package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        
        return array.toArray();
    }

    public SomeType findEvenOccurringValue() {
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return null;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
      return null;  //return Stream.of(predicate).filter(x -> x.);
    }
}
