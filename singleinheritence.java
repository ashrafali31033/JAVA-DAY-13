import java.util.*;
class a
{
    public void p1()
    {
        System.out.println("hello students");
    }
}
class b extends a
{
    public void r()
    {
        System.out.println("hello teachers");
    }
}
public class singleinheritence
{
    public static void main(String args[])
    {
        a h=new a();
        h.p1();
        b r=new b();
        r.p1();
    }
}