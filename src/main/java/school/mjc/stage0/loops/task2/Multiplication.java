package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int moduleOfNum = multiplyByAndToInclusive;
        if (multiplyByAndToInclusive < 0) {
            moduleOfNum = -multiplyByAndToInclusive;
        }
        int i = 0;
        while (i <= moduleOfNum) {
            if (multiplyByAndToInclusive == 0) System.out.print("");
            else System.out.println(i * multiplyByAndToInclusive);
            i++;
        }
    }
}
