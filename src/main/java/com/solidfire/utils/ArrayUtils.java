package com.solidfire.utils;

/**
 * Created by Jason Ryan Womack on 9/7/16.
 */
public class ArrayUtils {

    public static final Long[] toWrapper(final long[] input) {
        final Long[] output = new Long[input.length];
        int i = 0;
        for(final long element : input) {
            output[i++] = element;
        }
        return output;
    }

    public static final long[] toPrimative(final Long[] input) {
        final long[] output = new long[input.length];
        int i = 0;
        for(final long element : input) {
            output[i++] = element;
        }
        return output;
    }
}
