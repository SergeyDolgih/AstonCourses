public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Мур");
        Cat cat3 = new Cat("Барсик");
        Dog dog1 = new Dog("Рекс");
        Dog dog2 = new Dog("Пират");
        Dog dog3 = new Dog("Полкан");
        Dog dog4 = new Dog("Алмаз");
        cat1.run(200);
        cat2.run(201);
        cat3.swim(15);
        dog1.run(500);
        dog2.run(501);
        dog3.swim(10);
        dog4.swim(11);
        System.out.println("Всего животных: " + Animal.getCountAnimal());
        System.out.println("Всего котов: " + Cat.getCountCat());
        System.out.println("Всего собак: " + Dog.getCountDog());

        BowlFood food = new BowlFood(30);
        Cat[] cats = {cat1, cat2, cat3};

        for (Cat cat : cats) {
            cat.eat(food, 15);
            System.out.println(cat.name + " сыт: " + cat.isFull());
        }
        System.out.println("Остаток еды в миске: " + food.getFood() + " ед.");

        food.addFood(20);
        System.out.println("Добавили еды. Теперь в миске: " + food.getFood() + " ед.");

        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(food, 15);
                System.out.println(cat.name + " сыт: " + cat.isFull());
            }
        }
        System.out.println("Остаток еды в миске: " + food.getFood() + " ед.");

        System.out.println("\nФигуры:");
        Shape circle = new Circle(10, "Зелёный", "Красный");
        Shape rectangle = new Rectangle(5, 6, "Чёрный", "Белый");
        Shape triangle = new Triangle(8, 6, 4, "Оранжевый", "Жёлтый");

        System.out.println("Круг:");
        circle.printResult();

        System.out.println("\nПрямоугольник:");
        rectangle.printResult();

        System.out.println("\nТреугольник:");
        triangle.printResult();
    }
}