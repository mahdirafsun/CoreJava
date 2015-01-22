package Enum;


public class enum_Case {

    enumMonth month;
    public enum_Case(enumMonth month) {

        this.month = month;
    }
    public void whichMonthItIs(){

        switch (month){

            case January:
                System.out.println("This is January month");
                break;
            case February:
                System.out.println("This is February month");
                break;
            case March:
                System.out.println("This is March month");
                break;
            case April:
                System.out.println("This is April month");
                break;
            case May:
                System.out.println("This is May month");
                break;
            case  June:
                System.out.println("This is June month");
                break;
            case July:
                System.out.println("This is July month");
                break;
            case August:
                System.out.println("This is August month");
                break;
            case September:
                System.out.println("This is September month");
                break;
            case October:
                System.out.println("This is October month");
                break;
            case  November:
                System.out.println("This is November month");
                break;
            case December:
                System.out.println("This is December month");
                break;

           default:
                System.out.println("This is default");


        }

    }


}
