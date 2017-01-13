package Reusable;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

 


public class Assertion_Test  {
 	public Repo_Test Robj;
	public WebDriver driver;

 	public Assertion_Test(WebDriver driver) throws IOException {
		this.driver=driver;
 		Robj = new Repo_Test(driver);
	}
	Properties prop;
	//String  path = System.getProperty("user.dir") + "\\TestData\\UI.properties";
	//ObjectMap_Test123 objMap = new ObjectMap_Test123(path);

	//Signup_assertion
		public static  String Ex_sign_assert;
		public static  String Act_sign_assert;
		public  void sign_up_assertion()  throws Exception 
		{ 
			//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
			Act_sign_assert=Robj.signupassert().getText();
			Ex_sign_assert="**Business accounts are subscription based";
			Assert.assertEquals(Act_sign_assert,Ex_sign_assert);
			System.out.println("	# Validation == PASS :: Home Text is present");			
		}
	
	//DNM user_assertion
		public static  String Ex_dnmuser_assert;
		public static  String Act_dnmuser_assert;
		public  void dnmuser_assertion()  throws Exception 
		{ 
			//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
			Act_dnmuser_assert=Robj.dnmuserassert().getText();
			Ex_dnmuser_assert="INDIVIDUAL REGISTRATION";
			Assert.assertEquals(Act_dnmuser_assert,Ex_dnmuser_assert);
			System.out.println("	# Validation == PASS :: Home Text is present");			
		}
	
	//After login assertion
		public static  String Ex_logout_assert;
		public static  String Act_logout_assert;
		public  void logout_assertion()  throws Exception 
		{ 
			//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
			Act_logout_assert=Robj.logoutbutton().getText();
			Ex_logout_assert="LOG OUT";
			Assert.assertEquals(Act_logout_assert,Ex_logout_assert);
			System.out.println("	# Validation == PASS :: 'LOG OUT' Text is present");
			
		}
		
		//Business registration page assertion
		public static  String Ex_businesspage;
		public static  String Act_businesspage;
		public  void businesspage_assertion()  throws Exception 
		{ 
			//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
			Act_businesspage=Robj.businesspage().getText();
			Ex_businesspage="BUSINESS REGISTRATION";
			Assert.assertEquals(Act_businesspage,Ex_businesspage);
			System.out.println("	# Validation == PASS :: 'Business registration' Text is present");		
		}
		
		//Business registration page assertion
				public static  String Ex_payinfo;
				public static  String Act_payinfo;
				public  void payinfo_assertion()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_payinfo=Robj.payinfoassert().getText();
					Ex_payinfo="Payment information";
					Assert.assertEquals(Act_payinfo,Ex_payinfo);
					System.out.println("	# Validation == PASS :: 'Payment information' Text is present");		
				}
		        //User Content Recipes popup assertion
				public static  String Ex_Recipes;
				public static  String Act_Recipes;
				public  void Recipes_assertion()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_Recipes=Robj.createrecipespopup().getText();
					Ex_Recipes="Create Recipe";
					Assert.assertEquals(Act_Recipes,Ex_Recipes);
					System.out.println("	# Validation == PASS :: 'Create Recipe' Text is present");		
				}
				//User Content edit picture assertion
				public static  String Ex_edit;
				public static  String Act_edit;
				public  void edit_assertion()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_edit=Robj.editarea().getText();
					Thread.sleep(500);
					Ex_edit="Classic Shortbread(Picture For test purpose)Edited";
					Assert.assertEquals(Act_edit,Ex_edit);
					System.out.println("	# Validation == PASS :: 'Classic Shortbread(Only For test purpose)Edited' Text is present");		
				}
				
				//User Content edit Video assertion
				public static  String Ex_edit2;
				public static  String Act_edit2;
				public  void edit_assertion2()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_edit2=Robj.editarea().getText();
					Thread.sleep(500);
					Ex_edit2="Classic Shortbread(Video For test purpose)Edited";
					Assert.assertEquals(Act_edit2,Ex_edit2);
					System.out.println("	# Validation == PASS :: 'Classic Shortbread(Video For test purpose)Edited' Text is present");		
				}
				
				//User Content edit Recipe assertion
				public static  String Ex_edit3;
				public static  String Act_edit3;
				public  void edit_assertion3()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_edit3=Robj.editarea().getText();
					Thread.sleep(500);
					Ex_edit3="Classic Shortbread(Recipe For test purpose)Edited";
					Assert.assertEquals(Act_edit3,Ex_edit3);
					System.out.println("	# Validation == PASS :: 'Classic Shortbread(Recipe For test purpose)Edited' Text is present");		
				}
				
				//User Content edit Tutorials assertion
				public static  String Ex_edit4;
				public static  String Act_edit4;
				public  void edit_assertion4()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_edit4=Robj.editarea().getText();
					Thread.sleep(500);
					Ex_edit4="Classic Shortbread(Tutorials For test purpose)Edited";
					Assert.assertEquals(Act_edit4,Ex_edit4);
					System.out.println("	# Validation == PASS :: 'Classic Shortbread(Tutorials For test purpose)Edited' Text is present");		
				}
				
				
				
				
				
				
				
				
				//User Content delete picture assertion
				public static  String Ex_delete_pic;
				public static  String Act_delete_pic;
				public  void edit_delete_pic()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_delete_pic=Robj.editarea().getText();
					Thread.sleep(500);
					Ex_delete_pic="Classic Shortbread(Picture For test purpose)Edited";
					Assert.assertNotEquals(Act_delete_pic,Ex_delete_pic);
					System.out.println("	# Validation == PASS :: 'Classic Shortbread(Picture For test purpose)' Text is present");		
				}
				
				//User Content delete video assertion
				public static  String Ex_delete_vid;
				public static  String Act_delete_vid;
				public  void edit_delete_vid()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_delete_vid=Robj.editarea().getText();
					Thread.sleep(500);
					Ex_delete_vid="Classic Shortbread(Video For test purpose)";
					Assert.assertNotEquals(Act_delete_vid,Ex_delete_vid);
					System.out.println("	# Validation == PASS :: 'Classic Shortbread(Video For test purpose)' Text is present");		
				}
				
				//User Content delete Recipe assertion
				public static  String Ex_delete_rec;
				public static  String Act_delete_rec;
				public  void edit_delete_rec()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_delete_rec=Robj.editarea().getText();
					Thread.sleep(500);
					Ex_delete_rec="Classic Shortbread(Video For test purpose)";
					Assert.assertNotEquals(Act_delete_rec,Ex_delete_rec);
					System.out.println("	# Validation == PASS :: 'Classic Shortbread(Recipe For test purpose)' Text is present");		
				}
				
				//User Content delete tutorials assertion
				public static  String Ex_delete_tu;
				public static  String Act_delete_tu;
				public  void edit_delete_tu()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_delete_tu=Robj.editarea().getText();
					Thread.sleep(500);
					Ex_delete_tu="Classic Shortbread(Tutorials For test purpose)";
					Assert.assertNotEquals(Act_delete_tu,Ex_delete_tu);
					System.out.println("	# Validation == PASS :: 'Classic Shortbread(Recipe For test purpose)' Text is present");		
				}
				
				
				
				
				
				
				
				
				
				
				
				//User Content edit assertion
				public static  String Ex_add;
				public static  String Act_add;
				public  void add_assertion()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_add=Robj.addassert().getText();
					Ex_add="Recipe created successfully";
					Assert.assertEquals(Act_add,Ex_add);
					System.out.println("	# Validation == PASS :: 'Recipe created successfully' Text is present");		
				}
				
				//User Content edit assertion
				public static  String Ex_tutorials;
				public static  String Act_tutorials;
				public  void tutorials_assertion()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_tutorials=Robj.addassert().getText();
					Ex_tutorials="Tutorial created successfully";
					Assert.assertEquals(Act_tutorials,Ex_tutorials);
					System.out.println("	# Validation == PASS :: 'Tutorial created successfully' Text is present");		
				}
				
				//User Content updated assertion
				public static  String Ex_updated;
				public static  String Act_updated;
				public  void updated()throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_updated=Robj.addassert().getText();
					Ex_updated="Recipe updated";
					Assert.assertEquals(Act_add,Ex_add);
					System.out.println("	# Validation == PASS :: 'Recipe updated' Text is present");		
				}
				//User Content forgot password message assertion
				public static  String Ex_forgotpwdassert;
				public static  String Act_forgotpwdassert;
				public  void forgotpwdassert_assertion()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_forgotpwdassert=Robj.forgotpwdassert().getText();
					Ex_forgotpwdassert="Please check your email";
					Assert.assertEquals(Act_forgotpwdassert,Ex_forgotpwdassert);
					System.out.println("	# Validation == PASS :: 'Please check your email' Text is present");		
				}
				
				//User Content forgot password message assertion
				public static  String Ex_businessconfirm;
				public static  String Act_businessconfirm;
				public  void businessconfirm_assertion()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_businessconfirm=Robj.businessconfirm().getText();
					Ex_businessconfirm="Business info was updated";
					Assert.assertEquals(Act_businessconfirm,Ex_businessconfirm);
					System.out.println("	# Validation == PASS :: 'Business info was updated' Text is present");		
				}
				
				//User Content forgot password message assertion
				public static  String Ex_fbassert;
				public static  String Act_fbassert;
				public  void fbassert_assertion()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_fbassert=Robj.fbassert().getText();
					Ex_fbassert="FoodNiche";
					Assert.assertEquals(Act_fbassert,Ex_fbassert);
					System.out.println("	# Validation == PASS :: 'FoodNiche' Text is present");		
				}
				
				//User After logout assertion
				public static  String Ex_login_assert;
				public static  String Act_login_assert;
				public  void login_assert_assertion()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_login_assert=Robj.signwithemail().getText();
					Ex_login_assert="SIGN IN";
					Assert.assertEquals(Act_login_assert,Ex_login_assert);
					System.out.println("	# Validation == PASS :: 'SIGN IN' Text is present");		
				}
				
				//User NEXT button assertion
				public static  String Ex_next_assert;
				public static  String Act_next_assert;
				public  void next_assert_assertion()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_next_assert=Robj.nextbutton().getText();
					Ex_next_assert="NEXT";
					Assert.assertEquals(Act_next_assert,Ex_next_assert);
					System.out.println("	# Validation == PASS :: 'SIGN IN' Text is present");		
				}
				
				//User Registration page upper button assertion
				public static  String Ex_userregistration_assert;
				public static  String Act_userregistration_assert;
				public  void userregistration_assert_assertion()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_userregistration_assert=Robj.userregistration().getText();
					Ex_userregistration_assert="What will you like to do?";
					Assert.assertEquals(Act_userregistration_assert,Ex_userregistration_assert);
					System.out.println("	# Validation == PASS :: 'What will you like to do?' Text is present");		
				}
				
				//User step3 assertion
				public static  String Ex_step3assert;
				public static  String Act_step3assert;
				public  void step3assert()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_step3assert=Robj.step3assert().getText();
					Ex_step3assert="Follow 4 or 5 groups to get started!";
					Assert.assertEquals(Act_step3assert,Ex_step3assert);
					System.out.println("	# Validation == PASS :: 'Follow 4 or 5 groups to get started!' Text is present");		
				}
				
				//User signin assertion
				public static  String Ex_signinassert;
				public static  String Act_signinassert;
				public  void signinassertassert()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_signinassert=Robj.signwithemail().getText();
					Ex_signinassert="SIGN IN";
					Assert.assertEquals(Act_signinassert,Ex_signinassert);
					System.out.println("	# Validation == PASS :: 'SIGN IN' Text is present");		
				}
				
				//User step3 assertion
				public static  String Ex_restorepassword;
				public static  String Act_restorepassword;
				public  void restorepasswordassert()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_restorepassword=Robj.restorepassword().getText();
					Ex_restorepassword="Restore password";
					Assert.assertEquals(Act_restorepassword,Ex_restorepassword);
					System.out.println("	# Validation == PASS :: 'Restore password' Text is present");		
				}
				
				//User Content Name assertion
				public static  String Ex_postcontent;
				public static  String Act_postcontent;
				public  void postcontentassert()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_postcontent=Robj.contentname().getText();
					Ex_postcontent="JOAN P.";
					Assert.assertEquals(Act_postcontent,Ex_postcontent);
					System.out.println("	# Validation == PASS :: 'JOAN P.' Text is present");		
				}
				//User Content Name assertion
				public static  String Ex_addpost;
				public static  String Act_addpost;
				public  void addpost()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_addpost=Robj.editassert().getText();
					Ex_addpost="Feed created successfully";
					Assert.assertEquals(Act_addpost,Ex_addpost);
					System.out.println("	# Validation == PASS :: 'Feed created successfully' Text is present");		
				}
				//User tutorial pop up assertion
				public static  String Ex_tutorial;
				public static  String Act_tutorial;
				public  void tutorial()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_tutorial=Robj.createrecipespopup().getText();
					Ex_tutorial="Create Tutorial";
					Assert.assertEquals(Act_tutorial,Ex_tutorial);
					System.out.println("	# Validation == PASS :: 'Create Tutorial' Text is present");		
				}
			
				//User Content edit picture assertion
				public static  String Ex_edittu;
				public static  String Act_edittu;
				public  void edittu_assertion()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_edittu=Robj.tutorialsassertion().getText();
					Ex_edittu="Classic Shortbread(Tutorials For test purpose)Edited";
					Assert.assertEquals(Act_edittu,Ex_edittu);
					System.out.println("	# Validation == PASS :: 'Classic Shortbread(Tutorials For test purpose)Edited' Text is present");		
				}
				
				
				//User Coupons pop up assertion
				public static  String Ex_coupons;
				public static  String Act_coupons;
				public  void coupons()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_coupons=Robj.createrecipespopup().getText();
					Ex_coupons="Special discount";
					Assert.assertEquals(Act_coupons,Ex_coupons);
					System.out.println("	# Validation == PASS :: 'Special discount' Text is present");		
				}
				
				//User Coupons pop up assertion
				public static  String Ex_coupons2;
				public static  String Act_coupons2;
				public  void coupons2()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_coupons2=Robj.editassert().getText();
					Ex_coupons2="Coupon created successfully";
					Assert.assertEquals(Act_coupons2,Ex_coupons2);
					System.out.println("	# Validation == PASS :: 'Coupon created successfully' Text is present");		
				}
				
				//User Coupons group assert assertion
				public static  String Ex_groupassert;
				public static  String Act_groupassert;
				public  void groupassert()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_groupassert=Robj.groupassert().getText();
					Ex_groupassert="Group created successfully";
					Assert.assertEquals(Act_groupassert,Ex_groupassert);
					System.out.println("	# Validation == PASS :: 'Group created successfully' Text is present");		
				}
				//User Coupons group assert1
				public static  String Ex_groupassert1;
				public static  String Act_groupassert1;
				public  void groupassert1()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_groupassert1=Robj.groupassert1().getText();
					Ex_groupassert1="Back to Home";
					Assert.assertEquals(Act_groupassert1,Ex_groupassert1);
					System.out.println("	# Validation == PASS :: 'Back to Home' Text is present");		
				}
			
				//User Coupons group assert2
				public static  String Ex_groupassert2;
				public static  String Act_groupassert2;
				public  void groupassert2()  throws Exception 
				{ 
					//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
					Act_groupassert2=Robj.groupassert2().getText();
					Ex_groupassert2="CREATE GROUPS";
					Assert.assertEquals(Act_groupassert2,Ex_groupassert2);
					System.out.println("	# Validation == PASS :: 'Create Groups' Text is present");		
				}
				
}