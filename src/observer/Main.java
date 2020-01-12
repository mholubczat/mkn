package observer;

public class Main {
    public static void main(String[] args) {

        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();
        System.out.println(observer.getNews());
        observable.addObserver(observer);
        observable.setNews("news");
        System.out.println(observer.getNews());

        System.out.println("------------ implementacja z interfejsem observer");
ONewsAgency observableO = new ONewsAgency();
        ONewsChannel observerO = new ONewsChannel();
        ONewsChannel observerO1 = new ONewsChannel();

        System.out.println(observerO.getNews());

        observableO.addObserver(observerO);
        observableO.addObserver(observerO1);
        observableO.setNews("newsO");

        System.out.println(observerO1.getNews());
    }
}
