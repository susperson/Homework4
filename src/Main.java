public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int age = 12;
        if (age >= 18) {
            System.out.println("Поздравляем, вы совершеннолетний!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать, и ты сможешь смотреть это кино ;(");
        }

        //Задача 2
        System.out.println("\nЗадача 2");
        int age2 = 21;
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Вы ходите в школу");
        }
        if (age2 >= 18 && age2 < 24) {
            System.out.println("Вы уже закончили школу, пора в университет!");
        }
        if (age2 >= 24) {
            System.out.println("Ах да, вам уже пора искать первую работу!");
        }

        //Задача 3
        System.out.println("\nЗадача 3");
        int carriageCapacity = 102;
        int seating = 60;
        int standee = carriageCapacity - seating;

        int seatingOccupied = 60;
        int standeeOccupied = 12;
        int totalOccupied = seatingOccupied + standeeOccupied;

        int seatingFree = seating - seatingOccupied;
        int standeeFree = standee - standeeOccupied;

        if (totalOccupied >= carriageCapacity) {
            System.out.println("К сожалению, все места заняты");
        }
        if (totalOccupied < carriageCapacity && seatingFree > 0) {
            System.out.println("В вагоне свободно " + seatingFree + " сидячих мест.");
        }
        if (totalOccupied< carriageCapacity && standeeFree > 0) {
            System.out.println("В вагоне свободно " + standeeFree + " стоячих мест.");
        }

        //Задача 2_1
        System.out.println("\nЗадача 2_1");
        int age2_1 = 12;

        if (age2_1 >= 18) {
            System.out.println("Поздравляем, вы совершеннолетний!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать, и ты сможешь смотреть это кино ;(");
        }

        //Задача 2_2
        System.out.println("\nЗадача 2_2");
        int age2_2 = 15;

        if (age2_2 >= 24) {
            System.out.println("Поздравляем, вы окончили университет, пора искать первую работу!");
        } else if (age2_2 >= 18) {
            System.out.println("Вы уже окончили школу, пора отправляться в университет!");
        } else if (age2_2 >= 7) {
            System.out.println("Привет, ты уже сделал уроки?");
        } else {
            System.out.println("Позови маму!");
        }

        //Задача 2_3
        System.out.println("\nЗадача 2_3");
        if (totalOccupied >= carriageCapacity) {
            System.out.println("К сожалению, все места заняты");
        } else {
            System.out.println("В вагоне свободно " + seatingFree + " сидячих и " + standeeFree + " стоячих мест.");
        }

        //Задача 3_1
        System.out.println("\nЗадача 3_1");
        int age3_1 = 32;

        boolean goToChildcare = age3_1 >= 2 && age3_1 <= 6;
        boolean goToSchool = age3_1 >= 7 && age3_1 <= 18;
        boolean goToUniversity = age3_1 > 18 && age3_1 <= 24;
        boolean findAJob = age3_1 > 24;

        if (goToChildcare) {
            System.out.println("Если возраст человека равен " + age3_1 + " , то ему нужно ходить в детский сад");
        } else if (goToSchool) {
            System.out.println("Если возраст человека равен " + age3_1 + " , то ему нужно ходить в школу");
        } else if (goToUniversity) {
            System.out.println("Если возраст человека равен " + age3_1 + " , то ему нужно ходить в университет");
        } else if (findAJob) {
            System.out.println("Если возраст человека равен " + age3_1 + " , то ему нужно ходить на работу");
        } else {
            System.out.println("Агу!");
        }

        //Задача 3_2
        System.out.println("\nЗадача 3_2");
        int age3_2 = 21;

        boolean canNotRide = age3_2 < 5;
        boolean rideWithAdult = age3_2 >= 5 && age3_2 < 14;

        if (canNotRide) {
            System.out.println("К сожалению, тебе еще нельзя на аттракционы.");
        } else if (rideWithAdult) {
            System.out.println("Ты можешь кататься, но только в сопровождении взрослого!");
        } else {
            System.out.println("Добро пожаловать на американские горки!");
        }

        //Задача 3_3
        System.out.println("\nЗадача 3_3");
        int one = 9;
        int two = 3;
        int free = 9;

        if (one == two && one == free) {
            System.out.println("Все три числа равны " + one);
        } else if (one >= two && one >= free) {
            System.out.println("Самое большое число: " + one);
        } else if (two >= free) {
            System.out.println("Самое большое число: " + two);
        } else {
            System.out.println("Самое большое число: " + free);
        }
    }
}