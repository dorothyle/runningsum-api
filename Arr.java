/**
 * Arr Class
 * Contains an array as a data member and serves as a model for the API, which stores
 * data from the JSON object.
 */

package com.example.runningsum.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Arr {
    // Data Member
    private final int[] array;

    // Constructor
    public Arr(@JsonProperty("arr") int[] array) {
        this.array = array;
    }

    // Accessor
    public int[] getArr() {
        return this.array;
    }

    // Returns an array of running sums calculated from the input JSON object
    public int[] runningSum() {
        int[] sums = new int[array.length];

        // Returns empty array if data member array is empty
        if (array.length == 0) {
            return sums;
        }

        // Sets first sum as first element in array
        sums[0] = array[0];

        for (int i = 1; i < array.length; i++) {
            // Adds previous sum to current element in array
            sums[i] = sums[i - 1] + array[i];
        }

        return sums;
    }
}
