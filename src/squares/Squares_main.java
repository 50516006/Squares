package squares;
//データ　x={0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1.0,1.1,1.2,1.3,1.4,1.5,1.6};
//     y={  0,  1,  4,  9, 11, 14, 17, 19, 21, 22, 24, 25, 27, 29, 30, 31};
//傾き_Excel  = 2.2135 
//   _計算結果=-1.2109848275099422E29
//切片_Excwl = -0.3
//   _計算結果=-1.2581720574706781E29
public class Squares_main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
double x[]={0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1.0,1.1,1.2,1.3,1.4,1.5,1.6};
double y[]={  0,  1,  4,  9, 11, 14, 17, 19, 21, 22, 24, 25, 27, 29, 30, 31};
double theta[]= new double[2];

Squares_lib slib=new Squares_lib(x,y);
for(int i = 0; i < 100; i++){
	theta = slib.getDx();
	System.out.println(i+" : theta[0] = "+theta[0]);
	System.out.println(i+" : theta[1] = "+theta[1]);
	System.out.println(i+" : Objective function = "+slib.getRx());
}

	}

}
