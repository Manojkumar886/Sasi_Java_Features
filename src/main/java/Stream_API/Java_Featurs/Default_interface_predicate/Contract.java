package Stream_API.Java_Featurs.Default_interface_predicate;

public interface Contract
{
   default void Calculate_salary(int x,int y)
   {
       System.out.println(x+y);
   }
}
