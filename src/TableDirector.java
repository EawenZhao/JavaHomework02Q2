import java.util.Scanner;

public class TableDirector<T extends TableBuilder> {
    private String tableHeader;
    private StringBuilder tableContents = new StringBuilder();
    private T builder;

    public TableDirector(T builder) {
        this.builder = builder;
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

        builder.appendHead(headerItems);
        for (String row : rows) {
            builder.appendRow(row.split(","));
        }

        System.out.println(builder.getTable());
    }
}
