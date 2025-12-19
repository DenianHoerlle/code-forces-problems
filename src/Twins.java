import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/160/A
public class Twins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int amountOfCoins = Integer.parseInt(scan.nextLine());

        String[] coins = scan.nextLine().split(" ");

        ArrayList<Integer> sortedCoins = new ArrayList<>();

        int total = 0, minimumCoins = 0;

        for (String coin: coins) {
            total += Integer.parseInt(coin);
            sortedCoins.add(Integer.parseInt(coin));
        }

        sortedCoins.sort(Collections.reverseOrder());

        for (int i = 0; i < amountOfCoins; i++) {
            Integer currentCoin = sortedCoins.get(i);

            minimumCoins += currentCoin;
            total -= currentCoin;

            if (minimumCoins > total) {
                System.out.println(i+1);
                break;
            }
        }

    }
}
