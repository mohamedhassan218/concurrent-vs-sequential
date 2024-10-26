import java.util.concurrent.CompletableFuture;

public class BreadToaster {

    public CompletableFuture<Void> toastBread() {
        return CompletableFuture.runAsync(() -> {
            System.out.println("Toasting bread . . . ");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Toasting bread is interrupted!");
            }
            System.out.println("Bread is ready.");
        });
    }
}