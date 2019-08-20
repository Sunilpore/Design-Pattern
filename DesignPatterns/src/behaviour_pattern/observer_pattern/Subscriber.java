package behaviour_pattern.observer_pattern;

public class Subscriber implements Observer{

    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(){
        System.out.println("Hi "+name+", video uploaded: "+channel.title);
    }

    @Override
    public void subscribeChannel(Channel ch){
        channel = ch;
    }

}
