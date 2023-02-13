package uz.click.control;

import uz.click.entity.History;
import uz.click.entity.User;
import uz.click.repository.HistoryRepository;

import java.util.ArrayList;
import java.util.Objects;

public class HistoryController {
    HistoryRepository historyRepository = new HistoryRepository();
    public void showAllHistory(User user){
        ArrayList<History> allHistory = new ArrayList<>(historyRepository.getElements());
        for(History x : allHistory){
            if(Objects.equals(x.getOwnerId(), user.getUserID())) {
                if (x.getId() == 1)
                    System.out.println(x.getPhoneNumber() + " ---------- " + (-x.getSumma()) + " | " + x.getDate());
                else if (x.getId() == 2)
                    System.out.println(x.getType() + " ---------- " + (-x.getSumma()) + " | " + x.getDate());
                else if(x.getId() == 3)
                    System.out.println(x.getType() + " ---------- " + (-x.getSumma()) + " | " + x.getDate());
                else if(x.getId() == 4)
                    System.out.println(x.getType() + " ---------- " + (-x.getSumma()) + " | " + x.getDate());
            }
        }
    }
}
