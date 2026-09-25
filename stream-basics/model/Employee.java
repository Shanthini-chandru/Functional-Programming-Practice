package model;

public class Employee {
    private String name;
    private double salary;
    private Department dept;

    public Employee(String name, double salary, Department dept){
        this.name = name;
        this.salary = salary;
        this.dept = dept;

    }

    public String getName(){
        return name;
    }
    public Department getDepartment(){
        return dept;
    }
    public double getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return "User name: "+name+" salary:"+salary;
    }
}
