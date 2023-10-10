public class Class18 {
    public static void main(String args[]) {// 使用匿名內部類別建立 CCircle 物件
        CCircle circle = new CCircle(5.0);
        circle.show();// 呼叫 CCircle 物件的 show() 函數顯示圓的面積
    }
    static class CCircle {// 靜態內部類別 CCircle，表示圓形
        public double pi = 3.14; // 圓周率
        public double radius; // 半徑
    public CCircle(double r) {// CCircle 類別的建構元，用來初始化半徑
        radius = r;
    }
    public void show() {// 顯示圓的面積
        double area = pi * radius * radius; // 計算圓的面積
        System.out.println("圓面積:" + area); // 輸出圓的面積
        }
    }
}
