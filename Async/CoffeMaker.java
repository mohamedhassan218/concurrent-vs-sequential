import java.util.concurrent.CompletableFuture;

public class CoffeMaker {
    public CompletableFuture<Void> makeCoffee() {
        return CompletableFuture.runAsync(() -> {
            System.out.println("Making coffee . . . ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Making coffee is interrupted!");
            }
            System.out.println("Coffee is ready.");
        });
    }
}