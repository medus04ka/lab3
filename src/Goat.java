import java.util.ArrayList;
import java.util.List;

class Goat {
    public List<ShelfItem> getItemsFromShelf(Shelf shelf) {
        List<ShelfItem> itemsToReturn = new ArrayList<>();

        // Моделирование действий козлика
        if (Santik.willDrop()) {
            Santik santik = new Santik();
            santik.drop();
            itemsToReturn.add(santik);
        } else {
            itemsToReturn.addAll(shelf.getItems());
        }

        return itemsToReturn;
    }
}
