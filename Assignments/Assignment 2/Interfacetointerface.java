interface I1{
    int x=20;
    void show();
    void dispaly();
}
interface I2 extends I1{
    int y=50;
    void show();
    void play();
}
class A implements I2{
   public void show(){
    System.out.println("it is implements from interface");
   }
   public void play(){
    System.out.println("y value from I2"+y);
   }
   public void dispaly(){
    System.out.println("implemts from i1");
   }

}
public class Interfacetointerface {

    public static void main(String[] args) {
        A obj=new A();
        obj.dispaly();
        obj.show();
        obj.play();
        System.out.println(obj.x);
    }
}