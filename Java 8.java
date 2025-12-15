(Student.java)
package college;
public class Student{
public void display(){
System.out.println("Student details");
}
}
(Teacher.java)
package college;
public class Teacher{
public void get(){
System.out.println("Teacher details");
}
}
(BCA.java)
import college.*;
public class BCA{
public static void main(String args[]){
Student s1=new Student();
Teacher t1=new Teacher();
s1.display();
t1.get();
}
}

college/
   Student.java
   Teacher.java
BCA.java
