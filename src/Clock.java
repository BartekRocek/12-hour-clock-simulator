public class Clock {
    int hours = 12;
    int minutes = 56;

    void next() {
        minutes++;

        if (minutes == 60) {
            this.minutes = 0;
            hours++;
            if (hours == 13) {
                this.hours = 1;
            }
        }
        printHoursAndMinutes(this.hours, this.minutes);
    }

    private static void printHoursAndMinutes(int hours, int minutes) {
        String firstHourDigit;
        String firstMinuteDigit;

        if (hours < 10) {
            firstHourDigit = "0";
        } else firstHourDigit = "";
        if (minutes < 10) {
            firstMinuteDigit = "0";
        } else firstMinuteDigit = "";

        System.out.println(firstHourDigit + hours + ":" + firstMinuteDigit + minutes);
    }
}