package lookingpositive.lookingpositive;

import java.util.Scanner;

/**
 * This class is used to inform the user about Covid 19.
 */
public final class Information {

  /**
   * Case 3.
   */
  private static final int CASE_THREE = 3;
  /**
   * Case 4.
   */
  private static final int CASE_FOUR = 4;
  /**
   * Case 5.
   */
  private static final int CASE_FIVE = 5;
  /**
   * Case 6.
   */
  private static final int CASE_SIX = 6;
  /**
   * Case 7.
   */
  private static final int CASE_SEVEN = 7;

  private Information() {

  }

  /**
   * Information method. Contains the menu and the switch.
   */
  public static void infoMenu() {

    Scanner sc = new Scanner(System.in);
    int g = 0;
    while (g != -1) {
      System.out.println("Πιθανές ερωτήσεις:");
      System.out.println("1.Τι είναι covid; \r\n" + "2.Μέτρα προστασιας\r\n"
          + "3.Πληροφοριες 13033 σε περιπτωη lockdown \r\n"
          + "4.Χρωμα περιοχης\r\n"
          + "5.Σωστη χρηση μασκας [Ποιες μασκες επιτρεπονται]\r\n"
          + "6.Προστιμα\r\n" + "7.Πίσω");
      System.out.println("Επιλέξτε μια ερώτηση μέ βάση τον αριθμο:");
      g = sc.nextInt();

      switch (g) {
      case 1:
        System.out.println(
            "Η ασθένεια κορωνοϊού 2019 (Corona virus disease 2019, COVID-19),"
                + " επίσης γνωστή ως οξεία αναπνευστική νόσος 2019-nCoV, "
                + "είναι μία μολυσματική ασθένεια που προκαλείται"
                + " από τον κορωνοϊό SARS-CoV-2. "
                + "Ο ιός και η ασθένεια που εντοπίστηκε για πρώτη φορά "
                + "στην πόλη Γουχάν της Κίνας στα τέλη του 2019.");
        break;
      case 2:
        System.out.println("Τα μέτρα προστασίας είναι:\r\n"
            + "1.Αποφυγή επαφής με ασθενείς με συμπτώματα του ιου.\r\n"
            + "2.Τήρηση ατομικών μέτρων υγείας, όπως είναι το πλύσιμο χεριών, "
            + "και η αποφυγή χειραψίας και επαφης των χεριών με το "
            + "στόμα και την μύτη.\r\n"
            + "3.Εαν εμφανιστούν συμπτώματα κορονοιου αποφυγετε "
            + "την επαφη με αλλα ατομα και καντε το τεστ.");
        break;
      case CASE_THREE:
        System.out.println(
            "Μπορείτε να στείλετε από το κινητό σας μήνυμα SMS στον αριθμό "
                + "13033 " + "χωρίς χρέωση \r\n"
                + "Το SMS πρέπει να είναι της μορφής:\r\n"
                + "X [κενό] ονοματεπώνυμο και διεύθυνση κατοικίας\r\n"
                + "όπου Χ ο λόγος εξόδου με τον αριθμό 1, 2, 3, 4, 5, 6 που "
                + "αντιστοιχεί στις παρακάτω αιτιολογίες:\r\n"
                + "όπου Χ ο λόγος εξόδου με τον αριθμό 1, 2, 3, 4, 5, 6 που "
                + "αντιστοιχεί στις παρακάτω αιτιολογίες:\r\n"
                + "1.Μετάβαση σε φαρμακείο ή επίσκεψη στον γιατρό, "
                + "εφόσον αυτό συνιστάται μετά από σχετική επικοινωνία.\r\n"
                + "2.Μετάβαση σε εν λειτουργία κατάστημα προμηθειών αγαθών "
                + "πρώτης ανάγκης (σούπερ μάρκετ, μίνι μάρκετ), "
                + "όπου δεν είναι δυνατή η αποστολή τους.\r\n"
                + "3.Μετάβαση στην τράπεζα, στο μέτρο που "
                + "δεν είναι δυνατή η ηλεκτρονική συναλλαγή.\r\n"
                + "4.Κίνηση για παροχή βοήθειας σε ανθρώπους που "
                + "βρίσκονται σε ανάγκη ή συνοδεία ανηλίκων"
                + " μαθητών από/προς το σχολείο.\r\n"
                + "5.Μετάβαση σε τελετή κηδείας υπό τους όρους που προβλέπει "
                + "ο νόμος ή μετάβαση διαζευγμένων γονέων ή γονέων που τελούν "
                + "σε διάσταση που είναι αναγκαία για τη διασφάλιση της "
                + "επικοινωνίας γονέων και τέκνων, σύμφωνα με τις "
                + "κείμενες διατάξεις.\r\n"
                + "6.Σωματική άσκηση σε εξωτερικό χώρο ή κίνηση με κατοικίδιο "
                + "ζώο, ατομικά ή ανά δύο άτομα, τηρώντας στην τελευταία αυτή "
                + "περίπτωση την αναγκαία απόσταση 1,5 μέτρου.\r\n"
                + "Θα λαμβάνετε ως απάντηση:\r\n"
                + "Μετακίνηση [κενό] X [κενό] ονοματεπώνυμο "
                + "και διεύθυνση κατοικίας");
        break;
      case CASE_FOUR:
        System.out.println(
            "Τα χρώματα των Δήμων με βάση την επικυνδηνότητάς τους είναι: ");
        // call method
        break;
      case CASE_FIVE:
        System.out.println(
            "Οι μάσκες που επιτρέπονται είναι οι χειρουργικές, οι εγκεκρυμένες "
                + "μη χειρουργικές και οι υψηλής προστασίας."
                + "Η μάσκα πρέπει να χρησιμοποιείται σε όλους τους κλειστούς "
                + "χώρους και σε χώρους υψηλού συνοστισμού "
                + "(π.χ. στάσεις λεωφορείων)"
                + "Η μάσκα πρέπει να καλύπτει το στόμα"
                + " και τη μύτη σε κάθε περίπτωση.");
        break;
      case CASE_SIX:
        System.out.println("Το προστιμο για τη μη χρηση μασκας καθως και για "
            + "την κυκλοφορια εκτος κανονων ανερχεται στα 300 ευρω");
        break;
      case CASE_SEVEN:
        g = -1;
        break;
      default:
        System.out.println("Μη έγκυρη επιλογή. Προσπαθήστε ξανά.");
        break;
      }
      sc.close(); 
    }
  }
}
