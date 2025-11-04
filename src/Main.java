import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String birthday = InputHelper.getRegExString(scan, "Enter your birthday:", "\\d{2}/\\d{2}/\\d{4}");
        System.out.println(birthday);
    }
}