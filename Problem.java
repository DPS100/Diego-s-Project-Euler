public abstract class Problem {

    private Boolean isProblemSolved;
    private int problemNumber;

    public Problem(int problemNumber) {
        isProblemSolved = false;
        this.problemNumber = problemNumber;
    }

    public void setSolve(Boolean isSolved) {
        isProblemSolved = isSolved;
    }

    public Boolean isProblemSolved(){return isProblemSolved;}
    public int getProblemNumber(){return problemNumber;}
    public String toString() {
        String stringToReturn = "Euler Problem " + this.getProblemNumber() + "'s solution is: "; //syntax of string set up
        if(this.isProblemSolved()) {stringToReturn += this.returnSolution();} //if problem is solved, will add the solution to the string
        else {stringToReturn += "unsolved";} //if unsolved, solution will be unsolved
        return stringToReturn;
    }

    public abstract int returnSolution();
}