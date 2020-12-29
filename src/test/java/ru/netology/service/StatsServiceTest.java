package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        @Test
        void shouldCalculateSum() {
            int actual = service.calculateSum(sales);
            int expected = 180;
            assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateAverage() {
            int actual = service.calculateAverage(sales);
            int expected = 15;
            assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateMonthOfMaxSales(){
            int actual = service.calculateMonthOfMaxSales(sales);
            int expected = 8;
            assertEquals(expected, actual);

        }

        @Test
        void shouldCalculateMonthOfMinSales(){
            int actual = service.calculateMonthOfMinSales(sales);
            int expected = 9;
            assertEquals(expected, actual);

        }

        @Test
        void shouldCalculateMonthBelowAverage(){
            int actual = service.calculateMonthBelowAverage(sales);
            int expected = 5;
            assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateMonthAboveAverage(){
            int actual = service.calculateMonthAboveAverage(sales);
            int expected = 5;
            assertEquals(expected, actual);
        }
    }