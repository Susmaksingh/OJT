import java.lang.annotation.*;

class parent{
    void display(){
        System.out.print("parent class:");
    }
}
class child extends  parent{
    @Override
    void display(){
        System.out.println("child class");
    }
}
public class annotationex{
    public static void main(String[] args) {
        parent p=new child();
        p.display();
    }

}