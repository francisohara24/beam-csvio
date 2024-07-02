package example.csv_format;

import java.io.StringReader;

public class CSVFormat {
  public static void main(String[] args) {
    // What does withTrailingDelimiter() do?
    org.apache.commons.csv.CSVFormat format = org.apache.commons.csv.CSVFormat.DEFAULT.withTrailingDelimiter();
    StringReader input = new StringReader("a,b,c,")
  }
}
