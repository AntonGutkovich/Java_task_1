import java.util.Scanner;

public class Java_1 {
    public static void main(String[] args) {
        //task 1
        Scanner input = new Scanner(System.in);
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan;
        double roubles;
        yuan = input.nextInt();
        roubles = ROUBLES_PER_YUAN * yuan;
        System.out.println(roubles);
        //task 2
        int digit = yuan % 10;
        int digitr =( (int) roubles) % 10;

        if (digit == 1)
            System.out.print(yuan + " китайский юань - это ");
        if (2 <= digit && digit <= 4)
            System.out.print(yuan + " китайских юаня - это ");
        if (5 <= digit)
            System.out.print(yuan + " китайских юаней - это ");
        if (digitr == 1)
            System.out.println(roubles + " рубль");
        if (2 <= digitr && digitr <= 4)
            System.out.println(roubles + " рубля");
        if (5 <= digitr)
            System.out.println(roubles + " рублей");

    }
}