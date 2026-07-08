package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        // a. Create an instance of Veena and call play() method
        System.out.println("--- Part A ---");
        Veena veenaInstance = new Veena();
        veenaInstance.play();

        // b. Create an instance of Saxophone and call play() method
        System.out.println("\n--- Part B ---");
        Saxophone saxInstance = new Saxophone();
        saxInstance.play();

        // c. Place the instances in a variable of type Playable and then call play()
        System.out.println("\n--- Part C (Polymorphic Assignment) ---");
        Playable playableInstrument;

        playableInstrument = veenaInstance;
        playableInstrument.play();

        playableInstrument = saxInstance;
        playableInstrument.play();
    }
}
