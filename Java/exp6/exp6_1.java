import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;

class PersonalInfo {
  public static void main(String[] args) {
    JFrame f = new JFrame("Personal Information");
    JButton b1 = new JButton("MyInfo");
    JLabel l1 = new JLabel("Name: ");
    JLabel l2 = new JLabel("Street: ");
    JLabel l3 = new JLabel("City: ");
    JLabel l4 = new JLabel("Pin Code: ");
    JLabel l5 = new JLabel();
    JLabel l6 = new JLabel();
    JLabel l7 = new JLabel();
    JLabel l8 = new JLabel();
    JTextField tf1 = new JTextField();
    JTextField tf2 = new JTextField();
    JTextField tf3 = new JTextField();
    JTextField tf4 = new JTextField();
    b1.setBounds(80, 180, 100, 50);
    b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        l5.setText(tf1.getText());
        l6.setText(tf2.getText());
        l7.setText(tf3.getText());
        l8.setText(tf4.getText());
        l5.setFont(new Font("Arial", Font.PLAIN, 32));
        l6.setFont(new Font("Arial", Font.PLAIN, 32));
        l7.setFont(new Font("Arial", Font.PLAIN, 32));
        l8.setFont(new Font("Arial", Font.PLAIN, 32));
        b1.setBackground(Color.CYAN);
      }
    });
    l1.setBounds(20, 20, 100, 20);
    l2.setBounds(20, 60, 100, 20);
    l3.setBounds(20, 100, 100, 20);
    l4.setBounds(20, 140, 100, 20);
    l5.setBounds(20, 250, 200, 75);
    l6.setBounds(20, 290, 200, 75);
    l7.setBounds(20, 330, 200, 75);
    l8.setBounds(20, 370, 200, 75);
    tf1.setBounds(100, 20, 150, 20);
    tf2.setBounds(100, 60, 150, 20);
    tf3.setBounds(100, 100, 150, 20);
    tf4.setBounds(100, 140, 150, 20);
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(l5);
    f.add(l6);
    f.add(l7);
    f.add(l8);
    f.add(tf1);
    f.add(tf2);
    f.add(tf3);
    f.add(tf4);
    f.add(b1);
    f.setSize(400, 550);
    f.setLayout(null);
    f.setVisible(true);
  }
}