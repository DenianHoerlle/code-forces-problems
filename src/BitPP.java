import java.util.Scanner;

// https://codeforces.com/problemset/problem/282/A
public class BitPP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int statementsAmount = Integer.parseInt(scan.nextLine());

        int x = 0;

        for (int i = 0; i < statementsAmount; i++) {
            String statement = scan.nextLine();
            if (statement.charAt(1) == '+') x++;
            else x--;
        }

        System.out.println(x);
    }

}
