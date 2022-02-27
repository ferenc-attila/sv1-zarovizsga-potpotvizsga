package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Fish> fishes = new ArrayList<>();

    public void addFish(Fish fish) {
        fishes.add(fish);
    }

    public void feed() {
        fishes.forEach(Fish::feed);
    }

    public void removeFish() {
        this.fishes = fishes.stream()
                .filter(fish -> fish.getWeight() < 11)
                .toList();
    }

    public List<String> getStatus() {
        return fishes.stream()
                .map(Fish::status)
                .toList();
    }
}
