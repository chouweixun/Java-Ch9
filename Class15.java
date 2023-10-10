class CCircle {// 定義類別 CCircle
    private static double pi = 3.14; // 靜態圓周率常數
    private double radius; // 圓的半徑
    public CCircle(double r){ // 建構元，用來設定圓的半徑  
        radius = r;
    }
    public static double compare(CCircle c[]){ // 靜態方法，比較多個圓中的最大半徑
        double max = 0.0;
        for (int i = 0; i < c.length; i++)
            if (c[i].radius > max)
                max = c[i].radius;
        return max; // 傳回最大半徑
    }
    public static double average(CCircle c[]){ // 靜態方法，計算多個圓的半徑平均值
        double avg = 0;
        for (int i = 0; i < c.length; i++)
            avg += c[i].radius;
        avg = avg / c.length; // 計算平均值
        return avg;
    }
}
public class Class15{
    public static void main(String args[]){
        CCircle Circle[];
        Circle = new CCircle[3];
        Circle[0] = new CCircle(1.0); // 創建半徑為1.0的圓
        Circle[1] = new CCircle(4.0); // 創建半徑為4.0的圓
        Circle[2] = new CCircle(2.0); // 創建半徑為2.0的圓
        System.out.println("Largest radius = " + CCircle.compare(Circle)); // 顯示最大半徑
        System.out.println("Average radius = " + CCircle.average(Circle)); // 顯示平均半徑
    }
}
