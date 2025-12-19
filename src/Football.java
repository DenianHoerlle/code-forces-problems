import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String positions = scan.nextLine();

        int length = positions.length();

        int counter = 1;
        char lastChar = positions.charAt(0);

        boolean isDangerous = false;

        for (int i = 1; i < length; i++) {
            char currentChar = positions.charAt(i);

            if (lastChar == currentChar) {
                counter++;
                if (counter == 7) {
                    isDangerous = true;
                    break;
                }
            } else counter = 1;

            lastChar = currentChar;
        }

        System.out.println(isDangerous ? "YES" : "NO");
    }
}
