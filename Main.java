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

        tryTestProblem();
        fillTextArray();
        addCompleteProblems();
        setupFile();

    }

    public static void fillTextArray() {
        buildScanner();
        for(int x = 0; x < maxProblem; x++) {
            fileAsArray[x] = scanner.nextLine();
        }
        scanner.close();
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
        buildWriter();
        try {
            for(int x = 1; x <= 697; x++) {
                if(problems[x - 1] == null || !problems[x - 1].isProblemSolved()) {//if problem does not exist in array or is not solved,
                    writer.write("Problem " + x  + ": no solution\n");//write problem is not solved
                } else if (fileAsArray[x - 1].equals("Problem " + x + ": no solution")) {//problem is solved but has no displayed solution
                    writer.write("Problem " + x + ": " + problems[x - 1].returnSolution() + "\n");//write in problem's solution
                } else {//file is already written 
                    writer.write(fileAsArray[x - 1] + "\n");//re-write solution
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to write to file");
        }
    }

    public static void addCompleteProblems() {
        problems[1 - 1] = new Problem1();
        problems[2 - 1] = new Problem2();
    }

    public static void tryTestProblem() {
        System.out.println(new Problem2().returnSolution());
    }
}