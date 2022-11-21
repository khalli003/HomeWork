package lessonVariablesTwo;

public class main2 {
    public static void main(String[] args) {
          task1();
          task2();
          task3();
          task4();
          task5();
          task6();
          task7();
          task8();
    }
public static void task1(){
    System.out.println("Задача 1");
    // // Пишем код для задачи 1

    int a = 2147483647;
    System.out.println("Значение переменной a с типом int равно 2147483647 ");
    byte b = 127;
    System.out.println("Значение переменной b с типом byte равно 127");
    short c = 32767;
    System.out.println("Значение переменной C с типом short равно 32767");
    long d = 9223372036854775807L;
    System.out.println("Значение переменной d с типом long равно 9223372036854775807L");
    float e = 3.4F;
    System.out.println("Значение переменной e с типом float равно 3.4F");
    double f = 1.7;
    System.out.println("Значение переменной f с типом double равно 1.7");
    }
    public static void task2(){
        System.out.println("Задача 2");
        // Пишем код для задачи 2
         double a = 27.2;
         long b = 987678965549L;
         float c = 2.786F;
         char d = 569;
         int e = -159;
         short f = 27897;
         byte g = 67;






    }
    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
    var lyudmilaPavlovna = 23;
    var annaSergeevna = 27;
    var ekaterinaAndreevna = 30;
    var eachStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
    var totalLists = 480;
    var forEachStudent = totalLists / eachStudents;
        System.out.println("На каждого ученика рассчитано " + forEachStudent + " листов бумаги");


    }
    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        var machine = 16;
        var minute = 2;
        var amountPerMinute = machine / minute;
        System.out.println("Кличество бутылок за одну минуту  " + amountPerMinute );
       var a = 20;
       var b = 1200;
       var c = 4308;
       var d = 30156;
        a = a * amountPerMinute;
        System.out.println("За 20 минут  машина произвела " + a +" штук бутылок");
        b = b * amountPerMinute;
        System.out.println("За сутки машина произвела " + b +" штук бутылок");
        c = c * amountPerMinute;
        System.out.println("За 3 дня машина произвела " + c +" штук бутылок");
        d = d * amountPerMinute;
        System.out.println("За месяц машина произвела " + d +" штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        // Пишем код для задачи 5

        var totalAmountPaint = 120;
        var white = 2;
        var brown = 4;
        var onOneClassRoom = white + brown;

        var totalClassRooms = totalAmountPaint / onOneClassRoom;
         var finalTotalAmountPaint = totalAmountPaint / totalClassRooms;
        var resultWhite = totalClassRooms * white;
        var resultBrown = totalClassRooms * brown;
        System.out.println("В школе, где " + totalClassRooms +  " классов, нужно " + resultWhite + " банок белой краски и " + resultBrown + " банок коричневой краски");


    }
    public static void task6() {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
    var bananas = 5;
    var milk = 200;
    var iceCreme = 2;
    var eggs = 4;
    bananas = bananas * 80;
    milk = milk * 105;
    iceCreme = iceCreme * 100;
    eggs = eggs * 70;
    var totalGram = bananas + milk +  iceCreme + eggs;
        System.out.println("Сумма грамм " + totalGram);
        var inKilogram  = totalGram / 1000;
        System.out.println(" На киллограмм " + inKilogram);
    }
    public static void task7() {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
       var reset = 7 ;
       var firstVariant = 250;
        var secondVariant = 500;
       var resultFirstVariant  = firstVariant / reset ;
       var resultSecondVariant = secondVariant / reset;
        System.out.println("Потребуется дней " + resultFirstVariant + "\n Потребуется  " +resultSecondVariant + " день");
    }
    public static void task8() {
        System.out.println("Задача 8");
        // Пишем код для задачи 8
       var masha = 67760;
       var denis = 83690;
       var kristina = 76230;
       var increaseAmount = (masha *10) /100 ;//  сумма повышения
        var sum = increaseAmount + masha; // сумма с повышением за текущий месяц
        var beforeForTheYear = masha * 12; // сумма за год без повышения
        var afterForTheYear = sum * 12;// сумма за год после повышения
        var amountOfIncome = increaseAmount  * 12;
        System.out.println(" Маша теперь получает "+ sum + " рублей. " + " Годовой доход вырос на " + amountOfIncome + " рублей.");

        var increaseAmount1 = (denis *10) /100 ;//  сумма повышения
        var sum1 = increaseAmount1 + denis; // сумма с повышением за текущий месяц
        var beforeForTheYear1 = denis * 12; // сумма за год без повышения
        var afterForTheYear1 = sum1 * 12;// сумма за год после повышения
        var amountOfIncome1 = increaseAmount1  * 12;
        System.out.println(" Денис  теперь получает "+ sum1 + " рублей. " + " Годовой доход вырос на " + amountOfIncome1 + " рублей.");



        var increaseAmount2 = (kristina *10) /100 ;//  сумма повышения
        var sum2 = increaseAmount2 + kristina; // сумма с повышением за текущий месяц
        var beforeForTheYear2 = kristina * 12; // сумма за год без повышения
        var afterForTheYear2 = sum2 * 12;// сумма за год после повышения
        var amountOfIncome2 = increaseAmount2  * 12;
        System.out.println(" Кристина теперь получает "+ sum2 + " рублей. " + " Годовой доход вырос на " + amountOfIncome2 + " рублей.");


    }
}
