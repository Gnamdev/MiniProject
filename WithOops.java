                                     //Using 4 pillers  (Encapsulation , inheritance , polymorphism , abstraction) of object oriented programing concept !!
import java.util.Scanner;

abstract class Shape
{
     float area ;
    abstract public void acceptInput();
    abstract public void compute();
    public void disp()
    {
        System.out.println("The area is : " + area );
    }
}
class Square extends Shape
{
   private float lenght;
   public void acceptInput()
    {
       Scanner ac = new Scanner(System.in);
       System.out.println("Enter the lenght of square : ");
       lenght = ac.nextFloat();
      }
    public void  compute()
    {
       area = lenght*lenght ;
    }    
}
class Ractangle extends Shape
{
  private float lenght;
  private float breadth;
  
  public void acceptInput()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the lenght of ractangle : ");
    lenght = sc.nextFloat();
    System.out.println("Enter the breadth of ractangle : ");
    breadth = sc.nextFloat();
  }
 public void compute()
  {
    area = lenght*breadth;
  }
}

class Circle extends Shape
{
  private  float radius;
   public void acceptInput()
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the radius of circle : ");
     radius = sc.nextFloat();
    }
   public void compute()
   {
    area = 3.14f * radius * radius ;
   }
}
class Geometry 
{
    public void permit (Shape ref)
    {
        ref.acceptInput();
        ref.compute();
        ref.disp();
    }
}
public class WithOops {
    public static void main(String[] args) {
      Square a = new Square();
     Ractangle b = new Ractangle();
        Circle c =new Circle();

        Geometry ref = new Geometry();
        ref.permit(a);
        ref.permit(b);
        ref.permit(c);
     System.out.println("Thank you..");
    }
}
