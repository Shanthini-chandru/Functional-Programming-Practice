package service;


import model.Employee;

import java.util.Comparator;
import java.util.List;

/*
*
* 10. Sort Employees by Salary
    * Sort by salary ascending.
    * Then try descending.
    * practice: sorted(), Comparator
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


}
