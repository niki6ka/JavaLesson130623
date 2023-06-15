//Пусть дан произвольный список целых чисел.
//
//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение
//

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers_list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers_list.add(new Random().nextInt(100));

        }
        System.out.println(numbers_list);

        for (int i = 0; i < numbers_list.size(); i++) {
            if (numbers_list.get(i) % 2 == 0) {
                numbers_list.remove(i);
                i=i-1;

            }
        }
        System.out.println(numbers_list);

        Collections.sort(numbers_list);
        int mini = Collections.min(numbers_list);
        int maxi = Collections.max(numbers_list);
        int summ = 0;
        int count = 0;
        int summ2 = 0;

        System.out.println(numbers_list);
        int middle = numbers_list.size()/2; // Тут ищем среднего просто в списке, который в середине списка

        System.out.println("The min = " + mini);

        System.out.println("The max = " + maxi);

        System.out.println("The middle of list = " + numbers_list.get(middle));


        for (int i = mini; i <= maxi; i++) { // Поиск среднеарифметического между Мин и Мах
            summ = summ + i;
            count = count + 1;
            }
        System.out.println("The middle of Min and Max = " + summ/count);


        for (int i = 0; i < numbers_list.size(); i++) { // Поиск среднеарифметического между Мин и Мах среди значений в листе
            summ2 = (numbers_list.get(i) + summ2);


        }
        System.out.println("The middle of Min and Max in the list numbers = " + summ2/numbers_list.size());

        System.out.println("Ну либо совсем по-тупому = " + ((mini+maxi)/2));









    }
}