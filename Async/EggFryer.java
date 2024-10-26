import java.util.concurrent.CompletableFuture;

public class EggFryer {
    public CompletableFuture<Void> fryEgg() {
        return CompletableFuture.runAsync(() -> {
            System.out.println("Frying egg . . . ");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Frying egg is interrupted!");
            }
            System.out.println("Egg is ready.");
        });
    }
}