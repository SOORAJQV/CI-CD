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

WebUI.navigateToUrl('https://auth-q-sit-pf.qvantel.systems/auth/realms/qvantel/protocol/openid-connect/auth?ui_locales=en&scope=openid&response_type=code&redirect_uri=https%3A%2F%2Fsct-q-sit-pf.qvantel.systems%3A443%2Foauth2%2Fcallback&state=78bb5da5-ae12-4ce4-97a9-e4041c878015%7C%2F&client_id=sales-and-care-toolbox')

WebUI.setText(findTestObject('Object Repository/Qsuper-onbrd/Page_Sign in to qvantel/input_Username or email_username'), 
    'tom')

WebUI.setEncryptedText(findTestObject('Object Repository/Qsuper-onbrd/Page_Sign in to qvantel/input_Password_password'), 
    'FzsCvGRjjtU+KJvNcyw02R7E5wBhXDe6')

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Sign in to qvantel/input_Password_login'))

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Sales and Care Toolbox/a_Return to the start page'))

WebUI.verifyElementText(findTestObject('Page_Dashboard - Sales and Care Toolbox/div_Tom Tamer'), 'Tom Tamer')

WebUI.verifyElementText(findTestObject('Object Repository/Qsuper-onbrd/Page_Dashboard - Sales and Care Toolbox/div_No active customer session'), 
    'No active customer session')

WebUI.setText(findTestObject('Object Repository/identification/Page_Dashboard - Sales and Care Toolbox/input_Mobile device_query'), 
    fullname)

WebUI.click(findTestObject('Qsuper-onbrd/Page_Overview - Sales and Care Toolbox/button_Customer name_submit-search'))

WebUI.click(findTestObject('Object Repository/identification/Page_Overview - Sales and Care Toolbox/span_Qvantel Super 5G'))

WebUI.click(findTestObject('Object Repository/identification/Page_Overview - Sales and Care Toolbox/span_Active'))

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Overview - Sales and Care Toolbox/span_Products'))

WebUI.verifyElementText(findTestObject('Object Repository/Qsuper-onbrd/Page_Products - Sales and Care Toolbox/span_Active'), 
    'Active')

WebUI.getText(findTestObject('Object Repository/Qsuper-onbrd/Page_Products - Sales and Care Toolbox/div_Qvantel Super Active'))

WebUI.click(findTestObject('Object Repository/identification/Page_Overview - Sales and Care Toolbox/span_Customer'))

WebUI.verifyElementPresent(findTestObject('Object Repository/identification/Page_Customer details - Sales and Care Toolbox/div_Account information Edit account inform_6de9a4'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/identification/Page_Customer details - Sales and Care Toolbox/span_Active'), 
    'Active')

WebUI.verifyElementText(findTestObject('Object Repository/identification/Page_Customer details - Sales and Care Toolbox/span_dsam 111'), 
    fullname)

WebUI.verifyElementVisible(findTestObject('Object Repository/identification/Page_Customer details - Sales and Care Toolbox/span_natural-person'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/identification/Page_Customer details - Sales and Care Toolbox/span_dsam'), 
    givenname)

WebUI.verifyElementText(findTestObject('Object Repository/identification/Page_Customer details - Sales and Care Toolbox/span_111'), 
    familyname)

WebUI.verifyElementText(findTestObject('Object Repository/identification/Page_Customer details - Sales and Care Toolbox/span_dsam 111_1'), 
    fullname)

WebUI.verifyElementText(findTestObject('Object Repository/identification/Page_Customer details - Sales and Care Toolbox/span_98000011123'), 
    identificationid)

WebUI.verifyElementText(findTestObject('Object Repository/identification/Page_Customer details - Sales and Care Toolbox/span_srjgmail.com'), 
    email)

WebUI.verifyElementText(findTestObject('Object Repository/identification/Page_Customer details - Sales and Care Toolbox/span_98000011123_1'), 
    identificationid)

WebUI.verifyElementText(findTestObject('Object Repository/identification/Page_Customer details - Sales and Care Toolbox/span_cjbjbaasasscvcvcsdsfgh'), 
    issuingauthority)

WebUI.closeBrowser()

