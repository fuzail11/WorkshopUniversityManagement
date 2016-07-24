package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner s=new Scanner(System.in);
        Uni U= new Uni();
        int choice;
        int cout=3;
        do {
            System.out.println("Welcome To University Management");
            System.out.println("Help on: ");
            System.out.println(" 1. Teacher");
            System.out.println(" 2. Student");
            System.out.println(" 3. Exit");


                    choice = s.nextInt();
        } while( choice < 1 || choice > 3);
        System.out.println("\n");

        switch(choice) {

            case 1:

            do {


                do {
                    System.out.println("Welcome To University Management");
                    System.out.println(" 1. Teacher Addition");
                    System.out.println(" 2. Teacher Updating");
                    System.out.println(" 3. Teacher Deletion");
                    System.out.println(" 4. Exit");


                    choice = s.nextInt();
                } while (choice < 1 || choice > 4);
                System.out.println("\n");

                switch (choice) {

                    case 1:
                        U.getInputFromUserAndAddTeacher();
                        U.ViewT();
                        break;

                    case 2:
                        U.update();
                        U.ViewT();
                        break;
                    case 3:

                        U.delete();
                        U.ViewT();
                        break;

                    case 4:
                        System.out.println("Thankyou");
                        System.exit(0);
                        break;

                }

                cout--;


            }
            while (cout>0);




            case 2:


                do {


                    do {
                        System.out.println("Welcome To University Management");
                        System.out.println(" 1. Student Addition");
                        System.out.println(" 2. Student Updating");
                        System.out.println(" 3. Student Deletion");
                        System.out.println(" 4. Exit");


                        choice = s.nextInt();
                    } while (choice < 1 || choice > 4);
                    System.out.println("\n");

                    switch (choice) {

                        case 1:
                            U.getInputFromUserAndAddStudent();
                            U.ViewS();
                            break;

                        case 2:
                            U.updateS();
                            U.ViewS();
                            break;
                        case 3:

                            U.deleteS();
                            U.ViewS();
                            break;

                        case 4:
                            System.out.println("Thankyou");
                            System.exit(0);
                            break;

                    }

                    cout--;


                }
                while (cout>0);





            case 3:

                System.out.println("Thankyou");
                System.exit(0);











        }














    }
}
