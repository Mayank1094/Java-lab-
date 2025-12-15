import java.util.*;

class MessageCount
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String m=sc.nextLine();
int w=0,n=0;

for(String p:m.trim().split("\\s+"))
{
if(p.matches(".*[a-zA-Z].*"))
w++;
}

for(char c:m.toCharArray())
{
if(!Character.isLetter(c) && c!=' ')
n++;
}

System.out.println("Words: "+w);
System.out.println("Non alphabetic characters: "+n);
}
}
