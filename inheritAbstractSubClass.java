abstract class father
{
    int i=100;
    abstract public void prayer();

    final public void smoke()
    {
        System.out.println("Father-it is a bad habit");
    }
}
class child extends father
{
    int i=200;
    public void prayer()
    {

        System.out.println("Child is regularly doing prayers");
    }
    public void singer()
    {
        System.out.println("Child is very good Singer");
    }
         /* public void smoke()
                  {
                      System.out.println("child-it is a bad habit");
                   }  */
}
abstract class child2 extends father
{

    public void cricketer()
    {
        System.out.println("Child is very good Cricketer");
    }
}
class subchild extends child2
{
    public void prayer()
    {
        System.out.println("Child-2 & SubChild is regularly doing prayers");
    }
         /*   public void smoke()
                  {
                      System.out.println("subchild-it is a bad habit");
                   }   */

}


public class inheritAbstractSubClass {
    public static void main(String args[])
    {
        father f=new child();
        f.prayer();
        f.smoke();
        f=new subchild();
        f.prayer();
        f.smoke();
    }
}
