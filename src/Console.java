import java.util.Scanner;

public class Console {
    private final HitList hitlist;
    private final Scanner scanner;

    public Console(HitList h, Scanner s) {
        this.hitlist = h;
        this.scanner = s;
    }

    public void handleInput(String input) {
        if(isInteger(input)) {
            hitlist.hit(Integer.parseInt(input));
        }
        switch (input) {
            case "d" -> delete();
            case "a" -> add();
        }
    }

    private void add() {
        System.out.print("Enter name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        hitlist.addItem(new Item(name));
    }

    private void delete() {
        System.out.print("Which field do you want to delete?: ");
        int num = scanner.nextInt();
        hitlist.removeItem(num);
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public String prompt() {
        System.out.print("Enter x to hit, d to delete, or a to add: ");
        String response = scanner.nextLine();
        handleInput(response);
        System.out.println();

        return response;
    }
}
