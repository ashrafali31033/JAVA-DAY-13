import java.util.*;
class r2
{
    public void r()
    {
        System.out.println("hello i am grand parent");
    }
}

class p1 extends r2
{
    public void r1()
    {
        System.out.println("hello i am parent ");
    }
}
class d extends p1 
{
    public void r3()
    {
        System.out.println("i am child class" );
    }
}
public class Main
{
    public static void main(String[] args) {
        d f=new d();
        f.r3();
        p1 h=new p1();
        h.r1();
        r2 j=new r2();
        j.r();

    }
}