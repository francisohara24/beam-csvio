package commons_csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;

public class WithDelimiter {
  public static void main(String[] args) throws IOException {
    CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');
    String recordWithDelimiter = "foo;bar;foobar";  // record with 3 fields/cells
    String recordWithoutDelimiter = "foo,bar,foobar";  // record with 1 field/cell

    System.out.println(CSVParser.parse(recordWithDelimiter, format).getRecords());
    System.out.println(CSVParser.parse(recordWithoutDelimiter, format).getRecords());
  }
}
