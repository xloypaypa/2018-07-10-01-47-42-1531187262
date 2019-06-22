package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> list = new ArrayList<>();
        for (Integer[] now : array) {
            list.addAll(Arrays.asList(now));
        }
        return list;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> list = new ArrayList<>();
        for (Integer[] now : array) {
            list.addAll(Arrays.stream(now).filter(integer -> !list.contains(integer)).collect(Collectors.toList()));
        }
        return list;
    }
}
