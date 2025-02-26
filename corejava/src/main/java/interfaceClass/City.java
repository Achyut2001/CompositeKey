package InterfaceClass;

public interface City {

    class InnerClass {
        void method(){
            System.out.println("InnerClass");
        }
 }
    void city();
}

class main implements City, PoliceStation {
    public void city() {
        System.out.println("Udgir City");
    }

    @Override
    public void police() {
        System.out.println("udgir Police");
    }
}

class main2 implements City, PoliceStation {
    public static void main(String[] args) {
        main obj = new main();
        obj.city();
        obj.police();

        main2 obj1 = new main2();
        obj1.city();
        obj1.police();


    }

    public void city() {
        System.out.println("Latur city");
    }

    public void police() {
        System.out.println("Latur Police");
    }
}

