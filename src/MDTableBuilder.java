public class MDTableBuilder implements TableBuilder {
    StringBuilder MDString = new StringBuilder();

    @Override
    public void appendHead(String[] items) {
        MDString.append("|");
        for (String string : items) {
            MDString.append(string).append("|");
        }
        MDString.append("\n");
        MDString.append("|--|--|--|");
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
