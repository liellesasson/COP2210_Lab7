package app;

public class Controller {

    //----------------------------------------------------------
    // beginning of main(String[] args)) method

    public static void main(String[] args) {

        yourInfoHeader();

        PrintHeader.printStepHeader(1);

        for(int i = -10; i <= 10; i++){
            System.out.println("The value of i is: " + i);
        }//end for i

        PrintHeader.printStepHeader(2);

        for(int k = 0; k <= 8; k = k+2){
            System.out.println("The value of k is: " + k);
        }//end for k

        PrintHeader.printStepHeader(3);
        for(int l = 10; l >= 0; l--){
            System.out.println("The value of l is: " + l);
        }//end for l

        PrintHeader.printStepHeader(4);
        for(int i = 0; i <= 20; i++){
            System.out.printf("The value of i is: %d \t\t ", i);
            if(i % 2 == 0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }//end of i

        PrintHeader.printStepHeader(5);
        for(int i = 0; i <=20; i++){
            System.out.printf("The value of i is: %d ", i);

            if(i % 2 == 0 && i < 10){
                System.out.printf("\t\teven\n");
            }
            else if (i % 2 == 0){
                System.out.printf("\teven\n");
            }
            else if( i < 10){
                System.out.printf("\t\todd\n");
            }
            else{
                System.out.printf("\todd\n");
            }
        }//end of i

        PrintHeader.printStepHeader(6);
        for(int row = 1; row <=10; row++){

            for(int col = 1; col <=15; col++){
                System.out.print("X" + "\t");
            }//end for col

            System.out.println();
        }//end for row

        PrintHeader.printStepHeader(7);
        for(int row = 1; row <= 10; row++){

            for (int col = 1; col <=10; col++){
                if(col % 2 == 0 || row % 2 ==0)
                    System.out.print("O\t");
                else{
                    System.out.print("X\t");
                }
            }// end for col
            System.out.println();
        }//end for row

        PrintHeader.printStepHeader(8);
        for (int row = 1; row <= 10; row++){

            for(int col = 1; col <= 10; col++){
                if(row == col) {
                    System.out.print("X\t");
                }else{
                    System.out.print("O\t");
                }
            }
            System.out.println();
        }

        PrintHeader.printStepHeader(9);
        for(int row = 1; row <= 10; row++){
            for(int col = 1; col <= 10; col++){

                if(row == col || row + col == 11){
                    System.out.print("X\t");
                }else{
                    System.out.print("O\t");
                }
            }//end col
            System.out.println();
        }//end row

        PrintHeader.printStepHeader(10);
        for(int row = 1; row <= 10; row++){
            for(int col = 1; col <= 10; col++){

                if(row >= 3 && col >= 6 && row <= 8){
                    System.out.print("X\t");
                }else{
                    System.out.print("O\t");
                }

            }//end col
            System.out.println();
        }//end row

        PrintHeader.printStepHeader(11);
        for(int row = 1; row <= 10; row++){
            for(int col = 1; col <= 10; col++){

                if(col % 3 == 0 || row % 2 != 0){
                    System.out.print("X\t");
                }else{
                    System.out.print("O\t");
                }
            }//end col
            System.out.println();
        }//end row




    }//end for main

    //-------------------------------------------------------------
    // beginning of yourInfoHeader() method

    public static void yourInfoHeader(){

        System.out.println("===============================================");
        System.out.println("PROGRAMMER: " + "Lielle Sasson");
        System.out.println("PANTHER ID: " + "6304972");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210 ");
        System.out.println("SECTION: \t " + "UO1");
        System.out.println("SEMESTER: \t " + "Spring 2022");
        System.out.println("CLASSTIME: \t " + "T/TH 9:30-12:15");
        System.out.println();
        System.out.println("Assignment: " + "Lab7");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person.");
        System.out.println("===============================================");
        System.out.println();

    }//end yourInfoHeader





}//end controller
