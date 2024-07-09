package commons_csv;

import org.apache.commons.csv.CSVFormat;

import java.io.IOException;

public class WithHeaderComments {
  public static void main(String[] args) throws IOException {
    CSVFormat format = CSVFormat.DEFAULT.withHeader("column1", "column2").withCommentMarker('#').withHeaderComments("This is the first header comment.","This is the second header comment.");

    // Two header comments will be printed before the header and CSV records.
    System.out.println(format.format("foo", "bar"));
  }
}
