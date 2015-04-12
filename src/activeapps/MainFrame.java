/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activeapps;
import static activeapps.ActiveApps.RemoveMinMaxClose;
import java.awt.CardLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author daniar heri
 */
public class MainFrame extends JFrame {
    
    public static final int FRAME_WIDTH = 1366;
    public static final int FRAME_HEIGHT = 768;
    
    LoginPanel LoginPnl = new LoginPanel("img/test/BGDepan.png");
    PanitiaSessionPanel PanitiaPnl = new PanitiaSessionPanel("img/test/BGPanitia.png");
    PesertaSessionPanel PesertaPnl = new PesertaSessionPanel("img/test/BGPeserta.png");
    Sesi1 Sesi1Pnl = new Sesi1("img/test/BGTimer.png");
    Computerise ComputerisePnl = new Computerise("img/test/BGSoalPG.png");
    TTS TTSPnl = new TTS("img/test/BGTTS.png");
    SoalMenjodohkan SoalMenjodohkanPnl = new SoalMenjodohkan("img/test/BGSoalJodoh.png");
    AMQPanel AMQPane = new AMQPanel("img/test/BGAMQ.png");
    ACQPanel ACQPane = new ACQPanel("img/test/BGACQ.png");
    ACCPanel ACCPane = new ACCPanel("img/test/BGACC.png");
    GrandFinal GrandFinalPane = new GrandFinal("img/test/BGGrandFinal.png");
    DebatePanel DebatePane = new DebatePanel("img/test/BGDebate.png");
    LetMeAnswerPanel LetMePane = new LetMeAnswerPanel("img/test/BGLetMe.png");
    InputGrandFinalTeam InputTeamPanel = new InputGrandFinalTeam("img/test/BGInputTeam.png");
    TictacPanel TictacPane = new TictacPanel("img/test/BGTictac.png");
    WorOPanel WorOPane = new WorOPanel("img/test/BGWorO.png");
    AboutApps AboutPanel = new AboutApps("img/test/BGAbout.png");
    
    public static JPanel BasePanel = new JPanel();
    
    public MainFrame() {
        super("ACCESSapps");
        setDefaultLookAndFeelDecorated(true);
        setResizable(false);
        setLocationRelativeTo(null);
        RemoveMinMaxClose(this);
        BasePanel.setLayout(new CardLayout());
        BasePanel.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        initComponents();
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        BasePanel.add(LoginPnl, "Login");
        BasePanel.add(PanitiaPnl, "PanitiaSession");
        BasePanel.add(PesertaPnl, "PesertaSession");
        BasePanel.add(Sesi1Pnl, "Sesi1");
        BasePanel.add(ComputerisePnl, "Computerise");
        BasePanel.add(TTSPnl,"TTS");
        BasePanel.add(SoalMenjodohkanPnl,"SoalMenjodohkan");
        BasePanel.add(AMQPane,"AMQ");
        BasePanel.add(ACQPane,"ACQ");
        BasePanel.add(ACCPane,"ACC");
        BasePanel.add(DebatePane,"Debate");
        BasePanel.add(GrandFinalPane,"GrandFinal");
        BasePanel.add(LetMePane,"LetMe");
        BasePanel.add(InputTeamPanel,"InputTeam");
        BasePanel.add(TictacPane,"Tictac");
        BasePanel.add(WorOPane,"WorO");
        BasePanel.add(AboutPanel,"About");
        add(BasePanel);
        setVisible(true);
    }
    
    public static void SetNewPanel(String PanelName){
        CardLayout cardLayout = (CardLayout)BasePanel.getLayout();
        cardLayout.show(BasePanel, PanelName);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
