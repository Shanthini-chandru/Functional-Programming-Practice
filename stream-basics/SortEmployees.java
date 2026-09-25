import model.Department;
import model.Employee;
import service.EmployeeService;

import java.util.List;
import java.util.Map;

import static model.Department.*;

public class SortEmployees {
    static void main() {
        List<Employee> employees = List.of(
                new Employee("Chan",80000,IT),
                new Employee("Vijay",90000,HR),
                new Employee("Geetha",10000,FINANCE),
                new Employee("Sri",12000,FINANCE),
                new Employee("Mathi",9000,IT),
                new Employee("Gokul",90000,IT),
                new Employee("Neels",100000,FINANCE),
                new Employee("Kannan",65000,IT),
                new Employee("Akila",65000,HR)
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
        System.out.println("15. Find Employees Whose Name Starts With \"A\"");
        empService.findEmployeeByStartingLetter(employees,"A");
        System.out.println("16. Group Employees by Department");
        empService.groupEmployeeByDepartment(employees);



    }
}