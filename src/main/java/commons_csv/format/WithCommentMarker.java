package commons_csv.format;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;

public class WithCommentMarker {
  public static void main(String[] args) throws IOException {
    CSVFormat format = CSVFormat.DEFAULT;
    CSVFormat formatWithCommentMarker = CSVFormat.DEFAULT.withCommentMarker('\n');
    String records = "foo,bar,foobar\nfoo,bar,#foobar\n#foo,bar,foobar";  // the last line will be treated as a comment

    System.out.println(CSVParser.parse(records, format).getRecords());  //  3 records
    System.out.println(CSVParser.parse(records, formatWithCommentMarker).getRecords());  // only 2 records
  }
}
