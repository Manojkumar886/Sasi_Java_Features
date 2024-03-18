package Java_Featurs;

import java.util.Comparator;

public class DemoMethodReference
{
//    static method reference
    public static int comparetwonumbers(int no1,int no2)
    {
        return Integer.compare(no1,no2);
    }
    public static void main(String[] args)
    {
//        Contract c1=( no1, no2) -> { return no1+no2 ;};
//        c1.add(100,500);
       int comparevalue= DemoMethodReference.comparetwonumbers(20,10);
        System.out.println("comparable :"+comparevalue);

        Comparator<Integer> comparewithlambda = (no1,no2) -> Integer.compare(no1,no2);

        Comparator<Integer> comparetomethodref= DemoMethodReference :: comparetwonumbers;

    }
}
