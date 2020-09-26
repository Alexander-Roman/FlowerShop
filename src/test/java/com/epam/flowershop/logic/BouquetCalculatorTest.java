package com.epam.flowershop.logic;

import com.epam.flowershop.entity.Bouquet;
import com.epam.flowershop.entity.Flower;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;

public class BouquetCalculatorTest {

    private static BouquetCalculator bouquetCalculator;

    @BeforeClass
    public static void setup() {
        bouquetCalculator = new BouquetCalculator();
    }

    @AfterClass
    public static void tearDown() {
        bouquetCalculator = null;
    }

    @Test
    public void getTotalTestShouldReturnNotNull() {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Flower(100, "Flower", new BigDecimal("5.00")));

        BigDecimal actual = bouquetCalculator.getTotal(bouquet);

        Assert.assertNotNull(actual);
    }

    @Test
    public void getTotalTestShouldReturnCorrectTotalPrice() {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Flower(100, "Flower1", new BigDecimal("5.00")));
        bouquet.addFlower(new Flower(101, "Flower2", new BigDecimal("3.21")));

        BigDecimal expected = new BigDecimal("8.21");
        BigDecimal actual = bouquetCalculator.getTotal(bouquet);

        Assert.assertEquals(expected, actual);
    }
}
