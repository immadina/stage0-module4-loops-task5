package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int h = 1; h <= height; h++) {
            for (int l = 1; l <= length; l++) {
                if (h == 1 || l == 1 || h == height || l == length) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
