import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        boolean YorN = InputHelper.getYNConfirm(scan, "Enter Y if you'd like to keep playing or N if you'd like to stop:");
        System.out.println(YorN);
    }
}