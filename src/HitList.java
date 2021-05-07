import java.util.ArrayList;

public class HitList {
    public ArrayList<Item> getItems() {
        return items;
    }

    private final ArrayList<Item> items = new ArrayList<>();
    private final String hitChar = "#";

    public HitList() {
    }

    public void hit(int index) {
        items.get(index).hit();
    }

    public void addItem(Item i) {
        items.add(i);
    }

    public void removeItem(Item i) {
        items.remove(i);
    }

    public void removeItem(int i) {
        items.remove(i);
    }

    public String toString() {
        StringBuilder b = new StringBuilder();
        int num = 0;

        for (Item i : items) {
            b.append(num).append(". ").append(String.format("%-10s | ", i.getName()));
            b.append(hitChar.repeat(i.getHits()));
            b.append("\n");
            num++;
        }

        return b.toString();
    }
}
