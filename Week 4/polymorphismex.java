// polymophism - overloading example

class example{
    public void display(){
        System.out.println("Method  without parameters");
    }
    public void display(int a){
        System.out.println("Method with single parameter"+a);
    }
    public void display(int a, double b){
        System.out.println("Method with 2 parametrs"+a+","+b);
    }
    public void display(double a, double  b){
        System.out.println("Method with differenr datatypes"+a+","+b);
    }
    public void display(double x, int y, String z){
        System.out.println("Method with mix datatypes"+x+","+y+","+z);
    }

}

public  class polymorphismex{
    public static void main(String[] args) {
        example ex=new example();
        ex.display(5,6);
        ex.display(1.3,8,"Sri");
        ex.display();
    }
}