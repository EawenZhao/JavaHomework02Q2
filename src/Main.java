public class Main {
    public static void main(String[] args) {
        TableDirector<HTMLTableBuilder> htmlTableBuilderTableDirector = new TableDirector<>(HTMLTableBuilder.class);
        htmlTableBuilderTableDirector.dataScanner();
        htmlTableBuilderTableDirector.tableMaker();
    }
}