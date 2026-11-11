package school.mjc.stage0.loops.task5;

public class Rectangle {

    public void printRectangleFrom8s(int width, int height) {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                if (i == 0 || i == height - 1 ||
                        j == 0 || j == width - 1) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}