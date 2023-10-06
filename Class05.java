class CCount
{
    static int cnt = 0; // 靜態變數，用於追蹤物件創建的數量
    public CCount(){
        cnt++; // 建構元，每次物件創建時增加計數器
    }
    public void count(){
        System.out.println(cnt + " object(s) created"); // 顯示物件創建數量
    }
    static void setValue(int n) {
        cnt = n; // 靜態方法，用於設定物件計數器的值
    }
}
public class Class05{
    public static void main(String args[]){
        CCount a = new CCount(); // 創建第一個物件
        a.count(); // 顯示物件計數
        CCount b = new CCount(); // 創建第二個物件
        CCount c = new CCount(); // 創建第三個物件
        b.count(); // 顯示物件計數
        CCount.setValue(0); // 使用靜態方法設定物件計數為0
        c.count(); // 顯示物件計數，此時應該為0
    }
}

(D)類別變數，static修飾子加上成為類別變數，類別變數是每一個物件共享，因此會隨物件建立而累加
(E)實例函數，只要執行count() cnt變累加，如果是類別函數變成物件共用便無法執行。
