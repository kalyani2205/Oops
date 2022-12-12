package inheritanceprograms;
class A
{
    int a=1;
    int b=2;

    void m1(){
        System.out.println("m1 From A class ");
    }

   A() {
        System.out.println("A class Constructor ");
    }
}
class  B extends A
{
    int a=10;
    void m1()
    {
        System.out.println("m1 from B class ");
    }

    B() {
        System.out.println("B class constructor ");
    }
}
public class C extends B{

    int a=100;
    void m1()
    {
        System.out.println("m1 from child class ");
        super.m1();

    }
    C()
    {
        System.out.println("C class constructor");
    }
    public static void main(String[] args) {
      A ref=new C();
       ref.m1();
        System.out.println(ref.a);
        System.out.println(ref.b);
    }
}
