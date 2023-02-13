package uz.click.entity;

public class Payment {
    private String accountNumber;
    private double summa;
    private String phoneNumber;


    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setSumma(double summa) {
        this.summa = summa;
    }
    public double getSumma() {
        return this.summa;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}
