import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Convert extends JFrame {
    Convert(){
        setTitle("Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300,250);
        setLayout(null);
        JTextField t1=new JTextField("00",20);
        t1.setBounds(10,20,140,30);
        JTextField t2=new JTextField("00");
        t2.setBounds(10,140,140,30);
        JButton b=new JButton("Convert");
        b.setBounds(10,80,140,30);
        b.setContentAreaFilled(false);
        b.setFocusPainted(false);
//        b.setBackground(Color.gray);
//        b.setBorderPainted(false);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=t1.getText();
                double d=Double.parseDouble(s);
                t2.setText(s=d*.88+"");
            }
        });

        JLabel l1=new JLabel("USD");
        l1.setBounds(170,20,100,30);
        JLabel l2=new JLabel("EURO");
        l2.setBounds(170,140,100,30);
        add(t1);
        add(t2);
        add(b);
        add(l1);
        add(l2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Convert();
    }

}




