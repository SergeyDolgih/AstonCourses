public class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }

    public class Attraction {
        private String title;
        private String timework;
        private int cost;

        public Attraction(String title, String timework, int cost) {
            this.title = title;
            this.timework = timework;
            this.cost = cost;
        }

        public void displayinfo() {
            System.out.println("Наименование аттракциона: " + title);
            System.out.println("Время работы: " + timework);
            System.out.println("Стоимость: " + cost + " руб.");
        }
    }
}
