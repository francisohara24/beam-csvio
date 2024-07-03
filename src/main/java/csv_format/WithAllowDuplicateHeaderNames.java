package csv_format;

import org.apache.commons.csv.CSVFormat;

import java.io.IOException;

public class WithAllowDuplicateHeaderNames {
  public static void main(String[] args) throws IOException {
    // will run correctly
    CSVFormat format = CSVFormat.DEFAULT.withAllowDuplicateHeaderNames(false).withHeader("foo", "bar");

    // will throw exception
    CSVFormat formatWithDuplicateHeaderNames = CSVFormat.DEFAULT.withAllowDuplicateHeaderNames(false).withHeader("foo", "foo");
  }
}
