public class CountArgs {
public static void main(String[] args) {
int ints=0, floats=0, strings=0;
for(String a : args) {
try {
Integer.parseInt(a);
ints++;
} catch(NumberFormatException e1) {
try {
Float.parseFloat(a);
floats++;
} catch(NumberFormatException e2) {
strings++;
}
}
}
System.out.println("Integers: " + ints);
System.out.println("Floats: " + floats);
System.out.println("Strings: " + strings);
}
}
