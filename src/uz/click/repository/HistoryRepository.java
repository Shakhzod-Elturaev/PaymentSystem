package uz.click.repository;

import uz.click.entity.History;
import java.util.ArrayList;

public class HistoryRepository {
    public static ArrayList<History> histories = new ArrayList<>();

    public void addElement(History history){
        histories.add(history);
    }

    public ArrayList<History> getElements(){
        return histories;
    }
}
