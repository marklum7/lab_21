public class User implements Users {
    String username;
    User(String username){
        this.username=username;
    }

    @Override
    public void subscribe(Groups title) {
        title.newSubscriber(this);
    }
    @Override
    public void unsubscribe(Groups title) {
        title.dellSubscriber(this);
    }

    @Override
    public void post(String news, String title){
        System.out.println(this.username+", в канале \""+title+"\" вышла запись: "+news);
    }

}