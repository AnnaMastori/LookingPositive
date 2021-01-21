package lookingpositive.lookingpositive;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
//import java.time.Period;
import java.util.ArrayList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class is the model for users' profiles.
 *
 */
public class Profile {
  /**
   * User's first name.
   */
  private String firstName;
  /**
   * User's last name.
   */
  private String lastName;
  /**
   * User's residence region.
   */
  private String residenceRegion;
  /**
   * User's email.
   */
  private String email;
  /**
   * User's password.
   */
  private String password;
  /**
   * User's age.
   */
  private int age;
  /**
   * User's ID.
   */
  private int userID;
  /**
   * Susceptible or not.
   */
  private boolean isSusceptible;
  /**
   * Array list in which profiles are saved.
   */
  private static ArrayList<Profile> profiles = new ArrayList<Profile>();
  /**
   * Array list in which the birthdays are saved.
   */
  private static ArrayList<LocalDate> birthdays =
      new ArrayList<LocalDate>();

  /**
   * This constructor is used to create objects of users.
   *
   * @param name user's first name
   * @param surname  user's last name
   */
  public Profile(final String name, final String surname) {
    firstName = name;
    lastName = surname;
    email = null;
  }

  /**
   * Default constructor.
   */
  public Profile() {

  }

  /**
   * This constructor creates the profiles using the private variables.
   *
   * @param fName     is the user's first name
   * @param sName      is the user's last name
   * @param residenceReg is the user's residence region
   * @param usersAge     is the user's age
   * @param isSus      if the user belongs to high risk groups
   * @param pass       is the user's password
   * @param mail       is the user's email
   */
  public Profile(final String fName, final String sName,
      final String residenceReg, final int usersAge, final boolean isSus,
      final String pass, final String mail) {

    firstName = fName;
    lastName = sName;
    residenceRegion = residenceReg;
    userID = profilesSize();
    age = usersAge;
    isSusceptible = isSus;
    password = pass;
    email = mail;
    profiles.add(this);

    Calendar.daysInitializer();

  }
  /**
   * Returns first name.
   *
   * @return first name
   */
  public final String getFirstName() {
    return firstName;
  }
  /**
   * Returns last name.
   *
   * @return last name
   */
  public final String getLastName() {
    return lastName;
  }

  /**
   * Returns residence region.
   *
   * @return residence region
   */
  public final String getResidenceRegion() {
    return residenceRegion;
  }
  /**
   * Returns user ID.
   *
   * @return user ID
   */
  public final int getUserID() {
    return userID;
  }
  /**
   * Returns age.
   *
   * @return age
   */
  public final int getAge() {
    return age;
  }
  /**
   * Returns whether susceptible or not.
   *
   * @return whether susceptible or not
   */
  public final boolean getIsSusceptible() {
    return isSusceptible;
  }
  /**
   * Returns user's email.
   *
   * @return email
   */
  public final String getEmail() {
    return email;
  }
  /**
   * Returns user's password.
   *
   * @return password
   */
  public final String getPassword() {
    return password;
  }
/**
 * Sets new password.
 * @param pass is the new password
 */
  public final void setPassword(final String pass) {
    this.password = pass;
  }
  /**
   * Sets new Email.
   * @param mail is the new mail
   */
  public final void setEmail(final String mail) {
    this.email = mail;
  }
  /**
   * Changes the age of the user.
   * @param usersAge is the age
   */
  public final void setAge(final int usersAge) {
    this.age = usersAge;
  }
  /**
   * Returns the line from profiles.
   * @param i line to be returned
   * @return profile line
   */
  public static Profile profilesLine(final int i) {
    return profiles.get(i);
  }
  /**
   * Returns the size of profiles.
   * @return profile size
   */
  public static int profilesSize() {
    return profiles.size();
  }
  /**
   * Returns profiles.
   * @return ArrayList
   */
  public static ArrayList<Profile> getProfiles() {
    return profiles;
  }

  /**
   * Returns the line from profiles.
   * @param i line to be returned
   * @return profile line
   */
  public static LocalDate birthdaysLine(final int i) {
    return birthdays.get(i);
  }

  /**
   * Returns the size of profiles.
   * @return profile size
   */
  public static int birthdaysSize() {
    return birthdays.size();
  }

  /**
   * Returns profiles.
   * @return ArrayList
   */
  public static ArrayList<LocalDate> getBirthdays() {
    return birthdays;
  }

  /**
   * Updates the user's birthdays.
   */
  public static void updateBirthdays() {
    LocalDate currentDate = LocalDate.now();
    for (int i = 0; i < profilesSize(); i++) {
      Profile profile = profilesLine(i);
      System.out.println("Yo");
      System.out.println(profile.age);
      LocalDate birthdate = birthdaysLine(i);
      if (birthdate.getDayOfMonth() == currentDate.getDayOfMonth()
          && birthdate.getMonth() == currentDate.getMonth()
          && Period.between(birthdate, currentDate).getYears() > profile.age) {
        profile.setAge(Period.between(birthdate, currentDate).getYears());
      }
    }
  }

  /**
   * Saves profiles to JSON file.
   */
  public static void profilesSaver() {
    ObjectMapper objectmapper = new ObjectMapper();

    try {
      File profilesfile = new File(
          "src\\main\\resources\\profiles.json").getAbsoluteFile();
      objectmapper.writeValue(profilesfile, profiles);
    } catch (IOException e) {
      System.out.println("ioexception:" + e);
    } catch (Exception e) {
      System.out.println("exception:" + e);
    }
  }

  /**
   * Retrieves profiles from JSON file.
   */
  public static void profilesRetriever() {
    ObjectMapper objectmapper = new ObjectMapper();

    try {
      File profilesfile = new File(
          "src\\main\\resources\\profiles.json").getAbsoluteFile();
      profiles = objectmapper.readValue(
          profilesfile, new TypeReference<ArrayList<Profile>>() { });

    } catch (IOException e) {
      System.out.println("ioexception:" + e);
    } catch (Exception e) {
      System.out.println("exception:" + e);
    }
  }

  /**
   * ToString method.
   */
  @Override
  public final String toString() {
    if (email == null) {
      return "Όνομα=" + firstName + ", Επώνυμο=" + lastName;
    } else {
      return "Profile [ Όνομα=" + firstName + ", Επώνυμο=" + lastName
          + ", Δήμος Κατοικίας=" + residenceRegion + ", Ηλικία=" + age + " ]";
    }
   }
}
