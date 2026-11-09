package school.mjc.stage0.loops.task2;
public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int n = multiplyByAndToInclusive;
        if (n == 0) {
            return;
        }
        int count = n < 0 ? -n : n;
        int i = 0;
        while (i <= count) {
            System.out.println(n * i);
            i++;
        }
    }
}