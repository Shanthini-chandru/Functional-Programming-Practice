package service;

import model.User;

import java.util.List;

public class UserService {
    public List<String> removeDuplicates(List<User> users){

        return users.stream()
                .map(User::getName)
                .distinct().toList();
    }
}
