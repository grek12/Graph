import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        Scanner scan = new Scanner(System.in);
        String s = "";
        int x = 0;
        while (!"6".equals(s)) {
            System.out.println("1. Добавить граф");
            System.out.println("2. Удалить граф");
            System.out.println("3. Добавить связь");
            System.out.println("4. Удалить связь");
            System.out.println("5. Вывод графа");
            System.out.println("6. Выход");
            s = scan.next();
            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }
            switch (x) {
                case 1:
                    graph.addGraph();
                    break;
                case 2:
                    graph.removeGraph();
                    break;
                case 3:
                    System.out.println("Введите данные");
                    int number = scan.nextInt();
                    int number2 = scan.nextInt();
                    graph.addConnection(number, number2);
                    break;
                case 4:
                    System.out.println("Введите данные");
                    int z = scan.nextInt();
                    int y = scan.nextInt();
                    graph.removeConnection(z, y);
                case 5:
                    graph.printGraph();
                    break;
            }
        }
    }
}
