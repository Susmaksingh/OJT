// access modifire - public, private, protected
// non-access modifire - static, final, abstract

class sample{
    public int x=100;
    private int y=200;
    private static int q=0;

    private static  void increment(){
        q++; 
    }

    /*void data(){
        private int q=50;
    }*/
    void show(){
        System.out.println("the value of x:"+x);
        System.out.println("the value of y:"+y);
        sample.increment();
        System.out.println("the value of q:"+q);
    }
}
public  class accessm{
    public static void main(String[] args){
        sample obj = new sample();
        //obj.data();
        obj.show();
        //System.out.println(y);

    }

}