package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            list.add(i);
        }
        for (int i = left; i >= right; i--) {
            list.add(i);
        }
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        for (int i = left; i >= right; i--) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int now : array) {
            if (now % 2 == 0) {
                list.add(now);
            }
        }
        return list;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> list = new ArrayList<>();
        for (int x : secondArray) {
            for (int y : firstArray) {
                if (x == y) {
                    list.add(x);
                }
            }
        }
        return list;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> first = new ArrayList<>(Arrays.asList(firstArray));
        for (int now : secondArray) {
            if (!first.contains(now)) {
                first.add(now);
            }
        }
        return first;
    }
}
