public class HTMLTableBuilder implements TableBuilder {
    StringBuilder HTMLString = new StringBuilder();

    @Override
    public void appendHead(String[] items) {
        HTMLString.append("<tr>");
        for (String string : items) {
            HTMLString.append("<th>").append(string).append("</th>").append("\n");
        }
        HTMLString.append("</tr>");
    }

    @Override
    public void appendRow(String[] items) {
        HTMLString.append("<tr>");
        for (String string : items) {
            HTMLString.append("<td>").append(string).append("</td>").append("\n");
        }
        HTMLString.append("</tr>");
    }

    @Override
    public StringBuilder getTable() {
        return this.HTMLString;
    }
}
