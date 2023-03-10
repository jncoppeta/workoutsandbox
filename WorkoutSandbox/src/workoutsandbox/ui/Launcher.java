/**
 *
 */
package workoutsandbox.ui;

import java.util.ArrayList;
import java.util.Scanner;

import workoutsanbox.manager.Manager;
import workoutsanbox.manager.Plan;
import workoutsanbox.manager.Routine;
import workoutsanbox.manager.Workout;
import workoutsanbox.manager.Workout.Exercise;
import workoutsandbox.io.ExerciseReader;
import workoutsandbox.user.Profile;
import workoutsandbox.user.User;

/**
 * @author Axel Soto
 *
 */
public class Launcher {

    public static void print ( final String message ) {
        System.out.print( message );
    }

    public static void printf ( final String message ) {
        System.out.println( message );
    }

    private final static String fileName = "documents/exercise_bank.txt";

    public static void main ( final String[] args ) {
        final ExerciseReader er = new ExerciseReader();
        final Exercise[] exercises = er.readExercisesAsArray( fileName );
        final Manager manager = new Manager();

        for ( int i = 0; i < exercises.length; i++ ) {
            manager.addExerciseToList( exercises[i], exercises[i].getMuscle() );
            // printf( exercises[i].toString() );
        }
        printf( "Abdominal Size: " + manager.getExerciseList( "Abdominal" ).size() );
        printf( "Back Size:      " + manager.getExerciseList( "Back" ).size() );
        printf( "Biceps Size:    " + manager.getExerciseList( "Biceps" ).size() );
        printf( "Calves Size:    " + manager.getExerciseList( "Calves" ).size() );
        printf( "Chest Size:     " + manager.getExerciseList( "Chest" ).size() );
        printf( "Legs Size:      " + manager.getExerciseList( "Legs" ).size() );
        printf( "Shoulders Size: " + manager.getExerciseList( "Shoulders" ).size() );
        printf( "Triceps Size:   " + manager.getExerciseList( "Triceps" ).size() );
    }

    private void terminalUI () {
        final Scanner sc = new Scanner( System.in );

        print( "Enter Age: " );
        final int age = sc.nextInt();

        print( "Enter Height: " );
        final double height = sc.nextDouble();

        print( "Enter Weight: " );
        final double weight = sc.nextDouble();

        print( "Enter Routine-Time: " );
        final int rTime = sc.nextInt();

        print( "What is your Experinece?\nBeginner (1) | Intermediate (2) | Experienced (3)\n> " );
        final int experience = sc.nextInt();

        print( "What is your level of access to equipment?\nHome (1) | Clubhouse (2) | Facility (3)\n> " );
        final int equipment = sc.nextInt();

        print( "What are your goals?\nStrength (1) | Weight-Loss (2) | Size (3)\n> " );
        final int goals = sc.nextInt();

        final User user1 = new User( height, weight, age, rTime, experience, equipment, goals );

        final ArrayList<String> benchMuscles = new ArrayList<String>();
        benchMuscles.add( "Pectoralis Major" );
        benchMuscles.add( "Triceps" );
        final Exercise bench = new Exercise( "Bench", "Chest" );
        final Workout w1 = new Workout( bench, 1, 3, 6, 8, 0.8, "2-1-1 Tempo." );

        final ArrayList<String> squatMuscles = new ArrayList<String>();
        squatMuscles.add( "Quadriceps" );
        squatMuscles.add( "Glutes" );
        final Exercise squat = new Exercise( "Squat", "Legs" );
        final Workout w2 = new Workout( squat, 1, 2, 7, 7, 0.8, "Pause at bottom." );

        final ArrayList<String> deadliftMuscles = new ArrayList<String>();
        deadliftMuscles.add( "Quadriceps" );
        deadliftMuscles.add( "Hamstrings" );
        final Exercise deadlift = new Exercise( "Deadlift", "Back" );
        final Workout w3 = new Workout( deadlift, 1, 4, 2, 8, 0.85, "3 Second pause." );

        final ArrayList<Workout> workouts = new ArrayList<Workout>();
        workouts.add( w1 );
        workouts.add( w2 );
        workouts.add( w3 );
        final Routine routine = new Routine( workouts );
        routine.setDate( "1/14/2023" );

        final ArrayList<ArrayList<Routine>> plan = new ArrayList<ArrayList<Routine>>();
        final Plan p = new Plan( "Test Plan", plan );

        printf( "This is an example routine from your specific plan:" );
        printf( "--------------------------------------------------------------------------------" );
        printf( "| Exercise | Warm-up Sets | Working Sets | Reps | RPE | 1RM Percentage | Notes |" );
        printf( "--------------------------------------------------------------------------------" );
        for ( int i = 0; i < workouts.size(); i++ ) {
            printf( workouts.get( i ).getExercise().getName() + " | " + workouts.get( i ).getWarmupSets() + " | "
                    + workouts.get( i ).getWorkingSets() + " | " + workouts.get( i ).getReps() + " | "
                    + workouts.get( i ).getRPE() + " | " + workouts.get( i ).getMaxPercentage() + " | "
                    + workouts.get( i ).getNotes() );
        }
        printf( "Do you want to continue with your registration? If yes, enter 'y', otherwise, enter anything to exit" );
        final String r = sc.next();
        if ( r.equalsIgnoreCase( "y" ) ) {
            print( "Enter your first name: " );
            final String fName = sc.next();
            print( "Enter your last name: " );
            final String lName = sc.next();
            print( "Enter your email: " );
            final String email = sc.next();
            print( "Enter your username: " );
            final String user = sc.next();
            print( "Enter your password: " );
            final String pass = sc.next();

            final Profile profile = new Profile( fName, lName, email, user, pass, user1 );
            printf( "" );
            printf( "Your profile information: " );
            printf( "First Name: " + profile.getFirstName() );
            printf( "Last Name:  " + profile.getLastName() );
            printf( "Email:      " + profile.getEmail() );
            printf( "Username:   " + profile.getUsername() );
            printf( "Password:   " + profile.getPassword() );
            printf( "Age:        " + profile.getUser().getAge() );
            printf( "Height:     " + profile.getUser().getHeight() );
            printf( "Weight:     " + profile.getUser().getWeight() );
            printf( "Experience: " + profile.getUser().getExperience() );
            printf( "Equipment:  " + profile.getUser().getEquipment() );
            printf( "Goals:      " + profile.getUser().getGoals() );
            printf( "Thank you for trying out WorkoutSandbox." );
        }
        else {
            printf( "Thank you for trying out WorkoutSandbox." );
        }
    }
}
