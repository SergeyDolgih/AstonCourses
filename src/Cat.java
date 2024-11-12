public class Cat extends Animal {
    String name;
    static int countCat = 0;
    boolean isFull;

    Cat(String name) {
        super();
        countCat++;
        this.name = name;
        this.isFull = false;
    }

    public void run(int way) {
        if (way > 200) {
            System.out.println(name + " не может пробежать " + way + " м.");
        } else {
            System.out.println(name + " пробежал " + way + " м.");
        }
    }

    public void swim(int way) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(BowlFood bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            this.isFull = true;
            System.out.println(name + " поел и теперь сыт");
        } else {
            System.out.println(name + " не смог поесть. Недостаточно еды в миске");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCountCat() {
        return countCat;
    }

}