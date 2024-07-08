package commons_csv.format;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;

public class WithAllowMissingColumnNames {
  public static void main (String[] args) throws IOException {
    // will run successfully
    CSVFormat formatWithHeaderContainingNull_true = CSVFormat.DEFAULT.withAllowMissingColumnNames(true).withHeader("foobar", null);
    CSVParser.parse("foo,bar", formatWithHeaderContainingNull_true);

    // will run successfully
    CSVFormat formatWithHeaderContainingEmptyString_true = CSVFormat.DEFAULT.withAllowMissingColumnNames(true).withHeader("foobar", "");
    CSVParser.parse("foo,bar", formatWithHeaderContainingEmptyString_true);

    // will throw exception
    try {
      CSVFormat formatWithHeaderContainingNull_false = CSVFormat.DEFAULT.withAllowMissingColumnNames(false).withHeader("foobar", null);
      CSVParser.parse("foo,bar", formatWithHeaderContainingNull_false);
    } catch(IllegalArgumentException e){
      System.out.println("Exception thrown: " + e.getMessage());
    }

    // will throw exception
    try {
      CSVFormat formatWithHeaderContainingEmptyString_false = CSVFormat.DEFAULT.withAllowMissingColumnNames(false).withHeader("foobar", "");
      CSVParser.parse("foo,bar", formatWithHeaderContainingEmptyString_false);
    } catch (IllegalArgumentException e){
      System.out.println("Exception thrown: " + e.getMessage());
    }
  }
}