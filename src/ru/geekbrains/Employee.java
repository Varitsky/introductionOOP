package ru.geekbrains;

// Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
// Конструктор класса должен заполнять эти поля при создании объекта;
// Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;

public class Employee {

    private int idEmployee;
    private String name;
    private String position;
    private String eMail;
    private long phoneNumber;
    private long salary;
    private int age;


    //SETTERS

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //GETTERS

    public int getIdEmployee() {
        return idEmployee;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String geteMail() {
        return eMail;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public long getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }


    //CONSTRUCTORS

    public Employee(int idEmployee, String name, String position, String eMail, long phoneNumber, long salary, int age) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Employee(int idEmployee, String name, String position, long phoneNumber, long salary, int age) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Employee(int idEmployee, String name, String position, String eMail, long salary, int age) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.position = position;
        this.eMail = eMail;
        this.salary = salary;
        this.age = age;
    }

    public Employee(int idEmployee, String name, String position, long salary, int age) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
    }

    //PECHATORS

    public void printInfo(){
        System.out.println("\n"+"Данные на сотрудника номер ["+this.idEmployee+"]");
        System.out.println("Имя: "+this.name);
        System.out.println("Должность: "+this.position);
        if (this.eMail!=null){
            System.out.println("Адрес электронной почты: "+this.eMail);
        }
        if (this.phoneNumber!=0) {
            System.out.println("Номер телефона: " + this.phoneNumber);
        }
        System.out.println("Оклад: "+this.salary);
        System.out.println("Возраст: "+this.age);

    }

}
