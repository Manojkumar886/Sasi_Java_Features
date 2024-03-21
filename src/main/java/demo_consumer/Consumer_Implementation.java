package demo_consumer;

import java.util.function.Consumer;

public class Consumer_Implementation implements Consumer<Integer>
{

    @Override
    public void accept(Integer integer)
    {
        System.out.println(integer);
    }
}
