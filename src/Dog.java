public class Dog extends Animal {
    String name;
    public static int countDog = 0;

    Dog(String name) {
        super();
        countDog++;
        this.name = name;
    }

    public void run(int way) {
        if (way > 500) {
            System.out.println(name + " не может пробежать " + way + " м.");
        } else {
            System.out.println(name + " пробежал " + way + " м.");
        }

    }

    public void swim(int way) {
        if (way > 10) {
            System.out.println(name + " не может проплыть " + way + " м.");
        } else {
            System.out.println(name + " проплыл " + way + " м.");
        }
    }

    public static int getCountDog() {
        return countDog;
    }
}