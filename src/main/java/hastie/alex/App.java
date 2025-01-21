package hastie.alex;

/**
 * Hello world!
 */
public final class App {
    int a = 7;
    int b = 3;
    int c;

    /** An arbitrary equation for result testing */
    public void mathTest(int a, int b) { 
        c = a * b;
        // System.out.println(c);
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */

     public static void main(String[] args) {
        System.out.println("Hellow World");
        App anApp = new App();
        anApp.mathTest(anApp.a, anApp.b);
    }
}
