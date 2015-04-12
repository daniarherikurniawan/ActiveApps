/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activeapps;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author daniar heri
 */
class ImagePanel extends JPanel{
    public BufferedImage image;
    public Character Huruf;
    private int NoSoal;
    private int NoSoal2;
    public boolean terjawab = false;
    public boolean IsTepiMerah = false;
    public int X;
    public int Y;
    public ImagePanel(Character Ch){
        Huruf = Ch;
        NoSoal = 0;
        NoSoal2 = -99;
    }
    
    public void AddNoSoal(int No){
        if (NoSoal==0)
            NoSoal = No;
        else
            NoSoal2 = No;
    }
    
    public int NoSoal(){
        return NoSoal;
    }
    
    public boolean IsNoSoalSama(int No){
        if(NoSoal == No)
            return true;
        else
            if(NoSoal2==No)
                return true;
        return false;
    }
    
    public void LengkapiImagePanel(String path,int X,int Y) {
        //setLayout(new FlowLayout());
        try{
            image = ImageIO.read(new File(path));
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        //System.out.println(path);
        setPreferredSize(new Dimension(image.getWidth(),image.getHeight()));
        this.X = X;
        this.Y = Y;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isMetaDown()) {
                    System.out.println("Tes");
                } else {
                    //System.out.println("Teeees");
                    TTS.ChangeBorder(X, Y);
                }
            }
         });
        
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }
    
    
}
