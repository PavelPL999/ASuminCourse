package primitive;

public class SwitchCase {

    public static void main(String[] args) {
//        int numberOfMonth = 4;
//        switch (numberOfMonth) {
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            default:
//                System.out.println("Another month");
//        }
        String month = "May";
        switch (month) {
            case "January", "February", "December":
                System.out.println("winter");
                break;
            case "March", "April", "May":
                System.out.println("spring");
                break;
            default:
                System.out.println("summer or autumn");
        }
    }
}
