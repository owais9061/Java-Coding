package experiment09;
// Crawlable interface
interface Crawlable {
    void crawl();
}

// Moveable interface
interface Moveable {
    void move();
}

// Animal class implementing both Crawlable and Moveable interfaces
class Animal implements Crawlable, Moveable {
    @Override
    public void crawl() {
        System.out.println("Animal is crawling.");
    }

    @Override
    public void move() {
        System.out.println("Animal is moving.");
    }
}


