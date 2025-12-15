import java.util.Vector;

public class SimpleVector
{
public static void main(String[] args)
{
Vector<String> fruits = new Vector<>();

fruits.add("Apple");
fruits.add("Banana");
fruits.add("Orange");

System.out.println("Size of vector: " + fruits.size());
System.out.println("Element at index 1: " + fruits.get(1));

fruits.remove(0);

System.out.println("Vector after removal: " + fruits);
System.out.println("Does the vector contain Banana? " + fruits.contains("Banana"));
}
}
