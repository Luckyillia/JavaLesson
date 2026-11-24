import javax.swing.*;

public class INF04 {
    private JPanel MainPanel;
    private JTextField phoneNumbeJTF;
    private JTextField nameJTF;
    private JTextField surnameJTF;
    private JRadioButton blue;
    private JRadioButton green;
    private JRadioButton brown;
    private JButton button1;
    private JTextPane imgLeft;
    private JTextPane imgRight;
    private JLabel phoneNumber;
    private JLabel name;
    private JLabel surname;
    private JPanel LeftPanel;
    private JPanel RightPanel;
    private JPanel phoneNumberPanel;
    private JPanel namePanel;
    private JPanel surnamePanel;
    private JPanel eyePanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Wprowadzenie danych do paszportu. Wykonał: 00000000000");
        frame.setContentPane(new INF04().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(1200,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
