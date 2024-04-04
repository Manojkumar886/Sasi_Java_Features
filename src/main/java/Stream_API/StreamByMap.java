package Stream_API;

import java.util.*;
import java.util.stream.Stream;

public class StreamByMap
{
    public static void main(String[] args) {

//        ArrayList<Employee> empList=new ArrayList<Employee>();
//
//        Employee emp1=new Employee("Manoj",1001,5,32000);
//        Employee emp2=new Employee("Annamalai",1002,3,24000);
//        Employee emp3=new Employee("Razak",1003,10,92000);
//
//        empList.add(emp1);
//        empList.add(emp2);
//        empList.add(emp3);
//
//        empList
//                .stream()
//                .filter(emp -> emp.getEmpSalary()>30000)
//                .map(emp -> emp.getName().toUpperCase())
//                .forEach(System.out::println);


//        HashSet<Integer> al=new HashSet<Integer>();
//
//        al.add(10);
//        al.add(20);
//        al.add(30);
//        al.add(40);
//
////        total ---> total =total+[0] (loop)
//
////        al.stream()
////                .limit(2)
////                .skip(1)
////                .forEach(System.out::println);
//
//       Optional<Integer> totalcountofvalue=  al.stream()
//                .reduce((no1,no2) -> no1+no2);
//
//        System.out.println(totalcountofvalue.get());

//        HashSet<Integer> al=new HashSet<Integer>();
//
//        al.add(10);
//        al.add(20);
//        al.add(30);
//        al.add(40);
//
//
//       Object [] obj= al.stream().toArray();
//
//
//       for(Object ob:obj)
//       {
//           System.out.println(ob);
//       }


//        ArrayList<Integer> al=new ArrayList<Integer>();
//
//        al.add(10);
//        al.add(100);
//        al.add(89);
//        al.add(400);
//
//
//        al.parallelStream().forEachOrdered(System.out::println);

        HashMap<String ,Integer> hm=new HashMap<String,Integer>();

        hm.put("manoj",1000);
        hm.put("anitha",200);
        hm.put("sasi",400);
        hm.put("janani",900);


        hm
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);


    }
}
