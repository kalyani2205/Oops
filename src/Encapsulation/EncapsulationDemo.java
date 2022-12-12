package Encapsulation;
class A{
    private int a;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}


public class EncapsulationDemo {
    private int a;
    public static void main(String[] args) {
        A ref=new A();


       ref.setA(100);

        System.out.println( ref.getA());

    }


}


