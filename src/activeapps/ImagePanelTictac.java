/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activeapps;

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
public class ImagePanelTictac  extends JPanel{
    public BufferedImage image;
    public int Score;
    public int Time;
    public int X;
    public int Y;
    public boolean Terbuka = false;
    public ImagePanelTictac(int Sc,int time,int x, int y, String path){
        Score = Sc;
        Time = time;
        X = x;
        Y = y;//setLayout(new FlowLayout());
        try{
            image = ImageIO.read(new File(path));
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        //setPreferredSize(new Dimension(image.getWidth(),image.getHeight()));
        this.X = X;
        this.Y = Y;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isMetaDown()) {
                    System.out.println("Tes");
                } else {
                    //System.out.println("Teeees");
                    if(!Terbuka && TictacPanel.IsTimerMati())
                       TictacPanel.BukaKolom(X, Y);
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
