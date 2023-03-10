package workoutsanbox.manager;

import java.util.ArrayList;

/**
 * Class for a workout which provides all functionality for creating a plan.
 *
 * @author Joseph Coppeta (jncoppeta@gmail.com)
 */
public class Workout {

    /** The exercise to be performed. */
    private Exercise          exercise;
    /** The muscles involved in the exercise. */
    private ArrayList<String> muscles;
    /** Number of warm-up sets. */
    private int               warmupSets;
    /** Number of working sets. */
    private int               workingSets;
    /** Number of repetitions. */
    private int               reps;
    /** The rate of perceived exhaustion. */
    private int               RPE;
    /** The percentage of the 1RM for the exercise. */
    private double            maxPercentage;
    /** Notes about the way the workout should be performed. */
    private String            notes;

    /**
     * Default constructor for creating a new Workout with the given parameters
     *
     * @param warmupSets
     *            Number of warm-up sets
     * @param workingSets
     *            Number of working sets
     * @param reps
     *            Number of repetitions
     * @param RPE
     *            Rate of perceived exhaustion
     * @param maxPercentage
     *            Percentage of 1RM
     * @param notes
     *            Specific details about the workout
     */
    public Workout ( final Exercise exercise, final int warmupSets, final int workingSets, final int reps,
            final int RPE, final double maxPercentage, final String notes ) {
        setExercise( exercise );
        setMuscles( null );
        addMuscles( exercise.getMuscle() );
        setWarmupSets( warmupSets );
        setWorkingSets( workingSets );
        setReps( reps );
        setRPE( RPE );
        setMaxPercentage( maxPercentage );
        setNotes( notes );
    }

    public void addMuscles ( final String muscle ) {
        muscles.add( muscle );
    }

    /**
     * Returns the exercise for the workout
     *
     * @return exercise The exercise
     */
    public Exercise getExercise () {
        return exercise;
    }

    /**
     * Sets the exercise for the workout
     *
     * @param exercise
     *            The new exercise
     */
    public void setExercise ( final Exercise exercise ) {
        this.exercise = exercise;
    }

    /**
     * Returns the list of muscles
     *
     * @return muscles The list of muscles
     */
    public ArrayList<String> getMuscles () {
        return muscles;
    }

    /**
     * Sets the list of muscles
     *
     * @param muscles
     *            The new list of muscles
     */
    public void setMuscles ( final ArrayList<String> muscles ) {
        if ( muscles == null ) {
            this.muscles = new ArrayList<String>();
            return;
        }
        this.muscles = muscles;
    }

    /**
     * Returns the number of warm-up sets
     *
     * @return warmupSets The number of warm-up sets
     */
    public int getWarmupSets () {
        return warmupSets;
    }

    /**
     * Sets the number of warm-up sets
     *
     * @param warmupSets
     *            The new number of warm-up sets
     */
    public void setWarmupSets ( final int warmupSets ) {
        this.warmupSets = warmupSets;
    }

    /**
     * Returns the number of working sets
     *
     * @return workingSets The number of working sets
     */
    public int getWorkingSets () {
        return workingSets;
    }

    /**
     * Sets the number of working sets
     *
     * @param workingSets
     *            The new number of working sets
     */
    public void setWorkingSets ( final int workingSets ) {
        this.workingSets = workingSets;
    }

    /**
     * Returns the number of repetitions
     *
     * @return reps The number of repetitions
     */
    public int getReps () {
        return reps;
    }

    /**
     * Sets the number of repetitions
     *
     * @param reps
     *            The new number of reps
     */
    public void setReps ( final int reps ) {
        this.reps = reps;
    }

    /**
     * Returns the RPE
     *
     * @return RPE The RPE
     */
    public int getRPE () {
        return RPE;
    }

    /**
     * Sets the RPE
     *
     * @param rPE
     *            The new RPE
     */
    public void setRPE ( final int rPE ) {
        RPE = rPE;
    }

    /**
     * Returns the percentage of 1RM for weight
     *
     * @return maxPercentage The percentage of 1RM
     */
    public double getMaxPercentage () {
        return maxPercentage;
    }

    /**
     * Sets the 1RM percentage
     *
     * @param maxPercentage
     *            The 1RM percentage
     */
    public void setMaxPercentage ( final double maxPercentage ) {
        this.maxPercentage = maxPercentage;
    }

    /**
     * Returns the specific notes
     *
     * @return notes The notes
     */
    public String getNotes () {
        return notes;
    }

    /**
     * Sets the notes
     *
     * @param notes
     *            The new notes
     */
    public void setNotes ( final String notes ) {
        this.notes = notes;
    }

    /**
     * Public inner-class to represent an exercise entry in the workout
     *
     * @author Joseph Coppeta (jncoppeta@gmail.com)
     */
    public static class Exercise {

        /** The name of the exercise */
        private String name;
        /** The list of muscles involved */
        private String muscle;

        /**
         * Default constructor for creating a new exercise
         *
         * @param name
         *            The name of exercise
         * @param muscles
         *            The muscles involved in the exercise
         */
        public Exercise ( final String name, final String muscle ) {
            setName( name );
            setMuscle( muscle );
        }

        /**
         * Returns the name of the exercise
         *
         * @return name The name of the exercise
         */
        public String getName () {
            return name;
        }

        /**
         * Sets the name of the exercise
         *
         * @param name
         *            The name of the exercise
         */
        public void setName ( final String name ) {
            this.name = name;
        }

        /**
         * Returns the list of the muscles
         *
         * @return muscles The list of muscles
         */
        public String getMuscle () {
            return muscle;
        }

        /**
         * Sets the list of muscles
         *
         * @param muscles
         *            The new list of muscles
         */
        public void setMuscle ( final String muscles ) {
            this.muscle = muscles;
        }

        @Override
        public String toString () {
            return name + "," + muscle;
        }
    }

    @Override
    public String toString () {
        String workoutString = "";
        workoutString = exercise.getName() + " - " + warmupSets + " - " + workingSets + " - " + reps + " - " + RPE
                + " - " + maxPercentage + " - " + notes;
        return workoutString;
    }
}
