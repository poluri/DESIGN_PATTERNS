package src.Observable;

import src.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver obj);
    public void remove(NotificationAlertObserver obj);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();

}
