package methodsWebEelment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Cb%7Cfb%20log%20in%7C&placement=&creative=589460569900&keyword=fb%20log%20in&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-18520983355%26loc_physical_ms%3D9301536%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwp6CkBhB_EiwAlQVyxTSrcZfVS-mpAHKnJzbTzNej4aBPM_YPN9X4Qh-Q3CXrc9YEoaCUNBoCAWIQAvD_BwE");
		System.out.println(driver.findElement(By.id("u_0_b_T4")).getText());

	}

}
