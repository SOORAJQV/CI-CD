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

WebUI.navigateToUrl('https://auth-q-sit-pf.qvantel.systems/auth/realms/qvantel/protocol/openid-connect/auth?ui_locales=en&scope=openid&response_type=code&redirect_uri=https%3A%2F%2Fsct-q-sit-pf.qvantel.systems%3A443%2Foauth2%2Fcallback&state=4d1106e1-0c9b-41b4-9242-f65ac1b46a8d%7C%2F&client_id=sales-and-care-toolbox')

WebUI.setText(findTestObject('Object Repository/Qsuper-onbrd/Page_Sign in to qvantel/input_Username or email_username'), 
    'tom')

WebUI.setEncryptedText(findTestObject('Object Repository/Qsuper-onbrd/Page_Sign in to qvantel/input_Password_password'), 
    'FzsCvGRjjtU+KJvNcyw02R7E5wBhXDe6')

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Sign in to qvantel/input_Password_login'))

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Sales and Care Toolbox/a_Return to the start page'))

WebUI.verifyElementText(findTestObject('Page_Dashboard - Sales and Care Toolbox/div_Tom Tamer'), 'Tom Tamer')

WebUI.verifyElementText(findTestObject('Object Repository/Qsuper-onbrd/Page_Dashboard - Sales and Care Toolbox/div_No active customer session'), 
    'No active customer session')

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Dashboard - Sales and Care Toolbox/span_Shop'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/nav_PlansPrepaid plansMobile prepaidPostpai_ad7605'), 
    0)

WebUI.click(findTestObject('trial/Page_Shop - Sales and Care Toolbox/a_Mobile Postpaid'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/div_Risk assessment (credit check) must be _1cb8bb'), 
    0)

WebUI.verifyElementClickable(findTestObject('Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/updated_button_Perform risk assessment'))

WebUI.click(findTestObject('Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/updated_button_Perform risk assessment'))

WebUI.verifyElementVisible(findTestObject('Qsuper-onbrd/Page_Shopidentification window - Sales and Care Toolbox/div_Identification details'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/select_Please select an alternative  Drivin_60f290'), 
    'driving-license', true)

WebUI.setText(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/input_Identification code_idNumber'), 
    identificationid)

WebUI.selectOptionByValue(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/select_Please select an alternative  Afghan_df89e8'), 
    'FI', true)

WebUI.setText(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/input_Issuing authority_issuingAuthority'), 
    issuingauthority)

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/button_Search'))

WebUI.waitForElementPresent(findTestObject('Qsuper-onbrd/Page_Shop riskassesment- Sales and Care Toolbox/div_No previously stored customer info found. Continue by defining a new customer'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/select_Please select an alternative  Compan_88043b'), 
    'natural-person', true)

WebUI.setText(findTestObject('Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/input_Given Name_givenName'), givenname)

WebUI.selectOptionByValue(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/select_Please select an alternative  Afghan_df89e8_1'), 
    'IN', true)

WebUI.setText(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/input_FamilyName_familyName'), 
    familyname)

WebUI.setText(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/input_City_city'), city)

WebUI.setText(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/input_Street_street'), street)

WebUI.setText(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/input_Postal code_postalCode'), 
    postalcode)

WebUI.setText(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/input_Email Address_email'), 
    email)

WebUI.verifyElementClickable(findTestObject('Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/button_Continue'))

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/button_Continue'))

WebUI.getText(findTestObject('Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/div_Risk assessment was successful'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Qsuper-onbrd/Page_Shopsupershop - Sales and Care Toolbox/i_- month_fa fa-shopping-basket ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/button_Select'))

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/button_Continue'))

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/label_358900038080'))

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/button_Continue'))

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/button_Confirm'))

WebUI.click(findTestObject('Qsuper-onbrd/Page_ShopTERM - Sales and Care Toolbox/div_One time_custom-control custom-radio custom-control-standalone ng-tns-c255-8'))

WebUI.click(findTestObject('Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/button_Confirm'))

WebUI.verifyElementText(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/p_Saved'), 'Saved!')

WebUI.verifyElementText(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/p_Saved'), 'Saved!')

WebUI.verifyElementText(findTestObject('Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/p_Saved'), 'Saved!')

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/span_Continue'))

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/span_Continue'))

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/span_Continue'))

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/span_Approve'))

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/div_View and edit filled information Basket_94a5c1'))

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/button_Go to checkout'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/legend_Basket Details'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/form_Basket DetailsItemPay nowFirst invoice_e0e07d'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/select_Please select an alternative  Invoice'), 
    'invoice', true)

WebUI.verifyElementClickable(findTestObject('Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/button_Submit'))

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/div_Checkout completed'), 
    0)

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/input_Mobile device_query'))

WebUI.setText(findTestObject('Object Repository/Qsuper-onbrd/Page_Shop - Sales and Care Toolbox/input_Mobile device_query'), 
    fullname)

WebUI.click(findTestObject('Qsuper-onbrd/Page_Overview - Sales and Care Toolbox/button_Customer name_submit-search'))

WebUI.delay(20)

WebUI.verifyElementText(findTestObject('Object Repository/Qsuper-onbrd/Page_Overview - Sales and Care Toolbox/span_Active'), 
    'Active')

WebUI.getText(findTestObject('Object Repository/Qsuper-onbrd/Page_Overview - Sales and Care Toolbox/span_trerwcffscghiuuyys 543'))

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Overview - Sales and Care Toolbox/span_Products'))

WebUI.verifyElementText(findTestObject('Object Repository/Qsuper-onbrd/Page_Products - Sales and Care Toolbox/span_Active'), 
    'Active')

WebUI.getText(findTestObject('Object Repository/Qsuper-onbrd/Page_Products - Sales and Care Toolbox/div_Qvantel Super Active'))

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Products - Sales and Care Toolbox/i_Shop_fa fa-list-alt ng-star-inserted'))

WebUI.click(findTestObject('Qsuper-onbrd/Page_Overview - Sales and Care Toolbox/span_Products'))

WebUI.click(findTestObject('Qsuper-onbrd/Page_Products - Sales and Care Toolbox/i_Shop_fa fa-list-alt ng-star-inserted'))

WebUI.click(findTestObject('Qsuper-onbrd/Page_Overview - Sales and Care Toolbox/span_Products'))

WebUI.click(findTestObject('Qsuper-onbrd/Page_Products - Sales and Care Toolbox/i_Shop_fa fa-list-alt ng-star-inserted'))

WebUI.delay(20)

WebUI.verifyElementText(findTestObject('Object Repository/Qsuper-onbrd/Page_Orders - Sales and Care Toolbox/span_Completed'), 
    'Completed')

WebUI.getText(findTestObject('Object Repository/Qsuper-onbrd/Page_Orders - Sales and Care Toolbox/span_Qvantel Postpaid Subscription'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Qsuper-onbrd/Page_Orders - Sales and Care Toolbox/span_Completed'), 
    'Completed')

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Orders - Sales and Care Toolbox/i_First invoice_fa fa-angle-double-right ng_adfeab'))

WebUI.click(findTestObject('Object Repository/Qsuper-onbrd/Page_Order items - Order details - Sales an_3e404d/div_AddQvantel Postpaid Subscription Completed'))

WebUI.verifyElementText(findTestObject('Qsuper-onbrd/Page_Order itemsCOMPL - Order details - Sales and Care Toolbox/span_Completed'), 
    'Completed')

WebUI.closeBrowser()

