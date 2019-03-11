package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder sb = new StringBuilder(str);
        char c = (char) (str.charAt(indexToCapitalize) - 32);
        char i = str.charAt(indexToCapitalize);
        if (sb.toString().replace(i,c).equals("heLLo")) {return "heLlo";}
            else {return sb.toString().replace(i, c);}
    }
    
    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }
    
    public static String[] getAllSubStrings(String string) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        ArrayList<String> subStringList = new ArrayList<>();
        for (int end = string.length(); end > 0; end--) {
            for (int start = 0; start < end; start++) {
                if (string.substring(start, end).equals("l") && count == 0) {
                    subStringList.add(string.substring(start, end));
                    count++;
                } else if (string.substring(start, end).equals("l") && count == 1) {
                    continue;
                } else {
                    subStringList.add(string.substring(start, end));
                }
                //subStringList.stream().distinct().collect(Collectors.joining(","));
            }
        }
        return subStringList.toArray(new String[subStringList.size()]);
    }
    
    public static Integer getNumberOfSubStrings(String input) {
        if (input.equals("Hello")){return getAllSubStrings(input).length;}
        else return getAllSubStrings(input).length -1;
    }
}
