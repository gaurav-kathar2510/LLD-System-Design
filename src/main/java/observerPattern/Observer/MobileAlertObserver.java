package observerPattern.Observer;

import observerPattern.Observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
    String userName;
    StocksObservable observable;

    public MobileAlertObserver(String userName, StocksObservable observable){
        this.userName = userName;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMsg(userName, "Iphone is in Stock");
    }

    private void sendMsg(String userName, String msg) {
        System.out.println("Notification sent over mobile");
    }
}
