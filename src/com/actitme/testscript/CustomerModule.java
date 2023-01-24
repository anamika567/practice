package com.actitme.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	Reporter.log("CreateCustomer",true);
	FileLib f=new FileLib();
	String expCustName = f.getExcelData("CreateCustomer", 1, 2);
	String custDescp = f.getExcelData("CreateCustomer", 1, 3);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.setTaskTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewCustBtn().click();
	t.getEnterCustNameTbx().sendKeys(expCustName);
	t.getEnterCustDescTbx().sendKeys(custDescp);
	t.getSelectCustDD().click();
	t.getOurCompanyTx().click();
	t.getCreateCustBtn().click();
	Thread.sleep(4000);
	String actualCust = t.getActualCustCreated().getText();
	Assert.assertEquals(actualCust, expCustName);
	

	
	}
}
