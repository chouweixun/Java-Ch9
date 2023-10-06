class CRectangle
{
 int width;// 用於存儲矩形的寬度
 int height;// 用於存儲矩形的長度
 
 public CRectangle(int w,int h)// 帶參數的構造函數，用於初始化寬度和高度
 {
  width=w;
  height=h;
 }
 public CRectangle() // 無參數的構造函數，使用this關鍵字調用帶參數的構造函數，並初始化局部變數width和height
 {
  this(10,8);// 調用帶參數的構造函數，將寬度設置為10，高度設置為8
  int width;// 創建局部變數width
  int height;// 創建局部變數height
 }
    public void show()// 用於顯示矩形的寬度和高度的方法
    {
  System.out.println("width="+width);
  System.out.println("height="+height+"\n");
    }
}
  public class Class01
  {
   public static void main(String args[])
   {
  CRectangle aa=new CRectangle(8,6);//創建一個新的CRectangle對象，寬度為8，高度為6
   aa.show();// 調用show方法顯示寬度和高度
   CRectangle bb=new CRectangle();//創建一個新的CRectangle對象，使用默認值（寬度為10，高度為8）
   bb.show();// 調用show方法顯示寬度和高度
   }
  }
