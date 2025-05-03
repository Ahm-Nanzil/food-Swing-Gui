import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Orders extends JFrame {
    Orders(){
        setTitle("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setResizable(false);
        setLayout(new BorderLayout());
       setLocationRelativeTo(null);
        setSize(300,300);
        JTextField t=new JTextField("Orders:");
        //t.setEditable(false);
//        t.setBounds(0,20,290,40);
        JCheckBox c1=new JCheckBox("Buger");
//        c1.setBounds(10,100,80,60);
//        c1.setLocation(10,100);
        JCheckBox c2=new JCheckBox("Pizza");
//        c2.setBounds(100,100,80,60);
        JCheckBox c3=new JCheckBox("Pasta");
//        c3.setBounds(190,100,100,60);


        JButton b= new JButton("Order");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("Order:");
                if(c1.isSelected()){
                    t.setText(t.getText()+" "+c1.getText());
                }
                if(c2.isSelected()){
                    t.setText(t.getText()+" "+c2.getText());
                }
                if(c3.isSelected()){
                    t.setText(t.getText()+" "+c3.getText());
                }

            }
        });
//        b.setBounds(0,218,290,40);
        t.setBorder(BorderFactory.createLineBorder(Color.gray));
        t.setBackground(Color.white);

        add(c1,BorderLayout.WEST);
        add(c2,BorderLayout.CENTER);
        add(c3,BorderLayout.EAST);
        add(t,BorderLayout.NORTH);
        add(b,BorderLayout.SOUTH);
        pack();


        setVisible(true);
    }

    public static void main(String[] args) {
        new Orders();
    }
}
