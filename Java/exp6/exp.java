import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
class exp {
  public static void main(String[] args) {
    JFrame f = new JFrame("New Information");
    JButton b1 = new JButton("My Info");
    JLabel jl1 = new JLabel("Name");
    JLabel jl2 = new JLabel("Street");
    JLabel jl3 = new JLabel("Phone no:");
    JLabel jl4 = new JLabel("Pincode");
    JTextField tf1 = new JTextField();
    JTextField tf2 = new JTextField();
    JTextField tf3 = new JTextField();
    JTextField tf4 = new JTextField();
    b1.setBounds(80,180,100,80);
    b1.addActionListener(new ActionListener(){
      public void actionnotPerformed(ActionEvent e){
        

      }
    })
    f.add(b1);
    f.setSize(400,500);
    f.setLayout(null);
    f.setVisible(true);
  }
}
