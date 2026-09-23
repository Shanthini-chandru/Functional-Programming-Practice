import model.User;
import service.UserService;

import java.util.List;

public class RemoveDuplicates {
    static void main() {
        List<User> users = List.of(
                new User("Chan"),
                new User("Geetha"),
                new User("Geetha"),
                new User("Ram"),
                new User("gokul"),
                new User("ram"),
                new User("vijay"),
                new User("ajith")
        ) ;

        System.out.println("Distinct Users!");
        System.out.println("---------------");
        UserService userService = new UserService();
        userService.removeDuplicates(users).forEach(System.out::println);
    }
}
