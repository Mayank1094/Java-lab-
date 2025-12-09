interface Animal{
void makeSound();
}
class Dog implements Animal{
public void makeSound(){
System.out.println("bow bow");
}
}
public class InterfaceExample{
public static void main(String args[]){
Animal a = new Dog();
a.makeSound();
}
}
