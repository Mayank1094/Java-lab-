import java.util.*;
public class Message {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter message: ");
String s = sc.nextLine();
int words = s.split("\\s+").length;
int nonAlpha = 0;
for(char c : s.toCharArray()) {
if(!Character.isLetter(c)) {
nonAlpha++;
}
}
System.out.println("Words: " + words);
System.out.println("Non-alphabet characters: " + nonAlpha);
}
}
