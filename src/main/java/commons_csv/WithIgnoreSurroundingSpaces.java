package commons_csv;

import java.io.IOException;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.QuoteMode;

/** Tests the function of {@link CSVFormat}'s withIgnoreSurroundingSpaces() parameter. */
public class WithIgnoreSurroundingSpaces {
  public static void main(String[] args) throws IOException {
//    String record = "a,b,c\n1, 2 , 3 ";
//    CSVFormat format = CSVFormat.DEFAULT;
//    CSVFormat formatWithIgnoreSurroundingSpaces = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();
//    System.out.println("without:\n" + format.format(record));
//    System.out.println("with:\n" + formatWithIgnoreSurroundingSpaces.format(record));
    CSVFormat format = CSVFormat.newFormat(',')
        .withQuoteMode(QuoteMode.ALL)
        .withTrim(true);
        String foo = "\"\",\"\",\"Single space on the left\",\"Single space on the right\","
            + "\"Single spaces on both sides\",\"Multiple spaces on the left\","
            + "\"Multiple spaces on the right\",\"Multiple spaces on both sides\"";
        String bar = format.format("", " ", " Single space on the left", "Single space on the right ",
            " Single spaces on both sides ", "   Multiple spaces on the left", "Multiple spaces on the right   ",
            "  Multiple spaces on both sides     ");
    System.out.println(foo);
    System.out.println(bar);
  }
}