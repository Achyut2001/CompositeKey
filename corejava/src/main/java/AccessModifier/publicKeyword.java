package AccessModifier;

public class publicKeyword {
    public static void main(String[] args) {

        publicClass aClass = new publicClass();
        aClass.methodPublic();
    }
}

class publicClass {
    public void methodPublic() {
        System.out.println("Method is Public");
    }
}