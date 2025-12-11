interface Animal{
void makesound();
}
class Dog implements Animal{
public void makesound(){
System.out.println("bow bow");
}
}
public class InterfaceExample{
public static void main(String args[]){
Animal a=new Dog();
a.makesound();
}
}
