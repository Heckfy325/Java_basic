import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    
    int a = getNum();
    int b = getNum();
    
    //вывожу результат
    System.out.println("Сумма: " + sum(a,b));
  }
  
  //функция подсчета суммы 2х аргументов
  static int sum(int a, int b){
    return a+b;
  }

  //вспомогательная функция для печати текста и ввода значений
  static int getNum(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите слагаемое:");
    return scanner.nextInt();
  }
}
