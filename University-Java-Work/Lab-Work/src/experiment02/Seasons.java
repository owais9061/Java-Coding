package experiment02;

public class Seasons {
    public static void main(String[] args) {
        int month = 2; // Change this to any integer from 1 to 12 to test the program
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "fall";
                break;
            default:
                season = "invalid";
                break;
        }

        System.out.println("The month " + month + " is in the " + season + " season.");
    }
}
