import java.util.Random;

class Santik implements ShelfItem, SantikInteraction {
    @Override
    public void use() {
        System.out.println("Козлик уронил сантик.");
    }

    @Override
    public int getCost() {
        return Cost.SANTIK.getCost();
    }

    @Override
    public boolean dropSantik() {
        Random random = new Random();
        return random.nextBoolean();
    }

    @Override
    public void pickUpSantik() {
        System.out.println("Козлик уронил сантик и нагнулся, чтобы поднять его");
    }
}
