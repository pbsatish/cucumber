package CommonUtil;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OR {
	
	
	public static String  UserName="txtUsername";
	public static String  Password="//*[@id='txtPassword']";
	public static String  Loginbutton="//*[@id='btnLogin']";
	
	public static String Admin_id="menu_admin_viewAdminModule";
	
	public static String  Admin1="//*[@id='menu_admin_viewAdminModule']/b";
	public static String  Nationality="//*[@id='menu_admin_nationality']";
	
	
	public static String  Vamsi_UserName=" //*[@id='txtUsername']";
	public static String  Vamsi_password="//*[@id='txtPassword']";
	public static String  Vamsi_Login="//*[@id='btnLogin']";
	
	
	
	
	
	
	
	public static String raghu_username="//*[@id='txtUsername']";

	public static String raghu_passward="//*[@id='txtPassword']";

	public static String raghu_login="//*[@id='btnLogin']";

	public static String raghu_admin="//*[@id='menu_admin_viewAdminModule']/b";

	public static String raghu_nationality="//*[@id='menu_admin_nationality']";

	public static String raghu_add="//*[@id='btnAdd']";

	public static String raghu_name="//*[@id='nationality_name']";

	public static String raghu_save="//*[@id='btnSave']";
	public static String pavan_mercuryusername="//input[@name='userName']";
	public static String pavan_mercyrypwd="//input[@name='password']";
	public static String pavan_mercurylogin="//input[@name='login']";
	//public static String="//input[@name='password']";
	
	
	
	


	public static String pavan_EnterRoundtrip_OneWay="//input[@name='tripType' and  @value='oneway']";
	public static String pavan_Passengers_Count="//select [ @name='passCount' ]";
	
	public static String pavan_departingfrom="//select[@name='fromPort']";
	public static String pavan_departing_month="//select [  @name='fromMonth'] ";
	public static String pavan_departing_date="//select[@name='fromDay']";

	public static String pavan_arrivingin="//select[@name='toPort']";
	public static String pavan_return_month ="//select [  @name='toMonth'] ";
	public static String pavan_return_date="//select[@name='toDay']";
	public static String pavan_serviceclass="//input [  @name='servClass'  and  @value='Coach']";
	public static String pavan_airline="//select[@name='airline']";
	public static String pavan_continue="//input[@name='findFlights']";

	
	
	
	public static String Pavan1_username="//*[@id='txtUsername']";
	public static String Pavan1_Password= "//*[@id='txtPassword']";
	public static String Pavan1_Login = "//*[@id='btnLogin']";
	
public static String googlesearch="//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input";
public static String googlesearch_button="//*[@id='tsf']/div[2]/div/div[3]/center/input[1]";
public static String googleImage="//*[@id='hplogo']";


//Add Nationality startrs
public static String Pavan1_Admin="//*[@id='menu_admin_viewAdminModule']/b";
public static String Pavan1_Nationality="//*[@id='menu_admin_nationality']";
public static String Pavan1_Nationality_Add="//*[@id='btnAdd']";
public static String Pavan1_NationalityName="//*[@id='nationality_name']";
public static String Pavan1_NationalitySave="//*[@id='btnSave']";
//Add Nationality ends


	
	  
	  public static void highLightElement(WebDriver driver,WebElement element) {

		  try {
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("arguments[0].setAttribute('style','border: 3px solid red;');", element);
		   Thread.sleep(1000);
		   js.executeScript("arguments[0].style.border=''", element, "");
		   Thread.sleep(1000);
		  } catch (InterruptedException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		 }
	  

	
	
	
	
	
	
	
	
public static String sTargetTestCaseExcelPath="";	
public static String sTargetFolderPath="";	
public static String sTestCaseName="";	

//public static WebDriver driver ; 

//Pages
//1.MercuryFlightFinderPage  = MFFPage
//2.MercuryLoginPage  = MLPage
//3.SelectFlightPage = SFPage




// starts MercuryLoginPage by Sudhakar Date:12-Jan-2018
public static String MLPage_UserNameTextbox="//input[@type='text'and @name='userName']";
public static String MLPage_PasswordTextbox="//input[@type='password' and @name='password']";
public static String MLPage_SignInButton="//*[@name='login']";
//end MercuryLoginPage 


//Starts MercuryFlightFinderPage by Sudhakar Date:12-Jan-2018
public static String MFFPage_OneWayRadiobutton="//input[@type='radio'and @name='tripType' and @value='oneway' ]";
public static String MFFPage_RoundTripRadiobutton="//input[@type='radio'and @name='tripType' and @value='roundtrip' ]";



public static String MFFPage_PassengersCountListbox="//select[@name='passCount']";
public static String MFFPage_DepartingFromListbox="//select[@name='fromPort']";
public static String MFFPage_DepartingStartMonthListbox="//select[@name='fromMonth']";
public static String MFFPage_DepartingStartDateListbox="//select[@name='fromDay']";
public static String MFFPage_ArrivingIn="//select[@name='toPort']";
public static String MFFPage_ReturningEndMonthListbox="//select[@name='toMonth']";
public static String MFFPage_ReturningEndDateListbox="//select[@name='toDay']";
public static String MFFPage_EconomyclassRadioButton="//input[@type='radio' and @name='servClass' and @value='Coach']";
public static String MFFPage_BusinessclassRadioButton="//input[@type='radio' and @name='servClass' and @value='Business']";
public static String MFFPage_FirstClassRadioButton ="//input[@type='radio' and @name='servClass' and @value='First']";
public static String MFFPage_AirLineListbox ="//select[@name='airline']";
public static String MFFPage_ContinueButton ="//*[@name='findFlights']";
public static String MFFPage_SelectFlightImg ="//img[ @src='/images/masts/mast_flightfinder.gif' and @width='492' and @height='30']";
//End MercuryFlightFinderPage


//starts Mercury Select Flight Page by Sudhakar Date:12-Jan-2018
public static String SFPage_SelectFlightImg ="//img[ @src='/images/masts/mast_selectflight.gif' and @width='492' and @height='30']";
public static String SFPage_Continue_Click ="//input[@name='reserveFlights']";
//End Mercury Select Flight Page 

public static String BookFlightPage_FirstName ="//*[@name='passFirst0']";


public static String BookFlightPage_lastName ="//input[@name='passLast0']";
public static String BookFlightPage_meal1 ="//select[@name='pass.0.meal']";
public static String BookFlightPage_CardName ="//select[@name='creditCard']";
public static String BookFlightPage_CardNumber ="//input[@name='creditnumber']";
public static String BookFlightPage_expirymonth="//select [@name='cc_exp_dt_mn']";
public static String BookFlightPage_expiryyear="//select [@name='cc_exp_dt_yr']";
public static String BookFlightPage_SecurePurchase_Click="//input [@name='buyFlights']";



public static String Output_FlightConfirmation_Number = "(.//*[normalize-space(text()) and normalize-space(.)='CONTACT'])[1]/following::font[6]";
public static String Output_FlightBookingDate_Time="(.//*[normalize-space(text()) and normalize-space(.)='Departing'])[1]/preceding::b[1]";
public static String Output_DepartingDetails= "(.//*[normalize-space(text()) and normalize-space(.)='Departing'])[1]/following::td[1]";
public static String Output_ReturningDetails= "(.//*[normalize-space(text()) and normalize-space(.)='Returning'])[1]/following::td[1]";
public static String Output_PassengersDetails="(.//*[normalize-space(text()) and normalize-space(.)='Passengers'])[1]/following::td[1]";
public static String Output_BilledToDetails="(.//*[normalize-space(text()) and normalize-space(.)='Billed To'])[1]/following::p[1]";
public static String Output_DeliveryAddressDetails="(.//*[normalize-space(text()) and normalize-space(.)='Delivery Address (N/A for Ticketless Travel)'])[1]/following::p[1]";
public static String Output_TotalTaxes="(.//*[normalize-space(text()) and normalize-space(.)='Delivery Address (N/A for Ticketless Travel)'])[1]/following::font[9]";
//public static String Output_TotalPrice="(.//*[normalize-space(text()) and normalize-space(.)='$89 USD'])[1]/following::font[7]";
public static String Logout="//img[@src='/images/forms/Logout.gif']";





//public static String sTargetTestCaseExcelPath="";	
///public static String sTargetFolderPath="";	
//public static String sTestCaseName="";	

/*
public static String username_sendkey="//input[@id='txtUsername']";
public static String password_sendkey="//input[@id='txtPassword']";
public static String login_click="//input[@id='btnLogin']";
*/


//EMP EXPORT


public static String pim_focus="//a[@id='menu_pim_viewPimModule']";
public static String EMPlist_click="//a[@id='menu_pim_viewEmployeeList']";
public static String EMPcolumn="//*[@id='resultTable']/thead/tr/th";
public static String EMProws="//*[@id='resultTable']/tbody/tr/td[2]";

//*[@id="resultTable"]/thead/tr/th[1]

//ADMIN EXPORT

public static String ADMIN_focus="//a[@id='menu_admin_viewAdminModule']";


public static String ADMIN_USERMANAGEMENT_focus="//a[@id='menu_admin_UserManagement']";


public static String ADMIN_USERS_click="//a[@id='menu_admin_viewSystemUsers']";

public static String ADMIN_USERS_Add_click="//*[@id='btnAdd']";

public static String ADMIN_USERS_UserRole_Listbox="//*[@id='systemUser_userType']";

public static String ADMIN_USERS_EmpNAme_Sendkeys="//*[@id='systemUser_employeeName_empName']";

public static String ADMIN_USERS_UserNAme_Sendkeys="//*[@id='systemUser_userName']";

public static String ADMIN_USERS_Save_click="//*[@id='btnSave']";

public static String ADMIN_COLUMNS_click="//*[@id='resultTable']/thead/tr/th";

public static String ADMIN_ROWS_click="//*[@id='resultTable']/tbody/tr/td[2]";

//admin qualifications export
public static String ADMIN_FOCUS="//a[@id='menu_admin_viewAdminModule']";


public static String ADMIN_QUALIFICATIONS_FOCUS="//a[@id='menu_admin_Qualifications']";


public static String ADMIN_SKILLS_CLICK="//a[@id='menu_admin_viewSkills']";

public static String ADMIN_NUMOFCOLUMNS="//*[@id='recordsListTable']/thead/tr/th";

public static String ADMIN_NUMOFROWS="//*[@id='recordsListTable']/tbody/tr/td[2]";
//BooLEAN USERROLE
public static String Admin_focus="//a[@ id='menu_admin_viewAdminModule' ]";

public static String UserManagement_focus="//a[@id='menu_admin_UserManagement']";
public static String UserRole_Listbox="//select[@id='searchSystemUser_userType']";
public static String NoColumns="//*[@id='resultTable']/thead/tr/th";
public static String NoRows="//*[@id='resultTable']/tbody/tr/td[2]/a";
public static String search_click="//input[@id='searchBtn']";
//Pim Jobtitle Search



public static String Employee_focus="//a[@id='menu_pim_viewEmployeeList']";

public static String Jobtitle_listbox="//select[@id='empsearch_job_title']";
public static String Jobtitle_search_click="//input[@id='searchBtn']";

public static String PimColumns="//*[@id='resultTable']/thead/tr/th";
public static String PimRows="//*[@id='resultTable']/tbody/tr/td[2]";

//pimempidsearch
public static String Pim_focus1="//*[@id='menu_pim_viewPimModule']";
public static String emp_listclick="//*[@id='menu_pim_viewEmployeeList']";
public static String empid_sendkey="//*[@id='empsearch_id']";

public static String emp_searchclick="//*[@id='searchBtn']";

public static String empcoloumns="//*[@id='resultTable']/thead/tr/th";
public static String emprows="//*[@id='resultTable']/tbody/tr/td[2]";
public static String emp_name="//*[@id='empsearch_employee_name_empName']";



//boolean various search
public static String BSpimfocus="//a[@id='menu_pim_viewPimModule']";

public static String BSEMPCLICK="//a[@id='menu_pim_viewEmployeeList']";

public static String BSEMPNAMESENDKEY="//input[@id='empsearch_employee_name_empName' ] ";

public static String BSIDSENDKEY="//input [@id='empsearch_id']";

public static String BSJOBTITLELISTBOX="//select[@id='empsearch_job_title' ]";

public static String BSSEARCHCLICK="//input[@id='searchBtn' ]";

public static String BSCOLOUMNS="//*[@id='resultTable']/thead/tr/th";

public static String BSROWS="//*[@id='resultTable']/tbody/tr/td[1]";

//addemp
public static String Emp_Pim_focus1="//*[@id='menu_pim_viewPimModule']";
public static String Emp_list_focus="//*[@id='menu_pim_viewEmployeeList']";

public static String Emp_AddEmp_focus="//*[@id='menu_pim_addEmployee']";
public static String Emp_firstname_sendkey="//*[@id='firstName']";

public static String Emp_middlename_sendkey="//*[@id='middleName']";

public static String Emp_lastname_sendkey="//*[@id='lastName']";

public static String Emp_id_sendkey="//*[@id='employeeId']";

public static String Emp_save_click="//*[@id='btnSave']";

public static String Emp_pimadd_click="//input[@id='btnAdd']";







////////////////////



public static String username="//input[@id='txtUsername']";
public static String password="//input[@id='txtPassword'] ";
public static String login="//input[@id='btnLogin']";
//public static String admin="//a[@id='menu_admin_viewAdminModule']";

//PIM starts
public static String Home_MainMenu_PIM_click="//a[@id='menu_pim_viewPimModule']";

public static String PIM_Addemployee_click="//a[@id='menu_pim_addEmployee']";
//PIM ends


//Add employee starts


public static String firstname_sendkeys="//input[@id='firstName']";

public static String middlename_sendkeys="//input[@id='middleName']";

public static String lastname_sendkeys="//input[@id='lastName']";

public static String EmployeeId_defaultno="//input[@id='employeeId']";


public static String CreateLoginDetails_checkbox="//input[@id='chkLogin']";

public static String UserName_sendkeys="//input[@id='user_name']";

public static String Password_sendkeys="//input[@id='user_password']";

public static String ConfirmPassword_sendkeys="//input[@id='re_password']";

public static String Status_listbox="//select[@id='status']";

public static String save="//input[@id='btnSave']";

public static String Vacancies_Add_Backbutton_click="//input[@id='btnBack']";

//Add employee 


public static String Pim_focus="//*[@id='menu_pim_viewPimModule']";

public static String Employee_click="//*[@id='menu_pim_viewEmployeeList']";
public static String Employeename_click="//*[@id='empsearch_employee_name_empName']";
public static String Empserch_click="//*[@id='searchBtn']";


public static String Empcoloums="//*[@id='resultTable']/thead/tr/th";



//*[@id="resultTable"]/thead/tr/th[1]
//*[@id="resultTable"]/thead/tr/th[2]

public static String EmpRows="//*[@id='resultTable']/tbody/tr/td[5]";

//*[@id="resultTable"]/tbody/tr[1]/td[3]
//*[@id="resultTable"]/tbody/tr[2]/td[3]

//*[@id="resultTable"]/tbody/tr/td[3]

//Admin_Qualification Starts

public static String  Admin="//a[@id='menu_admin_viewAdminModule']";

public static String Qualification_Focus="//a[@id='menu_admin_Qualifications']";

public static String Qualification_skills_click="//a[@id='menu_admin_viewSkills']";

public static String Skills_Add="//input[@id='btnAdd']";

public static String AddSkill_Name="//input[@id='skill_name']";

public static String AddSkill_Description="//textarea[@id='skill_description']";

public static String AddSkill_Save="//input[@id='btnSave']";

public static String skillcoloumns="//*[@id='recordsListTable']/thead/tr/th";

public static String SkillRows="//*[@id='recordsListTable']/tbody/tr/td[2]";



//Leave starts
/*
public static String LE_Leave_focus="//*[@id='menu_leave_viewLeaveModule']";
public static String LE_Assignleave_focus=" //*[@id='menu_leave_assignLeave']";
public static String LE_Empnaqme_sendkey="//*[@id='assignleave_txtEmployee_empName']";
public static String LE_Leavetype_listbox="//*[@id='assignleave_txtLeaveType']";
public static String LE_Fromdate_sendkey="//*[@id='assignleave_txtFromDate']";
public static String LE_Todate_sendkey="/*[@id='assignleave_txtToDate']";
public static String LE_Comment_sendkey="//*[@id='assignleave_txtComment']";
public static String LE_Assign_click="//*[@id='assignBtn']";
public static String LE_Confirm_click="//*[@id='confirmOkButton']";
public static String LE_Leavelist_focus="//*[@id='menu_leave_viewLeaveList']";
public static String LE_All_checkbox="//*[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']";
public static String LE_search_click="//*[@id='btnSearch']";
public static String LE_No_coloumns="//*[@id='resultTable']/thead/tr/th";
public static String LE_No_Rows="//*[@id='resultTable']/tbody/tr/td[1]";


*/

public static String LL_From_SendKey="//*[@id='calFromDate']";

public static String Ll_Date_SendKey="//*[@id='calToDate']";

//public static String Ll_All_Checkbox="//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']";  
//*[@id="leaveList_chkSearchFilter_1"]


public static String Ll_All_SearchFilter3="//*[@id='leaveList_chkSearchFilter_3']";


//public static String Ll_All_Checkbox="//*[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']";
public static String Ll_All_Checkbox="//*[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']";
public static String Ll_Subunit_Listbox="//*[@id='leaveList_cmbSubunit']";
public static String Ll_Search="//*[@id='btnSearch']";
public static String Ll_colmns="//*[@id='resultTable']/thead/tr/th";
public static String Ll_rows="//*[@id='resultTable']/tbody/tr/td[1]";


//Leave Ends





//Mallika OR starts on March 24 starts



//LeaveList Export
public static String Leave_focus="//*[@id='menu_leave_viewLeaveModule']";
public static String Leavelist_click="//a[@id='menu_leave_viewLeaveList']";
public static String Leave_all_checkbox="//*[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']";
public static String Leave_search_click="//*[@id='btnSearch']";
public static String Leave_Num_columns="//*[@id='resultTable']/thead/tr/th";
public static String Leave_Num_rows="//*[@id='resultTable']/tbody/tr/td[2]";

public static String LE_Leave_focus="//*[@id='menu_leave_viewLeaveModule']";
public static String LE_Assignleave_focus=" //*[@id='menu_leave_assignLeave']";
public static String LE_Empnaqme_sendkey="//*[@id='assignleave_txtEmployee_empName']";
public static String LE_Leavetype_listbox="//*[@id='assignleave_txtLeaveType']";
public static String LE_Fromdate_sendkey="//*[@id='assignleave_txtFromDate']";
public static String LE_Todate_sendkey="/*[@id='assignleave_txtToDate']";
public static String LE_Comment_sendkey="//*[@id='assignleave_txtComment']";
public static String LE_Assign_click="//*[@id='assignBtn']";
public static String LE_Confirm_click="//*[@id='confirmOkButton']";
public static String LE_Leavelist_focus="//*[@id='menu_leave_viewLeaveList']";
public static String LE_All_checkbox="//*[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']";
public static String LE_search_click="//*[@id='btnSearch']";
public static String LE_No_coloumns="//*[@id='resultTable']/thead/tr/th";
public static String LE_No_Rows="//*[@id='resultTable']/tbody/tr/td[1]";

//public static String LE_Todate_sendkey="/*[@id='assignleave_txtToDate']";
//public static String LE_Comment_sendkey="//*[@id='assignleave_txtComment']";

//JobTitle 

public static String Job_focus="//a[@id='menu_admin_Job']";
public static String Jobtitle_click="//a[@id='menu_admin_viewJobTitleList']";
public static String Jobtitle_add="//*[@id='btnAdd']";
public static String Jobtitle_delete="//*[@id='btnDelete']";
public static String Jobtitle_columns="//*[@id='resultTable']/thead/tr/th";
public static String Jobtitle_rows="//*[@id='resultTable']/tbody/tr/td[2]";
public static String Jobtitle_new="//*[@id='jobTitle_jobTitle']";
public static String Job_description="//*[@id='jobTitle_jobDescription']";
public static String Job_note="//*[@id='jobTitle_note']";
public static String Job_savebtn="//*[@id='btnSave']";
public static String Jobtitle_delConfirmBtn="//*[@id='dialogDeleteBtn']";

public static String username_sendkey="//input[@id='txtUsername']";
public static String password_sendkey="//input[@id='txtPassword']";
public static String login_click="//input[@id='btnLogin']";


//Mallika OR starts on March 24 starts


//pim empiddelete starts

public static String PIM_focus="//*[@id='menu_pim_viewPimModule']";
public static String PIM_emplist_focus="//*[@id='menu_pim_viewEmployeeList']";
public static String PIM_add_click="//*[@id='btnAdd']";


public static String PIM_firstname_sendkeys="//*[@id='firstName']";
public static String PIM_lastname_sendkeys="//*[@id='lastName']";
public static String PIM_empid_sendkeys="//*[@id='employeeId']";

public static String PIM_save_click="//*[@id='btnSave']";

public static String PIM_empidserch_sendkeys="//*[@id='empsearch_id']";


public static String PIM_serch_click="//*[@id='searchBtn']";
public static String PIM_coloums="//*[@id='resultTable']/thead/tr/th";
public static String PIM_rows="//*[@id='resultTable']/tbody/tr/td[1]";
public static String PIM_checkbox_click="//*[@id='ohrmList_chkSelectRecord_28']";
public static String PIM_delete_click="//*[@id='btnDelete']";
public static String PIM_delete_conf_click="//*[@id='dialogDeleteBtn']";

//pim empiddelete ends

public static String Nationality_link= "//*[@id='menu_admin_nationality']";

public static String Nationality_add = "//*[@id='btnAdd']";


public static String Nationality_sendkeys="//*[@id='nationality_name']";


public static String Nationality_click= "//*[@id='btnSave']";



}















