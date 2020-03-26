/**
 * This is an example class to be used as a shell to make a numbered problem class
 * Press <Crtl> + <F>, toggle replace mode, and replace 2 with the current problem number <Ctrl> + <Alt> + <Enter>
 * After setup, put problem description here
 */
public class Problem2 extends Problem{
    
    public Problem2() {
        super(2);
        this.setSolve(false);
    }

    public int returnSolution() {
        return 2;
    }
}