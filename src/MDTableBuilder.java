public class MDTableBuilder implements TableBuilder {
    StringBuilder MDString = new StringBuilder();

    @Override
    public void appendHead(String[] items) {
        int columnCounter = 0;
        MDString.append("|");
        for (String string : items) {
            MDString.append(string).append("|");
            columnCounter++;
        }
        MDString.append("\n");
        for (int i = 0; i < columnCounter; i++) {
            MDString.append("|--");
        }
        MDString.append("|\n");
    }

    @Override
    public void appendRow(String[] items) {
        MDString.append("|");
        for (String string : items) {
            MDString.append(string).append("|");
        }
        MDString.append("\n");
    }

    @Override
    public StringBuilder getTable() {
        return this.MDString;
    }
}
