abstract class Shape
{
abstract void calculatearea();
}
class Circle extends Shape
{
double radius;
Circle(double radius)
{
this.radius=radius;
}
void calculatearea()
{
double area=Math.PI*radius*radius;
System.out.println("The area of circle:"+area);
}
}
class Rectangle extends Shape
{
double length,width;
Rectangle(double length,double width)
{
this.length=length;
this.width=width;
}
void calculatearea()
{
double area=length*width;
System.out.println("The area of Rectangle:"+area);
}
}
class Triangle extends Shape
{
double base,height;
Triangle(double base,double height)
{
this.base=base;
this.height=height;
}
void calculatearea()
{
double area=0.5*base*height;
System.out.println("The area of Triangle:"+area);
}
}
public class AreaCalculator
{
public static void main(String[] args)
{
Shape circle=new Circle(6);
Shape rectangle=new Rectangle(4,6);
Shape triangle=new Triangle(3,9);
circle.calculatearea();
rectangle.calculatearea();
triangle.calculatearea();
}
}
