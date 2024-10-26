public class BreadToaster {
    public void toastBread() {
        System.out.println("Toasting bread . . .");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Toasting bread is interrupted.");
        }
        System.out.println("Bread is toasted.");
    }
}
