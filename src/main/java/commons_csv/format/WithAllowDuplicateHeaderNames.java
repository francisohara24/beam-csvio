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
    CSVFormat formatWithDuplicateHeaderNames =
        CSVFormat.DEFAULT.withAllowDuplicateHeaderNames(false).withHeader("foo", "foo");
  }
}