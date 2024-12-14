class a {
    void canborrow()
    {
        System.out.println("students can borrow 3 books");
    }
}
class b extends a
{
    void canborrow()
    {
        System.err.println("teachers can borrow 10 books ");
    }
}
public class inheritence
{
    public static void main(String[] args) {
        b h=new b();
        h.canborrow();
        a f=new a();
        f.canborrow();
    }
}
