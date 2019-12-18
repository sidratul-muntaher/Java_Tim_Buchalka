public class SpeedConvertar {
    public static  long tomilePerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return  -1;
        }
        return  Math.round(kilometersPerHour / 1.609);
    }
    public  static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
            else{

                double YY = tomilePerHour(kilometersPerHour);
                System.out.println(kilometersPerHour + " km/h = " + YY + " mi/h");
            }
        }
    }

