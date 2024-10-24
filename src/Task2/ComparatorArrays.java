package Task2;
/*
Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
если они одинаковые, и false в противном случае.
Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать
элементы одного типа по парно по индексам.
 */
public class ComparatorArrays {

    public static <T, U> boolean compareArrays(T[] array1, U[] array2) {
        boolean result = false;
        // Проверка на равенство длины массивов
        if (array1.length == array2.length) {
            // Проверка на совпадение типов элементов
            if (array1.getClass().getComponentType().equals(array2.getClass().getComponentType())) {
                result = true;// Массивы одинаковые
            }
        }

        return result;
    }

}
