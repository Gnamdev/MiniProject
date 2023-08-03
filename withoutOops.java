                        // Without using 4 (Encapsulation , inheritance , polymorphism , abstraction) pillers of object oriented concept !!

import java.util.Scanner;

class Square
{
    float length;
    float area;

    public void acceptInput()
    {
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter the length of square : ");
        length = ac.nextFloat();
        
    }

 public void compute()
    {
        area = length*length;
    }

    public void disp()
    {
        System.out.println("The area of squre is : " + area );
    }
}

class Ractangle
{
    float length;
    float breadth;
    float area ;
    public void acceptInput()
    {
        Scanner ac = new Scanner(System.in);

        System.out.println("Enter the Lenght of Ractangle : ");
        length = ac.nextFloat();

        System.out.println("Enter the Breadth of Ractangle : ");
        breadth = ac.nextFloat();

    }
    public void compute()
    {
        area = length * breadth ;

    }
    public void  disp()
    {
        System.out.println("The area of Ractangle : "+ area );
    }
}
class Circle
{
    float radius;
    float area ;
    public void acceptInput()
    {
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        radius = ac.nextFloat();
        
    }
    public void compute()
    {
        area = ( 3.14f * radius * radius );

    }
    public void disp()
    {
        System.out.println("The area of Circle : " + area );
    }
}
public class withoutOops {
    public static void main(String[] args) {

        Square a = new Square();
        Ractangle b = new Ractangle();
        Circle c = new Circle();

        a.acceptInput();
        a.compute();
        a.disp();

        b.acceptInput();;
        b.compute();
        b.disp();

        c.acceptInput();
        c.compute();
        c.disp();
    }
}
