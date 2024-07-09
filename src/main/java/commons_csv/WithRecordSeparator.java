package commons_csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;

public class WithRecordSeparator {
  public static void main(String[] args) throws IOException {
    // The record separator specified will only affect printing but not parsing.
    CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator(";");
    String recordsWithLineBreak1 = "1,2,3\nfoo,bar,foobar\nSeattle,New York,Boston";
    String recordsWithLineBreak2 = "1,2,3\rfoo,bar,foobar\rSeattle,New York,Boston";
    String recordsWithLineBreak3 = "1,2,3\r\nfoo,bar,foobar\r\nSeattle,New York,Boston";
    String recordsWithSpecifiedSeparator = "1,2,3;foo,bar,foobar;Seattle,New York,Boston";

    // Parsing the records
    System.out.println("Parsing Results:");
    System.out.println("RecordsWithLineBreak1:" + CSVParser.parse(recordsWithLineBreak1, format).getRecords());  // 3 records
    System.out.println("RecordsWithLineBreak2:" + CSVParser.parse(recordsWithLineBreak2, format).getRecords());  // 3 records
    System.out.println("RecordsWithLineBreak3:" + CSVParser.parse(recordsWithLineBreak3, format).getRecords());  // 3 records
    System.out.println("RecordsWithSpecifiedSeparator:" + CSVParser.parse(recordsWithSpecifiedSeparator, format).getRecords());  // only 1 record since separator ";" was not recognized

    // Printing the records
    System.out.println("\nPrinting Results:");
    System.out.println("RecordsWithLineBreak1:\n" + format.format(recordsWithLineBreak1));  // 3 records delimited by ";"
    System.out.println("RecordsWithLineBreak2:\n" + format.format(recordsWithLineBreak2));  // 3 records delimited by ";"
    System.out.println("RecordsWithLineBreak3:\n" + format.format(recordsWithLineBreak3));  // 3 records delimited by ";"
    System.out.println("RecordsWithSpecifiedSeparator:\n" + format.format(recordsWithSpecifiedSeparator));  // only 1 record delimited by ";"
    CSVFormat format2 = CSVFormat.DEFAULT;
  }
}
