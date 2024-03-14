package Java_Featurs;

public sealed class TypeofProgramLangauges permits DemoJava,DemoC,DemoPython
{
    public void Programmer()
    {
        System.out.println("type of programming languages...!");
    }
}

final class DemoJava extends TypeofProgramLangauges
{
    public void Programmer()
    {
        System.out.println("Java is Object oriended Programming Langauges..!");
    }
}

 non-sealed class DemoC extends  TypeofProgramLangauges
{

}

sealed  class DemoPython extends TypeofProgramLangauges permits DemoSwitchExpressions
{

}

