import java.applet.Applet;
import java.awt.*;
public class Faces extends Applet{
public void paint(Graphics g){
g.drawOval(100,50,100,100);
g.fillOval(125,80,10,10);
g.fillOval(165,80,10,10);
g.drawLine(150,90,150,110);
g.drawArc(130,110,40,20,0,-180);
}
}

<html>
<applet code="Faces" width="300" height="300"></applet>
</html>
