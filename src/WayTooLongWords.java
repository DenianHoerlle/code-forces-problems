import java.util.Scanner;

// https://codeforces.com/problemset/problem/71/A
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());

        StringBuilder abbreviations = new StringBuilder();

        for (int i = 0; i < lines; i++) {
            String currentLine = scan.nextLine();

            int lineLength = currentLine.length();

            if (lineLength <= 10) {
                abbreviations.append(currentLine).append("\n");
                continue;
            }

            abbreviations.append(currentLine.charAt(0)).append(lineLength - 2).append(currentLine.charAt(lineLength - 1)).append("\n");
        }

        System.out.println(abbreviations);
    }
}
