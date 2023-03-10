package workoutsandbox.manager;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import workoutsanbox.manager.Manager;
import workoutsanbox.manager.Plan;

public class ManagerTest {

    @Test
    public void unnamedTest () {
        assertEquals( 0, 0 );
    }

    @Test
    public void testGetScheme () {
        final Manager manager = new Manager();
        final ArrayList<Integer> scheme = manager.getScheme();
        assertEquals( 5, scheme.size() );
    }

    @Test
    public void testGeneratePlan () {
        final Manager manager = new Manager();
        manager.genereatePlanExercises( "Strength" );

        final Plan p = manager.getPlan();
        assertEquals( "Strength Plan", p.getPlanName() );
        assertEquals( 8, p.getWorkouts().size() );

        System.out.println( p.toString() );
    }
}
