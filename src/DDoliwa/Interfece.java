import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.StringConcatFactory;

public class Interfece {
    private JTextField inputA;
    private JTextField inputB;
    private JButton btn;
    private JLabel aText;
    private JLabel bText;
    private JLabel ans;
    private JPanel main;
    private JPanel a;
    private JPanel b;

    public Interfece() {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Interfece");
        frame.setContentPane(new Interfece().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public int getA(){
        int a;
        try {
            a = Integer.parseInt(inputA.getText().trim());
        }catch (NumberFormatException e){
            ans.setText("Musisz wpisac liczby calkowite");
            return 0;
        }
        return a;
    }
    public int getB(){
        int b;
        try {
            b = Integer.parseInt(inputB.getText().trim());
        }catch (NumberFormatException e){
            ans.setText("Musisz wpisac liczby calkowite");
            return 0;
        }
        return b;
    }
    public void count(){
        int a = getA();
        int b = getB();
        if(a != 0 || b != 0){
            int nwd = NWD.nwd(a, b);
            ans.setText("Wynik: "+nwd);
        }else{
            ans.setText("Nie moze byc zera");
        }

    }
}
