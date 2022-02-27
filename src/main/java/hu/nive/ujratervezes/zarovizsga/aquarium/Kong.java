package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Kong extends Fish {

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void feed() {
        this.growMass(2);
    }

    @Override
    public boolean hasMemoryLoss() {
        return false;
    }
}
