import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Операция над double/float");
        System.out.println("1- Сравнить");
        System.out.println("2- Округлить");
        System.out.println("3- Отбросить дробную часть");

        int input = scanner.nextInt();
      
        switch (input) {
            //сравнить
            case 1: {
                System.out.println("Введите первое число:");
                double value1 = scanner.nextDouble();
                System.out.println("Введите второе число");
                float value2 = scanner.nextFloat();
                System.out.println(value1 == value2);
                System.out.println("Результат сравнения:" + compareNumber(value1, value2));
                break;
            }
            //округлить
            case 2: {
                System.out.println("Введите число ");
                double value3 = scanner.nextDouble();
                System.out.println("Результат округления " + Math.round(value3));
                break;
            }
            //отбросить дробную часть
            case 3: {
                System.out.println("Введите число ");
                double value4 = scanner.nextDouble();
                long x1 = (int) value4;
                System.out.println("Результат:" + x1);
                break;
            }
            //если ввели не 1 || 2 || 3
            default: 
              System.out.println("Не верный ввод!");
              break;
        }
    }
         //функция сравнения двух чисел
         public static String compareNumber(double x, float y){
          if (Math.abs(x - y) < 0.000001) {
              return "числа равны";
          }
          else if (x > y) {
              return "Первое число больше второго";
          }
          else
              return  "Первое число меньше второго";

          }
}
