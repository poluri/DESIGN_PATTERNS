import src.Observable.IphoneObservableImpl;
import src.Observable.StockObservable;
import src.Observer.EmailAlertObserverImpl;
import src.Observer.MobileAlertObserverImpl;
import src.Observer.NotificationAlertObserver;

public class Main {

    public static void main(String args[]) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz2@gmail.com", iphoneStockObservable);


        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);
        iphoneStockObservable.setStockCount(10);
    }


}
