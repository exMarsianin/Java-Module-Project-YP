import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("На какое количество гостей нужно разделить счёт?");
        int people = scan.nextInt();
        while (true) {
            if (people<=1) {
                System.out.println("Ошибка, введите корректное значение количества гостей");
                people = scan.nextInt();
            }
            else break;
        }
        Calculator number = new Calculator(people);

        while (true) {
        System.out.println("Введите название товара: ");
        String name = scan.next();
        System.out.println("Введите стоимость товара: ");
        double value = scan.nextDouble();
        Product product =  new Product(name,value);
        number.addmember(product);
            System.out.println("Товар успешно добавлен. Хотите добавить новый товар?");
            String result = scan.next();
            if(result.equalsIgnoreCase("Завершить")){
                System.out.println("Каждый должен скинуться по: " + number.Cost());
                System.out.println("Добавленные товары: " + "\n" + number.names);
                break;
            }
        }
    }
}
