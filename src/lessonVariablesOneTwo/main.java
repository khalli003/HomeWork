package lessonVariablesOneTwo;

public class main {
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

    public static void task1 () {
        System.out.println("Задача 1");
         // Пишем код для задачи 1
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper =  763789;
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
         // Пишем код для задачи 2
        var dog = 8;
        var cat = 3.6;
        var paper =  763789;
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        var dog1 = 8.0;
        var cat = 3.6;
        var paper =  763789;

        dog1 = dog1 -3.5;
         System.out.println(dog1);
         cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
      var frog = 3.5;
        System.out.println(frog);
        frog =frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog  + 4 ;
        System.out.println(frog);

    }
    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        var firstFighter = 78.2;
        var secondFighter = 82.7;
        var totalAmount = firstFighter + secondFighter;
        System.out.println(totalAmount);
        totalAmount =  secondFighter - firstFighter ;
        System.out.println(totalAmount);

    }
    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        var firstFighter = 78.2;
        var secondFighter = 82.7;
        var difference = secondFighter % firstFighter;
        System.out.println(difference);

    }
    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 8
        var hours = 640;
        var totalEmployee = 8;
        var fewerWorkers = hours / totalEmployee;
        System.out.println("Всего работников в компании - "  +  fewerWorkers  +  " человек." );

        fewerWorkers = fewerWorkers + 94;
        hours = fewerWorkers * totalEmployee;


       System.out.println(  "Если в компании работает " + fewerWorkers + " человек, то всего " + hours + " часа работы может быть поделено между сотрудниками.");










    }



}

