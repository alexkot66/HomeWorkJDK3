package Task2;


import static Task2.ComparatorArrays.compareArrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5, 6};
        Integer[] array2 = {1, 2, 3};
        Integer[] array3 = {1, 2, 4, 5, 9, 12};
        String[] array4 = {"Иван", "Коля", "Саша", "Вика", "Нина", "Настя"};
        Number[] array5 = {1, 2.0, 3.0, 4, 5, 6};
        Number[] array6 = {1, 2, 3, 4, 5, 9};

        System.out.println(compareArrays(array1, array2)); // false
        System.out.println(compareArrays(array1, array3)); // true
        System.out.println(compareArrays(array1, array4)); // false
        System.out.println(compareArrays(array1, array5)); // false
        System.out.println(compareArrays(array1, array6)); // true
    }
}
