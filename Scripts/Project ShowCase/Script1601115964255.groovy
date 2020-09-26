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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app.slack.com/client/T015K1W04H5/threads/thread/C017SU8EAQ0-1600616972.225200')

WebUI.setText(findTestObject('Object Repository/test/input_Enter your workspaces Slack URL_domain'), 'microsoftmlchallenge')

WebUI.click(findTestObject('Object Repository/test/button_Continue'))

WebUI.click(findTestObject('Object Repository/test/button_Continue with Google'))

WebUI.setText(findTestObject('Object Repository/test/input_Slack_identifier'), 'kanojiyamayur')

WebUI.click(findTestObject('Object Repository/test/div_Next_VfPpkd-RLmnJb'))

WebUI.waitForElementVisible(findTestObject('Object Repository/test/input_Too many failed attempts_password'), 5000)

WebUI.setEncryptedText(findTestObject('Object Repository/test/input_Too many failed attempts_password'), '+JymcMzvlpyrUxemvb5+mA==')

WebUI.sendKeys(findTestObject('Object Repository/test/input_Too many failed attempts_password'), Keys.chord(Keys.ENTER))

WebUI.waitForJQueryLoad(5000)

WebUI.waitForPageLoad(0)

WebUI.delay(10)