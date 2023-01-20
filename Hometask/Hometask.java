import java.util.Scanner;
import java.time.LocalTime;

public class Hometask {
    public static void main(String[] args){
        System.out.println("Enter username: ");
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();

        int hour = LocalTime.now().getHour();

        if (hour >= 5 && hour < 12) {
            System.out.printf("Доброе утро %s!", userName);
        } else if (hour >= 12 && hour < 18) {
            System.out.printf("Доброе день %s!", userName);
        } else if (hour >= 18 && hour < 23) {
            System.out.printf("Доброе вечер %s!", userName);
        } else  {
                System.out.printf("Доброй ночид %s!", userName);
            }
        }
    }