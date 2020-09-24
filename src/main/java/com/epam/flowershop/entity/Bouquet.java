package com.epam.flowershop.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Bouquet implements Serializable {

    private final List<Flower> flowers = new ArrayList<Flower>();

    public Bouquet() {
    }

    public List<Flower> getFlowers() {
        return Collections.unmodifiableList(flowers) ;
    }

    public boolean addFlower(Flower flower) {
        return flowers.add(flower);
    }

    public boolean removeFlower(Flower flower) {
        return flowers.remove(flower);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bouquet bouquet = (Bouquet) o;
        return Objects.equals(flowers, bouquet.flowers);
    }

    @Override
    public int hashCode() {
        return flowers.hashCode();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "flowers=" + flowers +
                '}';
    }
}
