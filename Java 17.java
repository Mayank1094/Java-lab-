import javax.swing.*;
import java.awt.*;
public class FontDemo {
public static void main(String[] a) {
JFrame f = new JFrame();
f.setLayout(new java.awt.FlowLayout());
f.add(make("Plain", Font.PLAIN));
f.add(make("Bold", Font.BOLD));
f.add(make("Italic", Font.ITALIC));
f.setSize(250, 150);
f.setVisible(true);
}
static JLabel make(String s, int t) {
JLabel l = new JLabel(s);
l.setFont(new Font("Serif", t, 18));
return l;
}
}
