/*
 * Цветочница. Создать несколько объектов-цветов. Собрать букет с определением его стоимости.
 */

package com.epam.flowershop.main;

import com.epam.flowershop.entity.Bouquet;
import com.epam.flowershop.entity.Flower;
import com.epam.flowershop.logic.BouquetCalculator;

import java.math.BigDecimal;

public class Runner {

    public static void main(String[] args) {

        Flower flower1 = new Flower(100, "Lily", new BigDecimal("5.00"));
        Flower flower2 = new Flower(101, "Tulip", new BigDecimal("3.65"));
        Flower flower3 = new Flower(102, "Rose red long", new BigDecimal("4.10"));
        Flower flower4 = new Flower(103, "Rose red short", new BigDecimal("3.75"));
        Flower flower5 = new Flower(104, "Rose white", new BigDecimal("3.90"));

        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(flower4);
        bouquet.addFlower(flower4);
        bouquet.addFlower(flower4);
        bouquet.addFlower(flower4);
        bouquet.addFlower(flower5);
        bouquet.addFlower(flower5);
        bouquet.addFlower(flower5);

        BouquetCalculator bouquetCalculator = new BouquetCalculator();
        BigDecimal totalCost = bouquetCalculator.getTotal(bouquet);
    }
}
