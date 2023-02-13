package uz.click.service;

import uz.click.entity.User;

import java.util.regex.Pattern;

public class PaymentService {
    public boolean checkMobile(String number){
        return Pattern.matches("\\+998\\d{9}", number);
    }
    public boolean checkSumma(double summa, User user){
        return summa <= user.getBalance();
    }
}
