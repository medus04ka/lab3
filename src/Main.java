import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shelf shelf = new Shelf();

        Santik santik = new Santik();
        Sheet sheet = new Sheet();
        Blanket blanket = new Blanket();
        Pillow pillow = new Pillow();

        shelf.putItem(santik);
        shelf.putItem(sheet);
        shelf.putItem(blanket);
        shelf.putItem(pillow);

        Goat goat = new Goat();
        List<ShelfItem> goatItems = goat.getItemsFromShelf(shelf);

        for (ShelfItem item : goatItems) {
            item.use();
        }

        shelf.displayItems();
    }
}