package observerDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObserverMain {
    public static void main(String[] args) throws IOException {
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        Subscriber aman = new Subscriber("Aman");
        Subscriber raman = new Subscriber("Raman");
        youtubeChannel.subscribe(raman);
        youtubeChannel.subscribe(aman);
        youtubeChannel.notifyChanges("learn design pattern");
        youtubeChannel.notifyChanges("New course Angular!!!");

        System.out.println("============================================================");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            System.out.println("Press 1:  To upload video");
            System.out.println("Press 2:  Create new Subscriber");
            System.out.println("Press 3: To exit");
            System.out.println("Press 4: To unsubscribe");

            int c = Integer.parseInt(bufferedReader.readLine());
            if(c == 1){
                System.out.println("Enter a video title");
                String videoTitle = bufferedReader.readLine();
                youtubeChannel.notifyChanges(videoTitle);
            }else if(c == 2){
                System.out.println("Enter Name of Subscriber");
                String subsName = bufferedReader.readLine();
                Subscriber subscriber = new Subscriber(subsName);
                youtubeChannel.subscribe(subscriber);
            }else if (c == 3){
                System.out.println("Thank ou for using app!! ");
                break;
            }else if (c == 4){
                System.out.println("Enter Name for Unsubscribe");
                String subsName = bufferedReader.readLine();
                Subscriber subscriber = new Subscriber(subsName);
                youtubeChannel.unsubscribe(subscriber);
                System.out.println(subsName + ": is unsubscribe!!");
            }else{
                System.out.println("wrong input");
            }
        }
    }
}
