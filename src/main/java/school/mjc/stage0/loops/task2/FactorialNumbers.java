package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        while (i <= printToInclusive) {
            if (i == 0) System.out.println(1);
            else {
                int fac = 1;
                int j = 1;
                while (j <= i) {
                    fac *= j;
                    j++;
                }
                System.out.println(fac);
            }
            i++;
        }
    }
}
