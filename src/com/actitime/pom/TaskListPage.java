package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustBtn;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustNameTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustDescTbx;
	
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selectCustDD;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompanyTx;

	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustCreated;
	
	
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProjBtn;
	
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement enterProjNameTbx;
	
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement selectCustDDL;
	
	@FindBy(xpath="(//div[text()='Big Bang Company' and @class='itemRow cpItemRow '])[1]")
	private WebElement bigBangTx;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement addProjDescTbx;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createProjBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualProjCreated;
	
	
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustBtn() {
		return newCustBtn;
	}

	public WebElement getEnterCustNameTbx() {
		return enterCustNameTbx;
	}

	public WebElement getEnterCustDescTbx() {
		return enterCustDescTbx;
	}

	public WebElement getSelectCustDD() {
		return selectCustDD;
	}

	public WebElement getOurCompanyTx() {
		return ourCompanyTx;
	}

	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}

	public WebElement getActualCustCreated() {
		return actualCustCreated;
	}

	public WebElement getNewProjBtn() {
		return newProjBtn;
	}

	public WebElement getEnterProjNameTbx() {
		return enterProjNameTbx;
	}

	public WebElement getBigBangTx() {
		return bigBangTx;
	}

	public WebElement getSelectCustDDL() {
		return selectCustDDL;
	}

	public WebElement getAddProjDescTbx() {
		return addProjDescTbx;
	}

	public WebElement getCreateProjBtn() {
		return createProjBtn;
	}
	public WebElement getActualProjCreated() {
		return actualProjCreated;
	}
	
	

}
