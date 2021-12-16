package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;

            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }

        return maxMonth + 1;
    }

    public int sumSalesInMoth(long[] sales) {
        int sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public int avgSalesMonth(long[] sales) {
        return sumSalesInMoth(sales) / sales.length;
    }

    public int sumMinAvgMonth(long[] sales) {
        int minAvgMonth = 0;
        for (long sale : sales) {
            if (sale < avgSalesMonth(sales))
                minAvgMonth = minAvgMonth + 1;
        }

        return minAvgMonth;
    }
    public int sumMaxAvgMonth(long[] sales) {
        int maxAvgMonth = 0;
        for (long sale : sales) {
            if (sale > avgSalesMonth(sales))
                maxAvgMonth = maxAvgMonth + 1;
        }

        return maxAvgMonth;
    }
}


