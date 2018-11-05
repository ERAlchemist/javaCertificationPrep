package academy.learnprogramming;

class MuseumClosed extends RuntimeException{}

class MuseumClosedForLunch extends MuseumClosed {}

public class CatchingExceptions {

    public static void main(String[] args) {
        try {
            visitMuseum();
        } catch(MuseumClosedForLunch mc) { // subclass
            System.out.println("Closed for lunch come back in 2 hours");
        } catch(MuseumClosed mc) {  // superclass
            System.out.println("Closed");
        }
    }

    public static void visitMuseum() {
        boolean b = Math.random() < 0.5;

        if(b) {
            throw new MuseumClosed();
        }

        throw new MuseumClosedForLunch();
    }
}
