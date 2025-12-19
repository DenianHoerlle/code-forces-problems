import java.util.Scanner;

// https://codeforces.com/problemset/problem/231/A
public class Team {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int problems = Integer.parseInt(scan.nextLine());

        int solvable = 0;

        for (int i = 0; i < problems; i++) {
            String sure = scan.nextLine();

            int howManySure = 0;

            if (sure.charAt(0) == '1') howManySure++;
            if (sure.charAt(2) == '1') howManySure++;
            if (sure.charAt(4) == '1') howManySure++;

            if (howManySure >= 2) solvable++;
        }

        System.out.println(solvable);
    }
}