class Namecard {
    private String name;
    private String address;
    private Phone data;
    class Phone { // 巢狀 Phone 類別
        private String company;
        private String cell;
        public Phone(String s1, String s2) { // Phone 類別的建構元
            company = s1;
            cell = s2;
        }
    }
    public Namecard(String n, String addr, String company, String cell) { // Namecard 類別的建構元
        name = n;
        address = addr;
        data = new Phone(company, cell); // 建立 Phone 物件並初始化
    }
    public void show() { // 列印 Namecard 資訊的 show 函數
        System.out.println("好友姓名: " + name);
        System.out.println("聯絡地址: " + address);
        System.out.println("公司電話: " + data.company);
        System.out.println("手機號碼: " + data.cell);
    }
}
public class Class17 {
    public static void main(String args[]) {
        Namecard first = new Namecard("Andy", "123City", "2345-6789", "0911-336600"); // 建立 Namecard 物件 first
        first.show(); // 顯示 Namecard 資訊
    }
}
