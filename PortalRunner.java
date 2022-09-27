package portalRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pom.POMClass;

public class PortalRunner extends BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static POMClass pom = new POMClass(driver);

	public static void main(String[] args) throws InterruptedException {

		// Driver Maximize and Url Launch

		// Driver Maximize and Url Launch

		geturl("https://clientx.me/");

		Thread.sleep(3000);

		// Click Exixting
		Clickonelement(pom.getPages().getClickExisting());

		Thread.sleep(2000);

		// Enter Mail id
		sendkeys(pom.getPages().getEnterMailid(), "smashsaheer@gmail.com");

		// Click Continue
		Clickonelement(pom.getPages().getClickContinue());

		Thread.sleep(2000);

		// Enter Username
		sendkeys(pom.getPages().getEnterEmailId(), "smashsaheer@gmail.com");

		// Enter Password
		sendkeys(pom.getPages().getEnterPassword(), "Test@1234");

		// Click Signin Button
		Clickonelement(pom.getPages().getSigninbtn());

/////////////////////// Dashboard  //////////////////////////////

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Click make Appointment
		Clickonelement(pom.getPages().getClickMake());

		Thread.sleep(3000);

		// Selectone(pom.getPages().getselectProvider(), "John's Hospitals");

		// Click Office
		Clickonelement(pom.getPages().getselectOfice());

		// select Office
		Clickonelement(pom.getPages().getselectOfice1());

		// Click provider
		Clickonelement(pom.getPages().getselectProvider());

		// Select provider
		Clickonelement(pom.getPages().getselectProvider1());

		// Click Time
		Clickonelement(pom.getPages().getClickTime());

		// Select date
	//	Clickonelement(pom.getPages().getselectDate());

		// Select time
		Clickonelement(pom.getPages().getselectTime());

		// Enter Reason
		sendkeys(pom.getPages().getEnterReason(), "Test@12345");

		// Click Submit
		// Clickonelement(pom.getPages().getClickSubmit());

		System.out.println("Appiontment Created Successfully");

		Thread.sleep(2000);

//		// Click Three dot
//		Clickonelement(pom.getPages().getClickDot());
//
//		Thread.sleep(2000);
//		// Click Edit
//		Clickonelement(pom.getPages().getClickEdit());
//
//		Thread.sleep(2000);
//		// Click Submit
//		Clickonelement(pom.getPages().getClickSubmit());

		// Click Three dot
//		Clickonelement(pom.getPages().getClickDot());
//		
//		Thread.sleep(2000);
//		
//		// Click Edit
//		Clickonelement(pom.getPages().getClickDelete());
//		
//		
//		// Enter Reason
//		sendkeys(pom.getPages().getEnterReason1(), "Test@12345");
//		
//		// Click Cancel
//		Clickonelement(pom.getPages().getClickCancel());

		Thread.sleep(3000);

		/// Click dashBoard
		Clickonelement(pom.getPages().getClickDashboard());

		// Add Crad
		Clickonelement(pom.getPages().getClickAddCard());

		// Enter Card Holder Name
		sendkeys(pom.getPages().getEnterName(), "ss");

		// Enter Card Holder Name
		sendkeys(pom.getPages().getEnterNameCardNo(), "5555 5555 5555 4444");

		// Enter CVV
		sendkeys(pom.getPages().getEnterCVV(), "345");

		// Enter CVV
		sendkeys(pom.getPages().getEnterMMYY(), "1123");

	//	Clickonelement(pom.getPages().getClickCancelc());

		// Click Save
		 Clickonelement(pom.getPages().getClickSave());

		System.out.println("Card Added Successfully");

		Thread.sleep(3000);

		/// Click Make payment
		Clickonelement(pom.getPages().getClickMakePay());

		/// Click Make payment
		// Clickonelement(pom.getPages().getClickMPaynow());

		System.out.println("Payment Done Successfully");

		Thread.sleep(2000);

		/// Click Make payment
		Clickonelement(pom.getPages().getClickClose());

 //////////////////////   Problems	///////////	

		Thread.sleep(4000);

		/// Click Problems
		Clickonelement(pom.getPages().getClickProblems());

		gettext(pom.getPages().getTextProblems());

 /////////////// Allergies  ///////////////

		Thread.sleep(4000);

		/// Click Allergies
		Clickonelement(pom.getPages().getClickAllergies());

		gettext(pom.getPages().getTextProblems());

		Thread.sleep(4000);

		/// Click Lab
		Clickonelement(pom.getPages().getClickLab());

		gettext(pom.getPages().getTextProblems());

		// Click View All
		Clickonelement(pom.getPages().getClickViewAll());

 /////////////////    Medication  /////////////////

		/// Click dashBoard
		Clickonelement(pom.getPages().getClickDashboard());

		gettext(pom.getPages().getTextProblems());

		// Click Medication View All
		Clickonelement(pom.getPages().getClickMViewAll());

 ///////////////////////////  APPOINTMENT  //////////////////

		// Thread.sleep(4000);

		// click Appointment
		Clickonelement(pom.getPages().getClickAppointment1());

		Thread.sleep(3000);

		// Click make Appointment
		Clickonelement(pom.getPages().getClickSCAppointment1());

		Thread.sleep(3000);

		// Selectone(pom.getPages().getselectProvider(), "John's Hospitals");

		// Click Office
		Clickonelement(pom.getPages().getselectOfice());

		// select Office
		Clickonelement(pom.getPages().getselectOfice1());

		// Click provider
		Clickonelement(pom.getPages().getselectProvider());

		// Select provider
		Clickonelement(pom.getPages().getselectProvider1());

		// Click Time
		Clickonelement(pom.getPages().getClickTime());

		// Select date
	//	Clickonelement(pom.getPages().getselectDate());

		// Select time
		Clickonelement(pom.getPages().getselectTime());

		// Enter Reason
		sendkeys(pom.getPages().getEnterReason(), "Test@12345");

		// Click Submit
	//	Clickonelement(pom.getPages().getClickSubmit());

 //////////////////////////  Billing   ////////////////////////

		Thread.sleep(3000);
		
		// Click Billing
		Clickonelement(pom.getPages().getClickBilling());

		// Click Add card
		Clickonelement(pom.getPages().getClickAddCards());

		// Enter Card Holder Name
		sendkeys(pom.getPages().getEnterNAME(), "ss");

		// Enter Card Holder Name
		sendkeys(pom.getPages().getEnterNameCardNo1(), "5555 5555 5555 3333");

		// Enter CVV
		sendkeys(pom.getPages().getEnterCVV1(), "345");

		// Enter CVV
		sendkeys(pom.getPages().getEnterMMYY1(), "1123");

		Clickonelement(pom.getPages().getClickCancelc());

		// Click Save
		// Clickonelement(pom.getPages().getClickSave());

		System.out.println("Billing Card Added Successfully");

		// clck View
		Clickonelement(pom.getPages().getClickView());

		// Click download
		Clickonelement(pom.getPages().getClickDownload());

		// Click Close
		Clickonelement(pom.getPages().getClickCancel1());

		// Click Pay button
		Clickonelement(pom.getPages().getClickPay());

		System.out.println("Payment Done Successfully");

		Thread.sleep(2000);

		/// Click Make payment
	//	Clickonelement(pom.getPages().getClickClose());

		// Payment History
		Clickonelement(pom.getPages().getClickPayment());

 //////////////////////// Documents   ////////////////////

		// Click Documents
		Clickonelement(pom.getPages().getClickDocument());

		// Click Dot
		Clickonelement(pom.getPages().getClickDot1());

		// Click Documents
		Clickonelement(pom.getPages().getClickSign());

		// Enter Name
		sendkeys(pom.getPages().getEnterNamee(), "Saheerahmed");

		// Enter Name
		Clickonelement(pom.getPages().getClickcancel1());

		// Enter Name
		// Clickonelement(pom.getPages().getClickSave1());

		System.out.println("Signed Successfully");

		Thread.sleep(4000);
		
		// Click Upkoad Documents
		Clickonelement(pom.getPages().getClickUploadDocu());
		
		// Click Upkoad Documents
		Clickonelement(pom.getPages().getClickclose());

		System.out.println("Upload Successfully");
		
		Thread.sleep(4000);

		// Click Dot
		Clickonelement(pom.getPages().getClickDot1());
		
//		// Click Print
//		Clickonelement(pom.getPages().getClickPrint());
//		
//		Thread.sleep(4000);
//		
//		// Click Cancel
//		Clickonelement(pom.getPages().getClickCancel1());

		// Click Download
		Clickonelement(pom.getPages().getClickDownload1());	
		
		Thread.sleep(4000);

		// Click Dot
	//	Clickonelement(pom.getPages().getClickDot1());
		
		// Click Dot
		//	Clickonelement(pom.getPages().getClickDelete1());
		
		// Click All Document
		Clickonelement(pom.getPages().getClickDDc());
		
		// Select All Document
		Clickonelement(pom.getPages().getSelectAllDoc());
		
		// Click Dropdown
		Clickonelement(pom.getPages().getClickDDc());
		
		// Select Unsigned Document
		Clickonelement(pom.getPages().getSelectUnsigned());
		
		// Click Dropdown
		Clickonelement(pom.getPages().getClickDDc());
		
		// Select Review Document
		Clickonelement(pom.getPages().getSelectReviewDoc());
		
		// Click Dropdown
		Clickonelement(pom.getPages().getClickDDc());
		
		// Click All Document
		Clickonelement(pom.getPages().getClickDDc());
		
		
		System.out.println("Going Good");
		
 ////////////////////  HealthProfile /////////////////////////
		
		// Click HealthProfile
		Clickonelement(pom.getPages().getClickHealth());
		
		// Click Dropdown
		Clickonelement(pom.getPages().getClickDD());
		
		// Click Problem
		Clickonelement(pom.getPages().getClickProblem());
		
		// Click Dropdown
		Clickonelement(pom.getPages().getClickDD());
		
		// Click Allergie
		Clickonelement(pom.getPages().getClickAllergie());
		
		// Click Dropdown
		Clickonelement(pom.getPages().getClickDD());
		
		// Click LabOrders
		Clickonelement(pom.getPages().getClickLabOrders());
		
		// Click Dropdown
		Clickonelement(pom.getPages().getClickDD());
		
		// Click Medication
		Clickonelement(pom.getPages().getClickMedication());
		
		System.out.println("good");
		
	}

}
