package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power >= 0) {
            System.out.println("1");
            int i = 1;
            while (i <= power) {
                int result = 1;
                int j = 1;
                while (j <= i) {
                    result *= 2;
                    j++;
                }
                System.out.println(result);
                i++;
            }

        } else {
            System.out.println("too much power");
        }

    }
}
