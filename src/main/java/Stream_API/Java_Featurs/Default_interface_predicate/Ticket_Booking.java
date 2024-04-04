package Stream_API.Java_Featurs.Default_interface_predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ticket_Booking
{
    public static void main(String[] args) {
//        Ticket_Booking obj=new Ticket_Booking();
//        System.out.println(obj.Test(89));

//        Predicate<Integer> p = age -> age > 18;
//        System.out.println( p.test(78));

//        ArrayList obj=new ArrayList();
//        Predicate<Collection> p= arr -> arr.size() >0;
//        System.out.println(p.test(obj));

        int [] fav_numbers ={ 1,2,45,674,356,78,99,13,777,999};

        Predicate<Integer> p= no -> no%2!=0;
        Predicate<Integer> p1= no -> no>100 ;
//        check(p.negate(),fav_numbers);
//        check(p1,fav_numbers);
//        check(p.and(p1),fav_numbers); //777,999
//        check(p.or(p1),fav_numbers);

//        Function < input ,output> obj
        Function<String,Integer>  obj=name -> name.length() ;
        System.out.println(obj.apply("Manojkumar"));
    }
    public static void check(Predicate<Integer> p, int arr [])
    {
        for(int i=0;i< arr.length;i++)
        {
           boolean result =p.test(arr[i]);
           if(result==true)
           {
               System.out.println(arr[i]);
           }
        }
    }
//    public Boolean Test(int age)
//    {
//        if(age>18)
//        {
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
}
