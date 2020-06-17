/**
 * Largest prime factor
 * Problem 3
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 extends Problem{
    
    public Problem3() {
        super(3);
        this.setSolve(false);
    }

    public int[] returnPrimesUnder(int num) {
        int total = 0;
        int[] allNums = new int[num / 2];
        allNums = fillArrayFrom(allNums, 0);
        boolean[] isPrime = new boolean[num / 2];
        isPrime = setAllBoolean(isPrime, true);
        int i = 0;
        while(i < total) {
            allNums[i] = i;
            if(i < 2) {isPrime[i] = false;}
            else if (isPrime[i]) {
                int holder = i;
                for(int x = 2; )
            }
            i++;
        }
    }

    public int[] fillArrayFrom(int[] arr, int start) {
        int len = arr.length;
        int[] newArr = new int[len];
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = i + start;
        }
        return newArr;
    }

    public boolean[] setAllBoolean(boolean[] arr, boolean bool) {
        int len = arr.length;
        boolean[] newArr = new boolean[len];
        for(int i = 0; i < len; i++) {
            newArr[i] = bool;
        }
        return newArr;
    }

    public int returnSolution() {
        return 3;
    }
}