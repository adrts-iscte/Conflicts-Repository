public class ConflictingClass {

    void x() {
        int x = 88;
        System.out.println("x");
        for (int i = 0; i != 5; i++) {
            System.out.println(i);
        }
    }

    void z() {
        char z = 'z';
        System.out.println("z");
    }

    void y() {
        char y = 'y';
        System.out.println("y");
    }

}
