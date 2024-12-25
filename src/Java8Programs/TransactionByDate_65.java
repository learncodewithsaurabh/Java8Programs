package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Q65. How to find the sum of transaction amounts for each day from a given list of transactions and sort them by date
    using the Java 8 Streams API?
    Sample Input: A list of transactions where each transaction contains a date and an amount:
                          Date         Amount
                        2024-12-23      100
                        2024-12-24      200
                        2024-12-25      300
                        2024-12-23      400
                        2024-12-24      500 */
class TransactionRecord {
    private String date;
    private int amount;

    public TransactionRecord(String date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }
}

public class TransactionByDate_65 {
    public static void main(String[] args) {
        List<TransactionRecord> transactionRecord = Arrays.asList(
            new TransactionRecord("2024-12-23",100),
            new TransactionRecord("2024-12-24",200),
            new TransactionRecord("2024-12-25",300),
            new TransactionRecord("2024-12-24",400),
            new TransactionRecord("2024-12-25",500)
        );

        Map<String, Integer> sumByDate = transactionRecord.stream()
            .collect(
            Collectors.groupingBy(TransactionRecord::getDate,
            Collectors.summingInt(TransactionRecord::getAmount)
              ));

      //  sumByDate.forEach((date,amnt)-> System.out.println(date+": "+amnt));

        System.out.println("Date\t\tAmount");
        sumByDate.entrySet().stream()
                                  .sorted(Map.Entry.comparingByKey())
                                   .forEach(e-> System.out.println(e.getKey()+": "+e.getValue()));


    }
}
