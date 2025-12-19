import java.util.Scanner;

// https://codeforces.com/problemset/problem/263/A
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row = -1;
        int column = -1;

        for (int i = 0; i < 5; i ++) {
            String currentLine = scan.nextLine();

            if (currentLine.indexOf('1') != -1) {
                row = i + 1;
                column = currentLine.indexOf('1') / 2 + 1;
                break;
            }
        }

        System.out.println(Math.abs(row - 3) + Math.abs(column - 3));
    }
}