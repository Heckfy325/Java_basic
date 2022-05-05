import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    //инициализация переменной
    int sum = 0;

    while(true){
      System.out.println("Введите число: ");
      String input = scanner.nextLine();
      //если введеное слово = "end", тогда считаем и выводим сумму введенных чисел, затем останавливаем цикл
      if("end".equals(input)){
        System.out.println("Сумма введеных чисел: " + sum);
        break;
      }
      //парсим string в int, чтобы складывать числа
      int x = Integer.parseInt(input);
      sum += x;
    }
    
  }
}
