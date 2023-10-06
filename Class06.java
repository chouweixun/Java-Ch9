class CAT
{
    static int w; // 靜態變數用於累計結果

    public static void add2n(int n)
    {
        for (int i = 0; i <= n; i++)
        {
            w = w + i; // 將 0 到 n 的數字相加並存儲在靜態變數 w 中
        }
        System.out.println("1+2+3+4+...=" + w); // 顯示結果
        w = 0; // 歸零以防止下一次呼叫時繼續累計
    }
}

public class Class06
{
    public static void main(String args[])
    {
        CAT.add2n(5); // 呼叫靜態方法並傳遞 n = 5
        CAT.add2n(10); // 呼叫靜態方法並傳遞 n = 10
    }
}
