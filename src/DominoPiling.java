import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstLine = scan.nextLine().split(" ");

        int m = Integer.parseInt(firstLine[0]);
        int n = Integer.parseInt(firstLine[0]);

        System.out.println((m * n) / 2);
    }

}
