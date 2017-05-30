import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.3.109:8070/')

WebUI.setText(findTestObject('location/Page_Z2DATA  Internal System/input_username'), 'nada.mahmoud@z2data.com')

WebUI.setText(findTestObject('location/Page_Z2DATA  Internal System/input_password'), 'P@ssw0rd@2017')

WebUI.click(findTestObject('location/Page_Z2DATA  Internal System/button_Login'))

WebUI.setText(findTestObject('location/Page_Companies List - Z2DATA  Inter/input_txt_CompanyName'), 'kemet')

WebUI.click(findTestObject('location/Page_Companies List - Z2DATA  Inter/button_Search'))

WebUI.click(findTestObject('location/Page_Companies List - Z2DATA  Inter/i_fa fa-share'))

WebUI.click(findTestObject('location/Page_Company Locations - Z2DATA  In/a_Add New'))

not_run: WebUI.click(findTestObject('location/Page_Company Locations - Z2DATA  In (1)/span_box'))

not_run: WebUI.setText(findTestObject('location/Page_Company Locations - Z2DATA  In (1)/input_txt_Product'), 'ultrasound')

not_run: WebUI.selectOptionByValue(findTestObject('location/Page_Company Locations - Z2DATA  In (1)/select_form-control slctCertif'), 
    '53', true)

not_run: WebUI.setText(findTestObject('location/Page_Company Locations - Z2DATA  In (1)/input_form-control inputCertif'), 
    'http://www.kemet.com/14005:2010')

not_run: WebUI.setText(findTestObject('location/Page_Company Locations - Z2DATA  In (1)/input_form-control inputSource'), 
    'http://www.kemet.com/default')

not_run: WebUI.setText(findTestObject('location/Page_Company Locations - Z2DATA  In (2)/input_txt_FullAddress'), 'haram')

not_run: WebUI.setText(findTestObject('location/Page_Company Locations - Z2DATA  In (2)/input_txt_BuldingNumber'), '22')

not_run: WebUI.click(findTestObject('location/Page_Company Locations - Z2DATA  In (2)/span_Select'))

not_run: WebUI.setText(findTestObject('location/Page_Company Locations - Z2DATA  In (2)/input_txt_Street'), 'harameg')

WebUI.setText(findTestObject('location/Page_Company Locations - Z2DATA  In (2)/input_select2-search__field'), 'India')

