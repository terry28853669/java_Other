//Problem�d�ҵ{��9_3�GProblem9_3.java �ϥΤ�k�A�}�C�C�X�@�ɺ����j�Ǹ�ިt�}�ҽҵ{��
import java.io.*;
class Problem9_3�C�X�@�ɺ����j�Ǹ�ިt�}�ҽҵ{��{
   static void displayMenu(int courseNum[ ],String courseName[ ],String courseReq[ ],int courseCredit[ ],String courseTeacher[ ]){//�w�q�@��void��kdisplayMenu()
        System.out.println("\t\t�@�ɺ����j�Ǹ�ިt�}�ҽҵ{��");
	System.out.println("\t\t----------------------------");
	System.out.println("�ҵ{�N��\t�ҵ{�W��\t�����\t\t�Ǥ�\t\t�½ҦѮv");
	System.out.println("-------------------------------------------------------------------------");
	for (int i = 0;i <= courseNum.length-1;i++){
		System.out.println(courseNum[i] + "\t\t" + courseName[i] + "\t" + courseReq[i] + "\t\t" + courseCredit[i] + "\t\t" + courseTeacher[i]);		
	}
	System.out.println();
   }
   public static void main(String agrs[])throws IOException{
	int courseNum[ ] = { 201,202, 203, 204,205,206, 207, 208,209,210, 211, 212};
        String courseName[ ] = {"�έp��1 ","�|�p��1 ","��Ʈw  ","��Ƶ��c","�����귽�W��","�����]�p","�q�l�Ӱ�","������P","�@�~�t��","���A���޲z","�����{���]�p","�����w��"};             	  
	String courseReq[ ] = {"��","��","��","��","��","��","��","��","��","��","��","��"};             	  
	int courseCredit[ ] = { 3,3,3,3,3,3,3,3,3,3,3,3};
	String courseTeacher[ ] = {"���ح�","��ӱj","���ʦc","�ΰ��G","���ʶ�","�J�|�x","���H��","���f��","���T��","�����@","�\�A��","�i�M"};             	  
	int sum = 0;
	int response = 0;
	String list = "";
	displayMenu(courseNum,courseName,courseReq,courseCredit,courseTeacher);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("�аݧA�n��ҶܡH�p�G�n�A�п�J1�F�p�G���n�A�п�J��L��ƭȡH");
	response = Integer.parseInt(br.readLine());
	while(response == 1){
		System.out.println("���F4�����׽Ҥ��~�A�п�J�A�n�ר��@����׽�(��J�ҵ{�N��)�H");
		int num = Integer.parseInt(br.readLine());
	if (num == 205){
		list = list + "205\t\t�����귽�W��\t��\t\t3\n";
		sum = sum + 3;
	}
	if (num == 206){
		list = list + "206\t\t�����]�p\t��\t\t3\n";
		sum = sum + 3;
	}
	if (num == 207){
		list = list + "207\t\t�q�l�Ӱ�\t��\t\t3\n";
		sum = sum + 3;
	}
	if (num == 208){
		list = list + "208\t\t������P\t��\t\t3\n";
		sum = sum + 3;
	}
	if (num == 209){
		list = list + "209\t\t�@�~�t��\t��\t\t3\n";
		sum = sum + 3;
	}
	if (num == 210){
		list = list + "210\t\t���A���޲z\t��\t\t3\n";
		sum = sum + 3;
	}
	if (num == 211){
		list = list + "211\t\t�����{���]�p\t��\t\t3\n";
		sum = sum + 3;
	}
	if (num == 212){
		list = list + "212\t\t�����w��\t��\t\t3\n";
		sum = sum + 3;
	}
		System.out.println("�аݧA�n��ҶܡH�p�G�n�A�п�J1�F�p�G���n�A�п�J��L��ƭȡH");
		response = Integer.parseInt(br.readLine());
	}
	System.out.println("��ҲM��:");
	System.out.println();
	System.out.println("�ҵ{�N��\t�ҵ{�W��\t�����\t\t�Ǥ�");
	System.out.println("-----------------------------------------------------");
	System.out.println("201\t\t�έp��1\t\t��\t\t3");
	System.out.println("202\t\t�|�p��1\t\t��\t\t3");
	System.out.println("203\t\t��Ʈw\t\t��\t\t3");
	System.out.println("204\t\t��Ƶ��c\t��\t\t3");	
	System.out.println(list);
	System.out.println("-----------------------------------------------------");
	sum = sum + 4*3;
	System.out.println("��׾Ǥ��ƦX�p:\t" + sum + "�Ǥ�");
	}
}


