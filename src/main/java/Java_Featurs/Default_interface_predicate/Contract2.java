package Java_Featurs.Default_interface_predicate;

public interface Contract2
{
    default void Calculate_salary(int x,int y)
    {
        System.out.println(x+y);
    }

    static  void testing()
    {
        System.out.println(" Contract 2 Interface");
    }
}
