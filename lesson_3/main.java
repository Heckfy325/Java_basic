import java.util.Scanner;

class Main {

  //число Пи, константа
  public static final double PI = 3.14; 
  
  public static void main(String[] args) {
    double radius = inputNumb("Введите радиус окружности: ");
    double length = inputNumb("Введите длинну окружности: ");
    System.out.println("Площадь круга: " + getSquare(radius));
    System.out.println("Длинна круга: " + getLenght(radius));
  }

  //функция для ввода числа
  static double inputNumb(String txt){
    Scanner scanner = new Scanner(System.in);
    System.out.println(txt);
    return scanner.nextDouble();
  }

  //функция нахождения площади круга
  static double getSquare(double radius){
    return PI * radius * radius;
  }

  //функция нахождения длинны круга
  static double getLenght(double radius){
    return 2 * PI * radius;
  }

}
