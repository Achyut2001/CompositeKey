package CurrnecyConvertar;

public class Rupee implements Currency {
    @Override
    public double ConvertToUSD(double amount) {
        return amount * 83;
    }
}

