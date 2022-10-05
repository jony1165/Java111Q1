package javaexam;
class CBox        // �w�qCRectangle���O
{
	int length;
	int width;
	int height;
	int radius;
	double pi;
	void surfaceArea()   // 定義成員函數volume(), 用來計算體積
	   {
		System.out.println(radius*radius*pi*4/3);
		System.out.println(length*width*2+height*length*2+width*height*2);      // 傳回箱子的表面積
	   }
}
public class class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBox box;
		box=new CBox();
		box.length=4;
		box.width=5;
		box.height=6;
		box.radius=10;
		box.pi=3.14159;
		box.surfaceArea();
	}

}
