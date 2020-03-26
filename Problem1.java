/**
 * Multiples of 3 and 5
 * Problem 1
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 extends Problem{
    
    private int max = 1000;

    public Problem1() {
        super(1);
        this.setSolve(true);
    }

    private int multiplesOfBothCombined() {
        int total = 0;
        for(int i = 2; i < max; i ++) {
            if(i % 3 == 0 || i % 5 == 0) {
                total += i;
            }
        }
        return total;
    }

    public int returnSolution() {
        return multiplesOfBothCombined();
    }
}