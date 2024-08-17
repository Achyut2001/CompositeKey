package AccessModifier;

public class privateKeyword {
    public static void main(String[] args) {
        privateClass obj = new privateClass();
        /*  obj.privateKeyword(); */
    }
}

class privateClass {
    private void privateKeyword() {
        System.out.println("Only Access in same Class");

    }

    public static void main(String[] args) {
        privateClass aClass = new privateClass();
        aClass.privateKeyword();
    }
}