interface shape{
    double calarea();
    double calperimeter();
}

class rectangle implements shape{
    private double length;
    private double width;
    public rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public double calarea(){
        return length * width;
    }
    public double calperimeter(){
        return 2 * (length + width);
    }

}
public class Interfaceex{
    public static void main(String[] args) {
       rectangle rec= new rectangle(10, 5);
        System.out.println("Area of the ractangle:"+rec.calarea());
        System.out.println("Perimeter of the ractangle:"+rec.calperimeter());
    }

}
