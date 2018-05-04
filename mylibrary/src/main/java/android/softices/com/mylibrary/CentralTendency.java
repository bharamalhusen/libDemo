package android.softices.com.mylibrary;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Rahul on 5/3/2018.
 */

public class CentralTendency {
    /**
     * Computes the arithmetic mean of a set of numbers
     *
     * @param numbers
     * @return
     */
    public static Number arithmeticMean(Collection<? extends Number> numbers) {
        //check type of values
        Iterator<? extends Number> iterator = numbers.iterator();
        Number firstNumberInCollection = iterator.next();

        if (firstNumberInCollection instanceof Integer) {
            return computeMeanInt(numbers);
        }

        return computeMeanInt(numbers);
    }

    /**
     * computes arithmetic mean for a set of Integer values
     *
     * @param numbers
     * @return
     */
    private static Number computeMeanInt(Collection<? extends Number> numbers) {
        double result = 0;
        Iterator<? extends Number> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            result += iterator.next().intValue();
        }
        return result / numbers.size();
    }
}