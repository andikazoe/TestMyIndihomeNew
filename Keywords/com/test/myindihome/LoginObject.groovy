package com.test.myindihome

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.test.basepageobject.BasePageObject

import internal.GlobalVariable

public class LoginObject extends BasePageObject {
	
	private TestObject btnMasukDaftar
	private TestObject btnMasuk
	private TestObject inputEmailPhone
	private TestObject btnMasukEmailPhone
	private TestObject inputPassword
	private TestObject btnLanjutPassword
	private TestObject selectCondition
	private TestObject selectAktivasiWA
	private TestObject selectAktivasiSMS
	private TestObject inputOTP1
	private TestObject inputOTP2
	private TestObject inputOTP3
	private TestObject inputOTP4
	private TestObject btnLewati
	private TestObject btnProfile
	private TestObject btnKeluar
	private TestObject btnYa
	private TestObject btnCobalagi
	
	public TestObject btnMasukDaftar(){
		btnMasukDaftar = createTestObjectByXpath("btnMasukDaftar", "/html/body/div[1]/div/nav/div[1]/div[2]/ul/li[4]/button")
	}
	
	public TestObject btnMasuk(){
		btnMasuk = createTestObjectByXpath("btnMasuk", "/html/body/div[3]/div/div/div/div[2]/div/div[1]/a")
	}
	
	public TestObject inputEmailPhone(){
		inputEmailPhone = createTestObjectByID("inputEmailPhone", "loginID")
	}
	
	public TestObject btnMasukEmailPhone(){
		btnMasukEmailPhone = createTestObjectByDataTestId("btnMasukEmailPhone", "submit")
	}
	
	public TestObject inputPassword(){
		inputPassword = createTestObjectByID("inputPassword", "password")
	}
	
	public TestObject btnLanjutPassword(){
		btnLanjutPassword = createTestObjectByDataTestId("btnLanjutPassword", "submit")
	}
	
	public TestObject selectCondition(Message){
		selectCondition = createTestObjectByXpath("selectCondition", "//*/text()[normalize-space(.)='${Message}']/parent::*")
	}
	
	public TestObject btnCobalagi(){
		btnCobalagi = createTestObjectByXpath("btnCobalagi", "//*/text()[normalize-space(.)='COBA LAGI']/parent::*")
	}
	
	public TestObject selectAktivasiWA(){
		selectAktivasiWA = createTestObjectByXpath("selectAktivasiWA", "//img[@alt='Icon WA']")
	}
	
	public TestObject selectAktivasiSMS(){
		selectAktivasiSMS = createTestObjectByXpath("selectAktivasiSMS", "//img[@alt='Icon SMS']")
	}
	
	public TestObject inputOTP1(){
		inputOTP1 = createTestObjectByID("inputOTP1", "otp1")
	}
	
	public TestObject inputOTP2(){
		inputOTP2 = createTestObjectByID("inputOTP1", "otp2")
	}
	
	public TestObject inputOTP3(){
		inputOTP3 = createTestObjectByID("inputOTP1", "otp3")
	}
	
	public TestObject inputOTP4(){
		inputOTP4 = createTestObjectByID("inputOTP1", "otp4")
	}
	
	public TestObject btnLewati(){
		btnLewati = createTestObjectByXpath("btnLewati", "//*/text()[normalize-space(.)='Lewati']/parent::*")
	}
	
	public TestObject btnProfile(){
		btnProfile = createTestObjectByXpath("btnProfile", "//div[@id='basic-navbar-nav']/ul/li[4]/a/div")
	}
	
	public TestObject btnKeluar(){
		btnKeluar = createTestObjectByXpath("btnkeluar", "//*/text()[normalize-space(.)='keluar']/parent::*")
	}
	
	public TestObject btnYa(){
		btnYa = createTestObjectByXpath("btnkeluar", "//*/text()[normalize-space(.)='Ya']/parent::*")
	}
	
	
}
