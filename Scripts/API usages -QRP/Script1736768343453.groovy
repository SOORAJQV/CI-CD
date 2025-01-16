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
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://auth-q-sit-pf.qvantel.systems/auth/realms/qvantel/protocol/openid-connect/auth?ui_locales=en&scope=openid&response_type=code&redirect_uri=https%3A%2F%2Fsct-q-sit-pf.qvantel.systems%3A443%2Foauth2%2Fcallback&state=6127d8cd-4097-4179-aa18-824eb99684f1%7C%2F&client_id=sales-and-care-toolbox')

WebUI.setText(findTestObject('Object Repository/API/Page_Sign in to qvantel/input_Username or email_username'), 'tom')

WebUI.setEncryptedText(findTestObject('Object Repository/API/Page_Sign in to qvantel/input_Password_password'), 'FzsCvGRjjtU+KJvNcyw02R7E5wBhXDe6')

WebUI.click(findTestObject('Object Repository/API/Page_Sign in to qvantel/input_Password_login'))

WebUI.click(findTestObject('Object Repository/API/Page_Sales and Care Toolbox/a_Return to the start page'))

WebUI.setText(findTestObject('Object Repository/API/Page_Dashboard - Sales and Care Toolbox/input_Mobile device_query'), 
    fullname)

WebUI.click(findTestObject('Object Repository/API/Page_Dashboard - Sales and Care Toolbox/button_No recent searches registered_submit-search'))

WebUI.verifyElementText(findTestObject('Object Repository/API/Page_Overview - Sales and Care Toolbox/span_99,999 sms'), 
    '99,999 sms')

WebUI.click(findTestObject('Object Repository/API/Page_Overview - Sales and Care Toolbox/button_Category Usage'))

WebUI.click(findTestObject('Object Repository/API/Page_Overview - Sales and Care Toolbox/button_Type Data'))

WebUI.click(findTestObject('Object Repository/API/Page_Overview - Sales and Care Toolbox/button_Message'))

WebUI.click(findTestObject('Object Repository/API/Page_Overview - Sales and Care Toolbox/button_Search'))

WebUI.verifyElementText(findTestObject('Object Repository/API/Page_Overview - Sales and Care Toolbox/div_No usage available'), 
    'No usage available')

WebUI.closeBrowser()

ResponseObject response = WS.sendRequest(findTestObject('API/Postman/Post data'))

WS.verifyResponseStatusCode(response, 200, FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://auth-q-sit-pf.qvantel.systems/auth/realms/qvantel/protocol/openid-connect/auth?ui_locales=en&scope=openid&response_type=code&redirect_uri=https%3A%2F%2Fsct-q-sit-pf.qvantel.systems%3A443%2Foauth2%2Fcallback&state=6127d8cd-4097-4179-aa18-824eb99684f1%7C%2F&client_id=sales-and-care-toolbox')

WebUI.setText(findTestObject('Object Repository/API/Page_Sign in to qvantel/input_Username or email_username'), 'tom')

WebUI.setEncryptedText(findTestObject('Object Repository/API/Page_Sign in to qvantel/input_Password_password'), 'FzsCvGRjjtU+KJvNcyw02R7E5wBhXDe6')

WebUI.click(findTestObject('Object Repository/API/Page_Sign in to qvantel/input_Password_login'))

WebUI.click(findTestObject('Object Repository/API/Page_Sales and Care Toolbox/a_Return to the start page'))

WebUI.setText(findTestObject('Object Repository/API/Page_Dashboard - Sales and Care Toolbox/input_Mobile device_query'), 
    fullname)

WebUI.click(findTestObject('API/Page_Dashboard - Sales and Care Toolbox/button_No recent searches registered_submit-search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/API/Page_Overview - Sales and Care Toolbox/section_Qvantel Super 5G  358900027590  Adj_8f0734'), 
    0)

WebUI.click(findTestObject('Object Repository/API/Page_Overview - Sales and Care Toolbox/span_Customer'))

WebUI.click(findTestObject('Object Repository/API/Page_Customer details - Sales and Care Toolbox/a_Overview'))

WebUI.verifyElementText(findTestObject('Object Repository/API/Page_Overview - Sales and Care Toolbox/span_99,949 sms'), 
    '99,949 sms')

WebUI.verifyElementText(findTestObject('Object Repository/API/Page_Overview - Sales and Care Toolbox/span_99,949 sms_1'), 
    '99,949 sms')

WebUI.click(findTestObject('Object Repository/API/Page_Overview - Sales and Care Toolbox/button_Type Data'))

WebUI.click(findTestObject('Object Repository/API/Page_Overview - Sales and Care Toolbox/button_Message'))

WebUI.click(findTestObject('Object Repository/API/Page_Overview - Sales and Care Toolbox/button_Search'))

WebUI.verifyElementVisible(findTestObject('Object Repository/API/Page_Overview - Sales and Care Toolbox/canvas'))

WebUI.closeBrowser()

