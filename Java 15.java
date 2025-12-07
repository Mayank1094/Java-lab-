import java.applet.Applet;
import java.awt.*;
public class ListDemo extends Applet {
List l;
public void init() {
l = new List(5, true);
l.add("Red");
l.add("Pink");
l.add("Green");
l.add("Orange");
l.add("Blue");
add(l);
}
}
/*
<applet code="ListDemo" width="300" height="200">
</applet>
*/
