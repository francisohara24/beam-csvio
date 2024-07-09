package commons_csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;

public class WithEscape {
  public static void main(String[] args) throws IOException {
    CSVFormat format = CSVFormat.DEFAULT.withEscape('@');
    String record = "San Francisco,California,Seattle,Washington"; // 4 fields/cells
    String recordWithEscapedDelimiter = "San Francisco@,California,Seattle@,Washington";  // 4 fields/cells
    String recordWithEscapedCommentMarker = "San Francisco,California,Seattle,Washington";
    for (String cell: CSVParser.parse(record, format).getRecords().get(0)) {
      System.out.println(cell);
    }
  }
}
