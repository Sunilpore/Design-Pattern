package behaviour_pattern.observer_pattern;

public interface Subject {

    void subscribe(Subscriber sub);

    void unSubscribe(Subscriber sub);

    void notifySubscriber();

    void upload(String title);
}
