/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activeapps;

import static activeapps.TTS.Kolom;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author daniar heri
 */
public class SoalTTS {
    public String Kata = new String("");
    public int StartIdxX;
    public int StartIdxY;
    public boolean IsVertikal;
    public int NoSoal;
    public int Panjang;
    public Vector<Huruf> ListHuruf = new Vector<Huruf>();
    
    public class Huruf{
        int IdX;
        int IdY;
        public char CurrHrf;
    }
    
    public SoalTTS(int X, int Y, char Rotation, int No, String kata){
        StartIdxX = X;
        StartIdxY = Y;
        
        Kolom[X][Y].LengkapiImagePanel("img/test/"+No+".png",X,Y);
        //Kolom[X][Y].setPreferredSize(new Dimension(Kolom[X][Y].image.getWidth(),Kolom[X][Y].image.getHeight()));
        Kolom[X][Y].terjawab = true;  
        Kolom[X][Y].repaint();
        NoSoal = No;
        //System.out.println(No);
        if (Rotation == 'V')
            IsVertikal = true;
        else
            IsVertikal = false;
        Kata = kata;
        Panjang = kata.length();
        
        MembentukListHuruf();
    }
    
    private void MembentukListHuruf(){
        // posisi awal itu 1
        for(int i = 0; i < Panjang; i ++){
            Huruf Hrf = new Huruf();
            Hrf.CurrHrf = Kata.charAt(i);
            if(!IsVertikal){
                //horizontal
                Hrf.IdX = StartIdxX;
                Hrf.IdY = StartIdxY+i;
            }else{
                Hrf.IdX = StartIdxX+i;
                Hrf.IdY = StartIdxY;
            }
           // System.out.println("iniii "+Hrf.IdX+" "+Hrf.IdY+" "+Hrf.CurrHrf+" "+NoSoal);
            TTS.Kolom[Hrf.IdX][Hrf.IdY].AddNoSoal(NoSoal);
            TTS.Kolom[Hrf.IdX][Hrf.IdY].Huruf=Hrf.CurrHrf;
           
        }
    }
    
    public void CetakJawaban(){
        for(int i = 0; i < Panjang; i ++){
            Huruf Hrf = new Huruf();
            Hrf.CurrHrf = Kata.charAt(i);
            if(!IsVertikal){
                //horizontal
                Hrf.IdX = StartIdxX;
                Hrf.IdY = StartIdxY+i;
            }else{
                Hrf.IdX = StartIdxX+i;
                Hrf.IdY = StartIdxY;
            }
            try {
                TTS.Kolom[Hrf.IdX][Hrf.IdY].image = ImageIO.read(new File("img/test/"+Hrf.CurrHrf+".png"));
                TTS.Kolom[Hrf.IdX][Hrf.IdY].terjawab = true;
                TTS.Kolom[Hrf.IdX][Hrf.IdY].repaint();
            } catch (IOException ex) {
                Logger.getLogger(SoalTTS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
