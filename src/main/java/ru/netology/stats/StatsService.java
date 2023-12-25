package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public long averageSale(long[] sales) {
        long totalSales = sum(sales);
        long averageSale = totalSales / 12;
        {

        }
        return averageSale;
    }

    public int calcMonthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < 12; i++) {
            if (sales[monthMaximum] <= sales[i]) {
                monthMaximum = i;
            }
        }
        return monthMaximum;
    }

    public int calcMonthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < 12; i++) {
            if (sales[monthMinimum] > sales[i]) {
                monthMinimum = i;
            }
        }
        return monthMinimum;
    }

    public int calcMonthsBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = averageSale(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter++;
    }

    public int calcMonthsAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = averageSale(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter = counter;
            }
        }
        return counter;
    }
}


















