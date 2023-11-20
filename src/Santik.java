import java.util.Random;

class Santik implements ShelfItem, Droppable {
    private static final Random random = new Random();

    @Override
    public void use() {
        System.out.println("Козлик положил сантик на металический язычок");
    }

    @Override
    public int getCost() {
        return Cost.SANTIK.getCost();
    }

    @Override
    public void drop() {
        System.out.println("Козлик уронил сантик и нагнулся, чтобы поднять его");
    }

    public static boolean willDrop() {
        return random.nextBoolean();
    }
}
