import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RandNum {
    private JPanel mainPanel;
    private JTextField textField1;
    private JLabel labelOne;
    private JButton wylosujButton;
    private JPanel inputPanel;
    private JPanel btnPanel;
    private JPanel textPanel;
    private JPanel resultPanel;
    private JLabel result;
    private JLabel yourNum;
    private JLabel randNum;

    public RandNum() {
        wylosujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int randInt = (int)(Math.random() * (10 - 1 + 1)) + 1;
                int yourInt;
                try {
                    yourInt = Integer.parseInt(textField1.getText().trim());
                    if(randInt == yourInt){
                        result.setText("Wygrales!!!");
                        yourNum.setText("Twoja liczba to: "+yourInt);
                        randNum.setText("Wylosowana liczba to: "+randInt);
                    }else {
                        result.setText("Przegrales!!!");
                        yourNum.setText("Twoja liczba to: "+yourInt);
                        randNum.setText("Wylosowana liczba to: "+randInt);

                    }
                }catch (NumberFormatException err){
                    result.setText("Musisz wpisac liczby calkowite");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Losowanie liczb: 00000000000");
        frame.setContentPane(new RandNum().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
