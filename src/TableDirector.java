import java.util.Scanner;

public class TableDirector {
    private String tableHeader;
    private StringBuilder tableContents = new StringBuilder();


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
        System.out.println("Which kind of forms would you like to make?\n" +
                "1. HTML\n" +
                "2. MarkDown\n");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "1": {
                HTMLTableBuilder htmlTableBuilder = new HTMLTableBuilder();
                htmlTableBuilder.appendHead(headerItems);
                for (String row : rows) {
                    htmlTableBuilder.appendRow(row.split(","));
                }
                System.out.println(htmlTableBuilder.getTable());
                break;
            }
            case "2": {
                MDTableBuilder mdTableBuilder = new MDTableBuilder();
                mdTableBuilder.appendHead(headerItems);
                for (String row : rows) {
                    mdTableBuilder.appendRow(row.split(","));
                }
                System.out.println(mdTableBuilder.getTable());
                break;
            }
            default:
        }

    }
}
