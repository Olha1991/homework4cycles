public class Main {
    public static void main(String[] args) {

        // Task 1

        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i);
            i++;
        }
        System.out.println();
        for (int n = 10; n >= 1; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Task 2

        for (int i1 = 3; i1 <= 31; i1 = i1 + 7) {
            System.out.println("Today is Friday the " + i1 + "th." + "Need to prepare a report");
        }

        // Task 3

        int cometFliesEvery = 79;
        int currentYear = 2022;
        int upToTheCurrentYear = currentYear - 200;
        int afterCurrentYear = currentYear + 100;
        for (int i2 = 0; i2 <= afterCurrentYear; i2 = i2 + cometFliesEvery) {
            if (upToTheCurrentYear < i2) {
                System.out.println(" " + i2);
            }
        }






    }
}