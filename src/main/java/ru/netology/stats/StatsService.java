package ru.netology.stats;

public class StatsService {
    //Сумма всех продаж
    public int calculateSum(int[] sales) {
        int sum = 0; // сумма всех продаж
        for (int sale : sales
        ) {
            sum += sale;
        }
        return sum;
    }
    //Средняя сумма продаж в месяц
    public int avrSum(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

//Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    public int underAvr (int[] sales) {
        int counter = 0; // счётчик количества месяцев
        for (int sale : sales
             ) {
            if (sale < avrSum(sales)) {
                counter+=1;
            }
        }
        return counter;
    }

    //Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    public int overAvr (int[] sales) {
        int counter = 0; // счётчик количества месяцев
        for (int sale : sales
        ) {
            if (sale > avrSum(sales)) {
                counter+=1;
            }
        }
        return counter;
    }
}
