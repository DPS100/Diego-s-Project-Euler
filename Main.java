import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

/**
 * This class will run the individual classes for each problem and print the
 * solution
 */
public class Main {

    public static int maxProblem = 697;
    public static File file = new File("Problems.txt");
    public static Scanner scanner;
    public static FileWriter writer;
    public static String[] fileAsArray = new String[maxProblem];
    public static Problem[] problems = new Problem[maxProblem];

    public static void main(String[] args) {

        buildScanner();
        buildWriter();
        addCompleteProblems();
        setupFile();
        fillTextArray();

    }

    public static void fillTextArray() {
        for(int x = 0; x < maxProblem; x++) {
            fileAsArray[x] = scanner.nextLine();
        }
    }

    public static void buildScanner() {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found for scanner");
        }
    }

    public static void buildWriter() {
        try {
            writer = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found for writer");
        }
    }

    public static void setupFile() {
        try {
            for(int x = 1; x <= 697; x++) {
                if(problems[x - 1] == null || !problems[x - 1].isProblemSolved()) {//if problem does not exist in array or is not solved,
                    writer.write("Problem " + x  + ": no solution\n");//write problem is not solved
                } else if (problems[x - 1].isProblemSolved() && fileAsArray[x - 1] != ("Problem " + x + ": no solution")) {//problem is solved but has no displayed solution
                    writer.write("Problem " + x + ": " + problems[x - 1].returnSolution() + "\n");//write in problem's solution
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to write to file");
        }
    }

    public static void addCompleteProblems() {
        problems[0] = new Problem1();
    }
}