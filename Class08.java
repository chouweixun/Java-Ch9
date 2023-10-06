class CWin{
    private static int cnt; // 靜態變數，用於追蹤物件創建的數量
    static String color;
    static int width;
    static int height;
    public static void count(){
        cnt = cnt + 1; // 增加物件計數
        System.out.println(cnt + " objects");
    }
    // 這是一個靜態方法，用於設定物件的顏色、寬度和高度
    public static void setCWin(String str, int w, int h){
        color = str;
        width = w;
        height = h;
    }
    // 這是一個靜態方法，用於設定預設的顏色、寬度和高度
    public static void setDefaultCWin(){
        color = "red";
        width = 2;
        height = 2;
    }
    public static void setZero(){
        cnt = 0; // 歸零物件計數
        System.out.println(cnt + " objects");
    }

    public static void setValue(int n){
        cnt = n; // 設定物件計數為給定值
    }
}
public class Class08{
    public static void main(String args[]){
        CWin a = new CWin();
        CWin.count(); // 計數並顯示物件數量
        CWin b = new CWin();
        CWin.count(); // 計數並顯示物件數量
        CWin.setZero(); // 設定物件計數為零並顯示物件數量
    }
}

(F)類別函數，如果不是無法累加。
(G)實例函數，只要執行count() cnt變累加，如果是類別函數變成物件共用便無法執行。
