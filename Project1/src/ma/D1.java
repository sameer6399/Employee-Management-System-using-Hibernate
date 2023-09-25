package pa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class D1 extends JFrame
{
Container c;
JButton btnClickMe;

D1()
{
c = getContentPane();
c.setLayout(new FlowLayout());
btnClickMe = new JButton("Click Me");
c.add(btnClickMe);

ActionListener a1 = (ae) -> {					//using lambda expression
JOptionPane.showMessageDialog(c, "Welcome to my App");
};
btnClickMe.addActionListener(a1);

setSize(400, 200);
setLocationRelativeTo(null);
setTitle("GUI App");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
public static void main(String args[])
{
D1 d = new D1();
}
}