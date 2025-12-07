import java.applet.*;
import java.awt.*;
import java.util.*;
public class TokenApplet extends Applet {
public void paint(Graphics g) {
String s = "Java is simple";
StringTokenizer st = new StringTokenizer(s);
int y = 20;
while(st.hasMoreTokens()) {
g.drawString(st.nextToken(), 20, y);
y += 20;
}
}
}
/*
<applet code="TokenApplet" width="300" height="300">
</applet>
*/
