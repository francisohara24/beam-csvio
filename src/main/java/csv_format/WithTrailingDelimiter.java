package csv_format;

import org.apache.commons.csv.CSVFormat;

import java.io.IOException;
import java.io.StringReader;

/**
 * Tests the function of {@link CSVFormat}'s withTrailingDelimeter() parameter.
 */
public class WithTrailingDelimiter {
  public static void main(String[] args) throws IOException {
    // What does withTrailingDelimiter() do?
    CSVFormat formatWithTrailingDelimiter = CSVFormat.DEFAULT.withDelimiter(',').withTrailingDelimiter();
    CSVFormat formatWithoutTrailingDelimiter = CSVFormat.DEFAULT.withDelimiter(',');
    StringReader input1 = new StringReader("a,b,c,");
    StringReader input2 = new StringReader("a,b,c,");
    System.out.println(formatWithTrailingDelimiter.parse(input1).getRecords());
    System.out.println(formatWithoutTrailingDelimiter.parse(input2).getRecords());
  }
}
