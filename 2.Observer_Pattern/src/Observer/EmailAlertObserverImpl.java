package src.Observer;

import src.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailid,StockObservable observable) {
        this.userName  = emailid;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnEmail(userName,"Product is in stock HurryUp");
    }

    private void sendMsgOnEmail(String userName, String productIsInStockHurryUp) {
        System.out.println("Message Sent to .."+userName);
        //Mobile notification logic
    }

}
