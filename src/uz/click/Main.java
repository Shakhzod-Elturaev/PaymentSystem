package uz.click;

import uz.click.control.UserController;


public class Main {
    static UserController userController = new UserController();
    public static void main(String[] args) {
        userController.start();
    }
}