package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    static Random random = new Random();

    static Employee generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        boolean choise = new Random().nextBoolean();
        Employee worker = null;
        if (choise) {
            int salary = random.nextInt(50000, 110000);
            int age = random.nextInt(20, 65);
             worker = new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age);
        }else {
            int salaryHour = random.nextInt(500,1001);
            int age = random.nextInt(20, 65);
             worker = new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salaryHour, age);
             worker.calculateSalary();

        }

        return worker;
    }

    /**
     * TODO: Переработать метод generateEmployees. Метод должен возвращать массив сотрудников
     *  разных типов (Worker, Freelancer), метод должен быть ОДИН!

     */
    static Employee[] generateEmployees(int count){
        Employee[] employes = new Employee[count];

        for (int i = 0; i < employes.length; i++)
            employes[i] = generateWorker();
        return employes;
    }

    public static void main(String[] args) {

        Employee[] employees = generateEmployees(10);


        Arrays.sort(employees, new SalaryComparator(SortType.Ascending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println();

        Arrays.sort(employees, new SalaryComparator(SortType.Descending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        //-------------------//

        Arrays.sort(employees, new AgeComparator(SortType.Ascending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println("=========================");

        Arrays.sort(employees, new AgeComparator(SortType.Descending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }


    }



}
