package ExcelUtil;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;

public class Test11 {
	
	
	//Map<String, String> ColumnsData = new HashMap<String, String>();

	//Map<String, String> ColumnsData = new HashMap<String, String>();
	
	Map<String, HashMap<String, String>> Datatable = new HashMap<String, HashMap<String, String>>();
	
	@Test
	public void Test1() throws Exception
	{
		
		ExcelApiTest4 eat = new ExcelApiTest4();
		
		Datatable=eat.getDataTable("C://HTML Report//OrangeHRM6//TC01_EMPExport4.xlsx", "Sheet1");
		
	
		//String TestURL=Datatable.get("TC01").get("UserName");
		
		System.out.println(Datatable.get("TC01").get("UserName"));
		System.out.println(Datatable.get("TC01").get("Password"));
		System.out.println(Datatable.get("TC01").get("Nationality"));
		System.out.println(Datatable.get("TC01").get("Skill"));
		
		System.out.println("----------------------------------------------");
		
		
		System.out.println(Datatable.get("TC02").get("UserName"));
		System.out.println(Datatable.get("TC02").get("Password"));
		System.out.println(Datatable.get("TC02").get("Nationality"));
		System.out.println(Datatable.get("TC02").get("Skill"));
		
		System.out.println("----------------------------------------------");
		
		System.out.println(Datatable.get("TC03").get("Nationality"));
		System.out.println(Datatable.get("TC03").get("UserName"));
		System.out.println(Datatable.get("TC03").get("Password"));
		System.out.println(Datatable.get("TC03").get("Skill"));	

		


	
	}

	

}
