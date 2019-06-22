package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return this.arrayList.stream().sorted().collect(Collectors.toList()).get(this.arrayList.size() - 1);
    }

    public double getMinimum() {
        return this.arrayList.stream().sorted().collect(Collectors.toList()).get(0);
    }

    public double getAverage() {
        double sum = 0;
        for (int now : arrayList) {
            sum += now;
        }
        return sum / arrayList.size();
    }

    public double getOrderedMedian() {
        int size = arrayList.size();
        if (size % 2 == 1) {
            return this.arrayList.get(size / 2);
        } else {
            return ((double) (this.arrayList.get(size / 2) + this.arrayList.get(size / 2 - 1))) / 2;
        }
    }

    public int getFirstEven() {
        return this.arrayList.get(getIndexOfFirstEven());
    }

    public int getIndexOfFirstEven() {
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (this.arrayList.get(i) % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {
        return this.arrayList.equals(arrayList);
    }

    public Double getMedianInLinkList(SingleLink<Integer> singleLink) {
        int size = arrayList.size();
        if (size % 2 == 1) {
            return Double.valueOf(singleLink.getNode(size / 2 + 1));
        } else {
            return ((double) (singleLink.getNode(size / 2) + singleLink.getNode(size / 2 + 1))) / 2;
        }
    }

    public int getLastOdd() {
        return this.arrayList.get(getIndexOfLastOdd());
    }

    public int getIndexOfLastOdd() {
        for (int i = this.arrayList.size() - 1; i >= 0; i--) {
            if (this.arrayList.get(i) % 2 == 1) {
                return i;
            }
        }
        return -1;
    }
}
