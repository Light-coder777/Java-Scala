import javax.swing.JButton;
import javax.swing.JFrame;
// import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.*;

class Message {
  public static void main(String[] args) {
    JFrame f = new JFrame();
    JButton b1 = new JButton("Click Me!");
    JButton b2 = new JButton("No! Click Me!");
    JButton b3 = new JButton("Please, Click Me!");
    JButton b4 = new JButton("Click Me Frist!");
    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel();
    JLabel l3 = new JLabel();
    JLabel l4 = new JLabel();
    b1.setBounds(20, 20, 100, 30);
    b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l1.setText("Thankyou for clicking me!");
        l1.setVisible(true);
      }
    });
    b2.setBounds(130, 20, 110, 30);
    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        l1.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l2.setText("Thankyou for not clicking first button!");
        l2.setVisible(true);
      }
    });
    b3.setBounds(250, 20, 140, 30);
    b3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        l1.setVisible(false);
        l2.setVisible(false);
        l4.setVisible(false);
        l3.setText("You are my friend!!!");
        l3.setVisible(true);
      }
    });
    b4.setBounds(400, 20, 130, 30);
    b4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setText("NOW YOU WILL PASS YOUR EXAM!!!");
        l4.setVisible(true);
      }
    });
    l1.setBounds(20, 50, 300, 30);
    l2.setBounds(20, 50, 300, 30);
    l3.setBounds(20, 50, 300, 30);
    l4.setBounds(20, 50, 300, 30);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.setSize(560, 400);
    f.setLayout(null);
    f.setVisible(true);
  }
}