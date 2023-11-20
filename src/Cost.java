public enum Cost {
    SANTIK(1),
    SHEET(1),
    BLANKET(1),
    PILLOW(2);

    private final int cost;

    Cost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
