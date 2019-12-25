public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(340));
    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 60){
            return "Invalid value";
        }
       /* float sec = (minutes * 60) + seconds;
        int h = (int)(sec /3600);
        float hour = (sec /3600);
        int m = (int)((hour - h) * 60) ;
        float min = ((hour - h) * 60);
        int second = (int) ((min - m) * 60);
        System.out.println( h + "h " + m + "m " + second + "s ");
        return  getDurationString(sec);*/

       int hour = minutes /60;
       int remaingmin = minutes % 60;
       String hours = hour + "h ";
       String minute = remaingmin + "m ";
       String second = seconds + "s ";

       if(hour < 10) hours = "0" + hours;
       if(remaingmin < 10) minute = "0" + minute;
       if(seconds < 10) second = "0" + seconds;

        String s = hours + minute + second;
        return s;
    }
    public static String getDurationString(int second){

        /*int h = (int)(second /3600);
        float hour = (second /3600);
        int m = (int)((hour - h) * 60) ;
        float min = ((hour - h) * 60);
        int seconds = (int) ((min - m) * 60);
        System.out.println(m + "m ");
        return  second;*/
        int minute = second /60;
        int remainingsec = second % 60;
        return (getDurationString(minute, remainingsec));

    }
}
