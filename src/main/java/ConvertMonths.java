public class ConvertMonths implements Months{
    @Override
    public int convert(int days) {
        return days/30;
    }
}
