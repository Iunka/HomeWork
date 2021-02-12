package ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_3;

import java.util.*;

public class Phonebook {

    private Map<String, Set<String>> record = new HashMap<>();

    public void add(String name, String number){
        Set<String> numbers = new HashSet<>();
        record.put(name, numbers);
    }

    public Set<String> get(String name){
        if (record.containsKey(name)) {
            return record.get(name);
        }
        return Collections.emptySet();

    }

}
