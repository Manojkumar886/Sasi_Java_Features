package Stream_API;

import java.util.*;

public class Stream_Process
{
    public static void main(String[] args) {
//        int [] ar={10,7,3,6,78,2,90};

//        count(),min,max,average,findany,findfirst,distinct

//        Arrays
//                .stream(ar)
//                .sorted()
//                .forEach(System.out::println);

//       OptionalDouble od= Arrays
//                .stream(ar)
//                .average();
//
//        System.out.println(od.getAsDouble());
//        OptionalInt od= Arrays
//                .stream(ar)
//                .min();
//
//        System.out.println(od.getAsInt());


//        filter ,map

//        Arrays
//                .stream(ar).filter(no-> no%5==0)
//                .forEach(System.out::println);
//    }

        List<Integer> al=new ArrayList<Integer>();

        al.add(10);
        al.add(40);
        al.add(30);
        al.add(25);
        al.add(10);
        al.add(50);
        al.add(60);
//
//        al.stream().distinct().forEach(System.out::println);


//            al.stream()
//                    .distinct() //40,30,25,50,60
//                    .sorted() //25,30,40,50,60
//                    .forEach(System.out::println);

//        al.stream()
//                .distinct()
//                .sorted((ele1,ele2)-> ele2.compareTo(ele1))
//                .forEach(System.out::println);


        List<String> l=new ArrayList<String>();
        l.add("manoj");
        l.add("pavi");
        l.add("hari");
        l.add("Geetha");

//        l.stream().map(name->name.toUpperCase())
//                .forEach(System.out::println);


//        l.stream().sorted((ele1,ele2)-> 0)
//                .forEach(System.out::println);



//        MAP




    }
}
