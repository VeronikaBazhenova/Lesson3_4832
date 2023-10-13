package ru.geekbrains.lesson3;

/**
 * TODO: Разработать тип Freelancer самостоятельно в рамках выполнения
 *  домашней работы
 * Фрилансер (работник с почасовой оплатой)

 */
public class Freelancer extends Employee{
    double salaryHour;
    public Freelancer(String surName, String name, double salaryHour, int age) {
        super(surName, name, salaryHour, age);
        this.salaryHour = salaryHour;
    }


    @Override
    public double calculateSalary() {
        return salary = 20.8*8*salaryHour;
    }
    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата (почасовая): %.2f (руб.), Возраст: %s",
                surName, name, calculateSalary(), age);
    }
}
