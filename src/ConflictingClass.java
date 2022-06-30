public class ConflictingClass {

    void x() {
        int x = 88;
        System.out.println("x");
    }

    void y() {
        char y = 'y';
        System.out.println("y");
    }
    
    void z() {
        for (int i = 0; i != 5; i++) {
            System.out.println(i);
        }
    }

}
