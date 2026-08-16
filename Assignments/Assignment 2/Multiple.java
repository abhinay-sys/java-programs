
interface I1{
    int x=20;
    void display();
}
interface I2{
    int y=50;
    void play();
}
interface I3{
    int z=30;
    void show();
}

class A implements I1,I2,I3{
public void dispaly(){
    System.out.println(x);
}
public void play(){
    System.out.println("it is from interface 2");
}
public void show(){
    System.out.println(z);
}
}

public class Multiple {
    public static void main(String[] args) {
        A obj=new A();
        obj.dispaly();
        obj.play();
        obj.show();
        System.out.println(obj.y);
    }

    
}
