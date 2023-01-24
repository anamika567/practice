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
public class ProjectModule extends BaseClass{
	
	@Test
	public void testCreateProject() throws EncryptedDocumentException, IOException, InterruptedException {
	Reporter.log("CreateProject",true);
	FileLib f=new FileLib();
	String expProjName = f.getExcelData("CreateProject", 1, 1);
	String projDescp = f.getExcelData("CreateProject", 1, 2);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.setTaskTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewProjBtn().click();
	t.getEnterProjNameTbx().sendKeys(expProjName);
	t.getSelectCustDDL().click();
	t.getBigBangTx().click();
	t.getAddProjDescTbx().sendKeys(projDescp);
	t.getCreateProjBtn().click();
	Thread.sleep(4000);
	String actualProj = t.getActualProjCreated().getText();
	Assert.assertEquals(actualProj,expProjName);

	

}
}
