package csmd264;
abstract class shape
 {
    void display(){
        System.out.println("the shape is circle");
    }
 abstract void draw();
}
public class ShapeDemo extends shape{
@Override
void draw(){
System.out.println("Drawing Circle");
    }
    public static void main(String[] args) {
        ShapeDemo s = new ShapeDemo();
        s.display();
        s.draw();
    }
}