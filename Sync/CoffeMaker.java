public class CoffeMaker {
    public void makeCoffee() {
        System.out.println("Making coffee . . . ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Making coffee interrupted.");
        }
        System.out.println("Coffee is finished.");
    }
}