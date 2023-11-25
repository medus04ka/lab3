import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class Shelf {
    private List<ShelfItem> items;

    public Shelf() {
        this.items = new ArrayList<>();
    }

    public boolean putItem(ShelfItem item) {
        boolean accepted = dropSantik();
        if (accepted) {
            items.add(item);
            System.out.println("Козлик положил " + item.getClass().getSimpleName() + " на полочку.");
        }
        return accepted;
    }

    private boolean dropSantik() {
        Random random = new Random();
        return random.nextBoolean();
    }
}



