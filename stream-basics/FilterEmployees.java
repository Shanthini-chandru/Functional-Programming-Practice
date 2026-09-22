import java.util.List;

/*
*
* 5. Find High-Salary Employees
    *  From the list of salaries find salaries > 50000
    * Practice : filter()
*
* */
public class FilterEmployees {
    List<Integer> salaries = List.of(25000, 55000, 70000, 30000, 90000, 45000);

    List<Integer> filterSalaries(){
        return salaries.stream()
                .filter(s-> s > 50000)
                 .toList();
    }

    static void main() {
        FilterEmployees fe = new FilterEmployees();
        List<Integer> salaries = fe.filterSalaries();
        System.out.println("High-Salary Employees");
        System.out.println("---------------------");
        for(Integer s: salaries){
            System.out.println(s);
        }
    }
}

