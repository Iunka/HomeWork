package ru.GeekBrains.Java.Lev_1.MyHomeWork.HomeWork5;

class Employee {

    // 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    private String name;
    private String position;
    private String email;
    private String phone;
    private float salary;
    private int age;

    // 2.	Конструктор класса должен заполнять эти поля при создании объекта;

    Employee (String name,
              String position,
              String email,
              String phone,
              float salary,
              int age) {

        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

        // 3. Внутри класса «Сотрудник» написать метод,
        // который выводит информацию об объекте в консоль

    String getName() {
        return name;
        }

    String getPosition() {
        return position;
    }

    String getEmail() {
        return email;
    }

    String getPhone() {
        return phone;
    }

    float getSalary() {
        return salary;
    }

    int getAge() {
        return age;
    }

    String getFull() {
        return  this.name + " " +
                this.age + " лет, " +
                this.position + ". Email: " +
                this.email + "Телефонный номер: " +
                this.phone + ". Зарплата: " +
                this.salary + " рублей.";
    }
    public void toOutputInfo(Employee employee){
        System.out.println(getFull());
    }
}