public class StringMethod
{
public static void main(String args[])
{
String message = "Hello java";
System.out.println("The given string is Hello java");
System.out.println("Length of string: " + message.length());
System.out.println("Uppercase: " + message.toUpperCase());
System.out.println("Character at index 1: " + message.charAt(1));
System.out.println("Substring from index 6: " + message.substring(6));
System.out.println("Contains 'java'? " + message.contains("java"));
}
}
