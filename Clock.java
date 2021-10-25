import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Clock {
  public static void main(String[] args) {
    LocalDateTime timeObject = LocalDateTime.now();
    DateTimeFormatter currentTime = DateTimeFormatter.ofPattern("HH:mm");

    String formattedTime = timeObject.format(currentTime);
    System.out.printf("The current time is " + formattedTime + "\n");
  }
}