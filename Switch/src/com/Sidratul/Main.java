package com.Sidratul;

public class Main {

    public static void main(String[] args) {
        printDayoftheWeek(0);
        printDayoftheWeek(1);
        printDayoftheWeek(2);
        printDayoftheWeek(3);
        printDayoftheWeek(4);
        printDayoftheWeek(5);
        printDayoftheWeek(6);
        printDayoftheWeek(-1);
       /* int switchValue = 5;
        //noinspection SwitchStatementWithoutDefaultBranch
        switch (switchValue){
            case 1:
                    System.out.println("Value was one");
            break;
            case 2:
                System.out.println("value was two");
                break;
            case 3: case 4: case 5:
                System.out.println("value may be three or four or five");
        }
        String month = "January";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }*/

    }
    public static void printDayoftheWeek(int day){

        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
