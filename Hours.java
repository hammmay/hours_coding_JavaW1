import java.io.Console;

public class Hours {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("How many hours did you code on Sunday?");
    String stringSundayHours = myConsole.readLine();

    System.out.println("How many hours did you code on Monday?");
    String stringMondayHours = myConsole.readLine();

    System.out.println("How many hours have you coded today?");
    String stringTodayHours = myConsole.readLine();

    Integer sundayHours = Integer.parseInt(stringSundayHours);
    Integer mondayHours = Integer.parseInt(stringMondayHours);
    Integer todayHours = Integer.parseInt(stringTodayHours);

    Integer totalHours = sundayHours + mondayHours + todayHours;

    if (totalHours >= 19) {
        System.out.println("Great job! You're on track to becoming a Java pro in no time!");
    } else {
        System.out.println("Stop Netflixing and start programming.");
    }

// Note: Below is just the code to convert the number back into a string and return a conjoined string message
//    String stringTotalHours = Integer.toString(totalHours);
//    System.out.println("You worked at least " + totalHours + " hours on java so far.");
  }
}
