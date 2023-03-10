package workoutsandbox.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import workoutsanbox.manager.Manager;
import workoutsanbox.manager.Plan;

public class testGUI {

    public static JFrame          frame;
    public static int             age;
    public static int             height;
    public static int             weight;
    public static boolean         flag;

    public static String          firstName = "";
    public static String          lastName  = "";
    public static String          email     = "";
    public static String          username  = "";
    public static String          password  = "";

    public static ExperienceLevel experience;
    public static EquipmentAccess access;
    public static ExerciseGoals   goals;

    /** Levels of prior experience */
    private enum ExperienceLevel {
        BEGINNER, INTERMEDIATE, EXPERIENCED
    };

    /** Access to equipment based on work-out environment */
    private enum EquipmentAccess {
        HOME, CLUB, FACILITY
    };

    /** Personal exercise goals */
    private enum ExerciseGoals {
        STRENGTH, WEIGHTLOSS, SIZE
    };

    public static void main ( final String[] args ) {
        frame = new JFrame();
        flag = true;
        // int c1 = JOptionPane.showConfirmDialog(null, "Want to test the input
        // buttons?");
        // if (c1 == JOptionPane.YES_OPTION) {
        // String age = JOptionPane.showInputDialog(null, "What is your age?");
        // String height = JOptionPane.showInputDialog(null, "What is your
        // height?");
        // String weight = JOptionPane.showInputDialog(null, "What is your
        // weight?");
        // JOptionPane.showMessageDialog(null, age + "yrs, " + height + "in, " +
        // weight + "lbs");
        // }
        //
        // int c2 = JOptionPane.showConfirmDialog(null, "Want to test a
        // JFrame?");
        // if (c2 == JOptionPane.YES_OPTION) {
        // frame.setForeground(Color.WHITE);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLocation(new Point(800, 450));
        // frame.setSize(new Dimension(300, 120));
        // frame.setTitle("WorkoutSandbox");
        // frame.setVisible(true);
        //
        // JButton b1 = new JButton();
        // b1.addActionListener(new ActionListener() {
        // public void actionPerformed(ActionEvent e) {
        // JOptionPane.showMessageDialog(null, "You clicked continue");
        //
        // }
        // });
        // b1.setText("Continue");
        // b1.setBackground(Color.GREEN);
        // frame.add(b1);
        //
        // JButton b2 = new JButton();
        // b2.addActionListener(new ActionListener() {
        // public void actionPerformed(ActionEvent e) {
        // frame.dispose();
        // }
        // });
        // b2.setText("Quit");
        // b2.setBackground(Color.RED);
        // frame.add(b2);
        // frame.setLayout(new FlowLayout());
        // }
        // int c3 = JOptionPane.showConfirmDialog(null, "Want to test a JFrame
        // layout?");
        // if (c3 == JOptionPane.YES_OPTION) {
        // frame.setForeground(Color.WHITE);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLocation(new Point(800, 450));
        // frame.setSize(new Dimension(300, 120));
        // frame.setTitle("WorkoutSandbox");
        //
        // frame.setLayout(new FlowLayout());
        // frame.add(new JLabel("Enter you age"));
        // frame.add(new JTextField(5));
        // frame.add(new JButton("Submit"));
        // frame.setVisible(true);
        //
        // }
        // int c4 = JOptionPane.showConfirmDialog(null, "Want to test a grid
        // layout?");
        // if (c4 == JOptionPane.YES_OPTION) {
        // createInfoFrame();
        // }

        ////////////////////
        // createInfoFrame();
        ////////////////////

        createScroller();
    }

    // public static void createInfoFrame() {
    // System.out.println("New JFrame created");
    // frame = new JFrame();
    // flag = false;
    // frame.setLocation(new Point(800, 450));
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.setSize(new Dimension(275, 175));
    // frame.setTitle("Sign-up Information");
    // frame.setLayout(new FlowLayout());
    // JPanel centerPanel = new JPanel(new GridLayout(4, 1));
    // centerPanel.add(new JLabel("Enter your age: "));
    // JTextField ageButton = new JTextField(10);
    // centerPanel.add(ageButton);
    // centerPanel.add(new JLabel("Enter your height: "));
    // JTextField heightButton = new JTextField(10);
    // centerPanel.add(heightButton);
    // centerPanel.add(new JLabel("Enter your weight: "));
    // JTextField weightButton = new JTextField(10);
    // centerPanel.add(weightButton);
    //
    // frame.add(centerPanel, BorderLayout.CENTER);
    // JButton submit = new JButton();
    //
    // submit.addActionListener(new ActionListener() {
    // public void actionPerformed(ActionEvent e) {
    // age = Integer.valueOf(ageButton.getText());
    // height = Integer.valueOf(heightButton.getText());
    // weight = Integer.valueOf(weightButton.getText());
    // frame.dispose();
    // frame = new JFrame();
    // frame.setLocation(new Point(800, 450));
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.setSize(new Dimension(275, 175));
    // frame.setTitle("CONFIRMATION");
    // frame.setLayout(new FlowLayout());
    //
    // JPanel centerPanel = new JPanel(new GridLayout(4,1));
    // centerPanel.add(new JLabel("Age: " + age));
    // centerPanel.add(new JLabel("Height: " + height));
    // centerPanel.add(new JLabel("Weight: " + weight));
    // JButton confirm = new JButton();
    // confirm.setText("CONFIRM");
    // confirm.addActionListener(new ActionListener() {
    // public void actionPerformed(ActionEvent e) {
    // frame.dispose();
    // }
    // });
    // JButton decline = new JButton();
    // decline.setText("DECLINE");
    // decline.addActionListener(new ActionListener() {
    // public void actionPerformed(ActionEvent e) {
    // flag = true;
    // frame.setVisible(false);
    // }
    // });
    // JPanel southPanel = new JPanel(new FlowLayout());
    // southPanel.add(confirm);
    // southPanel.add(decline);
    // frame.add(centerPanel);
    // frame.add(southPanel);
    // frame.setVisible(true);
    // }
    // });
    // System.out.println("Here");
    // submit.setText("Submit");
    // frame.add(submit);
    // frame.setVisible(true);
    // }

    public static void createInfoFrame () {
        frame = new JFrame();
        flag = false;
        frame.setLocation( new Point( 800, 450 ) );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize( new Dimension( 300, 245 ) );
        frame.setTitle( "Sign-up Information" );
        frame.setLayout( new FlowLayout() );
        final JPanel centerPanel = new JPanel( new GridLayout( 4, 1 ) );
        centerPanel.add( new JLabel( "Enter your age (yrs): " ) );
        final JTextField ageText = new JTextField( 10 );
        centerPanel.add( ageText );
        centerPanel.add( new JLabel( "Enter your height (in): " ) );
        final JTextField heightText = new JTextField( 10 );
        centerPanel.add( heightText );
        centerPanel.add( new JLabel( "Enter your weight (lbs): " ) );
        final JTextField weightText = new JTextField( 10 );
        centerPanel.add( weightText );

        final JPanel centerPanel2 = new JPanel( new GridLayout( 4, 1 ) );
        final JLabel agePanel = new JLabel( "Age:      " + age );
        centerPanel2.add( agePanel );
        final JLabel heightPanel = new JLabel( "Height:  " + height );
        centerPanel2.add( heightPanel );
        final JLabel weightPanel = new JLabel( "Weight: " + weight );
        centerPanel2.add( weightPanel );
        frame.add( centerPanel2 );
        frame.setVisible( true );

        frame.add( centerPanel, BorderLayout.CENTER );
        final JButton submit = new JButton();
        submit.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed ( final ActionEvent e ) {
                age = Integer.valueOf( ageText.getText() );
                height = Integer.valueOf( heightText.getText() );
                weight = Integer.valueOf( weightText.getText() );
                agePanel.setText( "Age:      " + age );
                heightPanel.setText( "Height:  " + height / 12 + "' " + height % 12 + "''" );
                weightPanel.setText( "Weight: " + weight );
                ageText.setText( "" );
                heightText.setText( "" );
                weightText.setText( "" );
            }
        } );
        final JButton continueButton = new JButton();
        continueButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed ( final ActionEvent e ) {
                frame.dispose();
                createWorkoutInfoFrame();
            }
        } );

        submit.setText( "Save" );
        continueButton.setText( "Continue" );
        frame.add( submit );
        frame.add( continueButton );
        frame.setVisible( true );
    }

    public static void createWorkoutInfoFrame () {
        frame = new JFrame();
        flag = false;
        frame.setLocation( new Point( 800, 450 ) );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize( new Dimension( 500, 300 ) );
        frame.setTitle( "Background Information" );
        final JPanel panel = new JPanel( new GridLayout( 5, 1 ) );

        final JPanel expPanel = new JPanel( new FlowLayout() );
        expPanel.add( new JLabel( "Select your experience: " ) );
        final JRadioButton expButton1 = new JRadioButton( "Beginner" );
        final JRadioButton expButton2 = new JRadioButton( "Intermediate" );
        final JRadioButton expButton3 = new JRadioButton( "Advanced" );
        final ButtonGroup expButtons = new ButtonGroup();
        expButtons.add( expButton1 );
        expButtons.add( expButton2 );
        expButtons.add( expButton3 );
        expPanel.add( expButton1 );
        expPanel.add( expButton2 );
        expPanel.add( expButton3 );
        panel.add( expPanel );

        final JPanel equipPanel = new JPanel( new FlowLayout() );
        equipPanel.add( new JLabel( "Select your equipment access: " ) );
        final JRadioButton equipButton1 = new JRadioButton( "Home" );
        final JRadioButton equipButton2 = new JRadioButton( "Club" );
        final JRadioButton equipButton3 = new JRadioButton( "Facility" );
        final ButtonGroup equipButtons = new ButtonGroup();
        equipButtons.add( equipButton1 );
        equipButtons.add( equipButton2 );
        equipButtons.add( equipButton3 );
        equipPanel.add( equipButton1 );
        equipPanel.add( equipButton2 );
        equipPanel.add( equipButton3 );
        panel.add( equipPanel );

        final JPanel goalPanel = new JPanel( new FlowLayout() );
        goalPanel.add( new JLabel( "Select your goal: " ) );
        final JRadioButton goalButton1 = new JRadioButton( "Strength" );
        final JRadioButton goalButton2 = new JRadioButton( "Size" );
        final JRadioButton goalButton3 = new JRadioButton( "Weight Loss" );
        final ButtonGroup goalButtons = new ButtonGroup();
        goalButtons.add( goalButton1 );
        goalButtons.add( goalButton2 );
        goalButtons.add( goalButton3 );
        goalPanel.add( goalButton1 );
        goalPanel.add( goalButton2 );
        goalPanel.add( goalButton3 );
        panel.add( goalPanel );

        final JPanel resultPanel = new JPanel( new FlowLayout() );
        final JLabel result = new JLabel( "" );
        resultPanel.add( result );
        panel.add( resultPanel );

        frame.setVisible( true );
        final JButton submit = new JButton();
        submit.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed ( final ActionEvent e ) {
                if ( expButton1.isSelected() ) {
                    if ( equipButton1.isSelected() ) {
                        if ( goalButton1.isSelected() ) {
                            result.setText( expButton1.getText() + " | " + equipButton1.getText() + " | "
                                    + goalButton1.getText() );
                            experience = ExperienceLevel.BEGINNER;
                            access = EquipmentAccess.HOME;
                            goals = ExerciseGoals.STRENGTH;
                        }
                        else if ( goalButton2.isSelected() ) {
                            result.setText( expButton1.getText() + " | " + equipButton1.getText() + " | "
                                    + goalButton2.getText() );
                            experience = ExperienceLevel.BEGINNER;
                            access = EquipmentAccess.HOME;
                            goals = ExerciseGoals.SIZE;
                        }
                        else if ( goalButton3.isSelected() ) {
                            result.setText( expButton1.getText() + " | " + equipButton1.getText() + " | "
                                    + goalButton3.getText() );
                            experience = ExperienceLevel.BEGINNER;
                            access = EquipmentAccess.HOME;
                            goals = ExerciseGoals.WEIGHTLOSS;
                        }
                    }
                    else if ( equipButton2.isSelected() ) {
                        if ( goalButton1.isSelected() ) {
                            result.setText( expButton1.getText() + " | " + equipButton2.getText() + " | "
                                    + goalButton1.getText() );
                            experience = ExperienceLevel.BEGINNER;
                            access = EquipmentAccess.CLUB;
                            goals = ExerciseGoals.STRENGTH;
                        }
                        else if ( goalButton2.isSelected() ) {
                            result.setText( expButton1.getText() + " | " + equipButton2.getText() + " | "
                                    + goalButton2.getText() );
                            experience = ExperienceLevel.BEGINNER;
                            access = EquipmentAccess.CLUB;
                            goals = ExerciseGoals.SIZE;
                        }
                        else if ( goalButton3.isSelected() ) {
                            result.setText( expButton1.getText() + " | " + equipButton2.getText() + " | "
                                    + goalButton3.getText() );
                            experience = ExperienceLevel.BEGINNER;
                            access = EquipmentAccess.CLUB;
                            goals = ExerciseGoals.WEIGHTLOSS;
                        }
                    }
                    else if ( equipButton3.isSelected() ) {
                        if ( goalButton1.isSelected() ) {
                            result.setText( expButton1.getText() + " | " + equipButton3.getText() + " | "
                                    + goalButton1.getText() );
                            experience = ExperienceLevel.BEGINNER;
                            access = EquipmentAccess.FACILITY;
                            goals = ExerciseGoals.STRENGTH;
                        }
                        else if ( goalButton2.isSelected() ) {
                            result.setText( expButton1.getText() + " | " + equipButton3.getText() + " | "
                                    + goalButton2.getText() );
                            experience = ExperienceLevel.BEGINNER;
                            access = EquipmentAccess.FACILITY;
                            goals = ExerciseGoals.SIZE;
                        }
                        else if ( goalButton3.isSelected() ) {
                            result.setText( expButton1.getText() + " | " + equipButton3.getText() + " | "
                                    + goalButton3.getText() );
                            experience = ExperienceLevel.BEGINNER;
                            access = EquipmentAccess.FACILITY;
                            goals = ExerciseGoals.WEIGHTLOSS;
                        }
                    }
                }
                else if ( expButton2.isSelected() ) {
                    if ( equipButton1.isSelected() ) {
                        if ( goalButton1.isSelected() ) {
                            result.setText( expButton2.getText() + " | " + equipButton1.getText() + " | "
                                    + goalButton1.getText() );
                            experience = ExperienceLevel.INTERMEDIATE;
                            access = EquipmentAccess.HOME;
                            goals = ExerciseGoals.STRENGTH;
                        }
                        else if ( goalButton2.isSelected() ) {
                            result.setText( expButton2.getText() + " | " + equipButton1.getText() + " | "
                                    + goalButton2.getText() );
                            experience = ExperienceLevel.INTERMEDIATE;
                            access = EquipmentAccess.HOME;
                            goals = ExerciseGoals.SIZE;
                        }
                        else if ( goalButton3.isSelected() ) {
                            result.setText( expButton2.getText() + " | " + equipButton1.getText() + " | "
                                    + goalButton3.getText() );
                            experience = ExperienceLevel.INTERMEDIATE;
                            access = EquipmentAccess.HOME;
                            goals = ExerciseGoals.WEIGHTLOSS;
                        }
                    }
                    else if ( equipButton2.isSelected() ) {
                        if ( goalButton1.isSelected() ) {
                            result.setText( expButton2.getText() + " | " + equipButton2.getText() + " | "
                                    + goalButton1.getText() );
                            experience = ExperienceLevel.INTERMEDIATE;
                            access = EquipmentAccess.CLUB;
                            goals = ExerciseGoals.STRENGTH;
                        }
                        else if ( goalButton2.isSelected() ) {
                            result.setText( expButton2.getText() + " | " + equipButton2.getText() + " | "
                                    + goalButton2.getText() );
                            experience = ExperienceLevel.INTERMEDIATE;
                            access = EquipmentAccess.CLUB;
                            goals = ExerciseGoals.SIZE;
                        }
                        else if ( goalButton3.isSelected() ) {
                            result.setText( expButton2.getText() + " | " + equipButton2.getText() + " | "
                                    + goalButton3.getText() );
                            experience = ExperienceLevel.INTERMEDIATE;
                            access = EquipmentAccess.CLUB;
                            goals = ExerciseGoals.WEIGHTLOSS;
                        }
                    }
                    else if ( equipButton3.isSelected() ) {
                        if ( goalButton1.isSelected() ) {
                            result.setText( expButton2.getText() + " | " + equipButton3.getText() + " | "
                                    + goalButton1.getText() );
                            experience = ExperienceLevel.INTERMEDIATE;
                            access = EquipmentAccess.FACILITY;
                            goals = ExerciseGoals.STRENGTH;
                        }
                        else if ( goalButton2.isSelected() ) {
                            result.setText( expButton2.getText() + " | " + equipButton3.getText() + " | "
                                    + goalButton2.getText() );
                            experience = ExperienceLevel.INTERMEDIATE;
                            access = EquipmentAccess.FACILITY;
                            goals = ExerciseGoals.SIZE;
                        }
                        else if ( goalButton3.isSelected() ) {
                            result.setText( expButton2.getText() + " | " + equipButton3.getText() + " | "
                                    + goalButton3.getText() );
                            experience = ExperienceLevel.INTERMEDIATE;
                            access = EquipmentAccess.FACILITY;
                            goals = ExerciseGoals.SIZE;
                        }
                    }
                }
                else if ( expButton3.isSelected() ) {
                    if ( equipButton1.isSelected() ) {
                        if ( goalButton1.isSelected() ) {
                            result.setText( expButton3.getText() + " | " + equipButton1.getText() + " | "
                                    + goalButton1.getText() );
                            experience = ExperienceLevel.EXPERIENCED;
                            access = EquipmentAccess.HOME;
                            goals = ExerciseGoals.STRENGTH;
                        }
                        else if ( goalButton2.isSelected() ) {
                            result.setText( expButton3.getText() + " | " + equipButton1.getText() + " | "
                                    + goalButton2.getText() );
                            experience = ExperienceLevel.EXPERIENCED;
                            access = EquipmentAccess.HOME;
                            goals = ExerciseGoals.SIZE;
                        }
                        else if ( goalButton3.isSelected() ) {
                            result.setText( expButton3.getText() + " | " + equipButton1.getText() + " | "
                                    + goalButton3.getText() );
                            experience = ExperienceLevel.EXPERIENCED;
                            access = EquipmentAccess.HOME;
                            goals = ExerciseGoals.WEIGHTLOSS;
                        }
                    }
                    else if ( equipButton2.isSelected() ) {
                        if ( goalButton1.isSelected() ) {
                            result.setText( expButton3.getText() + " | " + equipButton2.getText() + " | "
                                    + goalButton1.getText() );
                            experience = ExperienceLevel.EXPERIENCED;
                            access = EquipmentAccess.CLUB;
                            goals = ExerciseGoals.STRENGTH;
                        }
                        else if ( goalButton2.isSelected() ) {
                            result.setText( expButton3.getText() + " | " + equipButton2.getText() + " | "
                                    + goalButton2.getText() );
                            experience = ExperienceLevel.EXPERIENCED;
                            access = EquipmentAccess.CLUB;
                            goals = ExerciseGoals.SIZE;
                        }
                        else if ( goalButton3.isSelected() ) {
                            result.setText( expButton3.getText() + " | " + equipButton2.getText() + " | "
                                    + goalButton3.getText() );
                            experience = ExperienceLevel.EXPERIENCED;
                            access = EquipmentAccess.CLUB;
                            goals = ExerciseGoals.WEIGHTLOSS;
                        }
                    }
                    else if ( equipButton3.isSelected() ) {
                        if ( goalButton1.isSelected() ) {
                            result.setText( expButton3.getText() + " | " + equipButton3.getText() + " | "
                                    + goalButton1.getText() );
                            experience = ExperienceLevel.EXPERIENCED;
                            access = EquipmentAccess.FACILITY;
                            goals = ExerciseGoals.STRENGTH;
                        }
                        else if ( goalButton2.isSelected() ) {
                            result.setText( expButton3.getText() + " | " + equipButton3.getText() + " | "
                                    + goalButton2.getText() );
                            experience = ExperienceLevel.EXPERIENCED;
                            access = EquipmentAccess.FACILITY;
                            goals = ExerciseGoals.SIZE;
                        }
                        else if ( goalButton3.isSelected() ) {
                            result.setText( expButton3.getText() + " | " + equipButton3.getText() + " | "
                                    + goalButton3.getText() );
                            experience = ExperienceLevel.EXPERIENCED;
                            access = EquipmentAccess.FACILITY;
                            goals = ExerciseGoals.WEIGHTLOSS;
                        }
                    }
                }
            }
        } );
        final JButton continueButton = new JButton();
        continueButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed ( final ActionEvent e ) {
                frame.dispose();
                createSampleRoutineFrame();
            }
        } );

        submit.setText( "Save" );
        continueButton.setText( "Continue" );
        final JPanel buttonPanel = new JPanel( new FlowLayout() );
        buttonPanel.add( submit );
        buttonPanel.add( continueButton );
        panel.add( buttonPanel );
        frame.add( panel );

        frame.setVisible( true );
    }

    public static void createSampleRoutineFrame () {
        frame = new JFrame();
        flag = false;
        frame.setLocation( new Point( 800, 450 ) );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize( new Dimension( 600, 300 ) );
        frame.setTitle( "Example Routine" );
        frame.setLayout( new FlowLayout() );
        final JPanel panel = new JPanel( new GridLayout( 7, 1 ) );
        panel.add( new JLabel(
                "----------------------------------------------------------------------------------------------------------------------------------------" ) );
        panel.add( new JLabel(
                "    Exercise   |   Warm-up Sets   |   Working Sets   |   Reps   |   RPE   |   1RM Percentage   |   Notes    " ) );
        panel.add( new JLabel(
                "----------------------------------------------------------------------------------------------------------------------------------------" ) );
        panel.add( new JLabel(
                "  Bench Press  |        1         |          3       |     6    |    8    |         0.8        | 2-1-1 Tempo." ) );
        panel.add( new JLabel(
                "  Squat               |        1         |          2       |     7    |    7    |         0.8        | Pause at bottom." ) );
        panel.add( new JLabel(
                "  Deadlift            |        1         |          4       |     2    |    8    |         0.85       | 3 Second pause." ) );

        final JButton continueButton = new JButton();
        continueButton.setText( "Continue" );
        continueButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed ( final ActionEvent e ) {
                frame.dispose();
                createFinalInfoFrame();
            }
        } );

        final JButton quitButton = new JButton();
        quitButton.setText( "Quit" );
        quitButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed ( final ActionEvent e ) {
                frame.dispose();
            }
        } );

        final JPanel buttonPanel = new JPanel( new FlowLayout() );
        buttonPanel.add( continueButton );
        buttonPanel.add( quitButton );
        panel.add( buttonPanel );
        frame.add( panel );
        frame.setVisible( true );
    }

    public static void createFinalInfoFrame () {
        frame = new JFrame();
        flag = false;
        frame.setLocation( new Point( 800, 450 ) );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize( new Dimension( 1000, 300 ) );
        frame.setTitle( "Final Sign-up Information" );
        frame.setLayout( new FlowLayout() );
        final JPanel panel = new JPanel( new GridLayout( 7, 1 ) );
        panel.add( new JLabel( "Enter your first name: " ) );
        final JTextField fnText = new JTextField( 10 );
        panel.add( fnText );
        panel.add( new JLabel( "Enter your last name: " ) );
        final JTextField lnText = new JTextField( 10 );
        panel.add( lnText );
        panel.add( new JLabel( "Enter your email: " ) );
        final JTextField emailText = new JTextField( 10 );
        panel.add( emailText );
        panel.add( new JLabel( "Enter your username: " ) );
        final JTextField userText = new JTextField( 10 );
        panel.add( userText );
        panel.add( new JLabel( "Enter your password: " ) );
        final JTextField passText = new JTextField( 10 );
        panel.add( passText );

        final JPanel resultPanel = new JPanel( new FlowLayout() );
        final JLabel result = new JLabel( "" );
        resultPanel.add( result );
        panel.add( resultPanel );

        final JButton saveButton = new JButton();
        saveButton.setText( "Save" );
        saveButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed ( final ActionEvent e ) {
                firstName = fnText.getText();
                lastName = lnText.getText();
                email = emailText.getText();
                username = userText.getText();
                password = passText.getText();
                result.setText( firstName + " | " + lastName + " | " + email + " | " + username + " | " + password );
                fnText.setText( "" );
                lnText.setText( "" );
                emailText.setText( "" );
                userText.setText( "" );
                passText.setText( "" );
            }
        } );

        final JButton continueButton = new JButton();
        continueButton.setText( "Continue" );
        continueButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed ( final ActionEvent e ) {
                frame.dispose();
                createFinalFrame();
            }
        } );

        final JPanel buttonPanel = new JPanel( new FlowLayout() );
        buttonPanel.add( saveButton );
        buttonPanel.add( continueButton );
        panel.add( buttonPanel );
        frame.add( panel );
        frame.setVisible( true );
    }

    public static void createFinalFrame () {
        frame = new JFrame();
        flag = false;
        frame.setLocation( new Point( 800, 450 ) );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize( new Dimension( 500, 500 ) );
        frame.setTitle( "Example Routine" );
        frame.setLayout( new FlowLayout() );
        final JPanel panel = new JPanel( new GridLayout( 12, 1 ) );
        panel.add( new JLabel( "First Name: " + firstName ) );
        panel.add( new JLabel( "Last Name:  " + lastName ) );
        panel.add( new JLabel( "Email:      " + email ) );
        panel.add( new JLabel( "Username:   " + username ) );
        panel.add( new JLabel( "Password:   " + password ) );
        panel.add( new JLabel( "Age:        " + age + "yrs" ) );
        panel.add( new JLabel( "Height:     " + height / 12 + "' " + height % 12 + "''" ) );
        panel.add( new JLabel( "Weight:     " + weight + "lbs" ) );
        panel.add( new JLabel( "Experience: " + experience ) );
        panel.add( new JLabel( "Equipment:  " + access ) );
        panel.add( new JLabel( "Goal:       " + goals ) );

        final JButton closeButton = new JButton();
        closeButton.setText( "Close" );
        closeButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed ( final ActionEvent e ) {
                frame.dispose();
            }
        } );

        final JPanel buttonPanel = new JPanel( new FlowLayout() );
        buttonPanel.add( closeButton );
        panel.add( buttonPanel );
        frame.add( panel );
        frame.setVisible( true );
    }

    public static void createScroller () {
        final Manager manager = new Manager();
        manager.genereatePlanExercises( "Strength" );

        final Plan p = manager.getPlan();
        frame = new JFrame();
        frame.setLocation( new Point( 800, 450 ) );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize( new Dimension( 700, 500 ) );
        frame.setTitle( "Plan" );
        frame.setLayout( new FlowLayout() );

        final JPanel panel = new JPanel( new FlowLayout() );
        final JLabel label = new JLabel( "<html>" + p.toString() + "</html>" );
        panel.add( label );
        frame.add( panel );
        final JScrollPane scrollableText = new JScrollPane( label );
        scrollableText.setPreferredSize( new Dimension( 600, 200 ) );
        scrollableText.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );
        frame.add( scrollableText );
        frame.setVisible( true );
    }
}
