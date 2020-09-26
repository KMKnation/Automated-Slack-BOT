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
		":alert: :alert: :alert: :alert: :alert: :alert: :alert: :alert: :alert: :alert: :alert: :alert: \n"
		+"Never forget why this thread was created and the frustration of people with number 90+ in Tambola game.\n Game with rigged :rolling_on_the_floor_laughing: Don't forget to blame the organizers and  @Sabyh :joy: :joy: :joy:",
		 ":hug:"]

def achievers = ["Subhasis Rout" ,"Soufiane NAITTOULAHYANE" ,"Mohan M" ,
	"Michael Zulu" ,"Joanne Mary Jons" ,"Raquel Andrea Cerda Montañez" ,
	"Abirami Baskaran" ,"Aakash" ,"Yashasvi" ,"Abiola Omolaja" ,
	"Rafael Guntzel Arenhart" ,"Emily Tan" ,
	"Sourav Kumar Nag" ,"Arushikha" ,"Shikhar Chhabra" ,
	"Donatienne.Udacity" ,"Afreen Kansal" ,"Michael" ,"Shivangee Singh Chouhan "
	 ,"siddhartha bhattacharya" ,"Akshay mahale" ,"Pooja Sajnani" ,"AbletMuhtar" ,"MihailD" ,"Anna" ,"Jagriti Prakash" ,"Ly Nguyen Van" ,"Rajasekhar" ,"Tina" ,"Pbeugnet" ,"iulian v" ,"AndyP" ,"Cécile N." ,"Fabio Ismerim" ,"Annie Zhou" ,"Avijit Das" ,"Deekshita Saikia" ,"Stefan Z." ,"Juan David R." ,"Apurva K" ,"Rutuja Kawade" ,"Mohamed Gamal Orief" ,"Yago Gonzalez" ,"Pooja Tope-Puranik" ,"tmmsagheer" ,"Aishwarya" ,"Aayush Sharma" ,"1729" ,"Muhammad Saad Uddin" ,"Swapnil Gaikwad" ,"Mohamed Faris" ,"Rajaram Punyamanthula" ,"Erkan" ,"Nithin Upadhya B K" ,"Christodoulos Santorinaios" ,"Boston" ,"Eman" ,"Joe Abraham" ,"Deividas Mataciunas" ,"Anna Kondratenko" ,"manas" ,"Vishal Bansal" ,"BWO" ,"Veronica" ,"Bhushit Nema" ,"LUIS CORCHADO" ,"R. Reis" ,"Wilson Teng" ,"Rohan" ,"ManasviDuggal" ,"Cesar Ramirez" ,"Thant Thazin Eain" ,"carloshvp" ,"Elena Lestini" ,"nurilee" ,"Vivica" ,"Gabi Lopez" ,"Mounika Beesapu" ,"Nischitha N" ,"Gowthami" ,"DalalMouani" ,"Olalekan Bello " ,"Ahmed M. Hasan" ,"Vikas Yadav" ,"Rajvi Sheth" ,"Flaka" ,"Tim Truty" ,"Jerry Liao" ,"tnitave" ,"Jayani Edirisinghe" ,"Mariia Karyaeva" ,"Aarthi Padmanabhan" ,"samia butt" ,"Sharjeel.Butt" ,"arfat" ,"Espoir" ,"Érico Luiz Encarnação Rocha" ,"Khaled Skairek" ,"Julia" ,"Tejaswini G" ,"PRIYANKA UMRE" ,"Andreas Rhode" ,"Shudipto Trafder" ,"ruhi47" ,"Md. Abdul Monim" ,"Darshana S" ,"Venkata Ravi K A" ,"Noel Ching" ,"Ashu Priya" ,"Nilesh_Bhosale" ,"Lane" ,"Oriji Sandra O" ,"Afamefuna Chidinma Deborah " ,"BMC" ,"Astika Nehra" ,"Lee Francis" ,"afreenaliya" ,"Anupriya Saraswat" ,"AJ" ,"Olasupo Tobiloba" ,"Hsin-Wen Chang" ,"Mayur Kanojiya" ,"mlearner" ,"daniel.villegas" ,"florentina.vlasceanu" ,"Garima Sharma" ,"Murad A. Yaghi" ,"Dmytro Korolov" ,"bruce" ,"Arisht Jain" ,"Clinton B" ,"AndyL" ,"lekha" ,"Himani" ,"Anurag_hiwanj" ,"Joseph Itopa" ,"Arindam Banerjee" ,"Sudipta" ,"Atul" ,"Chidi Nwaneto" ,"huntingcarlisle" ,"Suman Dandapat" ,"Ram" ,"emily" ,"shivam khosla" ,"Nícolas Pauli" ,"Norman Lim" ,"Aishwarya Das" ,"Peace Peters " ,"Maryam Zahra Hasan" ,"Grover" ,"Mahesh" ,"KT.Yap" ,"Dana" ,"Parvati" ,"R.M Subodha Lakmini Rathnayake" ,"Gauri" ,"AkshataRevankar" ,"snehallokesh1996" ,"Rachel Ann Drury" ,"Abhra Debroy" ,"AudreyST" ,"Mahynour" ,"Nikita Shrestha" ,"Karol Karwat" ,"sanyam" ,"Hind" ,"Abdalmalek Abu-raddaha " ,"Anshu Trivedi" ,"SHASHANK KUMAR" ,"Vanshika Mediratta" ,"Blumenau" ,"Shreyas Kale" ,"selinozenc" ,"Abir Ghenaiet " ,"Bhadresh Savani" ,"RohankumarReddyDamagatla" ,"Silvana Zdravevska" ,"Leo Biaggi" ,"Ijeoma Ndu" ,"Arun Sriraman" ,"Shanaya Mehta" ,"Yash Bhawsar" ,"Ali Eren" ,"Rodrigo Solis" ,"Obinna Iheanachor" ,"Swati Narkhede" ,"IrisSusana" ,"raj jha" ,"Miruna" ,"Ifeoluwa Ojewande" ,"São Paulo" ,"Onyinye" ,"abdul" ,"Jayavardhan Kaspa" ,"AkashH" ,"Sahil Arora" ,"Alberto Pardo" ,"Tj.Udacity" ,"Himanshu Madan" ,"Eduardo Navickas" ,"Anita kumari Jena" ,"Ray's Web Presence" ,"S H Aishwarya" ,"Paulo Farias" ,"Sushma Jadhav" ,"Milcah Maina" ,"Tushika Singh" ,"gaston tavara" ,"Gayathri Rajan" ,"rachhek shrestha" ,"eleftheria" ,"Visarion" ,"Charlotte Kerio" ,"Xian Xun" ,"Neha Dohare" ,"Heber" ,"Akhilesh" ,"Ruthu" ,"U016Q848ME1" ,"Ben Lambert" ,"Moldovan Dorin" ,"Bhupinder" ,"Mufaddal Haidermota" ,"Ishani Bhardwaj" ,"Namrata" ,"Remi" ,"Anderson Fardin Vinco" ,"Basifrank" ,"Ankur" ,"Gigi" ,"Ishika Goel" ,"Saswat Kumar Rout" ,"Dayris RM" ,"Yolanda Zhang" ,"Sayak Mukherjee" ,"Sherline Kinyanjui" ,"AYENI OREJAH" ,"balu_r" ,"Hayat.H" ,"Christian Rivera" ,"Nidhi Singh" ,"Kevin Wettaka" ,"Nancy Al Aswad " ,"Temitayo Ilori" ,"Ravi" ,"Jaiprasad" ,"Martin Tonikyan " ,"M. Saif Ahmad" ,"Opeyemi Fabiyi" ,"Zoé Goey" ,"Manas_v" ,"Anna Hae" ,"Whitehat" ,"Shriya Narang " ,"Samuela Anastasi" ,"jyotish bora" ,"Annsana Baby " ,"Jude" ,"LavanyaPolamarasetty" ,"Íñigo Lejarza" ,"HowardO" ,"Daria" ,"saimaheshkrishna" ,"Jeanet" ,"Muhammad Rake Linggar Anggoro" ,"Edward.Udacity" ,"Vanessa G." ,"Somya Dwivedi" ,"Ani" ,"Ram Nayudu" ,"Vikram Verma" ,"Tamjid Ahmed" ,"Gunveen Batra" ,"Vinicius Bindewald" ,"Lakinkumar Patel" ,"Muhammad.Ali" ,"Omar Fuentes" ,"Priyanka Gupta" ,"Eddy Qay" ,"Ritika Gupta" ,"Rashmi Kaslikar" ,"Prasansha Satpathy " ,"Nikolaos Gkatzios" ,"Volker" ,"Reijay" ,"Rothwulf" ,"Soumyanil Banerjee" ,"Tanuj Kapila" ,"Marco Nogueira" ,"Pree" ,"Rucha Jogaikar" ,"simchuck" ,"NIDHI_V" ,"Lekha Mhatre" ,"Sachin" ,"ILS" ,"SnehaPawar" ,"Yusuf Alma" ,"Ashika" ,"kkech" ,"Dina Abdul-Rasoul" ,"Vaani Bansal" ,"Karina" ,"Ruslan Idelfonso Magana Vsevolodovna" ,"Dina AbdelRahman" ,"Hexuan Zhang" ,"Anshul Srivastava" ,"Shatakshi Pachori" ,"Fernando T" ,"Srinath Velavan" ,"Claudia Sameshima" ,"Reshma Mandala " ,"Alexander Korolev" ,"Memphis Ndego" ,"Shayla Costello" ,"Ayesha Akhtar" ,"Amitesh Kumar" ,"Tali" ,"Luciano de Toledo Santos" ,"Gabriella" ,"Hemanshu Gupta" ,"Ahmed Gharib" ,"Chirag Baru" ,"Perez Ogayo" ,"Hariharan Palanichamy" ,"Sachin Dev S" ,"wildes.silva" ,"vinay" ,"Varshini Ravi" ,"FATIMA A" ,"Pavan B J" ,"Aayushma Pant" ,"Nabil Belmokhtar" ,"Kuldeep Kumar" ,"Adolfo García" ,"Rafael Dias" ,"Sweta" ,"Alexandre Oliveira" ,"Michelle Foo" ,"Satish Mulay" ,"Nirmal" ,"MAfef" ,"Divyanshu Malik" ,"Prashasti Gupta" ,"Nikhita Panchangam" ,"Mayakoti Lakshmi Bhavana" ,"NIYOMUKIZA THAMAR" ,"eparamasari" ,"Ameenah" ,"susyjam" ,"Pippa" ,"Carlos Alcantara" ,"Sajjad" ,"Arunkumar Venkataramanan" ,"gagan" ,"Ahmed Nour" ,"Swapna K E" ,"Reshma Ramesh Babu" ,"Somesh Saini" ,"annanya24" ,"Viral Mamniya" ,"Ashish Karn" ,"Abdul Basit" ,"pawan.prasad" ,"Anand Kumar" ,"Nuria A Malet Quintar" ,"Dimitra Karamperi" ,"Mohammed Morhaf Jaela" ,"Marie Carmelina Sandrine Joseph" ,"SE" ,"Gabriela Felder" ,"Paula" ,"Gunisha Chaturvedi" ,"M Thejaswini" ,"Michael Roland Zulu" ,"Nishtha" ,"hannes delbeke" ,"Ian Cecil Mawuli Akoto " ,"Rishika.Udacity" ,"Seetha Raman Subramanian" ,"ujjwal kalkhande" ,"Diana Meneses " ,"Panth Shah" ,"Pratheeksha C Dhanpal" ,"Nathan_" ,"Kofi Ocran" ,"Thierry Blanchart" ,"Suresh Kumar" ,"Sandhya Singh" ,"Chetan Kuckian" ,"Supriya Khanolkar" ,"Olga Gnatenko" ,"Kajal Aggarwal" ,"Tanushree Pai" ,"Hanane Ouhammouch" ,"Kevin Bardool" ,"Shivansh Srivastava" ,"Bharati" ,"Anand Jha" ,"Hafssa" ,"Kawsar Ahmed" ,"wlemma" ,"Ni Putu Noviyanti Kusuma" ,"dineshtech" ,"C.Gustavo_Seminario" ,"Hasan Ozyavru" ,"Magdalena Weyher" ,"apoorva" ,"Deepak Kanuri" ,"Anne Losch" ,"pkams" ,"erankikiran" ,"Danielle Paes Barretto" ,"Ipshita Chakraborty" ,"Anga.Koko" ,"Lara" ,"atalex" ,"Muhammad Haris" ,"Clarence Lam" ,"FATIMA A." ,"Pavithra Devi M" ,"Kalpa Kalhara Sampath" ,"Mobasshir Bhuiyan" ,"Chuen" ,"M. Saqib" ,"Gaston R" ,"Sayed Ahmed" ,"Kiboss" ,"medmghari" ,"Raul Rada-Puiu" ,"Purushottam Dangol" ,"okeybond" ,"Arshi Saleh" ,"Jose Praveen" ,"lakin.patel" ,"Dina ElGammal" ,"manjunath" ,"Michalis Chaviaras" ,"Riya Acharya" ,"Carlos Rojas V" ,"Nimisha Singh" ,"Russell Hanna" ,"Michelle Santokie" ,"Aarthi Alagammai" ,"Catherine Muraya" ,"Danilo de Oliveira" ,"Prateek Mishra" ,"Rohan Kumar Reddy Damagatla" ,"Loise" ,"A7MED" ,"LUIS.CORCHADO" ,"Hari Prasanth SM" ,"Ishwarya Lakshmi" ,"Rahul Lokesh" ,"Bello Musa" ,"Svet" ,"Shivani Prusty" ,"Shalaka Wardha" ,"Ozan Ersoy" ,"Prasanth Nair" ,"Atulya" ,"Vidhi Agarwal" ,"sherbin" ,"Christian" ,"GOGUL RAJ" ,"LauraT" ,"Peter Park" ,"Varsha Kesavan" ,"Narse" ,"Duygu" ,"Slomon Ejukorlem" ,"Anum Abdullah" ,"Its_srs" ,"Luiz Roma" ,"Oscar Dicenta" ,"Khalid Waleed" ,"Palak Jalota" ,"Shrutika Aggarwal" ,"SyahrilRS" ,"Akki07" ,"Palak Rathi" ,"Oistamo Mamadsaidova" ,"Linh Nguyen" ,"Ferdib-Al-Islam" ,"Mehak Shahid" ,"Minoli Vartak" ,"Joseph Henry" ,"Priyansh Gupta" ,"Mohamed Fazal Mustafa" ,"Sandy Davis" ,"Divya Sri Bhargavi " ,"Sam Rostami" ,"Ishwarya Chandramouli" ,"tunde" ,"Niharikaa" ,"sumeet" ,"RAMKRISHNA KUNDU" ,"Kaushal kashyap" ,"Advait Kumar" ,"Pavlos Tsiantis" ,"AB" ,"A.Hamido" ,"alexander milks" ,"Umesh Sharma" ,"Pravinbhai Kucha" ,"Neema Mwaniki" ,"Pritom Chowdhury" ,"Evgeny Lavrov" ,"Surabhi Srivastava" ,"Melwin Amith D'Almeida" ,"Rakshaa Viswanathan" ,"Abita Ann Augustine" ,"Jyoti" ,"kiran kalicherla" ,"Varada.B" ,"Jarnen" ,"Karthik Ranggarajan" ,"Spyridon Mouratis" ,"Kevin Estrella" ,"Timothy Moore" ,"AKHIL JAMES" ,"Sadmi" ,"Vijoy Basu" ,"Cesar" ,"jyotsnasingh" ,"slack not working" ,"Radha Revathi G" ,"Ankita Maurya " ,"Sagar Jangid" ,"Avinash Topani" ,"CARLOS ANDRES ALVAREZ DAVILA" ,"Ritika Pal" ,"Sasanapuri Aishwarya" ,"Tarun Shukla" ,"Sreenu Baikani" ,"Purvaja Durga Barnala" ,"Audrey Mengue" ,"Amardeep Singh" ,"Solomon Kamau" ,"Martin-Philipp Irsch" ,"Engin Alkan" ,"Weiyang Sun" ,"Prabha Venkatesh" ,"Chetana Tadadikar" ,"Tharani Vadde" ,"Amara Eze" ,"Anderson Furtado" ,"Pratyusha Kumar Sahu" ,"Siewlee" ,"Day" ,"Flabio Marz" ,"Zahra Nabila Izdihar" ,"Vedita Kamat" ,"Rachid Retaiba" ,"pablo puente" ,"Rami Azmi" ,"Mary Becken" ,"Melyana" ,"Indrahas" ,"Kum Somi" ,"Fatima-Ezzahra OUHMID" ,"Adekunle Gabriel " ,"Verena Gorris" ,"mars" ,"Satya Ramani" ,"Yagna" ,"Ayoyinka " ,"Wojtek Czuba" ,"Ashish Somvanshi" ,"Lin C." ,"Romana Akter" ,"Sara Saad" ,"moussa" ,"Chelsea Nowlin" ,"Khaled Atamnia" ,"Caio Alencikas" ,"Sandeep Pawar" ,"Frank Hu" ,"Verrah Otiende" ,"Onur Baris" ,"Eva" ,"Anshit Mandloi" ,"ldiaz.udacity" ,"Donthineni Sushma Sri" ,"Monishka" ,"Saakshi Malhotra" ,"Nicholas Miller" ,"Monica Sai Kambala" ,"Petar Petrovski" ,"Mahesh Khatri" ,"Aaditree " ,"sabyh" ,"Amman" ,"Saikat Pandit " ,"Thomas George" ,"Jchavarr" ,"Vivian J." ,"Ricardo" ,"Mrigendra Singh" ,"Florian Ammon" ,"Carlos Castro" ,"Tahani Alsubait" ,"Surbhi Sharma" ,"Nikita Mahajan " ,"Petr" ,"tejas" ,"Ola-sumbo " ,"Akshata " ,"Arshia Shaikh" ,"anya" ,"heman" ,"Marcelo Pereira Marco Peres" ,"Steve Paek" ,"Priyanshi Sharma" ,"Ike Nigel.O" ,"Jahnavi Jonnalagadda" ,"Igor Dias" ,"FedericoM" ,"Oluchi" ,"Bharath Bhambore" ,"Viji" ,"Divaldo Mathias Neto" ,"jt0rres" ,"RJ" ,"Cem" ,"Sessika" ,"Aleem Juma" ,"somatat" ,"jaycob" ,"Sakshi S Gupte" ,"Neringa Bukyte" ,"Sambit Kumar Mohanty" ,"Monika Pawlak" ,"Varnit.Udacity" ,"SowmiyaNarayanan G" ,"Subhendu Maji" ,"Chetan S Rane" ,"U016YG95TAQ" ,"Jyoti Janai" ,"Linh Le " ,"Tanya Chabbra" ,"Pedro Couto" ,"Manoj" ,"Christos Gklinavos" ,"Nayarett González" ,"Toyin Olatile" ,"Ohikhatemen George" ,"Bima Putra Pratama" ,"kazeem Awoniyi" ,"Lagos" ,"bis" ,"rob" ,"Michał Kucharczyk" ,"jhonsen" ,"milind.pathak" ,"Maia Le" ,"Syahril RS" ,"Andres Dorado" ,"Harshit Rai" ,"BE" ,"Miguel Martinez Silva" ,"Utkarsha Kandale" ,"Quy Vu" ,"Clarisse Simoes" ,"Hinson Chung" ,"Mohamed Osama Mohamed Mohana" ,"Tahreem Arif" ,"Ayushi Choudhary" ,"Marwan Saeed Alsharabbi" ,"Garage" ,"Hareesh Namani" ,"Harini Pavithra" ,"Ali Abo-Jadya" ,"Sandra Dumitrescu" ,"Anita Igbine" ,"Herbert Fernandez Tamayo" ,"Houda Aynaou" ,"Godspower Onyenanu" ,"Jonas Afutu" ,"Balkrushn Hirani" ,"Saharul" ,"Arun Kumar Gupta" ,"Anita Gulyasne Goldpergel" ,"Lim Tern Poh" ,"Anjali Poornima" ,"Damir Divkovic" ,"Bilal Azmi" ,"Okello Edward" ,"Wen Chang" ,"Ahmed Abdelhameed" ,"Laboni Akter" ,"Ds" ,"ramreddy" ,"Debalekha Chakraborty" ,"apriyana" ,"Ankita Ghosh" ,"vivek tambi" ,"tamer" ,"Ravikiran Bhonagiri" ,"ketcx" ,"Akash Singh" ,"SALMAN ZAMAN" ,"Shubhra Sachdev" ,"Sakshi-M" ,"melvinroy" ,"Fatima Atiyya" ,"erin song" ,"Albino" ,"Harkirat Singh" ,"ChangSu LEE" ,"Mukund" ,"Atira Bagwan" ,"Nasahtahir" ,"Bree Alfaruq" ,"Sowji" ,"Akash Mhatre" ,"Prathibha" ,"Mokit Hossain" ,"Renee Raven" ,"Varsha.Gore" ,"janebraine" ,"SATHPra" ,"Richu Thomas" ,"Shankar Pandey" ,"Ebiere" ,"Khushal Goyal" ,"OscarDicenta" ,"Muskan Uppal" ,"Dominique Sy" ,"Arpit Dhankhar" ,"Ray Vernagus" 
	,"Sayar Banerjee" ,"Sudha" ,"Rikki Mohanty"]

def nameListSize = nameList.size()
def achieverSize = achievers.size()
def r = new Random()
for(int i=0;i<30000;i++){
		
//	WebUI.setText(findTestObject('Object Repository/Success/div_Test 4'), ''+nameList.get(r.nextInt(nameListSize)))
	WebUI.setText(findTestObject('Object Repository/Success/div_Test 4'), 'Congratulations !! @'+achievers.get(r.nextInt(achieverSize))+' on completing the #50daysofUdacity challenge')
	
	WebUI.click(findTestObject('Object Repository/Success/i__c-icon c-icon--paperplane-filled'))
	
	WebUI.delay(60)
}

