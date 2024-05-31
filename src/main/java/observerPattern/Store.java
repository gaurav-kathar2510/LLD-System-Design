package observerPattern;

import observerPattern.Observable.IphoneObservable;
import observerPattern.Observable.StocksObservable;
import observerPattern.Observer.EmailAlertObserver;
import observerPattern.Observer.MobileAlertObserver;
import observerPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservable();

        NotificationAlertObserver observer1 = new EmailAlertObserver("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("myname_abc", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(100);
    }
}


//Notes
/*
- Asked in walmart interview question
- important design pattern
Applicability
    when ab abstraction has two aspects, one dependent on another. Encapsulating these in seprate ojects lets u vary and reuse 'em independently
    When change in one object require changing other and you dont know how many objects need to be changed.
    When object should be able to notify.






*/
