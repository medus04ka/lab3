public class Main {
    public static void main(String[] args) {
        Shelf shelf = new Shelf();
        Goat goat = new Goat();

        goat.interactWithShelf(shelf);
        shelf.putItem(new Sheet());
        shelf.putItem(new Blanket());
        shelf.putItem(new Pillow());

        Santik santik = new Santik();
        goat.pickUpSantik(santik);
    }
}