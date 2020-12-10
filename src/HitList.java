import java.util.ArrayList;

public class HitList {
    private final ArrayList<Item> items = new ArrayList<>();

    public HitList() {
    }

    public void addItem(Item i) {
        items.add(i);
    }

    public void removeItem(Item i) {
        items.remove(i);
    }

    public String toString() {

    }
}
