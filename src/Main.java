public class Main {

    //    int[] array = generateRandomArray();
    /*Метод generateRandomArray модернизирован: сейчас с его помощью можно задать случайные числа
    из массива с длиной, задающей при вызове данного метода. */
    public static int[] generateRandomArray(int a){
        java.util.Random random = new java.util.Random();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100_000) + 100_000;
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println("Домашняя работа 8. Массивы. Часть 2.");
        System.out.println("Задача 1.");
        int[] arrayOfPayments = generateRandomArray(30);
        int amountOfPayments = 0;
        for (int i = 0; i < arrayOfPayments.length; i++){
            amountOfPayments = amountOfPayments + arrayOfPayments[i];
        }
        System.out.println("Сумма трат за месяц составила " + amountOfPayments + " рублей.");// Результат должен быть около 4_500_000.
        System.out.println();//Пуста строка, которая отделяет вывод результатов между задачами.

        System.out.println("Задача 2.");
        int[] arrayOfPaymentsPerDay = generateRandomArray(10);// Массив из 10 платежей за день.
        int max = arrayOfPaymentsPerDay[0];
        int min = arrayOfPaymentsPerDay[0];
        for (int i = 1; i < arrayOfPaymentsPerDay.length; i++){
            if (max < arrayOfPaymentsPerDay[i]){
                max = arrayOfPaymentsPerDay[i];
            }
            if (min > arrayOfPaymentsPerDay[i]){
                min = arrayOfPaymentsPerDay[i];
            }
        }
        for (int i = 0; i < arrayOfPaymentsPerDay.length; i++) {
            System.out.print(arrayOfPaymentsPerDay[i] + " ");
        }
        System.out.println();
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println();

        System.out.println("Задача 3.");
        double amountOfPaymentsPerDay = 0;
        double averageOfPaymentsPerDay = 0;
        for (int i = 0; i < arrayOfPaymentsPerDay.length; i++){
            amountOfPaymentsPerDay += arrayOfPaymentsPerDay[i];
        }
        averageOfPaymentsPerDay = amountOfPaymentsPerDay / arrayOfPaymentsPerDay.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageOfPaymentsPerDay + " рублей.");
        System.out.println();

        System.out.println("Задача 4.");
        char[] testStringArray = {'n','a','v','I',' ','v','o','n','a','v','I'};
        System.out.println(testStringArray);
        int i = 0;
        for (; i < ((testStringArray.length) /2); i++){
            char buff = testStringArray[i];
            testStringArray[i] = testStringArray[testStringArray.length - 1 - i];
            testStringArray[testStringArray.length - 1 - i] = buff;
        }
        System.out.println("Массив после перестановки элементов в обратном порядке: ");
        System.out.println(testStringArray);

    }

}
