package Encapsulation;
class B {
    private int b;

    public void setB(int b){
        this.b = b;
    }
    public int getB(){
        return b;
    }
}

public class Encapsulation{


    public static void main(String[] args) {
        B ref = new B();
        ref.setB(75);
        System.out.println(ref.getB());
    }
}