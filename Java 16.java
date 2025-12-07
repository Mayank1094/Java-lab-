import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class EventDemo extends Applet implements ActionListener {
Button b;
String message = "Hello";
public void init() {
b = new Button("Click");
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
message = "Button was clicked!";
repaint();
}
public void paint(Graphics g) {
g.drawString(message, 50, 100);
}
}
/*
<applet code="EventDemo" width="200" height="200">
</applet>
*/
