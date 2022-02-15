package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StatsServiceTest {
    @Test
    void testCalculateSum() {
        StatsService service = new StatsService(); // Создаём объект service
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void testAvrSum() {
        StatsService service = new StatsService(); // Создаём объект service
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.avrSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxSales() {
        StatsService service = new StatsService(); // Создаём объект service
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void testMinSales() {
        StatsService service = new StatsService(); // Создаём объект service
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void testUnderAvr() {
        StatsService service = new StatsService(); // Создаём объект service
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.underAvr(sales);
        assertEquals(expected, actual);
    }

    @Test
    void testOverAvr() {
        StatsService service = new StatsService(); // Создаём объект service
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.overAvr(sales);
        assertEquals(expected, actual);
    }
}

