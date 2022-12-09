package org.example;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static boolean streak = true;

    public static void main(String[] args) {
        startGame();
    }

    static void gameTitle(){
        System.out.println("Are you a genius");
        System.out.println("The program will randomly select question based on topics in Chemistry, Physics and Biology");
        System.out.println("Are you ready, please enter your name\n");
    }


    static void startGame() {

        gameTitle();

        String player_name = playerName();
        //there will be 5 rounds of questions
        for (int round = 1; round <= 5; round++) {
            streak = generateQuestion(randomNumber(3), round);

            //streak checker
            if (!streak) {
                System.out.println("You failed");
                break;
            }

            System.out.println("\nIncreased difficulty\n");
        }
        endGame(player_name);
    }

    static void endGame(String player_name) {
        if (streak) {
            System.out.println("You are a genius " + player_name);
        }
    }

    static String playerName() {
        String name = input.next();
        System.out.println("Hello, " + name);
        return name;
    }

    //generate random number from 1 to max
    static int randomNumber(int max) {
        return (int) Math.floor(Math.random() * max + 1);
    }

    static boolean generateQuestion(int random_number, int round) {

        if (round == 1) {
            //three random quest will be selected
            switch (random_number) {
                case 1 -> {
                    System.out.println("Can you light diamond on fire?");
                    return generateAnswer(randomNumber(4), round);
                }
                case 2 -> {
                    System.out.println("Can a fire have a shadow?");
                    return generateAnswer(randomNumber(4), round);
                }
                case 3 -> {
                    System.out.println("Can I turn my cat into a gold?");
                    return generateAnswer(randomNumber(4), round);
                }
            }
        } else if (round == 2) {
            //three random quest will be selected
            switch (random_number) {
                case 1 -> {
                    System.out.println("Can you light diamond on fire?");
                    return generateAnswer(randomNumber(4), round);
                }
                case 2 -> {
                    System.out.println("Can a fire have a shadow?");
                    return generateAnswer(randomNumber(4), round);
                }
                case 3 -> {
                    System.out.println("Can I turn my cat into a gold?");
                    return generateAnswer(randomNumber(4), round);
                }
            }

        } else if (round == 3) {
            //three random quest will be selected
            switch (random_number) {
                case 1 -> {
                    System.out.println("Can you light diamond on fire?");
                    return generateAnswer(randomNumber(4), round);
                }
                case 2 -> {
                    System.out.println("Can a fire have a shadow?");
                    return generateAnswer(randomNumber(4), round);
                }
                case 3 -> {
                    System.out.println("Can I turn my cat into a gold?");
                    return generateAnswer(randomNumber(4), round);
                }
            }
        } else if (round == 4) {
            //three random quest will be selected
            switch (random_number) {
                case 1 -> {
                    System.out.println("Can you light diamond on fire?");
                    return generateAnswer(randomNumber(4), round);
                }
                case 2 -> {
                    System.out.println("Can a fire have a shadow?");
                    return generateAnswer(randomNumber(4), round);
                }
                case 3 -> {
                    System.out.println("Can I turn my cat into a gold?");
                    return generateAnswer(randomNumber(4), round);
                }
            }
        } else if (round == 5) {
            //three random quest will be selected
            switch (random_number) {
                case 1 -> {
                    System.out.println("Can you light diamond on fire?");
                    return generateAnswer(randomNumber(4), round);
                }
                case 2 -> {
                    System.out.println("Can a fire have a shadow?");
                    return generateAnswer(randomNumber(4), round);
                }
                case 3 -> {
                    System.out.println("Can I turn my cat into a gold?");
                    return generateAnswer(randomNumber(4), round);
                }
            }
        }
        return true;
    }

    static void generatePlacement(){

    }

    static boolean generateAnswer(int random_number, int round) {

        char answer;

        if (round == 1) {
            switch (random_number) {
                case 1 -> {
                    System.out.println("A 1");
                    System.out.println("B 2");
                    System.out.println("C 3");
                    System.out.println("D 4");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'A';
                }
                case 2 -> {
                    System.out.println("A 2");
                    System.out.println("B 3");
                    System.out.println("C 4");
                    System.out.println("D 1");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'D';
                }
                case 3 -> {
                    System.out.println("A 3");
                    System.out.println("B 4");
                    System.out.println("C 1");
                    System.out.println("D 2");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'C';
                }
                case 4 -> {
                    System.out.println("A 4");
                    System.out.println("B 1");
                    System.out.println("C 2");
                    System.out.println("D 3");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'B';
                }
            }
        } else if (round == 2) {
            switch (random_number) {
                case 1 -> {
                    System.out.println("A 1");
                    System.out.println("B 2");
                    System.out.println("C 3");
                    System.out.println("D 4");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'A';
                }
                case 2 -> {
                    System.out.println("A 2");
                    System.out.println("B 3");
                    System.out.println("C 4");
                    System.out.println("D 1");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'D';
                }
                case 3 -> {
                    System.out.println("A 3");
                    System.out.println("B 4");
                    System.out.println("C 1");
                    System.out.println("D 2");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'C';
                }
                case 4 -> {
                    System.out.println("A 4");
                    System.out.println("B 1");
                    System.out.println("C 2");
                    System.out.println("D 3");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'B';
                }
            }

        } else if (round == 3) {
            switch (random_number) {
                case 1 -> {
                    System.out.println("A 1");
                    System.out.println("B 2");
                    System.out.println("C 3");
                    System.out.println("D 4");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'A';
                }
                case 2 -> {
                    System.out.println("A 2");
                    System.out.println("B 3");
                    System.out.println("C 4");
                    System.out.println("D 1");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'D';
                }
                case 3 -> {
                    System.out.println("A 3");
                    System.out.println("B 4");
                    System.out.println("C 1");
                    System.out.println("D 2");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'C';
                }
                case 4 -> {
                    System.out.println("A 4");
                    System.out.println("B 1");
                    System.out.println("C 2");
                    System.out.println("D 3");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'B';
                }
            }

        } else if (round == 4) {
            switch (random_number) {
                case 1 -> {
                    System.out.println("A 1");
                    System.out.println("B 2");
                    System.out.println("C 3");
                    System.out.println("D 4");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'A';
                }
                case 2 -> {
                    System.out.println("A 2");
                    System.out.println("B 3");
                    System.out.println("C 4");
                    System.out.println("D 1");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'D';
                }
                case 3 -> {
                    System.out.println("A 3");
                    System.out.println("B 4");
                    System.out.println("C 1");
                    System.out.println("D 2");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'C';
                }
                case 4 -> {
                    System.out.println("A 4");
                    System.out.println("B 1");
                    System.out.println("C 2");
                    System.out.println("D 3");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'B';
                }
            }

        } else if (round == 5) {
            switch (random_number) {
                case 1 -> {
                    System.out.println("A 1");
                    System.out.println("B 2");
                    System.out.println("C 3");
                    System.out.println("D 4");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'A';
                }
                case 2 -> {
                    System.out.println("A 2");
                    System.out.println("B 3");
                    System.out.println("C 4");
                    System.out.println("D 1");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'D';
                }
                case 3 -> {
                    System.out.println("A 3");
                    System.out.println("B 4");
                    System.out.println("C 1");
                    System.out.println("D 2");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'C';
                }
                case 4 -> {
                    System.out.println("A 4");
                    System.out.println("B 1");
                    System.out.println("C 2");
                    System.out.println("D 3");
                    answer = input.next().toUpperCase().charAt(0);
                    return answer == 'B';
                }
            }
        }
        return true;
    }
}