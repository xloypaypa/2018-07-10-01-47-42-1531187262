package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return this.array.stream().map(integer -> integer * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return this.array.stream().map(integer -> letters[integer - 1]).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        return this.array.stream().map(integer -> {
            String result = "";
            while (integer != 0) {
                int now = (integer - 1) % 26;
                result += letters[now];
                integer = (integer - 1) / 26;
            }
            return new StringBuilder(result).reverse().toString();
        }).collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        return this.array.stream().sorted((o1, o2) -> -Integer.compare(o1, o2)).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return this.array.stream().sorted(Integer::compare).collect(Collectors.toList());
    }
}
