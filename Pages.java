package com.Portal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages {
	public WebDriver driver;

	@FindBy(id = "normal_login_username")

	private WebElement username;

	public Pages(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}
	@FindBy(xpath = "(//img[@alt='Login-Image'])[1]")

	private WebElement ClickExisting;

	public WebElement getClickExisting() {
		return ClickExisting;
		
	}
	@FindBy(xpath = "(//input[@placeholder='Enter Email'])[1]")

	private WebElement EnterMailid;

	public WebElement getEnterMailid() {
		return EnterMailid;
	}
	@FindBy(xpath = "//button[normalize-space()='continue']")

	private WebElement ClickContinue;

	public WebElement getClickContinue() {
		return ClickContinue;
	}
	@FindBy(xpath = "(//input[@placeholder='Enter email'])[1]")

	private WebElement EnterEmailId;

	public WebElement getEnterEmailId() {
		return EnterEmailId;
	}

	@FindBy(xpath = "//input[@placeholder='Enter password']")

	private WebElement EnterPassword;

	public WebElement getEnterPassword() {
		return EnterPassword;
	}
	
	@FindBy(xpath = "//button[normalize-space()='Log in']")

	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}
 
////////////////////Dsahboard 
	
	
	@FindBy(xpath = "//p[normalize-space()='Make Appointment']")

	private WebElement ClickMake;

	public WebElement getClickMake() {
		return ClickMake;
	}
	@FindBy(xpath = "//input[@placeholder='Type a customer name']")

	private WebElement selectOfice;

	public WebElement getselectOfice() {
		return selectOfice;
	}
	@FindBy(xpath = "//div[text()=\"John's Hospital\"]")

	private WebElement selectOfice1;

	public WebElement getselectOfice1() {
		return selectOfice1;
	}
	
	@FindBy(xpath = "//input[@placeholder='Search Provider']")

	private WebElement selectProvider;

	public WebElement getselectProvider() {
		return selectProvider;
	}
	@FindBy(xpath = "//div[text()='Martin Edward']")

	private WebElement selectProvider1;

	public WebElement getselectProvider1() {
		return selectProvider1;
	}
	@FindBy(xpath = "//p[contains(text(),'Select Time & Date')]")

	private WebElement ClickTime;

	public WebElement getClickTime() {
		return ClickTime;
	}
	@FindBy(xpath = "//button[contains(text(),'10:30 am')]")

	private WebElement selectDate;

	public WebElement getselectDate() {
		return selectDate;
	}
	@FindBy(xpath = "//button[normalize-space()='09:00 am']")

	private WebElement selectTime;

	public WebElement getselectTime() {
		return selectTime;
	}
	@FindBy(xpath = "//textarea[@placeholder='Enter reason']")

	private WebElement EnterReason;

	public WebElement getEnterReason() {
		return EnterReason;
	}
	@FindBy(xpath = "//button[normalize-space()='Submit']")

	private WebElement ClickSubmit;

	public WebElement getClickSubmit() {
		return ClickSubmit;
	}
	@FindBy(xpath = "//button[@class='sc-gpxMCN dqlvSW']//*[name()='svg']")

	private WebElement ClickDot;

	public WebElement getClickDot() {
		return ClickDot;
	}
	@FindBy(xpath = "//span[normalize-space()='Edit']")

	private WebElement ClickEdit;

	public WebElement getClickEdit() {
		return ClickEdit;
	}
	@FindBy(xpath = "//*[name()='path' and contains(@d,'M17 6h5v2h')]")

	private WebElement ClickDelete;

	public WebElement getClickDelete() {
		return ClickDelete;
	}
	@FindBy(xpath = "//body/div[@id='Patient_Portal']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/textarea[1]")

	private WebElement EnterReason1;

	public WebElement getEnterReason1() {
		return EnterReason1;
	}
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")

	private WebElement ClickCancel;

	public WebElement getClickCancel() {
		return ClickCancel;
	}
	@FindBy(xpath = "//span[normalize-space()='Dashboard']")

	private WebElement ClickDashboard;

	public WebElement getClickDashboard() {
		return ClickDashboard;
	}
	@FindBy(xpath = "//p[normalize-space()='Add Card']")

	private WebElement ClickAddCard;

	public WebElement getClickAddCard() {
		return ClickAddCard;
	}
	@FindBy(xpath = "//body/div[@id='Patient_Portal']/div[1]/div[2]/div[2]/div[2]/div[1]/div[8]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")

	private WebElement EnterName;

	public WebElement getEnterName() {
		return EnterName;
	}
	@FindBy(xpath = "//input[@placeholder='---- ---- ---- ----']")

	private WebElement EnterNameCardNo;

	public WebElement getEnterNameCardNo() {
		return EnterNameCardNo;
	}
	@FindBy(xpath = "//input[@placeholder='CVV']")

	private WebElement EnterCVV;

	public WebElement getEnterCVV() {
		return EnterCVV;
	}
	@FindBy(xpath = "//input[@placeholder='MM/YY']")

	private WebElement EnterMMYY;

	public WebElement getEnterMMYY() {
		return EnterMMYY;
	}
	@FindBy(xpath = "//button[normalize-space()='Save Card']")

	private WebElement ClickSave;

	public WebElement getClickSave() {
		return ClickSave;
	}
	@FindBy(xpath = "//div[@class='sc-ivTmOn gjAwOB']//*[name()='svg']//*[name()='path' and contains(@d,'M1.293 1.2')]")

	private WebElement ClickCancelc;

	public WebElement getClickCancelc() {
		return ClickCancelc;
	}
	@FindBy(xpath = "//p[contains(text(),'Make a Payment')]")

	private WebElement ClickMakePay;

	public WebElement getClickMakePay() {
		return ClickMakePay;
	}
	@FindBy(xpath = "//button[contains(text(),'Pay Now')]")

	private WebElement ClickMPaynow;

	public WebElement getClickMPaynow() {
		return ClickMPaynow;
	}
	@FindBy(xpath = "//div[@class='sc-ivTmOn cqiTem']//*[name()='svg']//*[name()='path' and contains(@d,'M1.293 1.2')]")

	private WebElement ClickClose;

	public WebElement getClickClose() {
		return ClickClose;
	}
	
///////////  Problems	
	
	
	@FindBy(xpath = "//div[contains(text(),'Problems')]")

	private WebElement ClickProblems;

	public WebElement getClickProblems() {
		return ClickProblems;
	}

	@FindBy(xpath = "//div[contains(text(),'Problems')]")

	private WebElement TextProblems;

	public WebElement getTextProblems() {
		return TextProblems;
	}
	@FindBy(xpath = "//div[contains(text(),'Allergies')]")

	private WebElement ClickAllergies;

	public WebElement getClickAllergies() {
		return ClickAllergies;
	}
	@FindBy(xpath = "//div[contains(text(),'Allergies')]")
	private WebElement TextAllergies;

	public WebElement getTextAllergies() {
		return TextAllergies;
	}
	@FindBy(xpath = "//div[contains(text(),'Lab')]")

	private WebElement ClickLab;

	public WebElement getClickLab() {
		return ClickLab;
	}
	@FindBy(xpath = "//div[contains(text(),'Lab')]")

	private WebElement TextLab;

	public WebElement getTextLab() {
		return TextLab;
	}
	
	@FindBy(xpath = "//body/div[@id='Patient_Portal']/div[1]/div[2]/div[2]/div[2]/div[1]/div[10]/div[1]/button[1]")

	private WebElement ClickViewAll;

	public WebElement getClickViewAll() {
		return ClickViewAll;
	}
	@FindBy(xpath = "//body/div[@id='Patient_Portal']/div[1]/div[2]/div[2]/div[2]/div[1]/div[11]/div[1]/button[1]")

	private WebElement ClickMViewAll;

	public WebElement getClickMViewAll() {
		return ClickMViewAll;
	}
	@FindBy(xpath = "//body/div[@id='Patient_Portal']/div[1]/div[2]/div[2]/div[2]/div[1]/div[11]/div[1]/button[1]")

	private WebElement TextViewAll;

	public WebElement getTextViewAll() {
		return TextViewAll;
	}
	@FindBy(xpath = "//body/div[@id='Patient_Portal']/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]")

	private WebElement ClickAppointment1;

	public WebElement getClickAppointment1() {
		return ClickAppointment1;
	}
	@FindBy(xpath = "//p[contains(text(),'Schedule Appointment')]")

	private WebElement ClickSCAppointment1;

	public WebElement getClickSCAppointment1() {
		return ClickSCAppointment1;
	}
	
////////////////////// Billing////////////////
	
	@FindBy(xpath = "//span[contains(text(),'Billing')]")

	private WebElement ClickBilling;

	public WebElement getClickBilling() {
		return ClickBilling;
	}
	
	@FindBy(xpath = "//body/div[@id='Patient_Portal']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]")

	private WebElement ClickAddCards;

	public WebElement getClickAddCards() {
		return ClickAddCards;
	}
	@FindBy(xpath = "//body/div[@id='Patient_Portal']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")

	private WebElement EnterNAME;

	public WebElement getEnterNAME() {
		return EnterNAME;
	}
	
	@FindBy(xpath = "//input[@placeholder='---- ---- ---- ----']")

	private WebElement EnterNameCardNo1;

	public WebElement getEnterNameCardNo1() {
		return EnterNameCardNo1;
	}
	@FindBy(xpath = "(//input[@placeholder='CVV'])[1]")

	private WebElement EnterCVV1;

	public WebElement getEnterCVV1() {
		return EnterCVV1;
	}
	@FindBy(xpath = "(//input[@placeholder='MM/YY'])[1]")

	private WebElement EnterMMYY1;

	public WebElement getEnterMMYY1() {
		return EnterMMYY1;
	}
	@FindBy(xpath = "//button[normalize-space()='View']")

	private WebElement ClickView;

	public WebElement getClickView() {
		return ClickView;
	}
	@FindBy(xpath = "//body/div[@id='Patient_Portal']/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/*[1]")

	private WebElement ClickDownload;

	public WebElement getClickDownload() {
		return ClickDownload;
	}
	@FindBy(xpath = "//div[@class='sc-jSMfEi fjVgCQ']//*[name()='svg']//*[name()='path' and contains(@d,'M1.293 1.2')]")

	private WebElement ClickCancel1;

	public WebElement getClickCancel1() {
		return ClickCancel1;
	}
	@FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/button[2]")

	private WebElement ClickPay;

	public WebElement getClickPay() {
		return ClickPay;
	}
	@FindBy(xpath = "//div[contains(text(),'Payment History')]")

	private WebElement ClickPayment;

	public WebElement getClickPayment() {
		return ClickPayment;
	}
	
///////////// Document
	
	@FindBy(xpath = "//body/div[@id='Patient_Portal']/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]")

	private WebElement ClickDocument;

	public WebElement getClickDocument() {
		return ClickDocument;
	}
	
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]//*[name()='svg']")

	private WebElement ClickDot1;

	public WebElement getClickDot1() {
		return ClickDot1;
	}
	@FindBy(xpath = "//img[@class='sc-breuTD dFBhus']")

	private WebElement ClickSign;

	public WebElement getClickSign() {
		return ClickSign;
	}
	@FindBy(xpath = "//input[@type='text']")

	private WebElement EnterNamee;

	public WebElement getEnterNamee() {
		return EnterNamee;
	}
	@FindBy(xpath = "//button[normalize-space()='Cancel']")

	private WebElement Clickcancel1;

	public WebElement getClickcancel1() {
		return Clickcancel1;
	}
	@FindBy(xpath = "//button[normalize-space()='Save']")

	private WebElement ClickSave1;

	public WebElement getClickSave1() {
		return ClickSave1;
	}
	@FindBy(xpath = "//button[normalize-space()='Upload Document']")

	private WebElement ClickUploadDocu;

	public WebElement getClickUploadDocu() {
		return ClickUploadDocu;
	}
	@FindBy(xpath = "//div[@class='sc-jSMfEi cwsiMz']//*[name()='svg']")

	private WebElement Clickclose;

	public WebElement getClickclose() {
		return Clickclose;
	}
	
	@FindBy(xpath = "(//div[text()='Print'])[1]")

	private WebElement ClickPrint;

	public WebElement getClickPrint() {
		return ClickPrint;
	}
	
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")

	private WebElement ClickCancel2;

	public WebElement getClickCancel2() {
		return ClickCancel2;
	}
	@FindBy(xpath = "(//div[text()='Download'])[1]")

	private WebElement ClickDownload1;

	public WebElement getClickDownload1() {
		return ClickDownload1;
	}
	
	@FindBy(xpath = "(//div[text()='Delete'])[1]")

	private WebElement ClickDelete1;

	public WebElement getClickDelete1() {
		return ClickDelete1;
	}
	
	@FindBy(xpath = "//p[@class='sc-gKXOVf kOriBl']//*[name()='svg']")

	private WebElement ClickDDc;

	public WebElement getClickDDc() {
		return ClickDDc;
	}
	@FindBy(xpath = "(//div[text()='Signed Documents'])")

	private WebElement SelectAllDoc;

	public WebElement getSelectAllDoc() {
		return SelectAllDoc;
	}
	@FindBy(xpath = "(//div[text()='New / UnSigned Documents'])")

	private WebElement SelectUnsigned;

	public WebElement getSelectUnsigned() {
		return SelectUnsigned;
	}
	
	
	@FindBy(xpath = "(//div[text()='In Review Dcouments'])")

	private WebElement SelectReviewDoc;

	public WebElement getSelectReviewDoc() {
		return SelectReviewDoc;
	}
	
/////////////////	HealthProfile
	
	@FindBy(xpath = "(//span[text()='HealthProfile'])")

	private WebElement ClickHealth;

	public WebElement getClickHealth() {
		return ClickHealth;
	}
	@FindBy(xpath = "//body/div[@id='Patient_Portal']/div[1]/div[2]/div[2]/h4[1]/div[1]/*[1]")

	private WebElement ClickDD;

	public WebElement getClickDD() {
		return ClickDD;
	}
	@FindBy(xpath = "(//li[text()='Problems'])")

	private WebElement ClickProblem;

	public WebElement getClickProblem() {
		return ClickProblem;
	}
	@FindBy(xpath = "(//li[text()='Allergies'])")

	private WebElement ClickAllergie;

	public WebElement getClickAllergie() {
		return ClickAllergie;
	}
	@FindBy(xpath = "//li[contains(text(),'Lab Orders')]")

	private WebElement ClickLabOrders;

	public WebElement getClickLabOrders() {
		return ClickLabOrders;
	}
	
	@FindBy(xpath = "//li[contains(text(),'Medication')]")

	private WebElement ClickMedication;

	public WebElement getClickMedication() {
		return ClickMedication;
	}

	
	
	
	
	
	
	
	///////////////////////////////////////// Negative   /////////////////////////
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
