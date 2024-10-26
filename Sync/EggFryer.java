public class EggFryer {
    public void fryEggs() {
        System.out.println("Frying eggs . . .");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Frying eggs is interrupted.");
        }
        System.out.println("Eggs are done.");
    }
}