import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstLine = scan.nextLine().split(" ");

        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);

        String[] contestants = scan.nextLine().split(" ");

        int targetScore = Integer.parseInt(contestants[k - 1]);

        int winners = 0;

        for (int i = 0; i < n; i++) {
            int currentScore = Integer.parseInt(contestants[i]);
            if  (currentScore != 0 && currentScore >= targetScore) winners++;
        }

        System.out.println(winners);
    }

}
