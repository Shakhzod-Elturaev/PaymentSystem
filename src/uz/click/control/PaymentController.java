package uz.click.control;

import uz.click.entity.User;
import uz.click.service.PaymentService;
import uz.click.service.HistoryService;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

public class PaymentController {
    HistoryService historyService = new HistoryService();
    PaymentService paymentService = new PaymentService();
    Scanner scanNum = new Scanner(System.in);
    Scanner scanStr = new Scanner(System.in);
    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy  hh.mm");
    public void start(User user){
        System.out.println("\n1. Mobile phone\t 2. Internet provider\t 3. Taxes\t 4. Payment for education");
        int choice = scanNum.nextInt();
        switch (choice) {
            case 1 -> {
                payForPhone(user);
            }
            case 2 -> {
                payForInternetProvider(user);
            }
            case 3 -> {
                payForTaxes(user);
            }
            case 4 -> {
                payForEducation(user);
            }
        }
    }

    private void payForTaxes(User user) {
        int id = 3;
        enum Communal{
            ELECTRICITY, GAS, WATER, LANDTAX
        }
        String type = "";
        System.out.print("1. Electricity\n2. Gas\n3. Water\n4. Land tax\n");
        int a = scanNum.nextInt();
        switch(a){
            case 1 -> {
                type = String.valueOf(Communal.ELECTRICITY);
            }
            case 2 -> {
                type = String.valueOf(Communal.GAS);
            }
            case 3 -> {
                type = String.valueOf(Communal.WATER);
            }
            case 4 -> {
                type = String.valueOf(Communal.LANDTAX);
            }
        }
        System.out.print("An account number : ");
        String accountNumber = scanStr.nextLine();
        System.out.print("Summa : ");
        double summa = scanNum.nextDouble();
        boolean result = paymentService.checkSumma(summa, user);
        while(!result) {
            System.err.println("There is no such amount of money in your balance..");
            System.out.println();
            System.out.print("Summa : ");
            summa = scanNum.nextDouble();
            result = paymentService.checkSumma(summa, user);
        }
        user.setBalance(user.getBalance() - summa);
        String date = format.format(new Date());
        historyService.addTaxesHistory(user.getUserID(), id, accountNumber, summa, type, date);
        System.out.println("Successfully paid!!!");

    }

    public void payForPhone(User user){
        int id = 1;
        System.out.print("Phone number : ");
        String phoneNumber = scanStr.nextLine();
        boolean resultPhone = paymentService.checkMobile(phoneNumber);
        while(!resultPhone){
            System.err.println("Invalid phone number");
            System.out.println();
            System.out.print("Phone number : ");
            phoneNumber = scanStr.nextLine();
            resultPhone = paymentService.checkMobile(phoneNumber);
        }
        System.out.print("Summa : ");
        double summa = scanNum.nextDouble();
        boolean resultSumma = paymentService.checkSumma(summa, user);
        while(!resultSumma){
            System.err.println("There is no such amount of money in your balance!!!");
            System.out.println();
            System.out.print("Summa : ");
            summa = scanNum.nextDouble();
            resultSumma = paymentService.checkSumma(summa, user);
        }
        user.setBalance(user.getBalance() - summa);
        String date = format.format(new Date());
        historyService.addPhoneHistory(user.getUserID(), id, phoneNumber, summa, date);
        System.out.println("Successfully paid!!!");
    }
    public void payForInternetProvider(User user){
        int id = 2;
        System.out.println("\n1.UzOnline\t 2. Gals\t 3. Turon\t 4. Sola");
        int a = scanNum.nextInt();
        String type = "";
        switch (a){
            case 1 -> {
                type = "UzOnline";
            }
            case 2 -> {
                type = "Gals";
            }
            case 3 -> {
                type = "Turon";
            }
            case 4 -> {
                type = "Sola";
            }
        }
        System.out.print("An account number : ");
        String accountNum = scanStr.nextLine();
        System.out.print("Summa : ");
        double summa = scanNum.nextDouble();
        boolean res = paymentService.checkSumma(summa, user);
        while(!res){
            System.err.println("There is no such amount of money in your balance!!!");
            System.out.println();
            System.out.print("Summa : ");
            summa = scanNum.nextDouble();
            res = paymentService.checkSumma(summa, user);
        }
        user.setBalance(user.getBalance() - summa);
        String date = format.format(new Date());
        historyService.addInternetProviderHistory(user.getUserID(), id, accountNum, summa, type, date);
        System.out.println("Successfully paid!!!");
    }

    public void payForEducation(User user){
        int id = 4;
        enum Education{
            PDP, UDEMY, INTERNATION, CAMBRIDGE, EVEREST
        }
        String type = "";
        System.out.println("1. Pdp\n2. Udemy\n3. Internation\n4. Cambridge\n5. Everest\n");
        int a = scanNum.nextInt();
        switch(a){
            case 1 -> {
                type = String.valueOf(Education.PDP);
            }
            case 2 -> {
                type = String.valueOf(Education.UDEMY);
            }
            case 3 -> {
                type = String.valueOf(Education.INTERNATION);
            }
            case 4 -> {
                type = String.valueOf(Education.CAMBRIDGE);
            }
            case 5 -> {
                type = String.valueOf(Education.EVEREST);
            }
        }
        System.out.print("An account number : ");
        String accountNumber = scanStr.nextLine();
        System.out.print("Summa : ");
        double summa = scanNum.nextDouble();
        boolean result = paymentService.checkSumma(summa, user);
        while(!result){
            System.err.println("There is no such amount of money in your balance..");
            System.out.println();
            System.out.print("Summa : ");
            summa = scanNum.nextDouble();
            result = paymentService.checkSumma(summa, user);
        }
        user.setBalance(user.getBalance() - summa);
        String date = format.format(new Date());
        historyService.addEducationHistory(user.getUserID(), id, accountNumber, summa, type, date);
        System.out.println("Successfully paid!!!");
    }
}































