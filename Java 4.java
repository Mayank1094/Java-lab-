class Student
{
String name;
int age;

Student()
{
name="unknown";
age=0;
}

Student(String n)
{
name=n;
age=0;
}

Student(String n,int a)
{
name=n;
age=a;
}

void display()
{
System.out.println("name = "+name+" age = "+age);
}

public static void main(String args[])
{
Student s=new Student();
Student s1=new Student("Mayank");
Student s2=new Student("Mayank",19);
s.display();
s1.display();
s2.display();
}
}
