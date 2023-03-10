package workoutsanbox.manager;

import java.util.ArrayList;

/**
 * This class provides all functionality for the Routine object;
 *
 * @author Joseph Coppeta (jncoppeta@gmail.com)
 */
public class Routine {
    /** The date on which the routine is to be performed. */
    private String             date;
    /** The workouts specific to the routine. */
    private ArrayList<Workout> workouts;

    /**
     * Default constructor for creating a new routine
     *
     * @param workouts
     *            The list of workouts for the day
     */
    public Routine ( final ArrayList<Workout> workouts ) {
        setDate( "" );
        setWorkouts( workouts );
    }

    /**
     * Returns the date for the routine
     *
     * @return
     */
    public String getDate () {
        return date;
    }

    public boolean addWorkout ( final Workout w ) {
        return workouts.add( w );
    }

    public boolean removeWorkout ( final Workout w ) {
        return workouts.remove( w );
    }

    /**
     * Sets the date for the routine
     *
     * @param date
     *            The new date
     */
    public void setDate ( final String date ) {
        this.date = date;
    }

    /**
     * Returns the list of workouts for the routine
     *
     * @return workouts The list of workouts
     */
    public ArrayList<Workout> getWorkouts () {
        return workouts;
    }

    public Workout getWorkout ( final int ind ) {
        return workouts.get( ind );
    }

    /**
     * Sets the list of workouts for the routine
     *
     * @param workouts
     *            The list of workouts
     */
    public void setWorkouts ( final ArrayList<Workout> workouts ) {
        this.workouts = workouts;
    }

}
