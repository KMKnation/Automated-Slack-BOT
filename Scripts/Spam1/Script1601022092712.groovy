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

WebUI.setEncryptedText(findTestObject('Object Repository/test/input_Too many failed attempts_password'), '+JymcMzvlpyrUxemvb5+==')

WebUI.sendKeys(findTestObject('Object Repository/test/input_Too many failed attempts_password'), Keys.chord(Keys.ENTER))

WebUI.waitForJQueryLoad(5000)

WebUI.waitForPageLoad(0)

WebUI.delay(10)

WebUI.navigateToUrl('https://app.slack.com/client/T015K1W04H5/threads/thread/C017SU8EAQ0-1600616972.225200', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Success/div_Search Machine Learning Scholarship for_43ebad'))

WebUI.click(findTestObject('Object Repository/Success/div_Reply'))

def nameList = [":aww-onion-head:", ":pikachu_hi:", ":eyes:",
	 ":bunny-jitter-dance:",":dancing_penguin:", ":a-parrot:",
	 "https://microsoftmlchallenge.slack.com/archives/C016CCNN4BB/p1601080177077800",
	 "YOU ARE ONE AWESOME SET OF PEOPLE :heart:",
	 "In this last week of the program, we know you will keep supporting each other to together walk past the finish line and you will keep pumping up the spirits of this community until the very end! :fire:",
	 "Remember to check the courses, quizzes and labs to make sure you 've completed it.",
	  ":blob-sign-yes:", ":joy:", ":blob-sunglasses:", ":sabyh:",
	 "Please fill END of the program survey :) https://docs.google.com/forms/d/e/1FAIpQLSfFh2ayd68gxT76S9xfhE7ojnSqAvfkyEwhZbaoHW7o5J1ANg/viewform",
	   ":blob-excited:",
	   "A Peek into All That's Happening! https://sites.google.com/udacity.com/microsoftazurechallenge/community/alldayml-event?pli=1&authuser=1#h.pjlatl95xag", 
	    ":charmander_dancing:", 
		"What is the #AllDayML Event? https://sites.google.com/udacity.com/microsoftazurechallenge/community/alldayml-event?pli=1&authuser=1#h.d3iq2tnztdah",
		":dancing_mufasa:",
		"you are still here :joy:",
		 ":hug:"]

def nameListSize = nameList.size()
def r = new Random()
for(int i=0;i<30000;i++){
		
	WebUI.setText(findTestObject('Object Repository/Success/div_Test 4'), ''+nameList.get(r.nextInt(nameListSize)))
	
	WebUI.click(findTestObject('Object Repository/Success/i__c-icon c-icon--paperplane-filled'))
	
	WebUI.delay(30)
}

