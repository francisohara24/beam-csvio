package commons_csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;

public class WithIgnoreEmptyLines {
  public static void main(String[] args) throws IOException {
    CSVFormat formatWithoutIgnoreEmptyLines = CSVFormat.newFormat(',').withIgnoreEmptyLines(false);
    CSVFormat formatWithIgnoreEmptyLines = CSVFormat.newFormat(',').withIgnoreEmptyLines(true);
    String recordWithEmptyLine = "foo,bar,baz\n\n1,2,3";

    // Will result in two CSV records since empty line is ignored
    System.out.println(CSVParser.parse(recordWithEmptyLine,formatWithIgnoreEmptyLines).getRecords());

    // Will result in 3 CSV records where the middle CSV record is completely empty.
    System.out.println(CSVParser.parse(recordWithEmptyLine, formatWithoutIgnoreEmptyLines).getRecords());
  }
}
