package workoutsanbox.manager;

import java.util.ArrayList;
import java.util.Random;

import workoutsanbox.manager.Workout.Exercise;
import workoutsandbox.io.ExerciseReader;
import workoutsandbox.user.Profile;
import workoutsandbox.user.User;

public class Manager {

    private ArrayList<ArrayList<Integer>> strengthScheme;
    private ArrayList<Profile>            profileList;
    private ArrayList<Workout>            workoutList;
    private ArrayList<Exercise>           abdominalList;
    private ArrayList<Exercise>           backList;
    private ArrayList<Exercise>           bicepsList;
    private ArrayList<Exercise>           calvesList;
    private ArrayList<Exercise>           chestList;
    private ArrayList<Exercise>           legList;
    private ArrayList<Exercise>           shoulderList;
    private ArrayList<Exercise>           tricepList;
    private Plan                          currentPlan;

    public Manager () {
        startApplication();
    }

    public void startApplication () {
        profileList = new ArrayList<Profile>();
        workoutList = new ArrayList<Workout>();
        abdominalList = new ArrayList<Exercise>();
        backList = new ArrayList<Exercise>();
        bicepsList = new ArrayList<Exercise>();
        calvesList = new ArrayList<Exercise>();
        chestList = new ArrayList<Exercise>();
        legList = new ArrayList<Exercise>();
        shoulderList = new ArrayList<Exercise>();
        tricepList = new ArrayList<Exercise>();
        currentPlan = new Plan( "Default" );
        strengthScheme = new ArrayList<ArrayList<Integer>>();
        for ( int i = 0; i < 10; i++ ) {
            strengthScheme.add( new ArrayList<Integer>() );
        }
        populateLists();
        populateStrengthScheme();
    }

    public void populateLists () {
        final ExerciseReader reader = new ExerciseReader();
        final Exercise[] exercises = reader.readExercisesAsArray( "documents/exercise_bank.txt" );
        for ( int i = 0; i < exercises.length; i++ ) {
            addExerciseToList( exercises[i], exercises[i].getMuscle() );
        }
    }

    public boolean addProfile ( final double height, final double weight, final int age, final int exerciseTime,
            final int experience, final int equipment, final int goals, final String firstName, final String lastName,
            final String email, final String username, final String password ) {

        final User user = new User( height, weight, age, exerciseTime, experience, equipment, goals );
        final Profile profile = new Profile( firstName, lastName, email, username, password, user );
        for ( final Profile p : profileList ) {
            if ( p.equals( profile ) ) {
                return false;
            }
        }
        profileList.add( profile );
        return true;
    }

    public boolean addProfile ( final String firstName, final String lastName, final String email,
            final String username, final String password, final User user ) {
        final Profile profile = new Profile( firstName, lastName, email, username, password, user );
        for ( final Profile p : profileList ) {
            if ( p.equals( profile ) ) {
                return false;
            }
        }
        profileList.add( profile );
        return true;
    }

    public boolean addProfile ( final Profile profile ) {

        for ( final Profile p : profileList ) {
            if ( p.equals( profile ) ) {
                return false;
            }
        }
        profileList.add( profile );
        return true;
    }

    public boolean removeProfile ( final String firstName, final String lastName, final String email,
            final String username, final String password, final User user ) {

        final Profile profile = new Profile( firstName, lastName, email, username, password, user );
        for ( final Profile p : profileList ) {
            if ( p.equals( profile ) ) {
                return profileList.remove( profile );
            }
        }
        return false;
    }

    public boolean removeProfile ( final Profile profile ) {
        for ( final Profile p : profileList ) {
            if ( p.equals( profile ) ) {
                return profileList.remove( profile );
            }
        }
        return false;
    }

    public boolean addExerciseToList ( final Exercise e, final String name ) {
        if ( name.contains( "Abdominal" ) ) {
            return abdominalList.add( e );
        }
        else if ( name.contains( "Back" ) ) {
            return backList.add( e );
        }
        else if ( name.contains( "Biceps" ) ) {
            return bicepsList.add( e );
        }
        else if ( name.contains( "Calves" ) ) {
            return calvesList.add( e );
        }
        else if ( name.contains( "Chest" ) ) {
            return chestList.add( e );
        }
        else if ( name.contains( "Legs" ) ) {
            return legList.add( e );
        }
        else if ( name.contains( "Shoulders" ) ) {
            return shoulderList.add( e );
        }
        else if ( name.contains( "Triceps" ) ) {
            return tricepList.add( e );
        }
        else {
            System.out.println( "Name:" + name + "\n" );
            throw new IllegalArgumentException( "Invalid muscle group." );
        }
    }

    public boolean addWorkout ( final Workout workout ) {

        for ( final Workout w : workoutList ) {
            if ( w.equals( workout ) ) {
                return false;
            }
        }
        workoutList.add( workout );
        return true;
    }

    public boolean addWorkout ( final Exercise exercise, final int warmupSets, final int workingSets, final int reps,
            final int RPE, final double maxPercentage, final String notes ) {

        final Workout workout = new Workout( exercise, warmupSets, workingSets, reps, RPE, maxPercentage, notes );
        for ( final Workout w : workoutList ) {
            if ( w.equals( workout ) ) {
                return false;
            }
        }
        workoutList.add( workout );
        return true;
    }

    public boolean removeWorkout ( final Workout workout ) {

        for ( final Workout w : workoutList ) {
            if ( w.equals( workout ) ) {
                return workoutList.remove( workout );
            }
        }
        return false;
    }

    public boolean removeWorkout ( final Exercise exercise, final int warmupSets, final int workingSets, final int reps,
            final int RPE, final double maxPercentage, final String notes ) {

        final Workout workout = new Workout( exercise, warmupSets, workingSets, reps, RPE, maxPercentage, notes );
        for ( final Workout w : workoutList ) {
            if ( w.equals( workout ) ) {
                return workoutList.remove( workout );
            }
        }
        return false;
    }

    public ArrayList<Exercise> getExerciseList ( final String muscleGroup ) {
        if ( muscleGroup.equalsIgnoreCase( "Abdominal" ) ) {
            return abdominalList;
        }
        else if ( muscleGroup.equalsIgnoreCase( "Back" ) ) {
            return backList;
        }
        else if ( muscleGroup.equalsIgnoreCase( "Biceps" ) ) {
            return bicepsList;
        }
        else if ( muscleGroup.equalsIgnoreCase( "Calves" ) ) {
            return calvesList;
        }
        else if ( muscleGroup.equalsIgnoreCase( "Chest" ) ) {
            return chestList;
        }
        else if ( muscleGroup.equalsIgnoreCase( "Legs" ) ) {
            return legList;
        }
        else if ( muscleGroup.equalsIgnoreCase( "Shoulders" ) ) {
            return shoulderList;
        }
        else if ( muscleGroup.equalsIgnoreCase( "Triceps" ) ) {
            return tricepList;
        }
        else {
            throw new IllegalArgumentException( "Invalid muscle group." );
        }
    }

    public Plan getPlan () {
        return currentPlan;
    }

    public void genereatePlanExercises ( final String planType ) {
        final int weeks = 8;
        final ArrayList<ArrayList<Routine>> workouts = new ArrayList<ArrayList<Routine>>( weeks );
        if ( planType.equalsIgnoreCase( "Strength" ) ) {
            currentPlan.setPlanName( "Strength Plan" );
            for ( int i = 0; i < weeks; i++ ) {
                workouts.add( new ArrayList<Routine>() );
                workouts.get( i ).add( makePush() );
                workouts.get( i ).add( makePull() );
                workouts.get( i ).add( makeLegs() );
                workouts.get( i ).add( makePush() );
                workouts.get( i ).add( makePull() );
                workouts.get( i ).add( makeLegs() );
            }
            currentPlan.setWorkouts( workouts );
        }
        else if ( planType.equalsIgnoreCase( "Size" ) ) {
            currentPlan.setPlanName( "Size Plan" );

            currentPlan.setWorkouts( workouts );
        }
        else if ( planType.equals( "Weightloss" ) ) {
            currentPlan.setPlanName( "Weight loss Plan" );

            currentPlan.setWorkouts( workouts );
        }
        else {
            throw new IllegalArgumentException( "Invalid plan type." );
        }
    }

    public ArrayList<Exercise> getExercises ( final String muscleGroup, final int amount ) {
        final ArrayList<Exercise> returnList = new ArrayList<Exercise>();
        final Random rand = new Random();
        if ( muscleGroup.equalsIgnoreCase( "Abdominal" ) ) {
            for ( int i = 0; i < amount; i++ ) {
                boolean flag = true;
                int ind = rand.nextInt( abdominalList.size() );
                while ( flag ) {
                    flag = false;
                    for ( final Exercise e : returnList ) {
                        if ( abdominalList.get( ind ).equals( e ) ) {
                            flag = true;
                        }
                    }
                    if ( flag ) {
                        ind = rand.nextInt( abdominalList.size() );
                    }
                }
                returnList.add( abdominalList.get( ind ) );
            }
            return returnList;
        }
        else if ( muscleGroup.equalsIgnoreCase( "Back" ) ) {
            for ( int i = 0; i < amount; i++ ) {
                boolean flag = true;
                int ind = rand.nextInt( backList.size() );
                while ( flag ) {
                    flag = false;
                    for ( final Exercise e : returnList ) {
                        if ( backList.get( ind ).equals( e ) ) {
                            flag = true;
                        }
                    }
                    if ( flag ) {
                        ind = rand.nextInt( backList.size() );
                    }
                }
                returnList.add( backList.get( ind ) );
            }
            return returnList;
        }
        else if ( muscleGroup.equalsIgnoreCase( "Biceps" ) ) {
            for ( int i = 0; i < amount; i++ ) {
                boolean flag = true;
                int ind = rand.nextInt( bicepsList.size() );
                while ( flag ) {
                    flag = false;
                    for ( final Exercise e : returnList ) {
                        if ( bicepsList.get( ind ).equals( e ) ) {
                            flag = true;
                        }
                    }
                    if ( flag ) {
                        ind = rand.nextInt( bicepsList.size() );
                    }
                }
                returnList.add( bicepsList.get( ind ) );
            }
            return returnList;
        }
        else if ( muscleGroup.equalsIgnoreCase( "Calves" ) ) {
            for ( int i = 0; i < amount; i++ ) {
                boolean flag = true;
                int ind = rand.nextInt( calvesList.size() );
                while ( flag ) {
                    flag = false;
                    for ( final Exercise e : returnList ) {
                        if ( calvesList.get( ind ).equals( e ) ) {
                            flag = true;
                        }
                    }
                    if ( flag ) {
                        ind = rand.nextInt( calvesList.size() );
                    }
                }
                returnList.add( calvesList.get( ind ) );
            }
            return returnList;
        }
        else if ( muscleGroup.equalsIgnoreCase( "Chest" ) ) {
            for ( int i = 0; i < amount; i++ ) {
                boolean flag = true;
                int ind = rand.nextInt( chestList.size() );
                while ( flag ) {
                    flag = false;
                    for ( final Exercise e : returnList ) {
                        if ( chestList.get( ind ).equals( e ) ) {
                            flag = true;
                        }
                    }
                    if ( flag ) {
                        ind = rand.nextInt( chestList.size() );
                    }
                }
                returnList.add( chestList.get( ind ) );
            }
            return returnList;
        }
        else if ( muscleGroup.equalsIgnoreCase( "Legs" ) ) {
            for ( int i = 0; i < amount; i++ ) {
                boolean flag = true;
                int ind = rand.nextInt( legList.size() );
                while ( flag ) {
                    flag = false;
                    for ( final Exercise e : returnList ) {
                        if ( legList.get( ind ).equals( e ) ) {
                            flag = true;
                        }
                    }
                    if ( flag ) {
                        ind = rand.nextInt( legList.size() );
                    }
                }
                returnList.add( legList.get( ind ) );
            }
            return returnList;
        }
        else if ( muscleGroup.equalsIgnoreCase( "Shoulders" ) ) {
            for ( int i = 0; i < amount; i++ ) {
                boolean flag = true;
                int ind = rand.nextInt( shoulderList.size() );
                while ( flag ) {
                    flag = false;
                    for ( final Exercise e : returnList ) {
                        if ( shoulderList.get( ind ).equals( e ) ) {
                            flag = true;
                        }
                    }
                    if ( flag ) {
                        ind = rand.nextInt( shoulderList.size() );
                    }
                }
                returnList.add( shoulderList.get( ind ) );
            }
            return returnList;
        }
        else if ( muscleGroup.equalsIgnoreCase( "Triceps" ) ) {
            for ( int i = 0; i < amount; i++ ) {
                boolean flag = true;
                int ind = rand.nextInt( tricepList.size() );
                while ( flag ) {
                    flag = false;
                    for ( final Exercise e : returnList ) {
                        if ( tricepList.get( ind ).equals( e ) ) {
                            flag = true;
                        }
                    }
                    if ( flag ) {
                        ind = rand.nextInt( tricepList.size() );
                    }
                }
                returnList.add( tricepList.get( ind ) );
            }
            return returnList;
        }
        else {
            throw new IllegalArgumentException( "Invalid muscle group." );
        }
    }

    public ArrayList<Workout> getWorkouts ( final ArrayList<Exercise> exercises, final String planeType ) {
        final ArrayList<Workout> workouts = new ArrayList<Workout>();
        for ( final Exercise e : exercises ) {
            final ArrayList<Integer> scheme = getScheme();
            workouts.add( new Workout( e, scheme.get( 0 ), scheme.get( 1 ), scheme.get( 2 ), scheme.get( 3 ),
                    scheme.get( 4 ), "No notes" ) );
        }
        return workouts;
    }

    public void populateStrengthScheme () {
        // 3.4x4@7@75
        strengthScheme.get( 0 ).add( 3 );
        strengthScheme.get( 0 ).add( 4 );
        strengthScheme.get( 0 ).add( 4 );
        strengthScheme.get( 0 ).add( 7 );
        strengthScheme.get( 0 ).add( 75 );
        // 4.3x6@8@80
        strengthScheme.get( 1 ).add( 4 );
        strengthScheme.get( 1 ).add( 3 );
        strengthScheme.get( 1 ).add( 6 );
        strengthScheme.get( 1 ).add( 8 );
        strengthScheme.get( 1 ).add( 80 );
        // 3.3x8@7@75
        strengthScheme.get( 2 ).add( 3 );
        strengthScheme.get( 2 ).add( 3 );
        strengthScheme.get( 2 ).add( 8 );
        strengthScheme.get( 2 ).add( 7 );
        strengthScheme.get( 2 ).add( 75 );
        // 4.5x5@8@70
        strengthScheme.get( 3 ).add( 4 );
        strengthScheme.get( 3 ).add( 5 );
        strengthScheme.get( 3 ).add( 5 );
        strengthScheme.get( 3 ).add( 8 );
        strengthScheme.get( 3 ).add( 70 );
        // 4.2x3@9@90
        strengthScheme.get( 4 ).add( 4 );
        strengthScheme.get( 4 ).add( 2 );
        strengthScheme.get( 4 ).add( 3 );
        strengthScheme.get( 4 ).add( 9 );
        strengthScheme.get( 4 ).add( 90 );
        // 4.1x3@9@95
        strengthScheme.get( 5 ).add( 4 );
        strengthScheme.get( 5 ).add( 1 );
        strengthScheme.get( 5 ).add( 3 );
        strengthScheme.get( 5 ).add( 9 );
        strengthScheme.get( 5 ).add( 95 );
        // 4.2x7@8@80
        strengthScheme.get( 6 ).add( 4 );
        strengthScheme.get( 6 ).add( 2 );
        strengthScheme.get( 6 ).add( 7 );
        strengthScheme.get( 6 ).add( 8 );
        strengthScheme.get( 6 ).add( 80 );
        // 4.3x3@9@85
        strengthScheme.get( 7 ).add( 4 );
        strengthScheme.get( 7 ).add( 3 );
        strengthScheme.get( 7 ).add( 3 );
        strengthScheme.get( 7 ).add( 9 );
        strengthScheme.get( 7 ).add( 85 );
        // 4.3x7@8@75
        strengthScheme.get( 8 ).add( 4 );
        strengthScheme.get( 8 ).add( 3 );
        strengthScheme.get( 8 ).add( 7 );
        strengthScheme.get( 8 ).add( 8 );
        strengthScheme.get( 8 ).add( 75 );
        // 3.4x2@7@85
        strengthScheme.get( 9 ).add( 3 );
        strengthScheme.get( 9 ).add( 4 );
        strengthScheme.get( 9 ).add( 2 );
        strengthScheme.get( 9 ).add( 7 );
        strengthScheme.get( 9 ).add( 85 );
    }

    public ArrayList<Integer> getScheme () {
        final Random rand = new Random();
        final int ind = rand.nextInt( strengthScheme.size() );
        return strengthScheme.get( ind );
    }

    public Routine makePush () {
        final Routine routine = new Routine( new ArrayList<Workout>() );
        ArrayList<Workout> workouts = getWorkouts( getExercises( "Chest", 2 ), "Strength" );
        for ( final Workout w : workouts ) {
            routine.addWorkout( w );
        }
        workouts = getWorkouts( getExercises( "Triceps", 3 ), "Strength" );
        for ( final Workout w : workouts ) {
            routine.addWorkout( w );
        }
        workouts = getWorkouts( getExercises( "Shoulders", 2 ), "Strength" );
        for ( final Workout w : workouts ) {
            routine.addWorkout( w );
        }
        return routine;
    }

    public Routine makePull () {
        final Routine routine = new Routine( new ArrayList<Workout>() );
        ArrayList<Workout> workouts = getWorkouts( getExercises( "Back", 4 ), "Strength" );
        for ( final Workout w : workouts ) {
            routine.addWorkout( w );
        }
        workouts = getWorkouts( getExercises( "Biceps", 2 ), "Strength" );
        for ( final Workout w : workouts ) {
            routine.addWorkout( w );
        }
        workouts = getWorkouts( getExercises( "Abdominal", 1 ), "Strength" );
        for ( final Workout w : workouts ) {
            routine.addWorkout( w );
        }
        return routine;
    }

    public Routine makeLegs () {
        final Routine routine = new Routine( new ArrayList<Workout>() );
        ArrayList<Workout> workouts = getWorkouts( getExercises( "Legs", 4 ), "Strength" );
        for ( final Workout w : workouts ) {
            routine.addWorkout( w );
        }
        workouts = getWorkouts( getExercises( "Calves", 1 ), "Strength" );
        for ( final Workout w : workouts ) {
            routine.addWorkout( w );
        }
        return routine;
    }
}
