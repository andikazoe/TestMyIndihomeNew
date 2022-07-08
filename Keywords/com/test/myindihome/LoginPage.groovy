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

import internal.GlobalVariable

import com.test.basepageobject.BasePageObject

public class LoginPage {
	
	LoginObject login = new LoginObject()
	
	@Keyword
	public void loginFlow(Input_Email_Phone,Input_Password, Message, Select_Activation, OTP1, OTP2, OTP3, OTP4) {
		WebUI.openBrowser(GlobalVariable.LINK_WEB)
		WebUI.maximizeWindow()
		WebUI.click(login.btnMasukDaftar())
		WebUI.delay(1)
		WebUI.click(login.btnMasuk())
		WebUI.delay(1)
		WebUI.setText(login.inputEmailPhone(), Input_Email_Phone)
		WebUI.delay(1)
		if(Input_Email_Phone == '') {
			WebUI.comment('Case Input Email kosong')
		} else if(WebUI.waitForElementVisible(login.selectCondition(Message), 3)) {
			WebUI.comment(Message)
			WebUI.delay(5)
			WebUI.comment('Format Email Salah')
		} else {
			WebUI.click(login.btnMasukEmailPhone())
			WebUI.delay(1)
			if(WebUI.waitForElementPresent(login.btnCobalagi(), 3)) {
				WebUI.delay(1)
				WebUI.click(login.btnCobalagi())
				WebUI.delay(5)
			} else {
				WebUI.comment('Tidak ada condition')
				WebUI.setText(login.inputPassword(), Input_Password)
				WebUI.delay(1)
				WebUI.click(login.btnLanjutPassword())
				loginMetodeAktivasi(Select_Activation, OTP1, OTP2, OTP3, OTP4)
			}
		}
	}
	
	@Keyword
	public void loginMetodeAktivasi(Select_Activation, OTP1, OTP2, OTP3, OTP4) {
		if(Select_Activation == 'WhatsApp') {
			WebUI.click(login.selectAktivasiWA())
		} else if(Select_Activation == 'SMS') {
			WebUI.click(login.selectAktivasiSMS())
		} else {
			WebUI.comment('Tidak ada pilihan Select Activation')
		}
		WebUI.click(login.inputOTP1())
		WebUI.setText(login.inputOTP1(), OTP1)
		WebUI.click(login.inputOTP2())
		WebUI.setText(login.inputOTP2(), OTP2)
		WebUI.click(login.inputOTP3())
		WebUI.setText(login.inputOTP3(), OTP3)
		WebUI.click(login.inputOTP4())
		WebUI.setText(login.inputOTP4(), OTP4)
		if(WebUI.waitForElementVisible(login.btnLewati(), 10)) {
			WebUI.click(login.btnLewati())
		} else {
			WebUI.comment('Skip klik button lewati')
		}
		WebUI.delay(5)
		WebUI.click(login.btnProfile())
		WebUI.scrollToElement(login.btnKeluar(), 0)
		WebUI.click(login.btnKeluar())
		WebUI.click(login.btnYa())
	}
	
}
