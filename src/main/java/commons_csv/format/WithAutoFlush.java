package commons_csv.format;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

public class WithAutoFlush {
  public static void main(String[] args) throws IOException {
    CSVFormat format = CSVFormat.DEFAULT.withAutoFlush(false);
    OutputStream outputStream = System.out;
    CSVPrinter printer = new CSVPrinter(System.out, format);

    // Write a record
    printer.printRecord("foo", "bar");

    // Throw exception before the output stream is flushed or closed
    System.out.println("Throwing exception!");
    throw new RuntimeException("Unexpected error!");

    // Outcome: Because the output stream was not closed or flushed before the exception was thrown,
    //          there is a possibility that some characters in the record were not written to the outputStream but got
    //          stuck in a buffer.
  }
}
