class CRational{ // 分數類別
    public static int n; // 靜態分子
    public static int d; // 靜態分母
    public void setND(int num, int den){
        n = num; // 設定靜態分子
        d = den; // 設定靜態分母
    }
    public void setN(int num){ // 設定靜態分子
        n = num;
    }
    public void setD(int num){ // 設定靜態分母
        d = num;
    }
}
public class Class10b{
    public static void main(String args[]){
        CRational aaa = new CRational();
        aaa.setND(2, 5);
        show(aaa); // 呼叫show函式來顯示分數
    }
    public static void show(CRational obj){ // 引數為CRational類別的物件
        System.out.println(obj.n + "/" + obj.d); // 顯示分數
    }
}
