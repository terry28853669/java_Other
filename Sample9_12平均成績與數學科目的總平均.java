//範例程式9_12 Sample9_12.java 示範如何使用二維陣列計算第一位學生4科的平均成績與數學科目的總平均
//T.Q. LEE, 2009-07-30 in Kaoshiung
class Sample9_12平均成績與數學科目的總平均{
	public static void main(String args[ ]){
		int test[ ][ ] = {  { 90,100, 77, 60},
                    		    {100, 80, 75, 66},
                    		    { 85, 90,100, 70} };
      	//求第一位學生的總平均
      		int total = 0,avg = 0 ;
      		for(int i = 0 ; i < test[0].length; i++){
         		total = total + test[0][i];
      		}
        	avg = total / test[0].length;
      		System.out.println("第1位學生的總平均為" + avg + "分");
      	//求所有學生的數學平均
      	MathAvg(test);
    	}      
    	public static void MathAvg(int MA[ ][ ]){// 傳遞二維陣列
        	int total = 0,avg = 0;
         	for(int j = 0 ; j < MA.length ; j++){
           		total = total + MA[j][1];
      		}
           	avg = total / MA.length;
        	System.out.println("數學的總平均為" + avg + "分");
     	}
}