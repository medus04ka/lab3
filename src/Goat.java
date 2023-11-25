import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Goat {
    private List<ShelfItem> items;

    public Goat() {
        this.items = new ArrayList<>();
    }

    public void interactWithShelf(Shelf shelf) {
        boolean santikDropped = dropSantik(); // Вероятность 50/50
        if (santikDropped) {
            System.out.println("Козлик уронил сантик.");
            shelf.putItem(new Santik());
        } else {
            System.out.println("Козлик положил сантик на механический язычок.");
        }

        boolean accepted = shelf.putItem(new Santik()); // Вероятность 50/50
        if (accepted) {
            System.out.println("Козлик забрал спальные предметы.");
        } else {
            System.out.println("Язычок не принял сантик, козлику пришлось класть другой сантик.");
        }
    }

    private boolean dropSantik() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public void pickUpSantik(Santik santik) {
        santik.pickUpSantik();
    }
}
