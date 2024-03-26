package primitive;

public class Array {

    public static void main(String[] args) {
        String[] namesOfMonths = new String[12];
        namesOfMonths[0] = "January";
        namesOfMonths[1] = "February";
        namesOfMonths[2] = "March";
        namesOfMonths[3] = "April";
        namesOfMonths[4] = "May";
        namesOfMonths[5] = "June";
        namesOfMonths[6] = "July";
        namesOfMonths[7] = "August";
        namesOfMonths[8] = "September";
        namesOfMonths[9] = "October";
        namesOfMonths[10] = "November";
        namesOfMonths[11] = "December";
//
//        for (String s : namesOfMonths) {
//            System.out.print(s);
//            System.out.print("; ");
//        }
//        System.out.println();
//
        for (int i = 0; i < namesOfMonths.length; i++) {
            if (i < namesOfMonths.length - 1) {
                System.out.println(i + 1 + " - " + namesOfMonths[i] + ";");
            } else {
                System.out.println(i + 1 + " - " + namesOfMonths[i] + ".");
            }
        }

        int[] numbers = {4, 1, 34, 45, 13};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
