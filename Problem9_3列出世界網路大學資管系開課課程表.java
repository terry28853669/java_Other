//Problem範例程式9_3：Problem9_3.java 使用方法，陣列列出世界網路大學資管系開課課程表
import java.io.*;
class Problem9_3列出世界網路大學資管系開課課程表{
   static void displayMenu(int courseNum[ ],String courseName[ ],String courseReq[ ],int courseCredit[ ],String courseTeacher[ ]){//定義一個void方法displayMenu()
        System.out.println("\t\t世界網路大學資管系開課課程表");
	System.out.println("\t\t----------------------------");
	System.out.println("課程代號\t課程名稱\t必選修\t\t學分\t\t授課老師");
	System.out.println("-------------------------------------------------------------------------");
	for (int i = 0;i <= courseNum.length-1;i++){
		System.out.println(courseNum[i] + "\t\t" + courseName[i] + "\t" + courseReq[i] + "\t\t" + courseCredit[i] + "\t\t" + courseTeacher[i]);		
	}
	System.out.println();
   }
   public static void main(String agrs[])throws IOException{
	int courseNum[ ] = { 201,202, 203, 204,205,206, 207, 208,209,210, 211, 212};
        String courseName[ ] = {"統計學1 ","會計學1 ","資料庫  ","資料結構","網路資源規劃","網頁設計","電子商務","網路行銷","作業系統","伺服器管理","視窗程式設計","網路安全"};             	  
	String courseReq[ ] = {"必","必","必","必","選","選","選","選","選","選","選","選"};             	  
	int courseCredit[ ] = { 3,3,3,3,3,3,3,3,3,3,3,3};
	String courseTeacher[ ] = {"董建郎","方志強","李廷圭","翁健二","蕭銘雄","胡舉軍","董信煌","蔡柏江","陳俊卿","蔡旭昇","許丕忠","張鐸"};             	  
	int sum = 0;
	int response = 0;
	String list = "";
	displayMenu(courseNum,courseName,courseReq,courseCredit,courseTeacher);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("請問你要選課嗎？如果要，請輸入1；如果不要，請輸入其他整數值？");
	response = Integer.parseInt(br.readLine());
	while(response == 1){
		System.out.println("除了4門必修課之外，請輸入你要修那一門選修課(輸入課程代號)？");
		int num = Integer.parseInt(br.readLine());
	if (num == 205){
		list = list + "205\t\t網路資源規劃\t選\t\t3\n";
		sum = sum + 3;
	}
	if (num == 206){
		list = list + "206\t\t網頁設計\t選\t\t3\n";
		sum = sum + 3;
	}
	if (num == 207){
		list = list + "207\t\t電子商務\t選\t\t3\n";
		sum = sum + 3;
	}
	if (num == 208){
		list = list + "208\t\t網路行銷\t選\t\t3\n";
		sum = sum + 3;
	}
	if (num == 209){
		list = list + "209\t\t作業系統\t選\t\t3\n";
		sum = sum + 3;
	}
	if (num == 210){
		list = list + "210\t\t伺服器管理\t選\t\t3\n";
		sum = sum + 3;
	}
	if (num == 211){
		list = list + "211\t\t視窗程式設計\t選\t\t3\n";
		sum = sum + 3;
	}
	if (num == 212){
		list = list + "212\t\t網路安全\t選\t\t3\n";
		sum = sum + 3;
	}
		System.out.println("請問你要選課嗎？如果要，請輸入1；如果不要，請輸入其他整數值？");
		response = Integer.parseInt(br.readLine());
	}
	System.out.println("選課清單:");
	System.out.println();
	System.out.println("課程代號\t課程名稱\t必選修\t\t學分");
	System.out.println("-----------------------------------------------------");
	System.out.println("201\t\t統計學1\t\t必\t\t3");
	System.out.println("202\t\t會計學1\t\t必\t\t3");
	System.out.println("203\t\t資料庫\t\t必\t\t3");
	System.out.println("204\t\t資料結構\t必\t\t3");	
	System.out.println(list);
	System.out.println("-----------------------------------------------------");
	sum = sum + 4*3;
	System.out.println("選修學分數合計:\t" + sum + "學分");
	}
}


