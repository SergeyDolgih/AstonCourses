public class Main {
    public static int way(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("");
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    count = count + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {

        String[][] array = new String[][]{{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"8", "7", "6", "5"}, {"4", "3", "2", "1"}};
        try {
            try {
                int result = way(array);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Неверный размер массива!");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка в значении массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }
}