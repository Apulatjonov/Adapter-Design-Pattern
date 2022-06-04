public class ConvertWeeks implements Weeks{
    private ConvertMonths convertMonths;

    public ConvertWeeks(){
        convertMonths = new ConvertMonths();
    }

    //calculation is imaginary not that precise
    @Override
    public int convertWeeks(int days) {
        return convertMonths.convert(days)*30/8;
    }
}
