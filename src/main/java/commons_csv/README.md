# commons_csv
This package contains classes I wrote to test the behavior of each of the parameters of the `CSVFormat` class in Apache Commons CSV (v1.8).  
The following `CSVFormat` parameters were tested:
* `withAllowDuplicateHeaderNames(boolean allowDuplicateHeaderNames)`
* `withAllowMissingColumnNames(boolean allowMissingColumnNames)`
* `withAutoFlush(boolean autoFlush)`
* `withCommentMarker(char commentMarker)`
* `withDelimiter(char delimiter)`
* `withEscape(char escape)`
* `withQuote(char quoteChar)`
* `withQuoteMode(QuoteMode quoteModePolicy)`
* `withNullString(String nullString)`
* `withRecordSeparator(String recordSeparator)`
* `withSystemRecordSeparator()`
* `withFirstRecordAsHeader()`
* `withHeader(String... header)`
* `withHeaderComments(Object... headerComments)`
* `withIgnoreEmptyLines(boolean ignoreEmptyLines)`
* `withIgnoreHeaderCase(boolean ignoreHeaderCase)`
* `withIgnoreSurroundingSpaces(boolean ignoreSurroundingSpaces)`
* `withSkipHeaderRecord(boolean skipHeaderRecord)`
* `withTrailingDelimiter(boolean trailingDelimiter)`
* `withTrim(boolean trim)`