package model;

public class User {
    private String name;

    public User(String name){
        this.name =name.toLowerCase();
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "User name:"+name;
    }
}
