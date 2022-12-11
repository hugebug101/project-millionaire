package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static String real_answer = null;
    static boolean streak = true;
    static ArrayList<String> choices = new ArrayList<>();
    static ArrayList<String> first_questions = new ArrayList<>();
    static ArrayList<String> physic_first_question_answers = new ArrayList<>();
    static ArrayList<String> chemistry_first_question_answers = new ArrayList<>();
    static ArrayList<String> biology_first_question_answers = new ArrayList<>();
    static ArrayList<String> second_questions = new ArrayList<>();
    static ArrayList<String> physic_second_question_answers = new ArrayList<>();
    static ArrayList<String> chemistry_second_question_answers = new ArrayList<>();
    static ArrayList<String> biology_second_question_answers = new ArrayList<>();
    static ArrayList<String> third_questions = new ArrayList<>();
    static ArrayList<String> physic_third_question_answers = new ArrayList<>();
    static ArrayList<String> chemistry_third_question_answers = new ArrayList<>();
    static ArrayList<String> biology_third_question_answers = new ArrayList<>();
    static ArrayList<String> fourth_questions = new ArrayList<>();
    static ArrayList<String> physic_fourth_question_answers = new ArrayList<>();
    static ArrayList<String> chemistry_fourth_question_answers = new ArrayList<>();
    static ArrayList<String> biology_fourth_question_answers = new ArrayList<>();
    static ArrayList<String> fifth_questions = new ArrayList<>();
    static ArrayList<String> physic_fifth_question_answers = new ArrayList<>();
    static ArrayList<String> chemistry_fifth_question_answers = new ArrayList<>();
    static ArrayList<String> biology_fifth_question_answers = new ArrayList<>();
    static ArrayList<String> list_answers = new ArrayList<>();

    //main method
    public static void main(String[] args) {
        startGame();
    }

    static void gameTitle() {
        System.out.println("Are you a genius");
        System.out.println("The program will randomly select question based on topics in Chemistry, Physics and Biology");
        System.out.println("Are you ready, please enter your name");
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
            if (round < 5) {
                System.out.println("\nIncreased difficulty\n");
            }
        }
        endGame(player_name);
    }

    static void endGame(String player_name) {
        if (streak) {
            System.out.println("\nYou are a genius " + player_name);
        }
    }

    static String playerName() {
        String name = input.next();
        System.out.println("Hello, " + name);
        System.out.println();
        return name;
    }

    //generate random number from 1 to max
    static int randomNumber(int max) {
        return (int) Math.floor(Math.random() * max + 1);
    }

    static boolean generateQuestion(int random_number, int round) {

        if (round == 1) {
            System.out.println("Question " + round);
            //three random quest will be selected
            switch (random_number) {
                case 1 -> {
                    //physic
                    System.out.println(generateFirstQuestions().get(0));
                    return generateAnswer(1, round);
                }
                case 2 -> {
                    //chemistry
                    System.out.println(generateFirstQuestions().get(1));
                    return generateAnswer(2, round);
                }
                case 3 -> {
                    //biology
                    System.out.println(generateFirstQuestions().get(2));
                    return generateAnswer(3, round);
                }
            }
        } else if (round == 2) {
            System.out.println("Question " + round);
            switch (random_number) {
                case 1 -> {
                    //physic
                    System.out.println(generateSecondQuestions().get(0));
                    return generateAnswer(1, round);
                }
                case 2 -> {
                    //chemistry
                    System.out.println(generateSecondQuestions().get(1));
                    return generateAnswer(2, round);
                }
                case 3 -> {
                    //biology
                    System.out.println(generateSecondQuestions().get(2));
                    return generateAnswer(3, round);
                }
            }
        } else if (round == 3) {
            System.out.println("Question " + round);
            switch (random_number) {
                case 1 -> {
                    //physic
                    System.out.println(generateThirdQuestions().get(0));
                    return generateAnswer(1, round);
                }
                case 2 -> {
                    //chemistry
                    System.out.println(generateThirdQuestions().get(1));
                    return generateAnswer(2, round);
                }
                case 3 -> {
                    //biology
                    System.out.println(generateThirdQuestions().get(2));
                    return generateAnswer(3, round);
                }
            }
        } else if (round == 4) {
            System.out.println("Question " + round);
            switch (random_number) {
                case 1 -> {
                    //physic
                    System.out.println(generateFourthQuestions().get(0));
                    return generateAnswer(1, round);
                }
                case 2 -> {
                    //chemistry
                    System.out.println(generateFourthQuestions().get(1));
                    return generateAnswer(2, round);
                }
                case 3 -> {
                    //biology
                    System.out.println(generateFourthQuestions().get(2));
                    return generateAnswer(3, round);
                }
            }
        } else if (round == 5) {
            System.out.println("Question " + round);
            switch (random_number) {
                case 1 -> {
                    //physic
                    System.out.println(generateFifthQuestions().get(0));
                    return generateAnswer(1, round);
                }
                case 2 -> {
                    //chemistry
                    System.out.println(generateFifthQuestions().get(1));
                    return generateAnswer(2, round);
                }
                case 3 -> {
                    //biology
                    System.out.println(generateFifthQuestions().get(2));
                    return generateAnswer(3, round);
                }
            }
        }
        return true;
    }

    //validate answer
    static String isAnswer(String answer, ArrayList<String> method_answer) {

        System.out.println();
        list_answers = method_answer;
        for (int i = 0; i < 4; i++) {
            System.out.println(choices.get(i) + " " + list_answers.get(i));
            System.out.println(list_answers.get(i).contains(answer)); //comment to hide answer
            System.out.println();
            if (list_answers.get(i).contains(answer)) {
                real_answer = choices.get(i);
            }
        }
        return String.valueOf(input.next().toUpperCase().charAt(0));
    }

    //generate mcq choices
    static void generateChoices() {
        choices.add("A");
        choices.add("B");
        choices.add("C");
        choices.add("D");
    }

    //generate answer and shuffle its placement
    static boolean generateAnswer(int answer_scheme, int round) {

        generateChoices();

        if (round == 1) {
            switch (answer_scheme) {
                case 1 -> {
                    //physic
                    return isAnswer("Dimensions", physicFirstQuestionAnswer()).equals(real_answer);
                }
                case 2 -> {
                    //chemistry
                    return isAnswer("They easily lose electrons", chemistryFirstQuestionAnswer()).equals(real_answer);
                }
                case 3 -> {
                    //biology
                    return isAnswer("Mercury Poisoning", biologyFirstQuestionAnswer()).equals(real_answer);
                }
            }
        } else if (round == 2) {
            switch (answer_scheme) {
                case 1 -> {
                    //physic
                    return isAnswer("Time", physicSecondQuestionAnswer()).equals(real_answer);
                }
                case 2 -> {
                    //chemistry
                    return isAnswer("Vulcanization", chemistrySecondQuestionAnswer()).equals(real_answer);
                }
                case 3 -> {
                    //biology
                    return isAnswer("Vitamin K", biologySecondQuestionAnswer()).equals(real_answer);
                }
            }
        } else if (round == 3) {
            switch (answer_scheme) {
                case 1 -> {
                    //physic
                    return isAnswer("Geostationary Orbit", physicThirdQuestionAnswer()).equals(real_answer);
                }
                case 2 -> {
                    //chemistry
                    return isAnswer("Asbestos", chemistryThirdQuestionAnswer()).equals(real_answer);
                }
                case 3 -> {
                    //biology
                    return isAnswer("Myosin", biologyThirdQuestionAnswer()).equals(real_answer);
                }
            }
        } else if (round == 4) {
            switch (answer_scheme) {
                case 1 -> {
                    //physic
                    return isAnswer("His power output is greater when he runs in comparison to when he walks", physicFourthQuestionAnswer()).equals(real_answer);
                }
                case 2 -> {
                    //chemistry
                    return isAnswer("Silver Chloride", chemistryFourthQuestionAnswer()).equals(real_answer);
                }
                case 3 -> {
                    //biology
                    return isAnswer("Increase in volume and burst", biologyFourthQuestionAnswer()).equals(real_answer);
                }
            }
        } else if (round == 5) {
            switch (answer_scheme) {
                case 1 -> {
                    //physic
                    return isAnswer("Will become 2.25 times", physicFifthQuestionAnswer()).equals(real_answer);
                }
                case 2 -> {
                    //chemistry
                    return isAnswer("Tear gas", chemistryFifthQuestionAnswer()).equals(real_answer);
                }
                case 3 -> {
                    //biology
                    return isAnswer("Gastrin", biologyFifthQuestionAnswer()).equals(real_answer);
                }
            }
        }
        return false;
    }

    //first question
    static ArrayList<String> generateFirstQuestions() {
        first_questions.add("Which among the following is measured using a Vernier Caliper?"); //physics
        first_questions.add("The Alkali metals are called good reducing agents. This implies that__"); //chemistry
        first_questions.add("Minimata Disease is a severe neurological syndrome caused by eating fish and discovered in Japan. What was factor behind this disease?"); //biology

        return first_questions;
    }

    static ArrayList<String> physicFirstQuestionAnswer() {
        physic_first_question_answers.add("Dimensions");
        physic_first_question_answers.add("Time");
        physic_first_question_answers.add("Sound");
        physic_first_question_answers.add("Temperature");

        //Dimensions

        Collections.shuffle(physic_first_question_answers);

        return physic_first_question_answers;
    }

    static ArrayList<String> chemistryFirstQuestionAnswer() {
        chemistry_first_question_answers.add("They easily capture electrons");
        chemistry_first_question_answers.add("They are not stable at room temperature");
        chemistry_first_question_answers.add("They easily lose electrons");
        chemistry_first_question_answers.add("They don’t act with dilute acids");

        //They easily lose electrons

        Collections.shuffle(chemistry_first_question_answers);

        return chemistry_first_question_answers;
    }

    static ArrayList<String> biologyFirstQuestionAnswer() {
        biology_first_question_answers.add("Arsenic Poisoning");
        biology_first_question_answers.add("Mercury Poisoning");
        biology_first_question_answers.add("Lead Poisoning");
        biology_first_question_answers.add("Cadmium Poisoning");

        //Mercury Poisoning

        Collections.shuffle(biology_first_question_answers);

        return biology_first_question_answers;
    }

    //second question
    static ArrayList<String> generateSecondQuestions() {
        second_questions.add("Svedberg Unit is a unit of _________?");
        second_questions.add("When Sulphur is heated with rubber, the process is commonly known as ?");
        second_questions.add("Which of the following Vitamin is required for Normal Blood Circulation ?");

        return second_questions;
    }

    static ArrayList<String> physicSecondQuestionAnswer() {
        physic_second_question_answers.add("Concentration");
        physic_second_question_answers.add("Size");
        physic_second_question_answers.add("Density");
        physic_second_question_answers.add("Time");

        //Time

        Collections.shuffle(physic_second_question_answers);

        return physic_second_question_answers;
    }

    static ArrayList<String> chemistrySecondQuestionAnswer() {
        chemistry_second_question_answers.add("Galvanization");
        chemistry_second_question_answers.add("Sulphonation");
        chemistry_second_question_answers.add("Vulcanization");
        chemistry_second_question_answers.add("Hydrodesulfurization");

        //Vulcanization

        Collections.shuffle(chemistry_second_question_answers);

        return chemistry_second_question_answers;
    }

    static ArrayList<String> biologySecondQuestionAnswer() {
        biology_second_question_answers.add("Vitamin A");
        biology_second_question_answers.add("Vitamin K");
        biology_second_question_answers.add("Vitamin D");
        biology_second_question_answers.add("Vitamin E");

        //Vitamin K

        Collections.shuffle(biology_second_question_answers);

        return biology_second_question_answers;
    }

    //third question
    static ArrayList<String> generateThirdQuestions() {
        third_questions.add("Which among the following orbits are more prone to harms of space debris or space Junk in comparison to others?");
        third_questions.add("Calcium Magnesium Silicate is commonly called as ________?");
        third_questions.add("Which among the following is involved in movement of Muscles?");

        return third_questions;
    }

    static ArrayList<String> physicThirdQuestionAnswer() {
        physic_third_question_answers.add("Polar Sun Synchronous Orbit");
        physic_third_question_answers.add("Low Earth Orbit");
        physic_third_question_answers.add("Geosynchronous orbit");
        physic_third_question_answers.add("Geostationary Orbit");

        //Geostationary Orbit

        Collections.shuffle(physic_third_question_answers);

        return physic_third_question_answers;
    }

    static ArrayList<String> chemistryThirdQuestionAnswer() {
        chemistry_third_question_answers.add("Asbestos");
        chemistry_third_question_answers.add("Borax");
        chemistry_third_question_answers.add("Baking Soda");
        chemistry_third_question_answers.add("Washing Soda");

        //Asbestos

        Collections.shuffle(chemistry_third_question_answers);

        return chemistry_third_question_answers;
    }

    static ArrayList<String> biologyThirdQuestionAnswer() {
        biology_third_question_answers.add("Myoglobin");
        biology_third_question_answers.add("Myosin");
        biology_third_question_answers.add("Mucin");
        biology_third_question_answers.add("None of the above");

        //Myosin

        Collections.shuffle(biology_third_question_answers);

        return biology_third_question_answers;
    }

    //fourth question
    static ArrayList<String> generateFourthQuestions() {
        fourth_questions.add("A person runs up two flights of stairs instead of walking up. The person feels more tired because ___?");
        fourth_questions.add("Which among the following minerals is also known as Horn Silver?");
        fourth_questions.add("If Red blood cells in kept in distilled water what will happen?");

        return fourth_questions;
    }

    static ArrayList<String> physicFourthQuestionAnswer() {
        physic_fourth_question_answers.add("He does more work when he runs in comparison to when he walks");
        physic_fourth_question_answers.add("His power output is greater when he runs in comparison to when he walks");
        physic_fourth_question_answers.add("His gravitational force is greater when he runs in comparison to when he walk");
        physic_fourth_question_answers.add("He has more inertia when he runs in comparison to when he walks");

        //His power output is greater when he runs in comparison to when he walks

        Collections.shuffle(physic_fourth_question_answers);

        return physic_fourth_question_answers;
    }

    static ArrayList<String> chemistryFourthQuestionAnswer() {
        chemistry_fourth_question_answers.add("Silver Iodide");
        chemistry_fourth_question_answers.add("Silver Chloride");
        chemistry_fourth_question_answers.add("Zinc Phosphate");
        chemistry_fourth_question_answers.add("Silver Sulphide");

        //Silver Chloride

        Collections.shuffle(chemistry_fourth_question_answers);

        return chemistry_fourth_question_answers;
    }

    static ArrayList<String> biologyFourthQuestionAnswer() {
        biology_fourth_question_answers.add("Shrink and collapse");
        biology_fourth_question_answers.add("Stick together");
        biology_fourth_question_answers.add("Increase in volume and burst");
        biology_fourth_question_answers.add("Remains same");

        //Increase in volume and burst

        Collections.shuffle(biology_fourth_question_answers);

        return biology_fourth_question_answers;
    }

    //fourth question
    static ArrayList<String> generateFifthQuestions() {
        fifth_questions.add("If a moving body turns its speed to 1.5 times, its kinetic energy __:");
        fifth_questions.add("Which of the following chemicals is also known as lachrymatory agent or lachrymator? ");
        fifth_questions.add("Which among the following is not an Enzyme?");

        return fifth_questions;
    }

    static ArrayList<String> physicFifthQuestionAnswer() {
        physic_fifth_question_answers.add("Will become 1.5 times");
        physic_fifth_question_answers.add("Will become 3 times");
        physic_fifth_question_answers.add("Will become 2.25 times");
        physic_fifth_question_answers.add("Will become 6 times");

        //Will become 2.25 times

        Collections.shuffle(physic_fifth_question_answers);

        return physic_fifth_question_answers;
    }

    static ArrayList<String> chemistryFifthQuestionAnswer() {
        chemistry_fifth_question_answers.add("Mustard Gas");
        chemistry_fifth_question_answers.add("Tear gas");
        chemistry_fifth_question_answers.add("Diborane");
        chemistry_fifth_question_answers.add("Chlorine gas");

        //Tear gas

        Collections.shuffle(chemistry_fifth_question_answers);

        return chemistry_fifth_question_answers;
    }

    static ArrayList<String> biologyFifthQuestionAnswer() {
        biology_fifth_question_answers.add("Gastrin");
        biology_fifth_question_answers.add("Ptyalin");
        biology_fifth_question_answers.add("Pepsin");
        biology_fifth_question_answers.add("Rennin");

        //Gastrin

        Collections.shuffle(biology_fifth_question_answers);

        return biology_fifth_question_answers;
    }
}
