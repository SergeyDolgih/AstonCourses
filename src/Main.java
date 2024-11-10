public class Main {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Иванов И.И.", "Manager", "ivanov@ivan.com", 2929299, 30000, 29);
        empArray[1] = new Employee("Петров П.П.", "Engineer", "petrov@petr.com", 1212121, 35000, 30);
        empArray[2] = new Employee("Сидоров А.А.", "Designer", "sidorov@sid.com", 2323322, 40000, 31);
        empArray[3] = new Employee("Пупкин С.О.", "AQA", "pupkin@pup.com", 3434343, 45000, 32);
        empArray[4] = new Employee("Горбунов В.В.", "Economist", "gorbunov@gor.com", 4545454, 50000, 33);
        for (Employee employee : empArray) {
            employee.info();
            System.out.println();
        }
        Park park = new Park("Аттракционы");
        Park.Attraction attraction = park.new Attraction("Колесо обозрения", "12:00 - 16:00", 320);
        attraction.displayinfo();
    }
}