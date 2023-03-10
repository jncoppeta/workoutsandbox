package workoutsandbox.user;

import java.util.ArrayList;

import workoutsanbox.manager.Plan;
import workoutsanbox.manager.Routine;

public class User {
    
    /** Height in inches */
    private double height;
    
    /** Weight in pounds */
    private double weight;
    
    /** Age in years */
    private int age;
    
    /** Daily work-out time */
    private int exerciseTime;
    
    /** Current routine of work-outs to complete for the day */
    private Routine currentRoutine;
    
    /** List of book-marked routines */
    private ArrayList<Routine> savedRoutines;
    
    /** List of active daily work-outs in the plan */
    private Plan activePlan;
    
    /** List of book-marked plans */
    private ArrayList<Plan> savedPlans;
    
    /** Exercise experience level */
    private ExperienceLevel experience;
    
    /** Access to equipment */
    private EquipmentAccess equipment;
    
    /** Work-out goals */
    private ExerciseGoals goals;
    
    /** Levels of prior experience */
    private enum ExperienceLevel {BEGINNER, INTERMEDIATE, EXPERIENCED};
    
    /** Access to equipment based on work-out environment */
    private enum EquipmentAccess {HOME, CLUB, FACILITY};
    
    /** Personal exercise goals */
    private enum ExerciseGoals {STRENGTH, WEIGHTLOSS, SIZE};
    
    
    /**
     * Construct a User with the given information needed to generate an appropriate routine for
     * one day, as well as a Plan of routines.
     * 
     * @param height User height (inches)
     * @param weight User weight (pounds)
     * @param age User age (years)
     * @param exerciseTime (minutes)
     * @param experience User experience level as an integer
     * @param equipment User equipment access as an integer
     * @param goals User goals as an integer
     */
    public User(double height, double weight, int age, int exerciseTime, 
      int experience, int equipment, int goals) {
        setHeight(height);
        setWeight(weight);
        setAge(age);
        setExerciseTime(exerciseTime);
        setExperience(experience);
        setEquipment(equipment);
        setGoals(goals);
        setActivePlan(null);
        setSavedPlans(null);
        setCurrentRoutine(null);
    }

    /**
     * Access the User's current experience level.
     * 
     * @return the experience level of a user
     */
    public ExperienceLevel getExperience() {
        return experience;
    }

    /**
     * Set the User experience level.
     * 
     * @param experience the experience to set
     */
    public void setExperience(int experience) {
        switch (experience) {
            case 1:
                this.experience = ExperienceLevel.BEGINNER;
                break;
            case 2:
                this.experience = ExperienceLevel.INTERMEDIATE;
                break;
            case 3:
                this.experience = ExperienceLevel.EXPERIENCED;
                break;
            default:
                throw new IllegalArgumentException();
        }
        return;
    }

    /**
     * Access the user equipment availability.
     * 
     * @return the equipment availability
     */
    public EquipmentAccess getEquipment() {
        return equipment;
    }

    /**
     * Set the user equipment availability.
     * 
     * @param equipment the equipment to set
     */
    public void setEquipment(int equipment) {
        switch (equipment) {
            case 1:
                this.equipment = EquipmentAccess.HOME;
                break;
            case 2:
                this.equipment = EquipmentAccess.CLUB;
                break;
            case 3:
                this.equipment = EquipmentAccess.FACILITY;
                break;
            default:
                throw new IllegalArgumentException();
        }
        return;
    }

    /**
     * Access the Users exercise goals.
     * 
     * @return the goals
     */
    public ExerciseGoals getGoals() {
        return goals;
    }

    /**
     * Set the user goals.
     * 
     * @param goals the goals to set
     */
    public void setGoals(int goals) {
        switch (goals) {
            case 1:
                this.goals = ExerciseGoals.STRENGTH;
                break;
            case 2:
                this.goals = ExerciseGoals.WEIGHTLOSS;
                break;
            case 3:
                this.goals = ExerciseGoals.SIZE;
                break;
            default:
                throw new IllegalArgumentException();
        }
        return;
    }

    /**
     * Access User height
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Assigns a given height to the User.
     * @param height the height to set
     */
    private void setHeight(double height) {
        if (height < 48 || height > 90) {
            throw new IllegalArgumentException("Invalid height.");
        }
        this.height = height;
    }

    /**
     * Access User weight
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Assigns a given Weight to the User.
     * @param weight the weight to set
     */
    private void setWeight(double weight) {
        if (weight < 40 || weight > 1000) {
            throw new IllegalArgumentException("Error: You don't need a workout plan, you need a proper diet");
        }
        this.weight = weight;
    }

    /**
     * Access User age
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Assigns a given age to the User.
     * @param age the age to set
     */
    private void setAge(int age) {
        if (age < 7 || age > 100) {
            throw new IllegalArgumentException("Invalid age.");
        }
        this.age = age;
    }

    /**
     * Access daily exercise time
     * @return the exerciseTime
     */
    public int getExerciseTime() {
        return exerciseTime;
    }

    /**
     * Set daily exercise time
     * @param exerciseTime the exerciseTime to set
     */
    private void setExerciseTime(int exerciseTime) {
        if (exerciseTime < 5 || exerciseTime > 180) {
            throw new IllegalArgumentException("Invalid exercise time.");
        }
        this.exerciseTime = exerciseTime;
    }

    /**
     * Access active plan
     * @return the activePlans
     */
    public Plan getActivePlan() {
        return activePlan;
    }

    /**
     * Set the active plans for a user
     * @param activePlans the activePlans to set
     */
    public void setActivePlan(Plan activePlan) {
        this.activePlan = activePlan;
    }

    /**
     * Access list of book-marked plans.
     * @return the savedPlans
     */
    public ArrayList<Plan> getSavedPlans() {
        return savedPlans;
    }

    /**
     * Set list of saved plans.
     * @param savedPlans the savedPlans to set
     */
    public void setSavedPlans(ArrayList<Plan> savedPlans) {
        this.savedPlans = savedPlans;
    }

    /**
     * Access the current routine for the day
     * @return the currentRoutine
     */
    public Routine getCurrentRoutine() {
        return currentRoutine;
    }

    /**
     * Set the current routine for the day
     * @param currentRoutine the currentRoutine to set
     */
    public void setCurrentRoutine(Routine currentRoutine) {
        this.currentRoutine = currentRoutine;
    }

    /**
     * Access all saved routines;
     * @return the savedRoutines
     */
    public ArrayList<Routine> getSavedRoutines() {
        return savedRoutines;
    }

    /**
     * Set list of saved routines;
     * @param savedRoutines the savedRoutines to set
     */
    public void setSavedRoutines(ArrayList<Routine> savedRoutines) {
        this.savedRoutines = savedRoutines;
    }


}
