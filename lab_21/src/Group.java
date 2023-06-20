import java.util.ArrayList;
import java.util.List;

public class Group implements Groups {
    String title;
    List<Users> subscribers;
    List<String> news;

    Group(String title){
        this.title=title;
        this.news = new ArrayList<>();
        this.subscribers= new ArrayList<>();
    }

    void news(String news){
        this.news.add(news);
        conclusion();
    }

    @Override
    public void newSubscriber(Users username){
        subscribers.add(username);

    }
    @Override
    public void dellSubscriber(Users username) {
        subscribers.remove(username);
    }

    @Override
    public void conclusion() {
        for(Users username:subscribers){
            username.post(news.get(news.size()-1), this.title );
        }
    }
}