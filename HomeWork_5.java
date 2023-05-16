public class HomeWork_5 {
    enum Month {
        JANUARY(31),
        FEBRUARY(28),
        MARCH(31),
        APRIL(30),
        MAY(31),
        JUNE(30),
        JULY(31),
        AUGUST(31),
        SEPTEMBER(30),
        OCTOBER(31),
        NOVEMBER(30),
        DECEMBER(31);

        private int days;

        Month(int days) {
            this.days = days;
        }

        public int getDays() {
            return days;
        }
    }

    public static void main(String[] args) {
        printMonthDays(Month.FEBRUARY);
    }

    public static void printMonthDays(Month month) {
        System.out.println("Количество дней в " + month.name() + ": " + month.getDays());
    }
}
