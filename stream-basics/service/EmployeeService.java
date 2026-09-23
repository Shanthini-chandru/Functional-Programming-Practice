package service;


import model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
*
* 10. Sort Employees by Salary
    * Sort by salary ascending.
    * Then try descending.
    * practice: sorted(), Comparator
    *
*12. Calculate Total Salary
    *  Practice: reduce()
*
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


}
