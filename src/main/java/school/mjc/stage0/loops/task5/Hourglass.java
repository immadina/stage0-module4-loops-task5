package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int mid = height / 2 + 1;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (i == 1 || i == height) {
                    System.out.print(8);
                } else if (i > 1 && i < height && j != 1 && j != height) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


