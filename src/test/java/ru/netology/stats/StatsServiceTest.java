package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void findMinMonth() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual =service.minSales(sale);
        assertEquals(expected, actual);
    }
    @Test
    void findMaxMonth() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual =service.maxSales(sale);
        assertEquals(expected, actual);
    }
    @Test
    void findSumSalesInMonth() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual =service.sumSalesInMoth(sale);
        assertEquals(expected, actual);
    }
    @Test
    void findAvgMonth() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual =service.avgSalesMonth(sale);
        assertEquals(expected, actual);
    }
    @Test
    void findSumMinAvgMonth() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual =service.sumMinAvgMonth(sale);
        assertEquals(expected, actual);
    }
    @Test
    void findSumMaxAvgMonth() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual =service.sumMaxAvgMonth(sale);
        assertEquals(expected, actual);
    }

}