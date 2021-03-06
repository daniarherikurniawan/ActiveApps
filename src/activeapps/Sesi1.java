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
public class Sesi1 extends ImagePanelBackGround {
    private int DefaultTime = 5*60 ; // detik
    Timer countdownTimer ;
    public Sesi1(String path) {
        super(path);
        initComponents();
        countdownTimer = new Timer(1000, new CountdownTimerListener(DefaultTime));
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

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PauseTimer = new javax.swing.JButton();
        ResumeTimer = new javax.swing.JButton();
        SetTimer = new javax.swing.JButton();
        StartTimer = new javax.swing.JButton();
        ResetTimer = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        SpinnerMM = new javax.swing.JSpinner();
        SpinnerHH = new javax.swing.JSpinner();
        SpinnerSS = new javax.swing.JSpinner();
        Kembali = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        LabelTimer = new javax.swing.JLabel();

        jPanel3.setOpaque(false);

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(154, 300));

        PauseTimer.setBackground(new java.awt.Color(0, 0, 0));
        PauseTimer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PauseTimer.setForeground(new java.awt.Color(255, 255, 255));
        PauseTimer.setText("Pause Timer");
        PauseTimer.setEnabled(false);
        PauseTimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PauseTimer.setMargin(new java.awt.Insets(2, 4, 2, 4));
        PauseTimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PauseTimerMouseClicked(evt);
            }
        });

        ResumeTimer.setBackground(new java.awt.Color(0, 0, 0));
        ResumeTimer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ResumeTimer.setForeground(new java.awt.Color(255, 255, 255));
        ResumeTimer.setText("Resume Timer");
        ResumeTimer.setEnabled(false);
        ResumeTimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ResumeTimer.setMargin(new java.awt.Insets(2, 4, 2, 4));
        ResumeTimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResumeTimerMouseClicked(evt);
            }
        });

        SetTimer.setBackground(new java.awt.Color(0, 0, 0));
        SetTimer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SetTimer.setForeground(new java.awt.Color(255, 255, 255));
        SetTimer.setText("Set Timer");
        SetTimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SetTimer.setMargin(new java.awt.Insets(2, 4, 2, 4));
        SetTimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SetTimerMouseClicked(evt);
            }
        });

        StartTimer.setBackground(new java.awt.Color(0, 0, 0));
        StartTimer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        StartTimer.setForeground(new java.awt.Color(255, 255, 255));
        StartTimer.setText("Start Timer");
        StartTimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        StartTimer.setMargin(new java.awt.Insets(2, 4, 2, 4));
        StartTimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartTimerMouseClicked(evt);
            }
        });

        ResetTimer.setBackground(new java.awt.Color(0, 0, 0));
        ResetTimer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ResetTimer.setForeground(new java.awt.Color(255, 255, 255));
        ResetTimer.setText("Reset Timer");
        ResetTimer.setEnabled(false);
        ResetTimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ResetTimer.setMargin(new java.awt.Insets(2, 4, 2, 4));
        ResetTimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetTimerMouseClicked(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridBagLayout());

        SpinnerMM.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        SpinnerMM.setPreferredSize(new java.awt.Dimension(50, 35));

        SpinnerHH.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        SpinnerHH.setPreferredSize(new java.awt.Dimension(50, 35));

        SpinnerSS.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        SpinnerSS.setPreferredSize(new java.awt.Dimension(50, 35));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(StartTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PauseTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResumeTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SpinnerHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SpinnerMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SpinnerSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(SetTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(StartTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PauseTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ResetTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ResumeTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SpinnerHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SetTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        Kembali.setBackground(new java.awt.Color(0, 0, 0));
        Kembali.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Kembali.setForeground(new java.awt.Color(255, 255, 255));
        Kembali.setText("Kembali");
        Kembali.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KembaliMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Kembali)
                .addGap(57, 57, 57))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setOpaque(false);

        LabelTimer.setFont(new java.awt.Font("Tahoma", 0, 85)); // NOI18N
        LabelTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(LabelTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(LabelTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void KembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KembaliMouseClicked
        if(countdownTimer.isRunning()){
            countdownTimer.stop();
            repaintLabel(DefaultTime);
        }
        MainFrame.SetNewPanel("PanitiaSession");
    }//GEN-LAST:event_KembaliMouseClicked

    private void StartTimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartTimerMouseClicked
        if(StartTimer.isEnabled()){
            PauseTimer.setEnabled(true);
            countdownTimer = new Timer(1000, new CountdownTimerListener(DefaultTime));
            StartTimer.setEnabled(false);
            countdownTimer.start();
            SpinnerHH.setEnabled(false);
            SpinnerMM.setEnabled(false);
            SpinnerSS.setEnabled(false);
            SetTimer.setEnabled(false);
        }
    }//GEN-LAST:event_StartTimerMouseClicked

    private void ResetTimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetTimerMouseClicked
        if (ResetTimer.isEnabled()){
            countdownTimer.stop();
            ResetTimer.setEnabled(false);
            ResumeTimer.setEnabled(false);
            StartTimer.setEnabled(true);
            repaintLabel(DefaultTime);
        }
    }//GEN-LAST:event_ResetTimerMouseClicked

    private void PauseTimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PauseTimerMouseClicked
        if (PauseTimer.isEnabled()){
            ResumeTimer.setEnabled(true);
            PauseTimer.setEnabled(false);
            SetTimer.setEnabled(true);
            SpinnerHH.setEnabled(true);
            SpinnerMM.setEnabled(true);
            SpinnerSS.setEnabled(true);
            ResetTimer.setEnabled(true);
            countdownTimer.stop();
        }
    }//GEN-LAST:event_PauseTimerMouseClicked

    private void ResumeTimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResumeTimerMouseClicked
        if (ResumeTimer.isEnabled()){
            ResumeTimer.setEnabled(false);
            PauseTimer.setEnabled(true);
            countdownTimer.start();
            ResetTimer.setEnabled(false);
            SetTimer.setEnabled(false);
            SpinnerHH.setEnabled(false);
            SpinnerMM.setEnabled(false);
            SpinnerSS.setEnabled(false);
        }
    }//GEN-LAST:event_ResumeTimerMouseClicked

    private void SetTimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SetTimerMouseClicked
        if (SetTimer.isEnabled()){
            int HH = (int) SpinnerHH.getValue();
            int MM = (int) SpinnerMM.getValue();
            int SS = (int) SpinnerSS.getValue();
            DefaultTime = (HH*3600)+(MM*60)+SS;
            SetTimer.setEnabled(false);
            StartTimer.setEnabled(true);
            SetTimer.setEnabled(false);
            SpinnerHH.setEnabled(false);
            SpinnerMM.setEnabled(false);
            SpinnerSS.setEnabled(false);
            ResumeTimer.setEnabled(false);
            ResetTimer.setEnabled(false);
            repaintLabel(DefaultTime);
        }
    }//GEN-LAST:event_SetTimerMouseClicked

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
                SetTimer.setEnabled(true);
                SpinnerHH.setEnabled(true);
                SpinnerMM.setEnabled(true);
                SpinnerSS.setEnabled(true);
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
    private javax.swing.JButton ResumeTimer;
    private javax.swing.JButton SetTimer;
    private javax.swing.JSpinner SpinnerHH;
    private javax.swing.JSpinner SpinnerMM;
    private javax.swing.JSpinner SpinnerSS;
    private javax.swing.JButton StartTimer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
