public class Main {
    public static void main(String[] args) {

        Group penzalive = new Group("Новости Пенза");
        Group dodopizza = new Group("Пицца ДоДо");
        Group avtonews = new Group("Авто новости");
        Group resales = new Group("Перепродажи");

        User userFirst = new User("Валера");
        userFirst.subscribe(penzalive);
        userFirst.subscribe(dodopizza);
        userFirst.subscribe(avtonews);
        User userSecond = new User("Иннокентий");
        userSecond.subscribe(penzalive);
        userSecond.subscribe(dodopizza);
        userSecond.subscribe(avtonews);
        userSecond.subscribe(resales);

        penzalive.news("Сегодня сгорел спар в ближнем арбекове");
        dodopizza.news("Доступен новый промокод \"LETO\" на три пиццы");
        avtonews.news("Продается Volkswagen Polo");
        resales.news("В продаже появились новые кросовки Ollie Skate");
    }
}