package src.Observable;

import src.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{

    List<NotificationAlertObserver> observersList;
    int stockCount;

    public IphoneObservableImpl(){
        observersList = new ArrayList<>();
        stockCount = 0;
    }
    @Override
    public void add(NotificationAlertObserver obj) {
        observersList.add(obj);
    }
    @Override
    public void remove(NotificationAlertObserver obj) {
         if(observersList.contains(obj)){
             observersList.remove(obj);
         }
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver obj:observersList){
            obj.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {

        if(stockCount ==0){
            notifySubscribers();
        }
       stockCount = stockCount+newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
