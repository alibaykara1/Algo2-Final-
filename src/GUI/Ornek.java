package GUI;
import javax.swing.*;
import java.awt.event.*;

public class Ornek extends JFrame {
    JLabel label;
    JButton btn1, btn2;

    public Ornek() {
        setLayout(null); // ya da varsayılan
        label = new JLabel("100");
        label.setBounds(50, 50, 100, 30);
        add(label);

        btn1 = new JButton("+5");
        btn1.setBounds(50, 100, 80, 30);
        add(btn1);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int deger = Integer.parseInt(label.getText());
                label.setText(String.valueOf(deger + 5));
            }
        });

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ornek();
    }
}