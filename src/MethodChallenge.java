public class MethodChallenge {

    public static void main (String[] args){
        System.out.println("Single centimeter conversion: " + convertToCentimeters(68) + "cm");

        System.out.println("Full centimeter conversion: " + convertToCentimeters(5, 8) + "cm");
    }

    public static double convertToCentimeters(int heightInch) {
        return heightInch * 2.54;
    }
    public static double convertToCentimeters(int heightFeet, int heightInch) {
//        int convertToInch =(heightFeet * 12) + heightInch;
//       return convertToCentimeters(convertToInch);

        return convertToCentimeters((heightFeet * 12) + heightInch);
    }
}
/////////