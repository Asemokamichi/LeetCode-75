package com.asemokamichi;

import com.asemokamichi.leetcode.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Object, Integer> map = new HashMap<>();
        map.put(null, 3);
        map.put(null, 2);
        map.put(2, 3);
        map.put(0, 3);
        Person k = new Person("gjhb");
        map.put(k, 9);
        map.put(new Person("skldm"), 897);
        k.setName("skldm");
        for (Object key: map.keySet()) {
            System.out.printf("key = %s value = %d\n", key, map.get(key));
        }
        System.out.println(map.get(null));
        System.out.println(map.get(new Person("gjhb")));
        System.out.println(map.containsKey(null));

        Set<Object> set = new HashSet<>();
        set.add(null);
        set.add(null);
        set.add(90);
        set.add("jks");

        System.out.println(set);

        Object object = 0;
        System.out.println("hashCode = " + object.hashCode());
//        System.out.println("equals null and null = " + object.equals(null));


    }
}
