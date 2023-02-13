package uz.click.control;

import java.util.Scanner;

import uz.click.entity.User;
import uz.click.service.UserService;

public class UserController {
    UserService userService = new UserService();
    PaymentController paymentController = new PaymentController();
    HistoryController historyController = new HistoryController();
    Scanner scanNum = new Scanner(System.in);
    Scanner scanStr = new Scanner(System.in);
    public Long k = 0L;

    public void start(){
        while(true) {
            System.out.println("1. Sign in\t 2. Sign up\t 0. Exit");
            int choice = scanNum.nextInt();
            switch (choice) {
                case 1 -> {
                    signIn();
                }
                case 2 -> {
                    signUp();
                }
                case 0 -> {
                    System.out.println("Thank you for cooperation with us!!!");
                    return;
                }
            }
        }
    }

    public void signIn(){
        System.out.print("Enter your user-name : ");
        String userName = scanStr.nextLine();
        System.out.print("Enter your password : ");
        String password = scanStr.nextLine();
        User user = userService.checkUser(userName, password);
        while(user == null){
            System.err.println("Not found..");
            System.out.println();
            System.out.print("Enter your user-name : ");
            userName = scanStr.nextLine();
            System.out.print("Enter your password : ");
            password = scanStr.nextLine();
            user = userService.checkUser(userName, password);
        }
        System.out.println("\nWelcome\n Main Menu : \n");
        startUserMenu(user);
    }
    public void startUserMenu(User user){
        main:
        while(true){
            System.out.println("1. Payment\t 2. Balance\t 3. Transfer\t 4. Internet-package\t 5. Cashback\t 6. History\t 0. Exit");
            int choice = scanNum.nextInt();
            switch(choice){
                case 1 -> {
                    paymentController.start(user);
                }
                case 2 -> {
                    System.out.println("Balance : " + user.getBalance() + "$");
                }
                case 6 -> {
                    historyController.showAllHistory(user);
                }
                case 0 -> {
                    break main;
                }
            }
        }
    }

    public void signUp(){
        System.out.print("E-mail : ");
        String e_mail = scanStr.nextLine();
        System.out.print("Password : ");
        String password = scanStr.nextLine();
        System.out.print("Username : ");
        String username = scanStr.nextLine();
        boolean result = userService.checkUsername(username);
        while(result){
            System.err.print("This username is already exist!!!");
            System.out.println();
            System.out.print("Username : ");
            username = scanStr.nextLine();
            result = userService.checkUsername(username);
        }
        userService.addUser(username, password, k);
        k++;
        System.out.println("Successfully registered!!!");
    }
}
