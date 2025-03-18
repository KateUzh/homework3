//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a = 2222222;
        byte b = 120;
        short c = -10050;
        long d = 55555555L;
        float e = 33.33f;
        double f = -555.5555;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        float aa = 27.12f;
        long bb = 987678965549L;
        float cc = 2.786f;
        short dd = 569;
        short ee = -159;
        short ff = 27897;
        byte gg = 67;
        System.out.println("aa = " + aa);
        System.out.println("bb = " + bb);
        System.out.println("cc = " + cc);
        System.out.println("dd = " + dd);
        System.out.println("ee = " + ee);
        System.out.println("ff = " + ff);
        System.out.println("gg = " + gg);

        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        short totalLists = 480;
        byte totalStudents = (byte) (studentsLP + studentsAS + studentsEA);
        byte listsToStudent = (byte) (totalLists / totalStudents);
        System.out.println("На каждого ученика расчитано " + listsToStudent + " листов бумаги");

        int bottlesInTwoMinutes = 16;
        int bottlesInOneMinute = bottlesInTwoMinutes / 2;
        int minutesInOneDay = 60 * 24;
        int minutesInThreeDays = 3 * minutesInOneDay;
        int minutesInOneMonth = 30 * minutesInOneDay;
        int bottlesInTwentyMinutes = bottlesInOneMinute * 20;
        int bottleInOneDay = minutesInOneDay * bottlesInOneMinute;
        int bottleInThreeDays = minutesInThreeDays * bottlesInOneMinute;
        int bottleInOneMonth = minutesInOneMonth * bottlesInOneMinute;
        System.out.println("За 20 минут машина произвела " + bottlesInTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleInOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleInThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottleInOneMonth + " штук бутылок");

        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalCansPerClass = whiteCansPerClass + brownCansPerClass;
        int totalClass = totalCans / totalCansPerClass;
        int totalWhiteCans = totalClass * whiteCansPerClass;
        int totalBrownCans = totalClass * brownCansPerClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhiteCans +
                " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        int bananasWeight = 80;
        int totalBananas = 5;
        int milkVol = 200;
        float milkWeight = (float) (milkVol * 1.05);
        int iceCreamWeight = 100;
        int totalIceCream = 2;
        int eggsWeight = 70;
        int totalEggs = 4;
        float totalBreakfastWeight = bananasWeight * totalBananas + milkWeight + iceCreamWeight * totalIceCream +
                eggsWeight * totalEggs;
        int grPerKg = 1000;
        float totalBreakfastWeightKg = totalBreakfastWeight / grPerKg;
        System.out.println("Вес спортзавтрака составляет " + totalBreakfastWeight +
                " грамм (" + totalBreakfastWeightKg + " кг)");

        int excessWeightKg = 7;
        int excessWeight = excessWeightKg * grPerKg;
        int dailyWeightLossOne = 250;
        int dailyWeightLossTwo = 500;
        int daysOne = excessWeight / dailyWeightLossOne;
        int daysTwo = excessWeight / dailyWeightLossTwo;
        int daysAverage = (daysOne + daysTwo) / 2;
        System.out.println("При ежедневной потере в 250 грамм потребуется " + daysOne +
                " дней, при потере в 500 грамм - " + daysTwo + " дней. В среднем потребуется " + daysAverage +
                " день на похудение" + "\n");

        int salaryPerMonthMasha = 67760;
        int salaryPerMonthDenis = 83690;
        int salaryPerMonthKristina = 76230;
        float newSalaryPerMonthMasha = (float) (salaryPerMonthMasha * 1.1);

    }
}