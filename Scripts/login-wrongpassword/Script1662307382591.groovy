import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.bukalapak.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login/HomePage/btnLogin'))

WebUI.setText(findTestObject('Login/Page_Login ke Akun  Bukalapak/input_Nomor handphone atau email_LoginID'), 'haidarwonk@gmail.com')

WebUI.click(findTestObject('Login/Page_Login ke Akun  Bukalapak/button_Lanjut'))

WebUI.click(findTestObject('Login/Page_Login ke Akun  Bukalapak/div_password'))

WebUI.setText(findTestObject('Login/Page_Login ke Akun  Bukalapak/input_Lanjut_Password'), 'ngasalin')

WebUI.click(findTestObject('Login/Page_Login ke Akun  Bukalapak/button_Login'))

WebUI.verifyElementText(findTestObject('Login/Alert/p_Password yang kamu masukkan salah. Silakan coba lagi'), 'Password yang kamu masukkan salah. Silakan coba lagi.')

WebUI.takeScreenshot()

WebUI.closeBrowser()

