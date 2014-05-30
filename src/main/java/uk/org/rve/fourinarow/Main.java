package uk.org.rve.fourinarow;

public class Main {

    public static void main(String args[]) {
        final FourInARow game = new FourInARow(System.in, System.out);
        game.play();
    }

}
