import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TableDirector<T extends TableBuilder> {
    private String tableHeader;
    private StringBuilder tableContents = new StringBuilder();
    T type;

    public TableDirector(Class<T> tableClass) {
        try {
            type = tableClass.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public void dataScanner() {
        System.out.println("Please enter the Header (EXIT to finish):");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("EXIT")) {
            return;
        }
        tableHeader = input;

        System.out.println("Please enter the Contents (EXIT to finish):");
        while (true) {
            input = scanner.nextLine();
            if (input.equals("EXIT")) {
                break;
            }
            tableContents.append(input).append("\n");
        }
    }

    public void tableMaker() {
        String[] headerItems = tableHeader.split(",");
        String[] rows = tableContents.toString().split("\n");

        type.appendHead(headerItems);
        for (String row : rows) {
            type.appendRow(row.split(","));
        }

        System.out.println(type.getTable());
    }
}
