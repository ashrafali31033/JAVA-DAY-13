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
class c extends b
{
    public void r1()
    {
        System.out.println("hello aejas");
    }
}
public class multilevelinheritence
{
    public static void main(String[] args) {
        c f=new c();
        f.p1();
        c h=new c();
        h.r1();
        b j=new b();
        j.r();

    }
}