package csv_format;

import org.apache.commons.csv.CSVFormat;

import java.io.IOException;
import java.io.StringReader;

/**
 * Tests the function of {@link CSVFormat}'s withIgnoreSurroundingSpaces() parameter.
 */
public class WithIgnoreSurroundingSpaces {
  public static void main(String[] args) throws IOException {
    String input = "a,b,c\n1, 2 , 3 ";
    CSVFormat format = CSVFormat.DEFAULT;
    CSVFormat formatWithIgnoreSurroundingSpaces = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();
    System.out.println("without:\n" + format.format(input));
    System.out.println("with:\n" + formatWithIgnoreSurroundingSpaces.format(input));
  }
}
