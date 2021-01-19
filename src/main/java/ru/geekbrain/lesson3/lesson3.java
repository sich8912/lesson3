package ru.geekbrain.lesson3;

import java.util.Random;
import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {

        while (true) {

            int random = randomInt(10);
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {

                System.out.println("Введите число от 0 до 9");
                int answer = sc.nextInt();
                if (answer == random) {
                    System.out.println("Вы угадали");
                    break;
                } else if (answer > random) {
                    System.out.println("Вы не угадали, заданное число меньше ");
                } else {
                    System.out.println("Вы не угадали, заданное число больше ");
                }
            }
            System.out.println("Игра окончена, загаданное число - " + random);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int answerQuit = sc.nextInt();
            if (answerQuit == 0) break;
        }
    }

    public static int randomInt(int leng) {
        Random random = new Random();
        return random.nextInt(leng);
    }

}
