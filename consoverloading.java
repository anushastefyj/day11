class consoverloading
{
    String name;
    consoverloading()
    {
        name="anusha";
    }
    consoverloading(String name)
    {
        this.name=name;
    }
    void display()
        {
            System.out.println(name);
        }
        public static void main(String args[])
        {
            consoverloading s=new consoverloading();
            s.display();
            
        }
 }

