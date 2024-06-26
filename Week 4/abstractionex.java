abstract class car{
    car(){
        System.out.println("Owner is John");
    }

    abstract void brandName();
    public void color(){
        System.out.println("the color of the car is black");
    }
}

class car1 extends car{
    public void brandName(){
        System.out.println("The brand name of the car is AUDI");
    }
}

class car2 extends car{
    public void brandName(){
        System.out.println("The brand name of the car is HYUNDAI");
    } 
}

public class abstractionex {
    public static void main(String[] args) {
        car cobj = new car1();
        cobj.brandName();
        cobj.color();

        car cobj2 = new car2();
        cobj2.brandName();
        cobj2.color();
    }
}
