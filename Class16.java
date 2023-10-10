class CCircle{ // 定義類別 CCircle
    private static double pi = 3.14; // 靜態圓周率常數
    private double radius; // 圓的半徑
    public CCircle(double r){// 建構元，用來設定圓的半徑
        radius = r;
    } 
    public void show(){ // 顯示圓的面積和半徑
        System.out.println("area = " + pi * radius * radius); // 顯示面積
        System.out.println("radius = " + radius); // 顯示半徑
    }
}
public class Class16{
    public static void main(String args[]){
        CCircle cir[];
        cir = new CCircle[6];
        for (int i = 0; i < cir.length; i++){// 建立6個CCircle物件，並呼叫show()方法顯示其面積和半徑
            cir[i] = new CCircle(i);
            cir[i].show();
        }
        // 重新指派cir陣列的前三個元素為新的CCircle物件
        cir[0] = new CCircle(1.0);
        cir[1] = new CCircle(4.0);
        cir[2] = new CCircle(2.0);
        // 利用物件呼叫show() method顯示新的圓的面積和半徑
        cir[0].show();
        cir[1].show();
        cir[2].show();
    }
}
