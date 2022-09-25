public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println ("Задача №1");
        int Int = 123456789;
        System.out.println ("Значение переменной с типом int равно " + Int);
        byte Byte = 123;
        System.out.println ("Значение переменной с типом byte равно " + Byte);
        short Short = 12345;
        System.out.println ("Значение переменной с типом short равно " + Short);
        long Long = 123456789L;
        System.out.println ("Значение переменной с типом long равно " + Long);
        float Float = 3.2f;
        System.out.println ("Значение переменной с типом float равно " + Float);
        double Double = 3.2;
        System.out.println ("Значение переменной с типом double равно " + Double);

        //Задача №2
        System.out.println ("Задача №2");
        float Float1 = 27.12f;
        System.out.println ("float = " + Float1);
        long Long1 = 987_678_965_549L;
        System.out.println ("long = " + Long1);
        double Double1 = 2.786;
        System.out.println ("double = " + Float1);
        boolean Boolean1 = false;
        System.out.println ("boolean = " + Boolean1);
        char Char1 = 569;
        System.out.println ("char = " + Char1);
        short Short1 = -159;
        System.out.println ("short = " + Short1);
        int Int1= 27897;
        System.out.println ("int = " + Int1);
        byte Byte1 = 67;
        System.out.println ("byte = " + Byte1);

        //Задача №3
        System.out.println ("Задача №3");
        int teacherLudmilaPavlovna = 23;
        int teacherAnnaSergeevna =27;
        int teacherEkaterinaAndreevna =30;
        int totalPaper = 480;
        int totalStudents = teacherLudmilaPavlovna + teacherAnnaSergeevna + teacherEkaterinaAndreevna;
        double eachStudent = totalPaper / totalStudents;
        System.out.println ("На каждого ученика рассчитано " + eachStudent + " листов бумаги");

        //Задача №4
        System.out.println ("Задача №4");
        int bottlePerformance_2min = 16;
        int time = 2;
        int bottlePerformance_1min = bottlePerformance_2min / time;
        int interval1 = 20;
        int inTwentyMinutes = bottlePerformance_1min * interval1;
        int day = 24 * 60;
        int perDay = bottlePerformance_1min * day;
        int treeDays = perDay * 3;
        int thirtyDays = treeDays * 10;
        System.out.println ("За 20 минут машина произвела бутылок " + inTwentyMinutes + " штук");
        System.out.println ("В сутки машина произвела бутылок " + perDay + " штук");
        System.out.println ("За 3 дня машина произвела бутылок " + treeDays + " штук");
        System.out.println ("За 1 месяц машина произвела бутылок " + thirtyDays + " штук");

        //Задача №5
        System.out.println ("Задача №5");
        int totalPaint = 120;
        int paintPerClassWhite = 2;
        int paintPerClassBrown = 4;
        int paintPerClass = paintPerClassWhite + paintPerClassBrown;
        int totalClasses = totalPaint / paintPerClass;
        int whitePaint = totalClasses * paintPerClassWhite;
        int brownPaint = totalClasses * paintPerClassBrown;
        System.out.println ("В школе, где " + totalClasses + " классов, нужно " + whitePaint + " банок белой краски и "
                + brownPaint + " банок коричневой краски");

        //Задача №6
        System.out.println ("Задача №6");
        int weightBananas_1p = 80;
        int weightMilk_100ml = 105;
        int weightIceCream_1p = 100;
        int weightEggs_1p = 70;
        int bananasForTheRecipe = 5;
        int milkForTheRecipe = 2;
        int iceCreamForTheRecipe = 2;
        int eggsForTheRecipe = 4;
        int kilogram1 = 1000;
        int weightBananasForTheRecipe = bananasForTheRecipe * weightBananas_1p;
        int weightMilkForTheRecipe = milkForTheRecipe * weightMilk_100ml;
        int weightIceCreamForTheRecipe = iceCreamForTheRecipe * weightIceCream_1p;
        int weightEggsForTheRecipe = eggsForTheRecipe * weightEggs_1p;
        float wholeCocktail = weightBananasForTheRecipe + weightMilkForTheRecipe + weightIceCreamForTheRecipe
                + weightEggsForTheRecipe;
        float kilogram = wholeCocktail / kilogram1;
        System.out.println ("Вес спорт-завтрака составляет " + wholeCocktail + " грамм, что в свою очередь составляет "
                + kilogram + " килограмм");

        //Задача №7
        System.out.println ("Задача №7");
        byte skinutKg = 7;
        float vDen250 = 0.250F;
        float vDen500 = 0.500F;
        float dnejEsli250 = skinutKg / vDen250;
        float dnejEsli500 = skinutKg / vDen500;
        float raznVVese = (dnejEsli250 - dnejEsli500) / 2;
        float dnejVsrednem = raznVVese + dnejEsli500;
        System.out.println ("Если спортсмен будет терять каждый день по 250 грамм, то он похудеет за " + dnejEsli250 + " дней");
        System.out.println ("Если спортсмен будет терять каждый день по 500 грамм, то он похудеет за " + dnejEsli500 + " дней");
        System.out.println ("В среднем ему понадобиться " + dnejVsrednem + " день");

        //Задача №8
        System.out.println ("Задача №8");
        int god = 12; // месяцев
        int m = 67760; // Маша получает 67 760 рублей в месяц
        int d = 83690; // Денис получает 83 690 рублей в месяц
        int k = 76230; // k - Кристина получает 76 230 рублей в месяц
        int mm = m * god; // старый годовой доход Маши
        int dd = d * god; // старый годовой доход Дениса
        int kk = k * god; // старый годовой доход Кристины
        int q = 10; // Количество процентов на которое необходимо увеличить зарплату
        int mmm = m / 100 * q + m; // Новая зарплата Маши
        int ddd = d / 100 * q + d; // Новая зарплата Дениса
        int kkk = k / 100 * q + k; // Новая зарплата Кристины
        int mmmm = mmm * god; // новый годовой доход Маши
        int dddd = ddd * god; // новый годовой доход Дениса
        int kkkk = kkk * god; // новый годовой доход Кристины
        int mmmmm = mmmm - mm; // Разница в годовом доходе Маши
        int ddddd = dddd - dd; // Разница в годовом доходе Дениса
        int kkkkk = kkkk - kk; // Разница в годовом доходе Кристины
        System.out.println ("Маша теперь получает " + mmm + " рублей. Годовой доход вырос на " + mmmmm + " рублей");
        System.out.println ("Денис теперь получает " + ddd + " рублей. Годовой доход вырос на " + ddddd + " рублей");
        System.out.println ("Кристина теперь получает " + kkk + " рублей. Годовой доход вырос на " + kkkkk + " рублей");
    }

}