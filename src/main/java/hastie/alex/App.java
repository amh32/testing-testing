package hastie.alex;

/**
 * Hello world!
 */
public final class App {
    int a = 7;
    int b = 3;
    int c;

    //constructor to used for initialization if necessary
    private App() {
    }
    

    /** An arbitrary equation for result testing */
    static void mathTest(int a, int b) { 
        
        App anApp = new App();

        anApp.c = a * b;
        System.out.println(anApp.c);
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */

     public static void main(String[] args) {
        System.out.println("Hellow World");
        App anApp = new App();
        mathTest(anApp.a, anApp.b);
    }
}
