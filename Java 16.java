import javax.swing.*;
import java.awt.event.*;
public class A
{
public static void main(String[] args)
{
JFrame f=new JFrame();
JButton b=new JButton("Click me");
b.setBounds(50,50,120,30);
b.addActionListener(e->System.out.println("Button Clicked"));
b.addMouseListener(new MouseAdapter(){
public void mouseEntered(MouseEvent e){
System.out.println("Mouse Entered!");
}
});
f.add(b);
f.setSize(250,200);
f.setLayout(null);
f.setVisible(true);
}
}
