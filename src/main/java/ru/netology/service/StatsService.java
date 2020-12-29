package ru.netology.service;

public class StatsService {
    public int calculateSum(int[] turnover){
        int sum = 0;

        for (int sale : turnover) {
            sum += sale;
        }

        return sum;
    }

    public int calculateAverage(int[] turnover) {
        int sum = calculateSum(turnover);
        return sum / turnover.length;
    }

    public int calculateMonthOfMaxSales(int[] turnover){
        int calculateMax = turnover[0];
        int numberMonth = 1;
        int numberMonthOfMax = 1;
        for (int sale : turnover){
            if (calculateMax <= sale){
                calculateMax = sale;
                numberMonthOfMax = numberMonth;
            }
            numberMonth++;
        }
        return numberMonthOfMax;
    }

    public int calculateMonthOfMinSales(int[] turnover){
        int calculateMin = turnover[0];
        int numberMonth = 1;
        int numberMonthOfMin = 1;
        for (int sale : turnover) {
            if (calculateMin >= sale) {
                calculateMin = sale;
                numberMonthOfMin = numberMonth;
            }
            numberMonth++;
        }
        return numberMonthOfMin;
    }

    public int calculateMonthBelowAverage(int[] turnover){
        int average = calculateAverage(turnover);
        int months = 0;
        for (int sale : turnover){
            if (sale < average){
                months++;
            }
        }
        return  months;
    }

    public int calculateMonthAboveAverage(int[] turnover){
        int average = calculateAverage(turnover);
        int months = 0;
        for (int sale : turnover){
            if (sale > average){
                months++;
            }
        }
        return  months;
    }

}

