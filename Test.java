import java.io.*;
interface in1
{ 
    final int b = 10;
    void display();
}
abstract class demo
{ private int x=10;
public static int z=12;
protected static int w=15;
    public int a;
   demo()
    {
        a = 10;
    }
    abstract public void set(int a);
    abstract public void get();
}
public class Test extends demo implements in1
{
public static class A
    {
        void print()//dynamic binding
        {
            System.out.println("superclass.");
        }
    }
 
    public static class B extends A
    {
        //@Override
        void print()
        {
            System.out.println("subclass.");
        }
    }
    public void set(int a)
    {
        this.a = a;
    }

    final public void get()
    {
        System.out.println("a = " + a);
    }
     public void display()
    {
        System.out.println("Swetha");
    }

    public static void main(String[] args)
    { 
        Test obj = new Test();
        obj.set(20);
        obj.get();
        obj.display();
        System.out.println(b);
        B b=new B();
        A a1=b;
        A b1=new B();
        B b2=(B)b1;
        a1.print();
        b1.print();
        //System.out.print(x);//failed to access the private variable
    System.out.println(z+" "+w);//public scope will be through out the package andd protected will be in classes under inheritance
    }
}
