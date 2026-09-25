package service;


import model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
*
* 10. Sort Employees by Salary
    * Sort by salary ascending.
    * Then try descending.
    * practice: sorted(), Comparator
    *
* 12. Calculate Total Salary
    *  Practice: reduce()
* 11. Find the Highest Salary
    * Find the maximum salary.
    * Practice: max(), Comparator, Optional
* 13. Count Employees Above ₹50K
    * Given employee objects, count how many employees earn more than ₹50,000.
    * Practice: filter(), count()
* 14. Find 2nd Highest Salary
    * Find the second-highest distinct salary.
    * Practice :distinct()
                sorted()
                skip()
                findFirst()
* */
public class EmployeeService {

    public List<Employee> sortLowToHighSalary(List<Employee> employees){
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary)).toList();

    }

    public List<Employee> sortHighToLowSalary(List<Employee> employees){
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
    }

    //12. Calculate Total Salary
    public double overallSalary(List<Employee> employees){
        return employees.stream()
                .map(Employee::getSalary)
                .reduce(0.0,Double::sum);
    }

    //11. Find the Highest Salary
    public Double highestSalary(List<Employee> employees){
        return employees.stream()
                .map(Employee::getSalary)
                .reduce(0.0,Double::max);
    }

    //13. Count Employees Above ₹50K
    public long countEmpSalaryRange(List<Employee > employees, double minSalary){
        return employees.stream()
                .filter(e->e.getSalary() > minSalary)
                .count();

    }

    //14 . Find the Second-Highest Salary
    public Optional<Double> findSecondHightSalary(List<Employee> emp){
         return emp.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();


    }


}
