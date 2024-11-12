public class Animal {
    static int countAnimal = 0;

    Animal() {
        countAnimal++;
    }

    public void run(int way) {
    }

    public void swim(int way) {
    }

    public static int getCountAnimal() {
        return countAnimal;
    }
}