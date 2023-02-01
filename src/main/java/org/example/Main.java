package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static String realAnswer = null;
    static boolean streak = true;
    static ArrayList<String> choices = new ArrayList<>();
    static ArrayList<String> firstQuestions = new ArrayList<>();
    static ArrayList<String> physicFirstQuestionAnswers = new ArrayList<>();
    static ArrayList<String> chemistryFirstQuestionAnswers = new ArrayList<>();
    static ArrayList<String> biologyFirstQuestionAnswers = new ArrayList<>();
    static ArrayList<String> secondQuestions = new ArrayList<>();
    static ArrayList<String> physicSecondQuestionAnswers = new ArrayList<>();
    static ArrayList<String> chemistrySecondQuestionAnswers = new ArrayList<>();
    static ArrayList<String> biologySecondQuestionAnswers = new ArrayList<>();
    static ArrayList<String> thirdQuestions = new ArrayList<>();
    static ArrayList<String> physicThirdQuestionAnswers = new ArrayList<>();
    static ArrayList<String> chemistryThirdQuestionAnswers = new ArrayList<>();
    static ArrayList<String> biologyThirdQuestionAnswers = new ArrayList<>();
    static ArrayList<String> fourthQuestions = new ArrayList<>();
    static ArrayList<String> physicFourthQuestionAnswers = new ArrayList<>();
    static ArrayList<String> chemistryFourthQuestionAnswers = new ArrayList<>();
    static ArrayList<String> biologyFourthQuestionAnswers = new ArrayList<>();
    static ArrayList<String> fifthQuestions = new ArrayList<>();
    static ArrayList<String> physicFifthQuestionAnswers = new ArrayList<>();
    static ArrayList<String> chemistryFifthQuestionAnswers = new ArrayList<>();
    static ArrayList<String> biologyFifthQuestionAnswers = new ArrayList<>();

    //main method
    //Anas
    public static void main(String[] args) {
        startGame();
    }

    //Darwish
    static void startGame() {

        gameTitle();

        String playerName = playerName();

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
        endGame(playerName);
    }

    //Anas
    static boolean generateQuestion(int randomNumber, int round) {

        if (round == 1) {
            System.out.println("Question " + round);
            //three random quest will be selected
            switch (randomNumber) {
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
            switch (randomNumber) {
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
            switch (randomNumber) {
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
            switch (randomNumber) {
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
            switch (randomNumber) {
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

    //generate answer and shuffle its placement
    //Anas
    static boolean generateAnswer(int answerScheme, int round) {

        generateChoices();

        if (round == 1) {
            switch (answerScheme) {
                case 1 -> {
                    //physic
                    return isAnswer("Potential difference", physicFirstQuestionAnswer()).equals(realAnswer);
                }
                case 2 -> {
                    //chemistry
                    return isAnswer("Chlorine Gas", chemistryFirstQuestionAnswer()).equals(realAnswer);
                }
                case 3 -> {
                    //biology
                        return isAnswer("Cell", biologyFirstQuestionAnswer()).equals(realAnswer);
                }
            }
        } else if (round == 2) {
            switch (answerScheme) {
                case 1 -> {
                    //physic
                    return isAnswer("Zero", physicSecondQuestionAnswer()).equals(realAnswer);
                }
                case 2 -> {
                    //chemistry
                    return isAnswer("Ionizes partially in water to produce hydrogen oxide",
                            chemistrySecondQuestionAnswer()).equals(realAnswer);
                }
                case 3 -> {
                    //biology
                    return isAnswer("Nucleus", biologySecondQuestionAnswer()).equals(realAnswer);
                }
            }
        } else if (round == 3) {
            switch (answerScheme) {
                case 1 -> {
                    //physic
                    return isAnswer("Pressure's Law", physicThirdQuestionAnswer()).equals(realAnswer);
                }
                case 2 -> {
                    //chemistry
                    return isAnswer("The container becomes hotter",
                            chemistryThirdQuestionAnswer()).equals(realAnswer);
                }
                case 3 -> {
                    //biology
                    return isAnswer("Smooth Endoplasma Reticulum",
                            biologyThirdQuestionAnswer()).equals(realAnswer);
                }
            }
        } else if (round == 4) {
            switch (answerScheme) {
                case 1 -> {
                    //physic
                    return isAnswer("Fleming's Left hand rule",
                            physicFourthQuestionAnswer()).equals(realAnswer);
                }
                case 2 -> {
                    //chemistry
                    return isAnswer("Antidepressant", chemistryFourthQuestionAnswer()).equals(realAnswer);
                }
                case 3 -> {
                    //biology
                    return isAnswer("Ground tissue", biologyFourthQuestionAnswer()).equals(realAnswer);
                }
            }
        } else if (round == 5) {
            switch (answerScheme) {
                case 1 -> {
                    //physic
                    return isAnswer("Capacitor", physicFifthQuestionAnswer()).equals(realAnswer);
                }
                case 2 -> {
                    //chemistry
                    return isAnswer("Sodium carbonate", chemistryFifthQuestionAnswer()).equals(realAnswer);
                }
                case 3 -> {
                    //biology
                    return isAnswer("The blood glucose level",
                            biologyFifthQuestionAnswer()).equals(realAnswer);
                }
            }
        }
        return false;
    }

    //Luqman
    //first question
    static ArrayList<String> generateFirstQuestions() {
        firstQuestions.add("Which quantity is a scalar quantity?  ");
        firstQuestions.add("Which of the following substance consist of molecules?");
        firstQuestions.add("What do we call the most basic structure of living things");

        return firstQuestions;
    }

    //Hafizudin
    static ArrayList<String> physicFirstQuestionAnswer() {
        physicFirstQuestionAnswers.add("Potential difference");
        physicFirstQuestionAnswers.add("Velocity");
        physicFirstQuestionAnswers.add("Momentum");
        physicFirstQuestionAnswers.add("Force");

        //Potential difference

        Collections.shuffle(physicFirstQuestionAnswers);

        return physicFirstQuestionAnswers;
    }

    //Hafizudin
    static ArrayList<String> chemistryFirstQuestionAnswer() {
        chemistryFirstQuestionAnswers.add("Helium Gas");
        chemistryFirstQuestionAnswers.add("Chlorine Gas");
        chemistryFirstQuestionAnswers.add("Sodium Carbonate");
        chemistryFirstQuestionAnswers.add("Copper(ii) Oxide");

        //Chlorine Gas

        Collections.shuffle(chemistryFirstQuestionAnswers);

        return chemistryFirstQuestionAnswers;
    }

    //Hafizudin
    static ArrayList<String> biologyFirstQuestionAnswer() {
        biologyFirstQuestionAnswers.add("DNA");
        biologyFirstQuestionAnswers.add("Skin");
        biologyFirstQuestionAnswers.add("Cell");
        biologyFirstQuestionAnswers.add("Life");

        //Cell

        Collections.shuffle(biologyFirstQuestionAnswers);

        return biologyFirstQuestionAnswers;
    }

    //second question
    //Luqman
    static ArrayList<String> generateSecondQuestions() {
        secondQuestions.add("The force are balance when the net force is");
        secondQuestions.add("Which of the following is true about weak acid ?");
        secondQuestions.add("Where is DNA found inside a cell?");

        return secondQuestions;
    }

    //Hafizudin
    static ArrayList<String> physicSecondQuestionAnswer() {
        physicSecondQuestionAnswers.add("Zero");
        physicSecondQuestionAnswers.add("More than frictional force");
        physicSecondQuestionAnswers.add("Equal to frictional force");
        physicSecondQuestionAnswers.add("Less than frictional force");

        //Zero

        Collections.shuffle(physicSecondQuestionAnswers);

        return physicSecondQuestionAnswers;
    }

    //Hafizudin
    static ArrayList<String> chemistrySecondQuestionAnswer() {
        chemistrySecondQuestionAnswers.add("Unable to neutralize alkali");
        chemistrySecondQuestionAnswers.add("The pH value is more than 7");
        chemistrySecondQuestionAnswers.add("Able to change red litmus paper to blue");
        chemistrySecondQuestionAnswers.add("Ionizes partially in water to produce hydrogen oxide");

        //Ionizes partially in water to produce hydrogen oxide

        Collections.shuffle(chemistrySecondQuestionAnswers);

        return chemistrySecondQuestionAnswers;
    }

    //Hafizudin
    static ArrayList<String> biologySecondQuestionAnswer() {
        biologySecondQuestionAnswers.add("Cytoplasm");
        biologySecondQuestionAnswers.add("Nucleus");
        biologySecondQuestionAnswers.add("Cell membrane");
        biologySecondQuestionAnswers.add("Mitochondria");

        //Nucleus

        Collections.shuffle(biologySecondQuestionAnswers);

        return biologySecondQuestionAnswers;
    }

    //Luqman
    //third question
    static ArrayList<String> generateThirdQuestions() {
        thirdQuestions.add("After a log journey the air pressure in a car tyre is increased,this can explain by");
        thirdQuestions.add("Which of the following is true of an Exorthermic reaction?");
        thirdQuestions.add("Which organelle synthesis lipid?");

        return thirdQuestions;
    }

    //Hafizudin
    static ArrayList<String> physicThirdQuestionAnswer() {
        physicThirdQuestionAnswers.add("Boyle's Law");
        physicThirdQuestionAnswers.add("Charles's Law");
        physicThirdQuestionAnswers.add("Pressure's Law");
        physicThirdQuestionAnswers.add("Newton's Law");

        //Pressure's Law

        Collections.shuffle(physicThirdQuestionAnswers);

        return physicThirdQuestionAnswers;
    }

    //Hafizudin
    static ArrayList<String> chemistryThirdQuestionAnswer() {
        chemistryThirdQuestionAnswers.add("The container becomes hotter");
        chemistryThirdQuestionAnswers.add("The temperature of mixture decreases");
        chemistryThirdQuestionAnswers.add("Heat energy is absorbed from the surroundings");
        chemistryThirdQuestionAnswers.add("The heat energy is converted to kinetic energy");

        //The container becomes hotter

        Collections.shuffle(chemistryThirdQuestionAnswers);

        return chemistryThirdQuestionAnswers;
    }

    //Hafizudin
    static ArrayList<String> biologyThirdQuestionAnswer() {
        biologyThirdQuestionAnswers.add("Lysosom");
        biologyThirdQuestionAnswers.add("Rough Endoplasmic Reticulum");
        biologyThirdQuestionAnswers.add("Golgi Apparatus");
        biologyThirdQuestionAnswers.add("Smooth Endoplasma Reticulum");

        //Smooth Endoplasma Reticulum

        Collections.shuffle(biologyThirdQuestionAnswers);

        return biologyThirdQuestionAnswers;
    }

    //Luqman
    //fourth question
    static ArrayList<String> generateFourthQuestions() {
        fourthQuestions.add("The motion of a current carrying conductor in an magnetic fields can be determined by");
        fourthQuestions.add("What is the type of medicine for barbiturate");
        fourthQuestions.add("Which of the following tissue is NOT a plant tissue");

        return fourthQuestions;
    }

    //Hafizudin
    static ArrayList<String> physicFourthQuestionAnswer() {
        physicFourthQuestionAnswers.add("Direction of current flow");
        physicFourthQuestionAnswers.add("Fleming's Right hand rule");
        physicFourthQuestionAnswers.add("Fleming's Left hand rule");
        physicFourthQuestionAnswers.add("Right hand grip rule");

        //Fleming's Left hand rule

        Collections.shuffle(physicFourthQuestionAnswers);

        return physicFourthQuestionAnswers;
    }

    //Hafizudin
    static ArrayList<String> chemistryFourthQuestionAnswer() {
        chemistryFourthQuestionAnswers.add("Antibiotic");
        chemistryFourthQuestionAnswers.add("Antidepressant");
        chemistryFourthQuestionAnswers.add("Stimulant");
        chemistryFourthQuestionAnswers.add("Analgesic");

        //Antidepressant

        Collections.shuffle(chemistryFourthQuestionAnswers);

        return chemistryFourthQuestionAnswers;
    }

    //Hafizudin
    static ArrayList<String> biologyFourthQuestionAnswer() {
        biologyFourthQuestionAnswers.add("Meristem tissue");
        biologyFourthQuestionAnswers.add("Connective tissue");
        biologyFourthQuestionAnswers.add("Ground tissue");
        biologyFourthQuestionAnswers.add("Vascular tissue");

        //Ground tissue

        Collections.shuffle(biologyFourthQuestionAnswers);

        return biologyFourthQuestionAnswers;
    }

    //Luqman
    //fourth question
    static ArrayList<String> generateFifthQuestions() {
        fifthQuestions.add("Which of the following electronic component can store charge and also smoothen the output current of a rectification circuit");
        fifthQuestions.add("What is the addictive added in detergent to improve the function of detergent as cleaning agent in hard water");
        fifthQuestions.add("Which internal factor is regulated by Pankreas");

        return fifthQuestions;
    }

    //Hafizudin
    static ArrayList<String> physicFifthQuestionAnswer() {
        physicFifthQuestionAnswers.add("Resistor");
        physicFifthQuestionAnswers.add("Diode");
        physicFifthQuestionAnswers.add("Capacitor");
        physicFifthQuestionAnswers.add("Thermistor");

        //Capacitor

        Collections.shuffle(physicFifthQuestionAnswers);

        return physicFifthQuestionAnswers;
    }

    //Hafizudin
    static ArrayList<String> chemistryFifthQuestionAnswer() {
        chemistryFifthQuestionAnswers.add("Lipase");
        chemistryFifthQuestionAnswers.add("Sodium Hypochlorite");
        chemistryFifthQuestionAnswers.add("Sodium carbonate");
        chemistryFifthQuestionAnswers.add("Silicones");

        //Sodium carbonate

        Collections.shuffle(chemistryFifthQuestionAnswers);

        return chemistryFifthQuestionAnswers;
    }

    //Hafizudin
    static ArrayList<String> biologyFifthQuestionAnswer() {
        biologyFifthQuestionAnswers.add("The level of carbon dioxide");
        biologyFifthQuestionAnswers.add("The blood osmotic pressure");
        biologyFifthQuestionAnswers.add("The body temperature");
        biologyFifthQuestionAnswers.add("The blood glucose level");

        //The blood glucose leve

        Collections.shuffle(biologyFifthQuestionAnswers);

        return biologyFifthQuestionAnswers;
    }

    //validate answer
    //Darwish
    static String isAnswer(String answer, ArrayList<String> listAnswers) {

        for (int i = 0; i < 4; i++) {
            System.out.println("\t" + choices.get(i) + " " + listAnswers.get(i));
//            System.out.println("\t" + listAnswers.get(i).contains(answer)); //comment to hide answer

            if (listAnswers.get(i).contains(answer)) {
                realAnswer = choices.get(i);
            }
        }
        return String.valueOf(input.next().toUpperCase().charAt(0));
    }

    //generate mcq choices
    //Hafizudin
    static void generateChoices() {
        choices.add("A");
        choices.add("B");
        choices.add("C");
        choices.add("D");
    }

    //Darwish
    static void endGame(String playerName) {
        if (streak) {
            System.out.println("\nYou are a genius " + playerName);
        }
    }

    //Luqman
    static String playerName() {
        String name = input.next();
        System.out.println("Hello, " + name);
        System.out.println();
        return name;
    }

    //generate random number from 1 to max
    //Luqman
    static int randomNumber(int max) {
        return (int) Math.floor((Math.random() * max) + 1);
    }

    //Hafizudin
    static void gameTitle() {
        System.out.println("Are you a genius");
        System.out.println("There will be 5 questions");
        System.out.print("Are you ready, please enter your name : ");
    }
}
