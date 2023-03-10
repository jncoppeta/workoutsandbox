package workoutsandbox.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import workoutsanbox.manager.Workout.Exercise;

public class ExerciseReader {
    
    private static final int EXERCISE_QUANTIY = 270;

    
    public static Exercise[] readExercisesAsArray(String path) {
        
        Exercise[] list = new Exercise[EXERCISE_QUANTIY];
        try (Scanner scnr = new Scanner(new FileInputStream(path), "UTF8")) {
            scnr.nextLine();
            int idx = 0;
            while (scnr.hasNextLine()) {
                try {
                    list[idx] = proccessLine(scnr.nextLine());
                    idx++;
                }
                catch (IllegalArgumentException e) {
                    continue;
                }        
            }
            scnr.close();
        }
        catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Invalid path: " + path);
        }
        
        return list;
    }
    
    private static Exercise proccessLine(String line) {
        Scanner lineScan = new Scanner(line);
        lineScan.useDelimiter(",");
        
        try {
            String muscleGroup = lineScan.next();
            String exercise = lineScan.next();
//            String level = lineScan.next();
//            String bodySegment = lineScan.next();
//            String type = lineScan.next();
//            String modality = lineScan.next();
            return new Exercise(exercise, muscleGroup);
        }
        catch (InputMismatchException e) {
            return null;
        }
     }
}
