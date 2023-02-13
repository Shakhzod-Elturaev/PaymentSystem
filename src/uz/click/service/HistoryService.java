package uz.click.service;

import uz.click.entity.History;
import uz.click.repository.HistoryRepository;



public class HistoryService {
    HistoryRepository historyRepository = new HistoryRepository();

    public void addPhoneHistory(Long userId, int id, String number, double summa, String date){
            History history1 = new History();
            history1.setOwnerId(userId);
            history1.setId(id);
            history1.setPhoneNumber(number);
            history1.setSumma(summa);
            history1.setDate(date);
            historyRepository.addElement(history1);
    }

    public void addInternetProviderHistory(Long userId, int id, String accountNumber, double summa, String type, String date){
        History history1 = new History();
        history1.setOwnerId(userId);
        history1.setId(id);
        history1.setAccountNumber(accountNumber);
        history1.setSumma(summa);
        history1.setType(type);
        history1.setDate(date);
        historyRepository.addElement(history1);
    }

    public void addTaxesHistory(Long userId, int id, String accountNumber, double summa, String type, String date){
        History history1 = new History();
        history1.setOwnerId(userId);
        history1.setId(id);
        history1.setAccountNumber(accountNumber);
        history1.setSumma(summa);
        history1.setType(type);
        history1.setDate(date);
        historyRepository.addElement(history1);
    }

    public void addEducationHistory(Long userId, int id, String accountNumber, double summa, String type, String date){
        History history1 = new History();
        history1.setOwnerId(userId);
        history1.setId(id);
        history1.setAccountNumber(accountNumber);
        history1.setSumma(summa);
        history1.setType(type);
        history1.setDate(date);
        historyRepository.addElement(history1);
    }
}
