import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Список товаров");
        String[] products = new String[]{"Хлеб", "Яйца", "Масло"};
        int[] prices = new int[]{100, 200, 300};
        int[] count = new int[]{0, 0, 0};

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " - " + prices[i]);
        }

        System.out.println("Добавьте товары в корзину");
        while (true){
            String inputString = scanner.nextLine();
            String[] inputStrings = inputString.split("\\s");

            System.out.println("Выберите товар и количество или введите end");
            if (inputString.equals("end")) {
                System.out.println("Товары в корзине:");
                int totalProductsSum = 0;
                for (int i = 0; i < count.length; i++) {
                    if (count[i] != 0) {
                        int productSum = prices[i] * count[i];
                        System.out.println("Товар " + products[i] + " Цена за ед. " + prices[i] + " Общая сумма " + productSum);
                        totalProductsSum += productSum;
                    }
                }
                System.out.println("Итого: " + totalProductsSum);
                break;
            }

            int productNumber = Integer.parseInt(inputStrings[0]);
            int productCount = Integer.parseInt(inputStrings[1]);
            count[productNumber - 1] += productCount;
            System.out.println("Выбранное кол-во товара:" + productCount);
        }
    }
}

