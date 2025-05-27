public class InstrumentDemo {

    
    interface Playable {
        void play();
    }


    static class Guitar implements Playable {
        public void play() {
            System.out.println("Strumming the guitar...");
        }
    }

    
    static class Piano implements Playable {
        public void play() {
            System.out.println("Playing the piano...");
        }
    }


    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        System.out.println("Guitar:");
        guitar.play();

        System.out.println("\nPiano:");
        piano.play();
    }
}
