public class Lesson_3 {
    public static void main(String[] args) {
        printThreeWord(); // Задание 1
        checkSumSign(); // Задание 2
        printColor(); // Задание 3
        compareNumbers(); // Задание 4
        System.out.println(checkNumber(11, 10)); // Задание 5
        anInteger(-25); // Задание 6
        System.out.println(numberNegative(-13)); // Задание 7
        printString("Hello!", 3); // Задание 8
        System.out.println(checkYears(2025)); // Задание 9
        System.out.println();
        System.out.println("Задание 10"); // Задание 10
        int[] array = {1, 0, 0, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Задание 11"); // Задание 11
        int[] array1 = new int[100];
        for (int i = 0; i < array1.length; i++) {
            System.out.print((array1[i] = i) + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Задание 12"); // Задание 12
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                System.out.print((arr[i] * 2) + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Задание 13"); // Задание 13
        int[][] mass = new int[4][4];
        for (int i = 0; i < mass.length; i++) {
            mass[i][i] = 1;
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[j][i] + " ");
            }
            System.out.println();
        }
        writingArray(5, 2); // Задание 14
    }

    public static void printThreeWord() {
        System.out.println("Задание 1");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }

    public static void checkSumSign() {
        System.out.println("Задание 2");
        int a = 5;
        int b = 7;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println();
    }

    public static void printColor() {
        System.out.println("Задание 3");
        int value = 56;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else if (value > 100) {
            System.out.println("Зелёный");
        }
        System.out.println();
    }

    public static void compareNumbers() {
        System.out.println("Задание 4");
        int a = 10;
        int b = 9;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        System.out.println();
    }

    public static boolean checkNumber(int a, int b) {
        System.out.println("Задание 5");
        return ((a + b) > 10 && (a + b) <= 20);
    }

    public static void anInteger(int a) {
        System.out.println();
        System.out.println("Задание 6");
        System.out.println(a >= 0 ? "Число положительное" : "Число отрицательное");
    }

    public static boolean numberNegative(int a) {
        System.out.println();
        System.out.println("Задание 7");
        return (a <= 0);
    }

    public static void printString(String str, int a) {
        System.out.println();
        System.out.println("Задание 8");
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
        System.out.println();
    }

    public static boolean checkYears(int x) {
        System.out.println("Задание 9");
        return x % 4 == 0 && x % 100 != 0 || x % 400 == 0;
    }

    public static int[] writingArray(int len, int initialValue) {
        System.out.println();
        System.out.println("Задание 14");
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print(newArray[i] = initialValue); // новоя строка?
        }
        return newArray;
    }
}
