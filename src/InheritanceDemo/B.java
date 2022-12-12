package InheritanceDemo;

public class B extends P {
    public B() {
        System.out.println("constructor from class B");
    }

    void m1()
    {
        System.out.println("m1 from class B");
        super.m1();


    }
}
