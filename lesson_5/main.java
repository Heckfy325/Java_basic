import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);


    // Баллы играка
    int userScore = 0;
    
    while(true){
      System.out.println("Введите дату в формате \"yyyy\" и количество дней: ");
      int year = scanner.nextInt();
      int days = scanner.nextInt();
      
      if((year % 4 == 0) && (year % 400 == 0)){
        if(days == 366) userScore++;
        else System.out.println("Не правильно в " + year + " году 366 дней!");
      }else {
        if(days == 365){
          userScore++;
        }else{
          System.out.println("Не правильно в " + year + " году 365 дней!");
          System.out.println("Ваш счет:  " + userScore);
          break;
        }
      }
    }
  } 
}
