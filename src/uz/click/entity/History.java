package uz.click.entity;

public class History {
    private int Id;
    private String accountNumber;
    private double summa;
    private String phoneNumber;
    private String cardNumber;
    private String date;
    private String type;
    private Long ownerId;

    public History(){

    }

    public void setOwnerId(Long ownerId){
        this.ownerId = ownerId;
    }
    public Long getOwnerId(){
        return this.ownerId;
    }

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
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

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return this.date;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
}
