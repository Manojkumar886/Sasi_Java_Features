package Stream_API.Java_Featurs;

public final class DemoSwitchExpressions extends DemoPython
{
    public static void main(String[] args)
    {
//        Scanner scan=new Scanner(System.in);
//        System.out.println(" enter month (1-12)");
//        int month=scan.nextInt();
//
//       int dayscount= switch (month)
//        {
//            case 1,3,5,7,8,10,12 -> yield 31;
//            case 2 ->28;
//            case 4,6,9,11 ->30;
//            default -> throw new IllegalArgumentException("Invaild Month");
//        };
//
//        System.out.println("This month has "+dayscount+" days only..!");
        Checking("Manoj");
    }
    static void Checking(Object obj)
    {
        switch (obj)
        {
            case null -> System.out.println("null value");
            case String s -> System.out.println("String value");
            default -> throw new IllegalArgumentException("Unexpected value "+obj);
        }
    }
}
