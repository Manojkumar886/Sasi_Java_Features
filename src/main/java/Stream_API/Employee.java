package Stream_API;

public class Employee
{
    String name;
    int empId,empExp,empSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpExp() {
        return empExp;
    }

    public void setEmpExp(int empExp) {
        this.empExp = empExp;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public Employee(String name, int empId, int empExp, int empSalary) {
        this.name = name;
        this.empId = empId;
        this.empExp = empExp;
        this.empSalary = empSalary;
    }
}
