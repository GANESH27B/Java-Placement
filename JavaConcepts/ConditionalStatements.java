public class ConditionalStatements {
    public static void main(String[] args) {
        int marks = 78;
        String result;

        if (marks >= 90) {
            result = "Grade A";
        } else if (marks >= 60) {
            result = "Grade B";
        } else {
            result = "Needs improvement";
        }

        System.out.println(result);

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}