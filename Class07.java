class DOG{
    public static void power(int i, int j){
        System.out.println(Math.pow(i, j)); //平方
    }
}
public class Class07{
    public static void main(String args[]){
        DOG.power(2, 5); //呼叫power方法計算 2 的 5 次方，並顯示結果
        DOG.power(3, 2); //呼叫power方法計算 3 的 2 次方，並顯示結果
    }
}
