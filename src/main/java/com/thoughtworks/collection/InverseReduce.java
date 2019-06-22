package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> list = new ArrayList<>();
        do {
            int now  = random.nextInt(3);
            number -= now;
            if (number > 0) {
                list.add(number);
            }
        } while (number > 0);
        return list;
    }
}
