package ru.GeekBrains.Java.Lev_2.MyHomeWork.HomeWork_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся)
        String[] setWrods = {"home","play", "cat", "love", "home", "cat",
                "read", "hand", "earth", "near", "cat", "play",
                "home","play", "cat", "love", "home", "cat", "earth", "near"};

        //Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем)
        Set<String> uniqueWords = new HashSet<>();
        for (int i = 0; i < setWrods.length; i++) {
            uniqueWords.add(setWrods[i]);
        }
        System.out.println(uniqueWords);


        //Посчитать сколько раз встречается каждое слово.
        Map<String, Integer> repeatWords = new HashMap<>();
        for (int i = 0; i < setWrods.length; i++) {
            if (repeatWords.get(setWrods[i]) == null){
                repeatWords.put(setWrods[i], 1);
            } else {
                repeatWords.put(setWrods[i], repeatWords.get(setWrods[i])+1);
            }
        }
        System.out.println(repeatWords);

        //В этот телефонный справочник с помощью метода add() можно добавлять записи.
        addPhonebook();

    }

    static void addPhonebook(){

        Phonebook pb = new Phonebook();
        pb.add("Ivanov", "111-11-11");
        pb.add("Petrov", "222-11-11");
        pb.add("Sidorov", "333-11-11");
        pb.add("Ivanov", "444-11-11");

        System.out.println("Searching for name Ivanov: " + pb.get("Ivanov"));
    }




}
