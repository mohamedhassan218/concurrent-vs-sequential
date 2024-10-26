import java.util.concurrent.CompletableFuture;

public class Breakfast {

    public static void main(String[] args) {
        System.out.println("Starting to prepare breakfast. . . . . ");

        long start = System.currentTimeMillis();

        BreadToaster toastBread = new BreadToaster();
        CoffeMaker makeCoffee = new CoffeMaker();
        EggFryer fryEgg = new EggFryer();
        CompletableFuture<Void> toast = toastBread.toastBread();
        CompletableFuture<Void> coffee = makeCoffee.makeCoffee();
        CompletableFuture<Void> egg = fryEgg.fryEgg();

        CompletableFuture.allOf(toast, coffee, egg).thenRun(() -> {
            long end = System.currentTimeMillis();
            System.out.println("Breakfast is ready.\nTotal time: " + (end - start) + "ms");
        }).join();

        /*
         * The Output:
         * 
         * Starting to prepare breakfast. . . . .
         * Making coffee . . .
         * Frying egg . . .
         * Toasting bread . . .
         * Coffee is ready.
         * Egg is ready.
         * Bread is ready.
         * Breakfast is ready.
         * Total time: 3020ms
         */
    }
}
