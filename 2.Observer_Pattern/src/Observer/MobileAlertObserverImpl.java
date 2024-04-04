package src.Observer;

import src.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String emailid,StockObservable observable) {
        this.userName  = emailid;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName,"Product is in stock HurryUp");
    }

    private void sendMsgOnMobile(String userName, String productIsInStockHurryUp) {
        System.out.println("Message Sent to .."+userName);
        //Mobile notification logic
    }


}
