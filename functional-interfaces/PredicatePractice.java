import java.util.List;
import java.util.function.Predicate;

/*
*
1. Employee Salary Checker
* ->User Predicate<Integer> to check whether salary is greater than 50000
* ->Test it for every salary
* Practice: Predicate, lambda
*  */
public class PredicatePractice {
    List<Integer> salaries = List.of(25000,45000,60000,30000,80000);

    void employeeSalaryChecker(){
        Predicate<Integer> greaterThen50000 = s -> s > 50000;
        for(Integer l:salaries){
            System.out.println(greaterThen50000.test(l));
        }

    }

    void main(){
        PredicatePractice pp = new PredicatePractice();
        pp.employeeSalaryChecker();
    }



}
