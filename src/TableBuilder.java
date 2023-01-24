public interface TableBuilder {
    void appendHead(String[] items); // items为表头的各项// items为表头的各项
    void appendRow(String[] items);  // items为一条记录的各项
    StringBuilder getTable(); //返回表格字符串
}


