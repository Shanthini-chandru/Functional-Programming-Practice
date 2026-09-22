import java.util.List;
import java.util.function.Consumer;

/*
*
* 3. Employee Notification
    * Using a Consumer<String>
    * Send notification to all the employees
*
* */

public class ConsumerPractice {
    List<String> employees = List.of("Arun", "Priya", "Rahul");

    void sendNotification(){
        Consumer<List<String>> notify =
                s-> s.forEach(
                        e->System.out.println("Send notification to "+e));

        notify.accept(employees);
    }
    static void main(String[] args) {
        ConsumerPractice cp = new ConsumerPractice();
        cp.sendNotification();

    }
}
