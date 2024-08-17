package Inheritance;


class mobile {
    int mobile_qty() {
        int qty = 10;
        return qty;
    }

    double mobile_price() {
        double price = 2500.00;
        return price;
    }
}

class shop extends mobile {

}

public class parent3 {
    public static void main(String[] args) {
        shop shop = new shop();
        System.out.println("Mobile qty is " + shop.mobile_qty());
        //   shop.mobile_qty();
        System.out.println("Mobile price is " + shop.mobile_price());
    }
}
