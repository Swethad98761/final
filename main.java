import java.lang.*;
class Shape
{
    int w,h;
    double r;
public int getArea(int w,int h)
{
return w*h;
}
int getPerimeter(int w,int h)
{
return 2*(w+h);
}
double getArea(double r)//overloaded method
{
    this.r=r;
    return (double)(3.14*r*r);
}
double getPerimeter(double r)//overloaded method
{this.r=r;
return (double)(2*3.14*r);
}
}
class Circle extends Shape
{double r;
Circle()
{
    this.r=10;//this keyword
}
void getArea()
{
    System.out.println("area of circle is "+(double)super.getArea(r));//super keyword
}
public double getPerimeter(double r)//overrided method
{
  return  (double)2*3.14*r; 
}
}
class Square extends Shape
{
    Square()
    {
        this(5);//this keyword
    }
    Square(int side)
   {
      System.out.println("area of square is "+super.getArea(side,side));
      System.out.println("perimeter of square is "+super.getPerimeter(side,side));
   }
}
class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}
class des
{int a,b;
   des(int a,int b)
   {
       this.a=a;
       this.b=b;
   }
  // @override
   public String toString() {//overrided toString method
        return String.format("first arg is "+a+" second arg is "+b);
    }
}
public class main
{
    public static void main(String args[])
    {
        Square s=new Square();
        Circle c=new Circle();
        c.getArea();
        StringBuilder sb=new StringBuilder();
        sb.append(c.getPerimeter(20));//stringbuilder object
          try//custom exception
        {
            throw new MyException("Exception");
        }
        catch (MyException ex)
        {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
        System.out.println("using to string method the perimeter of circle is "+sb.toString());//returns the string form of an object(tostring is an object class method
        System.out.println("using object class method hashcode the hashcode value of object c is "+c.hashCode());//returns the hascode value of an object
        System.out.println("using get class name"+s.getClass().toString());
         des c1 = new des(10, 15);
        System.out.println(c1);
    
        
    }
}

