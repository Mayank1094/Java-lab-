class A{
void eat(){
System.out.println("my friend eat panipuri");
}
}
class B extends A{
void drink(){
System.out.println("my friend drink tea");
}
}
public class C{
public static void main(String args[]){
B b1=new B();
b1.eat();
b1.drink();
}
}
