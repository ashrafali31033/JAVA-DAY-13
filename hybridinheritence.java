import java.util.*;
class gp
{
    public void r()
    {
        System.out.println("hello i am grand parent");
    }
}

class p1 extends gp
{
    public void r1()
    {
        System.out.println("hello i am parent ");
    }
}
interface p2
{
    void r2();
}
class d extends p1 implements p2
{
    public void r2()
    {
        System.out.println("i am child class" );
    }
    public void r3()
    {
        System.out.println("bye");
    }
}
public class hybridinheritence
{
    public static void main(String[] args) {
        d d1=new d();
        d1.r();
        d1.r1();
        d1.r2();
        d1.r3();

    }
}