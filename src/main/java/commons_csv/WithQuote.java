package commons_csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.QuoteMode;

import java.io.IOException;

public class WithQuote {
  public static void main(String[] args) throws IOException {
    CSVFormat format = CSVFormat.DEFAULT.withEscape('%').withQuote('@').withQuoteMode(QuoteMode.ALL);
    String record = "San Fra%%ncisco,California,Seattle,Washington";
    for(String cell: CSVParser.parse(record, format).getRecords().get(0)){
      System.out.println(cell);
    }
    System.out.println(CSVParser.parse(record, format).getRecords().get(0));
    System.out.println(format.format(record));
  }
}
