import java.util.Scanner;

public class wdh {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int weeks=1;
        int days=weeks*7;
        int hours=days*24;
        int minutes=hours*60;
        int seconds=minutes*60;


        System.out.print("Please enter number of Weeks:");

        weeks= input.nextInt();
        System.out.println("weeks:"+ weeks);
        System.out.println("days:"+weeks*7);
        System.out.println("hours:"+weeks*168);
        System.out.println("minutes"+weeks*10080);
        System.out.println("seconds"+weeks*604800);
    }
}
