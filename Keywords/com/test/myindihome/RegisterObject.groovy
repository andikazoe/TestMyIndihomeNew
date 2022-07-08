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

public class RegisterObject extends BasePageObject {
	
	private TestObject btnMasukDaftar
	private TestObject btnDaftar
	private TestObject inputFullname
	private TestObject inputPonsel
	private TestObject inputEmail
	private TestObject inputPassword
	private TestObject btnDaftarSekarang
	private TestObject selectAktivasi
	private TestObject inputOTP1
	private TestObject inputOTP2
	private TestObject inputOTP3
	private TestObject inputOTP4
	private TestObject selectTidakBerlangganan
	private TestObject btnLanjut
	private TestObject btnMulaiMenjelajai
	private TestObject btnOk
	private TestObject selectCondition
	
	public TestObject btnMasukDaftar(){
		btnMasukDaftar = createTestObjectByXpath("btnMasukDaftar", "/html/body/div[1]/div/nav/div[1]/div[2]/ul/li[4]/button")
	}
	
	public TestObject btnDaftar(){
		btnDaftar = createTestObjectByXpath("btnDaftar", "/html/body/div[3]/div/div/div/div[2]/div/div[2]/a")
	}
	
	public TestObject inputFullname(){
		inputFullname = createTestObjectByID("inputFullname", "fullName")
	}
	
	public TestObject inputPonsel(){
		inputPonsel = createTestObjectByID("inputPonsel", "mobileNumber")
	}
	
	public TestObject inputEmail(){
		inputEmail = createTestObjectByID("inputEmail", "email")
	}
	
	public TestObject inputPassword(){
		inputPassword = createTestObjectByID("inputPassword", "password")
	}
	
	public TestObject btnDaftarSekarang(){
		btnDaftarSekarang = createTestObjectByXpath("btnDaftarSekarang", "/html/body/div[1]/div/div[2]/div/section/form/div[5]/button/span")
	}
	
	public TestObject selectCondition(Message){
		selectCondition = createTestObjectByXpath("selectCondition", "//*/text()[normalize-space(.)='${Message}']/parent::*")
	}
	
	public TestObject selectAktivasi(Select_Activation){
		selectAktivasi = createTestObjectByXpath("selectAktivasi", "//*/text()[normalize-space(.)='${Select_Activation}']/parent::*")
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
	
	public TestObject selectTidakBerlangganan(){
		selectTidakBerlangganan = createTestObjectByXpath("selectTidakBerlangganan", "//*[@id='headingTwo']")
	}
	
	public TestObject btnLanjut(){
		btnLanjut = createTestObjectByXpath("btnLanjut", "/html/body/div[1]/div/div[2]/div/section/form/div[2]/button")
	}
	
	public TestObject btnMulaiMenjelajai(){
		btnMulaiMenjelajai = createTestObjectByXpath("btnMulaiMenjelajai", "/html/body/div[1]/div/section/div/div/div/a")
	}
	
	public TestObject btnOk(){
		btnOk = createTestObjectByXpath("btnMulaiMenjelajai", "//*/text()[normalize-space(.)='ok']/parent::*")
	}
	
}
