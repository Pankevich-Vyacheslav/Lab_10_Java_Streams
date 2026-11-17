package ua.opnu;

import java.util.List;
import java.util.Comparator;
import java.util.Arrays;

public class EasyTasks {

    public static void main(String[] args) {
        // Для виконання лабораторної роботи необхідно написати вміст методів згідно умовам завдання,
        // після чого протестувати метод за допомогою тестів, які знаходяться в папці
        // src\test\TaskTest.java
    }

    public List<Integer> doubling(List<Integer> nums) {
        // Множимо кожен елемент списку на 2
        return nums.stream().map(num -> num * 2).toList();
    }

    public List<Integer> square(List<Integer> nums) {
        // Піднесення кожного числа до квадрата
        return nums.stream().map(num -> num * num).toList();
    }

    public List<String> moreY(List<String> strings) {
        // Додавання символу "y" на початок і в кінець кожного рядка
        return strings.stream().map(str -> "y" + str + "y").toList();
    }

    public List<Integer> noNeg(List<Integer> nums) {
        // Фільтрація: залишаємо лише невід'ємні числа
        return nums.stream().filter(num -> num >= 0).toList();
    }

    public List<Integer> no9(List<Integer> nums) {
        // Видалення чисел, які закінчуються на цифру 9
        return nums.stream().filter(num -> Math.abs(num % 10) != 9).toList();
    }

    public List<String> noZ(List<String> strings) {
        // Видалення рядків, які містять літеру 'z'
        return strings.stream().filter(str -> !str.contains("z")).toList();
    }

    public List<String> refinedStrings(List<String> strings) {
        // Видалення дублікатів і сортування за спаданням довжини
        return strings.stream().distinct().sorted(Comparator.comparingInt(String::length).reversed()).toList();
    }


    public List<String> flatten(List<String> strings) {
        // Розділення рядків за пробілами та об'єднання в один список
        return strings.stream().flatMap(str -> Arrays.stream(str.split(" "))).toList();
    }

}