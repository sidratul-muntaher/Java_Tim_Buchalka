public class Main {
    public static void main(String[] args) {
        calcFeetandInchtoCm(100);
    }
    public static double calcFeetandInchtoCm(double feet, double inch){
       if(feet < 0 || inch < 0 && inch > 12){
           return -1;
       }
       double cm = (12 * feet) * 2.54;
       double centemeter = (inch * 2.54) + cm;
        System.out.println(feet + " feet " + ", " + inch + " inch = " + centemeter + " centemeter");
        return centemeter;
    }
    public static double calcFeetandInchtoCm(double inch){
        if(inch <= 0){
            return -1;
        }

        double feet = (int) inch/12;
        double remainingInch = inch % 12;
        System.out.println(inch + " inch = " + feet  + " foot, " + remainingInch + " inches");
        return calcFeetandInchtoCm(feet, remainingInch );
    }
}
