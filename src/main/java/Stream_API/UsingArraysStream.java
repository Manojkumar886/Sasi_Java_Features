package Stream_API;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UsingArraysStream
{
    public static void main(String[] args)
    {

//        int [] arr ={ 10,5,6,7,3};
//        System.out.println(arr.length);

//        IntStream s= Arrays.stream(arr);  //
//        Long length= s.count();
//        System.out.println(length);
//        s.forEach(no-> System.out.println(no));

        int [] arr ={ 10,5,6,7,3};
//        IntStream s= Arrays.stream(arr);
//        s=  s.sorted();
//        s.forEach(System.out::println);
//        s.forEach(System.out::println);

//        Arrays
//                .stream(arr)
//                .sorted()
//                .forEach(System.out::println);

        System.out.println(Arrays.stream(arr).count());


    }
}
