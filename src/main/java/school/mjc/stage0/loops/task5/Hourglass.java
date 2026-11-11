package school.mjc.stage0.loops.task5;

public class Hourglass {

    public void printHourglassOfGivenSize(int size) {

        for (int i = 0; i < size; i++) {

            int spaces = Math.min(i, size - 1 - i);
            int eights = size - 2 * spaces;

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < eights; j++) {
                System.out.print("8");
            }

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
