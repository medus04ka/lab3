import java.util.Random;

class Santik implements ShelfItem, SantikInteraction {
    @Override
    public void use() {
        System.out.println("Козлик посмотрел на цену, указанную на механическом язычке, решил посчитать сантики.");
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
        System.out.println("Козлик снова уронил сантик и нагнулся, чтобы поднять его");
    }
}
