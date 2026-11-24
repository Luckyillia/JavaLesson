import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Kalkulator {
    private JPanel main;
    private JTextField liczba1Input;
    private JTextField liczba2Input;
    private JComboBox operInput;
    private JButton btn;
    private JLabel ansText;
    private JPanel ans;
    private JPanel btnPanel;
    private JLabel oper;
    private JLabel liczba2;
    private JLabel liczba1;
    private String choOper;

    public Kalkulator() {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String liczbaOne = liczba1.getText().toString().trim();
                String liczbaTwo = liczba2.getText().toString().trim();
                double answer = 0;
                switch (choOper){
                    case "+":
                        answer = Double.parseDouble(liczbaOne)+Double.parseDouble(liczbaTwo);
                        ansText.setText(liczbaOne+" + "+liczbaTwo+" = "+answer);
                        break;
                    case "-":
                        answer = Double.parseDouble(liczbaOne)-Double.parseDouble(liczbaTwo);
                        ansText.setText(liczbaOne+" - "+liczbaTwo+" = "+answer);
                        break;
                    case "*":
                        answer = Double.parseDouble(liczbaOne)*Double.parseDouble(liczbaTwo);
                        ansText.setText(liczbaOne+" * "+liczbaTwo+" = "+answer);
                        break;
                    case "/":
                        answer = Double.parseDouble(liczbaOne)/Double.parseDouble(liczbaTwo);
                        ansText.setText(liczbaOne+" / "+liczbaTwo+" = "+answer);
                        break;
                }
                System.out.println(answer);
            }
        });
        operInput.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                choOper = operInput.getSelectedItem().toString();
                System.out.println(choOper);
            }
        });
        String[] oper = { "+", "-", "*", "/"};
        for(int i = 0;i<oper.length;i++){
            operInput.addItem(oper[i]);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator");
        frame.setContentPane(new Kalkulator().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
