package workoutsandbox.user;

/**
 * This class provides all functionality for the Profile object
 * 
 * @author Joseph Coppeta
 */
public class Profile {
	
	/** The client's first name. */
	private String firstName;
	/** The client's last name. */
	private String lastName;
	/** The client's email. */
	private String email;
	/** The client's username for the profile. */
	private String username;
	/** The client's password for the profile.*/
	private String password;
	/** The client's user details. */
	private User user;
	
	/**
	 * Default constructor for creating a new profile
	 *
	 * @param firstName The first name
	 * @param lastName The last name
	 * @param email The email address
	 * @param username The username
	 * @param password The password
	 */
	public Profile(String firstName, String lastName, String email, String username, String password, User user) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setUsername(username);
		setPassword(password);
		setUser(user);
	}
	
	/**
	 * Returns the user
	 * 
	 * @return user The user
	 */
	public User getUser() {
		return user;
	}
	
	/**
	 * Sets the user
	 * 
	 * @param user The new user
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	/**
	 * Returns the first name
	 * 
	 * @return firstName the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets the first name
	 * 
	 * @param firstName The new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Returns the last name
	 * 
	 * @return lastName The last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the last name
	 * 
	 * @param lastName The new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Returns the email
	 * 
	 * @return email The email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Sets the email 
	 * 
	 * @param email The new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Returns the username
	 * 
	 * @return username The username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * Sets the username
	 * 
	 * @param username The new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * Returns the password
	 * 
	 * @return password The password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Sets the password 
	 * 
	 * @param password The new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
}
