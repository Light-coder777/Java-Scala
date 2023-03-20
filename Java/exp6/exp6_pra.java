import java.awt.*;
import java.awt.event.*;
class Wow {
  public static void main(String[] args) {
    Frame f = new Frame("New frame");
    Font new_font = new Font("arial",Font.PLAIN,16);
    Label l = new Label("New regis");
    TextField tf = new TextField();
    Button b = new Button("SUBMIT");
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox male = new Checkbox("Male", true, cbg);
    Checkbox female = new Checkbox("Female", true, cbg);
    l.setBounds(20,50,100,50);
    tf.setBounds(150,50,100,50);
    b.setBounds(100,100,100,50);
    male.setBounds(150, 140, 100, 20);
    female.setBounds(260, 140, 100, 20);
    b.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
      }
    });
    f.add(b);
    f.add(l);
    f.add(tf);
    f.add(male);
    f.add(female);
    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent w) {
        System.exit(0);
      }
    });
    // f.setBackground(new Color(0, 0, 0));
    f.setSize(400,300);
    f.setLayout(null);
    f.setVisible(true);
    f.setResizable(true);
  }
  
}
