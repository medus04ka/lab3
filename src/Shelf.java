import java.util.ArrayList;
import java.util.List;


class Shelf {
    private final List<ShelfItem> items;

    public Shelf() {
        this.items = new ArrayList<>();
    }

    public void putItem(ShelfItem item) {
        items.add(item);
        System.out.println("Тронул полочку, из которой появились " + item.getClass().getSimpleName() +", но для их использования нужно было заплатить");
    }

    public List<ShelfItem> getItems() {
        return items;
    }

    public void displayItems() {
        for (ShelfItem item : items) {
            System.out.println(item.getClass().getSimpleName() + ": " + item.getCost() + " сантиков");
        }
    }
}



