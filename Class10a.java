class CRational // 分數類別
{
    public int n; // 分子
    public int d; // 分母

    public void setND(int num, int den)
    {
        n = num; // 設定分子
        d = den; // 設定分母
    }

    public void setN(int num)
    {
        n = num; // 設定分子
    }

    public void setD(int num)
    {
        d = num; // 設定分母
    }

    public void show()
    {
        System.out.println(n + "/" + d); // 顯示分數
    }
}

public class Class10a
{
    public static void main(String args[])
    {
        CRational aaa = new CRational();
        aaa.setND(3, 5); // 設定分數的分子和分母
        aaa.show(); // 顯示分數
    }
}
