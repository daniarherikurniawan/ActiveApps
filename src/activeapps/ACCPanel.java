/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activeapps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author daniar heri
 */
public class ACCPanel extends ImagePanelBackGround {

    /**
     * Creates new form ACCPanel
     */
    
    private int DefaultTime = 90*60 ; // detik
    Timer countdownTimer ;
    public ACCPanel(String Path) {
        super(Path);
        initComponents();
        countdownTimer = new Timer(1000, new ACCPanel.CountdownTimerListener(DefaultTime));
        repaintLabel(DefaultTime);
        setSize(MainFrame.FRAME_WIDTH, MainFrame.FRAME_HEIGHT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTimer = new javax.swing.JLabel();
        StartTimer = new javax.swing.JButton();
        PauseTimer = new javax.swing.JButton();
        ResetTimer = new javax.swing.JButton();
        Kembali = new javax.swing.JButton();

        LabelTimer.setFont(new java.awt.Font("Tahoma", 0, 105)); // NOI18N
        LabelTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        StartTimer.setBackground(new java.awt.Color(0, 0, 0));
        StartTimer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        StartTimer.setForeground(new java.awt.Color(255, 255, 255));
        StartTimer.setText("Start Timer");
        StartTimer.setMargin(new java.awt.Insets(2, 4, 2, 4));
        StartTimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartTimerMouseClicked(evt);
            }
        });

        PauseTimer.setBackground(new java.awt.Color(0, 0, 0));
        PauseTimer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PauseTimer.setForeground(new java.awt.Color(255, 255, 255));
        PauseTimer.setText("Pause Timer");
        PauseTimer.setEnabled(false);
        PauseTimer.setMargin(new java.awt.Insets(2, 4, 2, 4));
        PauseTimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PauseTimerMouseClicked(evt);
            }
        });

        ResetTimer.setBackground(new java.awt.Color(0, 0, 0));
        ResetTimer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ResetTimer.setForeground(new java.awt.Color(255, 255, 255));
        ResetTimer.setText("Reset Timer");
        ResetTimer.setEnabled(false);
        ResetTimer.setMargin(new java.awt.Insets(2, 4, 2, 4));
        ResetTimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetTimerMouseClicked(evt);
            }
        });

        Kembali.setBackground(new java.awt.Color(0, 0, 0));
        Kembali.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Kembali.setForeground(new java.awt.Color(255, 255, 255));
        Kembali.setText("Kembali");
        Kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KembaliMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(615, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(StartTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(PauseTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(ResetTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LabelTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(247, 247, 247))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(460, 460, 460))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(LabelTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StartTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PauseTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void StartTimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartTimerMouseClicked
        if(StartTimer.isEnabled()){
            PauseTimer.setEnabled(true);
            countdownTimer = new Timer(1000, new CountdownTimerListener(DefaultTime));
            StartTimer.setEnabled(false);
            countdownTimer.start();
        }
    }//GEN-LAST:event_StartTimerMouseClicked

    private void PauseTimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PauseTimerMouseClicked
        if (PauseTimer.isEnabled()){
            PauseTimer.setEnabled(false);
            ResetTimer.setEnabled(true);
            countdownTimer.stop();
        }
    }//GEN-LAST:event_PauseTimerMouseClicked

    private void ResetTimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetTimerMouseClicked
        if (ResetTimer.isEnabled()){
            countdownTimer.stop();
            ResetTimer.setEnabled(false);
            StartTimer.setEnabled(true);
            repaintLabel(DefaultTime);
        }
    }//GEN-LAST:event_ResetTimerMouseClicked

    private void KembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KembaliMouseClicked
        if(countdownTimer.isRunning()){
            countdownTimer.stop();
            repaintLabel(DefaultTime);
        }
        MainFrame.SetNewPanel("PanitiaSession");
    }//GEN-LAST:event_KembaliMouseClicked
    public void repaintLabel(int Second){
        
        int hh = Second/3600;
        int mm = (Second%3600)/60;
        int ss = (Second%3600)%60;
        String StrHH, StrMM, StrSS;
        if (hh < 10)
            StrHH = new String("0"+hh);
        else
            StrHH = new String(Integer.toString(hh));
        if (mm < 10)
            StrMM = new String("0"+mm);
        else
            StrMM = new String(Integer.toString(mm));
        if (ss < 10)
            StrSS = new String("0"+ss);
        else
            StrSS = new String(Integer.toString(ss));
        String Jam = new String(StrHH+":"+StrMM+":"+StrSS);
        
        LabelTimer.setText(Jam);
    }
    
    class CountdownTimerListener implements ActionListener{
        int timeRemaining ;
        
        public CountdownTimerListener(int Time){
            timeRemaining = Time;
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            if (--timeRemaining > 0){
                repaintLabel(timeRemaining);
            }else{
                LabelTimer.setText("Time's up!");
                PauseTimer.setEnabled(false);
                ResetTimer.setEnabled(true);
                
                countdownTimer.stop();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kembali;
    private javax.swing.JLabel LabelTimer;
    private javax.swing.JButton PauseTimer;
    private javax.swing.JButton ResetTimer;
    private javax.swing.JButton StartTimer;
    // End of variables declaration//GEN-END:variables
}
