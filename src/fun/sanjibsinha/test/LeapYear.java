package fun.sanjibsinha.test;

public class LeapYear {

    public static void main(String[] args) {
        int year = 2004;
        int numDays = 0;
        if ((year % 400 == 0))
            numDays = 29;
        else
            numDays = 28;
        System.out.println("Number of days :" + numDays);
        System.out.println(year/400);
    }
}
