package demo_consumer;

import Java_Featurs.Default_interface_predicate.Contract;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class demo_execution_consumer
{

    public static void main(String[] args)
    {
        List<Integer> my_values = Arrays.asList(89,89,23,67,56);
//
//        System.out.println(my_values);
//
//        for(Integer values: my_values)
//        {
//            System.out.println(values);
//        }

//        ForEach  () --method ,consturctor

//        my_values.forEach( no -> System.out.println(no));

//        contract cc=new contract_implement();
//        cc.rule();

//        contract cc=new contract() {
//            @Override
//            public void rule() {
//                System.out.println("Hello");
//            }
//        };
//
//        cc.rule();


//        contract cc= ()-> System.out.println(" hello");
//        cc.rule();


//        Consumer cc=new Consumer_Implementation();
//        cc.accept(89);

//        Consumer<Integer>  cc=new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };

//        Consumer<Integer>  cc= (t) -> System.out.println(t);
//        my_values.forEach(cc);

        Supplier<Double> supply= () -> Math.random();
        System.out.println(supply.get());

    }
}
