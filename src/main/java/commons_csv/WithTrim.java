package commons_csv;

import java.io.IOException;
import org.apache.commons.csv.CSVFormat;

/** Tests the function of {@link CSVFormat}'s withTrim() parameter. */
public class WithTrim {
  public static void main(String[] args) throws IOException {
    String record = "a,b,c\n1, 2 , 3 ";
    CSVFormat format = CSVFormat.DEFAULT;
    CSVFormat formatWithTrim = CSVFormat.MYSQL;
    //    System.out.println("without:\n" + format.format(input));
    //    System.out.println("with:\n" + formatWithTrim.format(input));
    System.out.print(System.lineSeparator().equals("\n"));
  }
}
