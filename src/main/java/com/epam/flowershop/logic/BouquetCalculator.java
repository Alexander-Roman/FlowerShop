package com.epam.flowershop.logic;

import com.epam.flowershop.entity.Bouquet;
import com.epam.flowershop.entity.Flower;

import java.math.BigDecimal;

public class BouquetCalculator {


    public BigDecimal getTotal(Bouquet bouquet) {
        BigDecimal total = new BigDecimal("0.00");

        for (Flower flower : bouquet.getFlowers()) {
            total = total.add(flower.getPrice());
        }

        return total;
    }

}
