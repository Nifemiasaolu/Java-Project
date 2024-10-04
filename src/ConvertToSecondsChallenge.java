public class ConvertToSecondsChallenge {

    public static void main(String[] args) {
       System.out.println(getDurationString(-3698));
       System.out.println(getDurationString(-65, 45));
       System.out.println(getDurationString(50, 145));
    }

    public static String getDurationString(int seconds) {
        if(seconds >= 0) {
//           int minute = seconds / 60;
           return getDurationString(seconds / 60, seconds % 60);

        } else {
            return "Invalid data for second (" + seconds + "), must be a positive integer value";
        }

    }
    public static String getDurationString(int minutes, int seconds) {
        if(seconds >= 0 && minutes >= 0 && minutes < 60) {

        int hours = minutes / 60;
        int remainingMinute =  minutes % 60;
        int remainingSecond = seconds % 60;

        return hours + "h " + remainingMinute + "m " + remainingSecond + "s";
        } else {
            return "Invalid data input";
        }
    }
}
