public class Main {
    public static void main(String[] args) {
       int newScore = calculateScore("Tim", 500);
       System.out.println(newScore);

       calculateScore(75);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println( playerName + " scored " + score + " points");
        return score * 1000;

    }public static int calculateScore(int score) {

        return calculateScore("Anonymous", 200);
    }
}