import java.util.Scanner;

// https://codeforces.com/problemset/problem/4/A
public class Watermelon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int w = scan.nextInt();

        if (w <= 2) System.out.println("NO");
        else System.out.println(w % 2 != 0 ? "NO" : "YES");
    }
}
