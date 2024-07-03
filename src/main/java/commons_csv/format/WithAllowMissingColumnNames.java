package commons_csv.format;

import org.apache.commons.csv.CSVFormat;

public class WithAllowMissingColumnNames {
  CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames();

}
