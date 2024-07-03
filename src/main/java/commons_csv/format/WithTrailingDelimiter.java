package commons_csv.format;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;

/**
 * Tests the function of {@link CSVFormat}'s withTrailingDelimeter() parameter.
 */
public class WithTrailingDelimiter {
  public static void main(String[] args) throws IOException {
    CSVFormat formatWithTrailingDelimiter = CSVFormat.DEFAULT.withDelimiter(',').withTrailingDelimiter();
    CSVFormat formatWithoutTrailingDelimiter = CSVFormat.DEFAULT.withDelimiter(',');
    String input = "a,b,c,";
    System.out.println("with:\n" + CSVParser.parse(input, formatWithTrailingDelimiter).getRecords());
    System.out.println("without:\n" + CSVParser.parse(input, formatWithoutTrailingDelimiter).getRecords());
  }
}
