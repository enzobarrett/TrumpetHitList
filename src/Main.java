import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CSVReader r = new CSVReader("hitlist.csv");
        HitList h = r.readHitList();
        Scanner s = new Scanner(System.in);
        Console console = new Console(h, s);

        String input;

        do {
            System.out.println(h);
            input = console.prompt();

        } while (!input.equals("q"));

    }
}
