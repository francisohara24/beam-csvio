package commons_csv.format;

import java.io.IOException;
import org.apache.commons.csv.CSVFormat;

/** Tests the function of {@link CSVFormat}'s withAllowDuplicateHeaderNames() parameter. */
public class WithAllowDuplicateHeaderNames {
  public static void main(String[] args) throws IOException {
    // will run correctly
    CSVFormat format =
        CSVFormat.DEFAULT.withAllowDuplicateHeaderNames(false).withHeader("foo", "bar");

    // will throw exception
    try {
      CSVFormat formatWithDuplicateHeaderNames =
          CSVFormat.DEFAULT.withAllowDuplicateHeaderNames(false).withHeader("foo", "foo");
    } catch (IllegalArgumentException e){
      System.out.println("Exception thrown: " + e.getMessage());
    }
  }
}