import java.util.*;
public class refers{
    void display()
    {
        System.out.println("hello student");
    }
    void dis1()
    {
        this.display();
    }
    public static void main(String args[])
    {
        refers o=new refers();
        o.dis1();
    }

}