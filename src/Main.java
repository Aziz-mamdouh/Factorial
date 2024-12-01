import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       calc in = new calc();

        System.out.println("please enter the num :");
        in.setX( input.nextInt());
        in.factorial();
    }
}