package commons_csv;

import org.apache.commons.csv.CSVFormat;

public class WithNullString {
  public static void main(String[] args) {
    CSVFormat format = CSVFormat.DEFAULT.withNullString("None");
    String record = "foo,bar,None";
    System.out.println(format.format(record));
  }
}
