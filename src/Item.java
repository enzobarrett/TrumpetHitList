public class Item {
    private String name;
    private int hits;

    Item(String name) {
        this.name = name;
    }

    Item(String name, int hits) {
        this.name = name;
        this.hits = hits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public void hit() {
        hits++;
    }

    @Override
    public String toString() {
        return String.format("%s,%d", name, hits);
    }
}
