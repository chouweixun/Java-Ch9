class Data {
    private String name;
    private Test score;
    class Test { // 內部類別 Test，用於存儲英文和數學成績
        private int english;
        private int math;
        public Test(int eng, int m) { // Test 類別的建構元，用於設定英文和數學成績
            english = eng;
            math = m;
        }
        public double avg() {// 計算並傳回英文和數學成績的平均值
            return (english + math) / 2.0;
        }
    }
    public Data(String n, int eng, int math) {// Data 類別的建構元，用於設定學生姓名和成績
        name = n;
        score = new Test(eng, math); // 初始化 Test 物件
    }
    public void show() {// 顯示學生姓名、英文成績、數學成績和平均成績的函數
        System.out.println("學生姓名:" + name);
        System.out.println("英文成績:" + score.english);
        System.out.println("數學成績:" + score.math);
        System.out.println("平均成績:" + score.avg());
    }
}
public class Class19 {
    public static void main(String args[]) {
        Data stu = new Data("Annie", 85, 92);// 創建 Data 物件 stu 並呼叫 show() 方法
        stu.show();
    }
}
