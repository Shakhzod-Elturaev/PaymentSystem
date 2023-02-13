package uz.click.service;

import uz.click.entity.User;
import uz.click.repository.UserRepository;

import java.util.ArrayList;

public class UserService {
    public static Double balance = 1000000d;
    UserRepository userRepository = new UserRepository();

    public void addUser(String username, String password, Long userId){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setUserID(userId);
        user.setBalance(balance);
        userRepository.addElement(user);
    }

    public User checkUser(String userName, String password){
        ArrayList<User> users = new ArrayList<>(userRepository.getUsers());
        for(User x : users){
            if(x.getUsername().equals(userName) && x.getPassword().equals(password)){
                return x;
            }
        }
        return null;
    }

    public boolean checkUsername(String username){
        for(User x : userRepository.getUsers()){
            if(x.getUsername().equals(username))
                return true;
        }
        return false;
    }
}
