package InheritanceDemo;
class A// parent
{
        int a=20;

        void m1()
        {
                System.out.println("m1 from A class ");
        }
        A()
        {
                System.out.println("parent class constructor");
        }
}
public class ISingle extends  A {//child
        int a=200;
        ISingle()
        {
                System.out.println("child class constructor");
        }
        void m1()
        {
                System.out.println("m2 from Child class ");
                super.m1();
        }
        public static void main(String[] args) {
            A ref=new ISingle();
           //     ref.m2();
                ref.m1();
                System.out.println(ref.a);//parent
        }
        }
