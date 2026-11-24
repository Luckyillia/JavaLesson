import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormsOne {
    private JButton btn;
    private JPanel main;

    public FormsOne() {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn.setText("");
                int min = 1;
                int max = 8;
                int range = max - min + 1;

                int rand = (int)(Math.random() * range) + min;
                btn.setIcon(new ImageIcon(getClass().getResource("assets/"+rand+".png")));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FormsOne");
        frame.setContentPane(new FormsOne().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
