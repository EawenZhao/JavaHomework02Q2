public class Main {
    public static void main(String[] args) {
        TableDirector<MDTableBuilder> mdBuilder = new TableDirector<>(new MDTableBuilder());
        mdBuilder.dataScanner();
        mdBuilder.tableMaker();
    }
}