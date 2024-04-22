package modul8;

 public abstract class Shape {
     public abstract void getNameOfShape();
 }
class Circle extends Shape{
    @Override
    public void getNameOfShape() {
        System.out.println("Circle");
    }}

class Quad extends Shape{
    @Override
    public void getNameOfShape() {
        System.out.println("Quad");
}}

class Triangle extends Shape{
    @Override
    public void getNameOfShape() {
        System.out.println("Triangle");
    }}
class Rectangle extends Shape{
    @Override
    public void getNameOfShape() {
        System.out.println("Rectangle");
    }}
class Pentagon extends Shape{
    @Override
    public void getNameOfShape() {
        System.out.println("Pentagon");
    }}


class ShapePrinter{
       public void shepePrint (Shape shape){

           shape.getNameOfShape();
}
    }
class ShapePrintTest {
    public static void main(String[] args) {
        Circle circle=new Circle();
       Quad quad=new Quad();
       Triangle triangle=new Triangle();
       Rectangle rectangle=new Rectangle();
       Pentagon pentagon=new Pentagon();

       ShapePrinter shapePrinter=new ShapePrinter();
       shapePrinter.shepePrint(circle);
        shapePrinter.shepePrint(quad);
        shapePrinter.shepePrint(triangle);
        shapePrinter.shepePrint(rectangle);
        shapePrinter.shepePrint(pentagon);


    }
}