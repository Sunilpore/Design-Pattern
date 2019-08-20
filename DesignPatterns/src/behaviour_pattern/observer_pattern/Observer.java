package behaviour_pattern.observer_pattern;

public interface Observer {

    void update();

    void subscribeChannel(Channel ch);
}
