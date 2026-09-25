import model.Employee;
import service.EmployeeService;

import java.util.List;

public class SortEmployees {
    static void main() {
        List<Employee> employees = List.of(
                new Employee("Chan",80000),
                new Employee("Vijay",90000),
                new Employee("Geetha",10000),
                new Employee("Sri",12000),
                new Employee("Mathi",9000),
                new Employee("Gokul",90000),
                new Employee("Neels",100000),
                new Employee("Kannan",65000)
        );

        EmployeeService empService = new EmployeeService();
        System.out.println("Ascending Sort of Salary");
        System.out.println("------------------------");
        empService.sortLowToHighSalary(employees).forEach(System.out::println);
        System.out.println("Descending Sort of Salary");
        System.out.println("------------------------");
        empService.sortHighToLowSalary(employees).forEach(System.out::println);
        System.out.println("Total of Salaries");
        System.out.println("-----------------");
        System.out.println(empService.overallSalary(employees));
        System.out.println("Highest Salary");
        System.out.println("--------------");
        System.out.println(empService.highestSalary(employees));
        double minSalary = 50000;
        System.out.print("No of Employees Earning more than "+minSalary+" is ");
        System.out.println(empService.countEmpSalaryRange(employees,minSalary));
        System.out.println("Find the second-highest distinct salary. "+empService.findSecondHightSalary(employees));



    }
}