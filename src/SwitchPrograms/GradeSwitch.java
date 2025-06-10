package SwitchPrograms;

public class GradeSwitch {
    public static void main(String[] args) {
        String Grade = "H";

        switch(Grade) {

            case "A":
              System.out.println("Excellent");
            break;

            case "B":
                System.out.println("Very Good");
                break;

            case "C":
                System.out.println("Good");
                break;

            case "D":
                System.out.println("Needs Improvement");
                break;

            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");

        }
    }
}
