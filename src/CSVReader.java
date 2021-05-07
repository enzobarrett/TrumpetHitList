import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CSVReader {
    private final String filename;

    public CSVReader(String filename) {
        this.filename = filename;
    }

    public HitList readHitList() {
        try {
            Scanner s = new Scanner(new File(filename));
            HitList h = new HitList();

            while (s.hasNextLine()) {
                String[] arr = s.nextLine().split(",");
                h.addItem(new Item(arr[0], Integer.parseInt(arr[1])));
            }

            return h;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void writeHitList(HitList h) {
        try (PrintWriter p = new PrintWriter(new File(filename))) {
            for (Item i : h.getItems()) {
                p.println(i.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
