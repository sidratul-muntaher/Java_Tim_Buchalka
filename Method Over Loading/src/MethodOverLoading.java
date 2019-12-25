public class MethodOverLoading {
    public static void main(String[] args) {
        int newScore = calculateScore("Sid", 100);
        System.out.println("New Score is " + newScore);
        calculateScore(70);
    }
    public  static int calculateScore(String playername, int Score){
        System.out.println("Player " + playername + " scored " + Score + " point ");
        return Score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Uname player scored " + score + " point");
        return score;
    }
}
