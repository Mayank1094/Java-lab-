import javax.swing.*;
import java.awt.*;
class FontDemo
{
public static void main(String[] a)
{
JFrame f=new JFrame();
f.setLayout(new FlowLayout());
f.add(make("This is Arial Font",Font.PLAIN));
f.add(make("This is Times New Roman Font",Font.BOLD));
f.add(make("This is Courier New Font",Font.ITALIC));
f.setSize(250,150);
f.setVisible(true);
}
static JLabel make(String s,int t)
{
JLabel l=new JLabel(s);
l.setFont(new Font("Serif",t,18));
return l;
}
}
