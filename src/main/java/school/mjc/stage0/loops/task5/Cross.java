package school.mjc.stage0.loops.task5;
public class Cross {

    public void printCross(int size) {

        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= size; j++) {

                if (i == (size + 1) / 2 || j == (size + 1) / 2) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
