import java.util.*;
class a
{
    public void p1()
    {
        System.out.println("hello guys");
    }
}

class b extends a
{
    public void r()
    {
        super.p1();
    }
}
class c extends b
{
    public void r1()
    {
        super.r();
    }
}
public class superkeyword
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