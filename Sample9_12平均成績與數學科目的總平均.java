//�d�ҵ{��9_12 Sample9_12.java �ܽd�p��ϥΤG���}�C�p��Ĥ@��ǥ�4�쪺�������Z�P�ƾǬ�ت��`����
//T.Q. LEE, 2009-07-30 in Kaoshiung
class Sample9_12�������Z�P�ƾǬ�ت��`����{
	public static void main(String args[ ]){
		int test[ ][ ] = {  { 90,100, 77, 60},
                    		    {100, 80, 75, 66},
                    		    { 85, 90,100, 70} };
      	//�D�Ĥ@��ǥͪ��`����
      		int total = 0,avg = 0 ;
      		for(int i = 0 ; i < test[0].length; i++){
         		total = total + test[0][i];
      		}
        	avg = total / test[0].length;
      		System.out.println("��1��ǥͪ��`������" + avg + "��");
      	//�D�Ҧ��ǥͪ��ƾǥ���
      	MathAvg(test);
    	}      
    	public static void MathAvg(int MA[ ][ ]){// �ǻ��G���}�C
        	int total = 0,avg = 0;
         	for(int j = 0 ; j < MA.length ; j++){
           		total = total + MA[j][1];
      		}
           	avg = total / MA.length;
        	System.out.println("�ƾǪ��`������" + avg + "��");
     	}
}