package workoutsanbox.manager;

import java.util.ArrayList;

/**
 * This class provides all the functionality for the Plan object.
 *
 * @author Joseph Coppeta (jncoppeta@gmail.com)
 */
public class Plan {

    /** The name of the current plan. */
    private String                        planName;
    /** The 2D list of all workouts. */
    private ArrayList<ArrayList<Routine>> workouts;

    /**
     * Default constructor for creating a plan
     *
     * @param planName
     *            The name of the plan
     * @param workouts
     *            The workouts in the plan
     */
    public Plan ( final String planName, final ArrayList<ArrayList<Routine>> workouts ) {
        this.planName = planName;
        setWorkouts( workouts );
    }

    public Plan ( final String name ) {
        this.planName = name;
        workouts = new ArrayList<ArrayList<Routine>>();
    }

    /**
     * Returns the name of the plan
     *
     * @return planName The name of the plan
     */
    public String getPlanName () {
        return planName;
    }

    /**
     * Sets the name of the plan
     *
     * @param planName
     *            The name of the plan
     */
    public void setPlanName ( final String planName ) {
        this.planName = planName;
    }

    /**
     * Returns the list of workouts
     *
     * @return workouts The list of workouts
     */
    public ArrayList<ArrayList<Routine>> getWorkouts () {
        return workouts;
    }

    /**
     * Sets the list of workouts
     *
     * @param workouts
     *            The list of workouts
     */
    public void setWorkouts ( final ArrayList<ArrayList<Routine>> workouts ) {
        for ( int i = 0; i < workouts.size(); i++ ) {
            this.workouts.add( new ArrayList<Routine>() );
            for ( int k = 0; k < workouts.get( i ).size(); k++ ) {
                this.workouts.get( i ).add( new Routine( null ) );
                this.workouts.get( i ).set( k, workouts.get( i ).get( k ) );
            }
        }
    }

    /**
     * Returns the specific week of workouts. The first week is week 1.
     *
     * @param weekNumber
     *            The index plus 1 of the week to return
     * @return workouts.get(weekNumber - 1) The specific week
     */
    public ArrayList<Routine> getWeek ( final int weekNumber ) {
        return workouts.get( weekNumber - 1 );
    }

    /**
     * Returns the specific workout given a week and a day. The first week is
     * week 1 and the first day is day 1.
     *
     * @param weekNumber
     *            The index plus 1 of the week to return
     * @param dayNumber
     *            The index plus 1 of the day to return
     * @return workouts.get(weekNumber - 1).get(dayNumber - 1) The specific
     *         workout
     */
    public Routine getWorkout ( final int weekNumber, final int dayNumber ) {
        return workouts.get( weekNumber - 1 ).get( dayNumber - 1 );
    }

    /**
     * For terminal, replace "<br>" with "\n"
     */
    @Override
    public String toString () {
        String toReturn = "";
        for ( int i = 0; i < workouts.size(); i++ ) {
            for ( int k = 0; k < workouts.get( i ).size(); k++ ) {
                for ( int n = 0; n < workouts.get( i ).get( k ).getWorkouts().size(); n++ ) {
                    toReturn += "| " + workouts.get( i ).get( k ).getWorkout( n ).toString() + " |";
                    toReturn += "<br>";
                }
                toReturn += "<br>";
            }
            toReturn += "<br>";
            toReturn += "---------------------------------------------------------------------------------------";
            toReturn += "<br>";
        }
        return toReturn;
    }
}
