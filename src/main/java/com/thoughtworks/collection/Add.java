package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum = 0;
        for (int i = Math.min(leftBorder, rightBorder); i <= Math.max(leftBorder, rightBorder); i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum = 0;
        for (int i = Math.min(leftBorder, rightBorder); i <= Math.max(leftBorder, rightBorder); i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for (int now : arrayList) {
            sum += now * 3 + 2;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        for (int now : arrayList) {
            result.add(now % 2 == 1 ? now * 3 + 2 : now);
        }
        return result;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        for (int now : arrayList) {
            if (now % 2 == 1) {
                sum += now * 3 + 5;
            }
        }
        return sum;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        double sum = 0;
        int count = 0;
        for (int now : arrayList) {
            if (now % 2 == 0) {
                sum += now;
                count++;
            }
        }
        return sum / count;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return getMedianOfEven(arrayList);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        for (int now : arrayList) {
            if (now % 2 == 0 && now == specialElment) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        for (int now : arrayList) {
            if (now % 2 == 0 && !result.contains(now)) {
                result.add(now);
            }
        }
        return result;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int now : arrayList) {
            if (now % 2 == 0) {
                even.add(now);
            } else {
                odd.add(now);
            }
        }
        even.sort(Integer::compare);
        odd.sort((o1, o2) -> -Integer.compare(o1, o2));
        List<Integer> result = new ArrayList<>();
        result.addAll(even);
        result.addAll(odd);
        return result;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        Integer pre = null;
        for (int now : arrayList) {
            if (pre != null) {
                result.add((now + pre) * 3);
            }
            pre = now;
        }
        return result;
    }
}
