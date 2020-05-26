public class SwitchExample {

    public static void main(String[] args){
        int month=7;
        String monthName;

        switch (month){
                case 1:
                monthName="January";
                break;

            case 2:
                monthName="February";
                break;

            case 3:
                monthName="March";
                break;

            case 4:
                monthName="April";
                break;

            case 5:
                monthName="May";
                break;

            case 6:
                monthName="June";
                break;

            default:
                monthName="Invalid month";
                break;
        }
        System.out.println("The month is : "+monthName);
    }
}
