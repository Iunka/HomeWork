package ru.GeekBrains.Java.Lev_1.MyHomeWork.HomeWork5;

public class HomeWork_5 {
    public static void main(String[] args){

        // 4.	Создать массив из 5 сотрудников.

        Employee[] employees = {
                new Employee("Иванов Вадим Вадимович", "Инженер",
                        "email.@gmail.com", "111-11-11",
                        45000, 20),
                new Employee("Масянина Анна Викторовна", "Секретарь",
                        "anna@gmail.com", "222-22-22",
                        20000, 52),
                new Employee("Костиков Евгений Викторович", "Архитектор",
                        "genius@@gmail.com", "333-33-33",
                        120000, 58),
                new Employee("Прутков Кузьма Антонович", "Юрист",
                        "kuzia@gmail.com", "444-44-44",
                        70000, 25),
                new Employee("Крутикова Татьяна Ивановна", "Директор",
                        "dir@gmail.com", "555-55-55",
                        2000000, 41)
        };

        // 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        for (int i = 0; i < employees.length; i++)
            if (employees[i].getAge() > 40)
                System.out.println(employees[i].getFull());


    }

}
