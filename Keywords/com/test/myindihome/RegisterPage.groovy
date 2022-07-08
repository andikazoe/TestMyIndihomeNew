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

public class RegisterPage {

	RegisterObject register = new RegisterObject()
	
	@Keyword
	public void registerFlow(Input_Fullname, Input_Ponsel, Input_Email,Input_Password) {
		WebUI.openBrowser(GlobalVariable.LINK_WEB)
		WebUI.maximizeWindow()
		WebUI.click(register.btnMasukDaftar())
		WebUI.delay(1)
		WebUI.click(register.btnDaftar())
		WebUI.delay(1)
		WebUI.setText(register.inputFullname(), Input_Fullname)
		WebUI.delay(1)
		WebUI.setText(register.inputPonsel(), Input_Ponsel)
		WebUI.delay(1)
		WebUI.setText(register.inputEmail(), Input_Email)
		WebUI.delay(1)
		WebUI.setText(register.inputPassword(), Input_Password)
		WebUI.delay(1)
		WebUI.click(register.btnDaftarSekarang())
	}

	@Keyword
	public void registerCondition(Negative_Case, Select_Activation, OTP1, OTP2, OTP3, OTP4, Message) {
		if(Negative_Case == 'Yes') {
			WebUI.comment('Negative Case')
			if(WebUI.waitForElementVisible(register.selectCondition(Message), 5)) {
				WebUI.comment(Message)
				WebUI.delay(5)
			} else {
				WebUI.comment('Tidak ada condition')
			}
		} else if(Negative_Case == 'No') {
			WebUI.comment('Positive Case')
			registerMetodeAktivasi(Select_Activation, OTP1, OTP2, OTP3, OTP4)
		} else {
			WebUI.comment('Tidak ada pilihan Negative Case')
		}
	}

	@Keyword
	public void registerMetodeAktivasi(Select_Activation, OTP1, OTP2, OTP3, OTP4) {
		if(WebUI.waitForElementPresent(register.btnOk(), 5)) {
			//Jika gagal register
			WebUI.click(register.btnOk())
		} else {
			WebUI.click(register.selectAktivasi(Select_Activation))
			WebUI.click(register.inputOTP1())
			WebUI.setText(register.inputOTP1(), OTP1)
			WebUI.click(register.inputOTP2())
			WebUI.setText(register.inputOTP2(), OTP2)
			WebUI.click(register.inputOTP3())
			WebUI.setText(register.inputOTP3(), OTP3)
			WebUI.click(register.inputOTP4())
			WebUI.setText(register.inputOTP4(), OTP4)
			WebUI.click(register.selectTidakBerlangganan())
			WebUI.click(register.btnLanjut())
			WebUI.click(register.btnMulaiMenjelajai())
		}
	}
}
