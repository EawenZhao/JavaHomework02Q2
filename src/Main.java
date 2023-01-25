public class Main {
    public static void main(String[] args) {
        TableDirector<HTMLTableBuilder> htmlBuilder = new TableDirector<>(HTMLTableBuilder.class);
        htmlBuilder.dataScanner();
        htmlBuilder.tableMaker();
    }
}