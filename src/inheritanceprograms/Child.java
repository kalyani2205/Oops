package inheritanceprograms;
class p
{
    int a=10;
    int b=20;
    p()
    {
        System.out.println("parrent constructor");
    }

    void m1()
    {
        System.out.println("hello ");
    }
}
public class Child extends p
{
    int a=100;
    int b=200;
    Child()
    {
        System.out.println("child class constructor : ");
    }
    void m1()
    {
        System.out.println("child method");
        System.out.println(super.a);
        System.out.println(super.b);
    }

    void m2()
    {
        System.out.println("m2 method from child class ");
    }
    public static void main(String[] args)
    {
       Child ref=new Child();


        ref.m1();
        ref.m2();
        System.out.println(ref.a);
        System.out.println(ref.b);



    }
}
