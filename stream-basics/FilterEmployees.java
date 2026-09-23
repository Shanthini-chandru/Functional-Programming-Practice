import java.util.ArrayList;
import java.util.List;

/*
*
* 5. Find High-Salary Employees
    *  From the list of salaries find salaries > 50000
    * Practice : filter()
* 6. Extract Employee Names
    * Given a list of employees, print only their names
* */

class Employee {
    private final String name;
    private final int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    @Override
    public String toString(){
        return "Employee :"+name+" Earning :"+salary;
    }
}
public class FilterEmployees {

    //5. Find High-Salary Employees
    List<Integer> salaries = List.of(25000, 55000, 70000, 30000, 90000, 45000);
    List<Integer> filterSalaries(){
        return salaries.stream()
                .filter(s-> s > 50000)
                 .toList();
    }

    static void main() {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("chan",1234));
        empList.add(new Employee("geeth",20000));
        empList.add(new Employee("arun",30000));
        empList.add(new Employee("vijay",40000));
        empList.add(new Employee("gokul",10000));

        FilterEmployees fe = new FilterEmployees();
        List<Integer> salaries = fe.filterSalaries();
        System.out.println("High-Salary Employees");
        System.out.println("---------------------");
        for(Integer s: salaries){
            System.out.println(s);
        }

        System.out.println("Name of the EMPLOYEES");

        for(Employee e: empList){
            System.out.println(e.getName());
        }



    }
}

