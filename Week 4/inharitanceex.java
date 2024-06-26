class shape{
    int length, area;
    
    public void show(){
        System.out.println("inharitance example:");
    }
}

class square extends shape{

    square(int s){
        length = s;
    }
    public void show(){
    area = length*length;
    System.out.println("the area of the squre"+area);
    }
}
class  rectangle extends  shape{
    int breadth;
    rectangle(int l, int b){
        length=l;
        breadth=b;
    }
    public void show(){
    area = length*breadth;
    System.out.println("the area of the ractangle"+area);
    }
    
}
class box extends rectangle{
    int height;
    box(int l, int b, int h){
        super(l, b);
        length=l;
        breadth=b;
        height=h;
    }
    public void result(){
        area=length*breadth*height;
        System.out.println("The area of a box is:"+area);
    }
}

public class inharitanceex{
    public static void main(String[] args) {
        square obj=new square(5);
        obj.show();
        rectangle obj1=new rectangle(10, 24);
        obj1.show();
        //obj1.output();
        shape sobj=new shape();
        //sobj.show();
        box bobj=new box(2,3,6);
        bobj.result();
        


    }
    
}