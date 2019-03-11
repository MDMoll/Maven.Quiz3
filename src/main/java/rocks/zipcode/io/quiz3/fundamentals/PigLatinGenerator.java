package rocks.zipcode.io.quiz3.fundamentals;

import static rocks.zipcode.io.quiz3.fundamentals.VowelUtils.hasVowels;
import static rocks.zipcode.io.quiz3.fundamentals.VowelUtils.isVowel;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] splitString = str.split("\\s");
        String[] outputArr = new String[splitString.length];
        StringBuilder sb = new StringBuilder();
        String output = "";
        for (String s : splitString) {
            char c = s.charAt(0);
            if (isVowel(c)) {
                output = (s += "way");
            }
            if (!hasVowels(s)) {
                output = (s += "ay");
            }
            for (int i = 0; i < s.length(); i++){
                StringBuilder piggedString = new StringBuilder(s);
                while (!isVowel(piggedString.charAt(0))) {
                    piggedString.append(s.charAt(i));
                    piggedString.deleteCharAt(0);
                    piggedString.toString();
                    i++;
                }
                if (isVowel(piggedString.charAt(i))) {
                     String pigged = piggedString.toString();
                     output = (pigged += "ay");
                }
            }
        }
        return output;
    }
}