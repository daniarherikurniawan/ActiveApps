/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activeapps;

import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import javax.swing.AbstractButton;
import javax.swing.JRootPane;

/**
 *
 * @author daniar heri
 */
public class ActiveApps {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        MainFrame Apps = new MainFrame();
        Apps.setExtendedState(Frame.MAXIMIZED_BOTH);
        //Apps.pack();
        //Apps.setSize(Apps.getMaximumSize());
        Apps.setVisible(true);    
    }
    
    public static void RemoveMinMaxClose(Component comp){
        if(comp instanceof AbstractButton){
            comp.getParent().remove(comp);
        }else if (comp instanceof Container){
            Component comps [] = ((Container)comp).getComponents();
            for (int i = 0 ; i < comps.length; i++){
                RemoveMinMaxClose(comps[i]);
            }
    }
    }
    
}
