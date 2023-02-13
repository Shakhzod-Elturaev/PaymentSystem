package uz.click.entity;

public class Transfer {
    private String cardNumber;
    private double summa;

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setSumma(double summa) {
        this.summa = summa;
    }
    public double getSumma() {
        return this.summa;
    }
}
