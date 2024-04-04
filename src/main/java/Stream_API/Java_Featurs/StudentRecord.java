package Stream_API.Java_Featurs;
//constructor -parameter,tostring,hascode,equals,getter

public record StudentRecord  (String name,String email)
{
    private static int age=89;
//    canonical consturctor
//    public StudentRecord(String name,String email)
//    {
//        this.name=name;
//        this.email=email;
//    }

//    compact constructor
    public StudentRecord
    {
        if(name.isBlank())
        {
            throw new IllegalArgumentException(" name should not be blank");
        }
    }
    public void print()
    {
        System.out.println("SOMETHING SOMETHING");
    }

}
