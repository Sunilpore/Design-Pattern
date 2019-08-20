package behaviour_pattern.observer_pattern;

public class YoutubeActivity {

    /*
        @Subscriber-> subscribers are observers here, and they are observing the channel.
        Once any video is uploaded, subscribers will get the notification.

        @Channel-> It is a subject here

        Here channel will push the info and subscriber will pull the information
     */

    public static void main(String[] args) {

        Channel marvel = new Channel();

        Subscriber s1 = new Subscriber("Amit");
        Subscriber s2 = new Subscriber("Ben");
        Subscriber s3 = new Subscriber("Carry");
        Subscriber s4 = new Subscriber("Demon");
        Subscriber s5 = new Subscriber("Ekon");

        marvel.subscribe(s1);
        marvel.subscribe(s2);
        marvel.subscribe(s3);
        marvel.subscribe(s4);
        marvel.subscribe(s5);

        marvel.unSubscribe(s3);

        s1.subscribeChannel(marvel);
        s2.subscribeChannel(marvel);
        s3.subscribeChannel(marvel);
        s4.subscribeChannel(marvel);
        s5.subscribeChannel(marvel);

        marvel.upload("Avenger Teaser");

    }


}
