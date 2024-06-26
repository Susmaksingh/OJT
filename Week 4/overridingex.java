class shape{    //superclass/parent/base
    int length,area;

    public void show(){
        System.out.println("Overriding example");
    }
}

class square extends shape{
    square(int s){
        length = s;
    }
    public void show(){
        area = length*length;
        System.out.println("The area of a square is:"+ area);
    }    
}

class rectangle extends shape{
    int breadth;
    rectangle(int l, int b){
        length= l;
        breadth=b;
    }

    public void show(){
        area = length*breadth;
        System.out.println("The area of a rectangle is:"+ area);
    }
}

class box extends rectangle{
    int height;
    box(int l, int b, int h){
        super(l,b);    
        length = l;
        breadth= b;
        height = h;
    }

    public void result(){
        area = length*breadth*height;
        System.out.println("The area of a box is:"+ area);
    }
}

public class overridingex {
    public static void main(String[] args) {
        shape sobj = new shape();
        sobj.show();
        square obj = new square(5);
        obj.show();
        rectangle obj1 = new rectangle(4,6);
        obj1.show();
        box bobj = new box(2,4,3);
        bobj.result();
    }
}
