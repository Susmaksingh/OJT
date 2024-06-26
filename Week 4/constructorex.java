class rectangle{
    
    int length, breadth, area;
    /*rectangle(){          //non - parameterized constructor
        System.out.println("Calculating the area of the ractangle");
    }*/
    //private final int breadth;

    rectangle(int length, int breadth){
       this.length=length;
        this.breadth=breadth;
    }
    /*void calarea(int length, int breath){
        area=length*breath;
        System.out.println("There are of the rectangleis:"+area);
    }*/
    void calarea(){
        area=length*breadth;
        System.out.println("The area of the rectangle is :"+ area);
    }

}
public class constructorex{
    public static void main(String[] args) {
        //rectangle rec = new rectangle();
        //rec.calarea(10, 25);;

        rectangle rect = new rectangle(12, 5);
        rect.calarea();

    }

}