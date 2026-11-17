import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RandNumV2 {
    private JPanel mainPanel;
    private JTextField inputNum;
    private JPanel inputPanel;
    private JButton randNumBtn;
    private JButton checkBtn;
    private JPanel randPanel;
    private JLabel text1;
    private JPanel secondPanel;
    private JPanel textPanel1;
    private JPanel textPanel2;
    private JPanel textPanel3;
    private JLabel hitText;
    private JLabel attemptText;
    private int randNum;
    private int countAttempt;

    public RandNumV2() {
        randNumBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                randNum = (int)(Math.random() * (127 - 1 + 1)) + 1;
                secondPanel.setVisible(true);
            }
        });
        checkBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int yourInt;
                try {
                    yourInt = Integer.parseInt(inputNum.getText().trim());
                    if(randNum > yourInt){
                        hitText.setText("Za mala");
                        countAttempt++;
                        attemptText.setText("Proba: "+countAttempt);
                    } else if(randNum < yourInt){
                        hitText.setText("Za duza");
                        countAttempt++;
                        attemptText.setText("Proba: "+countAttempt);
                    }else {
                        hitText.setText("Trafiles");
                        countAttempt++;
                        attemptText.setText("Proba: "+countAttempt);
                    }
                }catch (NumberFormatException err){
                    text1.setText("Musisz wpisac liczby calkowite");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Losowanie liczb: 00000000000");
        frame.setContentPane(new RandNumV2().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
