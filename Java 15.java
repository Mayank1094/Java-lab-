import java.applet.Applet;
import java.awt.*;
public class MyList extends Applet {
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
