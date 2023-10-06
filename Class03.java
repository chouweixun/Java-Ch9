class Caaa  // 定義類別Caaa
{
    private int value;

    public Caaa()
    {
        this(10); // 呼叫帶有參數的建構元，將value設定為10
        System.out.println("value=" + value);
    }

    public Caaa(int i)
    {
        value = i; // 將傳入的參數設定為value的值
        System.out.println("value=" + value);
    }
}

public class Class03
{
    public static void main(String args[])
    {
        Caaa obj1 = new Caaa();     // 建立Caaa物件，呼叫預設建構元，value被設定為10
        Caaa obj2 = new Caaa(12);   // 建立Caaa物件，呼叫帶有參數的建構元，value被設定為12
    }
}

(B)第21行是呼叫沒有引數的，第22行則是呼叫有引數的
(C) Caaa 類別不能宣告成public，因為一個檔案裡只能有一個 public 的類別
(D)可在其他類別呼叫 value所以並沒有影響。
