package csv_format;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;

public class WithAllowDuplicateHeaderNames {
  public static void main(String[] args) throws IOException {
    CSVFormat format = CSVFormat.DEFAULT.withAllowDuplicateHeaderNames(false).withHeader("foo", "bar");  // will run correctly
    CSVFormat formatWithDuplicateHeaderNames = CSVFormat.DEFAULT.withAllowDuplicateHeaderNames(false).withHeader("foo", "foo");  // will throw exception
  }
}
