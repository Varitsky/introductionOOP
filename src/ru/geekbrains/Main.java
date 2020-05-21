package ru.geekbrains;

public class Main {
    private static int staff = 5;

    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[staff];
        //ФИО, должность, email, телефон, зарплата, возраст;
        //телефон или/и почту можно не указывать

        employeeArray[0] = new Employee(1, "VARITSKII DMITRII", "Engineer", "varitsky@gmail.com", 8_926_477_77_84L, 20_000, 31);
        employeeArray[1] = new Employee(2, "AID KRONOVICH", "God of Underworld of the dead", 9223372036854775807L, 2147483647);
        employeeArray[2] = new Employee(3, "Ryan", "Good boy", 110_000, 1);
        employeeArray[3] = new Employee(4, "ARTEMII PANARIN", "Hockey player", "newyorkrangers@thegarden.com",
                1_212_465_6000L, 825097645000L, 28);

        employeeArray[4] = new Employee();
        employeeArray[4].setIdEmployee(5);
        employeeArray[4].setName("Jesus");
        employeeArray[4].setPosition("Messiah");
        employeeArray[4].setSalary(0);
        employeeArray[4].setAge(2020);

        printOutTheListOfEmmployeesWhoIsOverAge(employeeArray, 40);

        employeeArray[0].printInfo();

    }

    public static void printOutTheListOfEmmployeesWhoIsOverAge(Employee[] employeeArray, int employeeAge) {
        System.out.println("\n" + "Employee over " + employeeAge + " list: ");
        for (int i = 0; i < staff; i++) {
            if (employeeArray[i].getAge() > employeeAge) {
                System.out.println(employeeArray[i].getName());
            }
        }
        System.out.println();
    }
}
