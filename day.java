public class Day {
    public static void main(String args[]) {
        int a = 4;
        String dayName = " ";

        switch (a) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                System.out.println("Invalid day number");
        }

       
            System.out.println("The day is: " + dayName);
        
    }
}
