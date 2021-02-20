public class HourlyPayer implements Payer {
    @Override
    public void pay() {
        System.out.println("Paying by the hour!");
    }
}
