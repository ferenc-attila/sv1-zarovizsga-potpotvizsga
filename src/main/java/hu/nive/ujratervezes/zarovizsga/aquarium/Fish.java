package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {

    private String name;
    private int weight;
    private String color;

    protected Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String status() {
        return this.getName() + ", weight: " + this.getWeight() + ", color: " + this.getColor() + ", short term memory loss: " + this.hasMemoryLoss();
    }

    public abstract void feed();

    public abstract boolean hasMemoryLoss();

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void growMass(int grams) {
        this.weight += grams;
    }
}
