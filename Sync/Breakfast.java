public class Breakfast {
    public static void main(String[] args) {
        System.out.println("Starting to prepare breakfast . . . . . ");

        long start = System.currentTimeMillis();

        BreadToaster breadToaster = new BreadToaster();
        EggFryer eggFryer = new EggFryer();
        CoffeMaker coffeMaker = new CoffeMaker();
        breadToaster.toastBread();
        eggFryer.fryEggs();
        coffeMaker.makeCoffee();

        long end = System.currentTimeMillis();

        System.out.println("Breakfast is ready in " + (end - start) + " ms");

        /*
         * Output:
         * 
         * Starting to prepare breakfast . . . . .
         * Toasting bread . . .
         * Bread is toasted.
         * Frying eggs . . .
         * Eggs are done.
         * Making coffee . . .
         * Coffee is finished.
         * Breakfast is ready in 6004 ms
         */
    }
}
