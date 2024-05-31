package observerPattern.Observer;

import observerPattern.Observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String emailId;
    StocksObservable observable;

    public EmailAlertObserver(String emailid, StocksObservable observable){
        this.emailId = emailid;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId,"Product is in Stock");
    }

    private void sendMail(String emailId, String msg) {
        System.out.println("mail sent to: "+ emailId);
    }
}
