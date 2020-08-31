package CodeWars.MexicanWave;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MexicanWave {
    private static String[] wave(String str) {
        final String[] word = {""};
        ArrayList<String> wave = new ArrayList<>();

        String[] letters = str.toLowerCase().split("");

            Stream.iterate(0, n -> n+1)
                    .limit(str.length())
                    .forEach(i -> {

                        Stream.iterate(0, n -> n + 1)
                                .limit(str.length())
                                .forEach(x -> {
                                    if (x.equals(i))
                                        word[0] += letters[x].toUpperCase();
                                    else word[0] += letters[x];
                                });
                        if (!letters[i].equals(" "))
                            wave.add(word[0]);
                        word[0] = "";
                    });

        String[] mexicanWave = new String[wave.size()];

        Stream.iterate(0, n -> n + 1)
                .limit(wave.size())
                .forEach(x -> mexicanWave[x] = wave.get(x));


        return mexicanWave;
    }

    public static void main(String[] args) {
        MexicanWave.wave("Hello");
        MexicanWave.wave("Two Words");
    }
}
