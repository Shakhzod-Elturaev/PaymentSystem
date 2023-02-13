package uz.click.repository;

import uz.click.entity.User;

import java.util.ArrayList;

public class UserRepository {
    public static ArrayList<User> users = new ArrayList<>();

    public void addElement(User user){
        users.add(user);
    }

    public ArrayList<User> getUsers(){
        return  users;
    }
}
