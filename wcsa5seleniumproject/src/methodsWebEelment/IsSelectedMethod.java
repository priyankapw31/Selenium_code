package methodsWebEelment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/oppo-reno8t-5g-sunrise-gold-128-gb/p/itm9ec7deac6401c?pid=MOBGHZ9HZ4AEQGFH&lid=LSTMOBGHZ9HZ4AEQGFHRXGINU&marketplace=FLIPKART&fm=neo%2Fmerchandising&iid=M_467a4c0e-04ac-44c5-a870-98b2d534584d_25_4K7UO67RB4TQ_MC.MOBGHZ9HZ4AEQGFH&ppt=None&ppn=None&ssid=jkg0gceks00000001686721640703&otracker=clp_pmu_v2_Oppo%2Bsmartphones_1_25.productCard.PMU_V2_OPPO%2BReno8T%2B5G%2B%2528Sunrise%2BGold%252C%2B128%2BGB%2529_mobile-phones-bsd-june-aj83n-nou87-store_MOBGHZ9HZ4AEQGFH_neo%2Fmerchandising_0&otracker1=clp_pmu_v2_PINNED_neo%2Fmerchandising_Oppo%2Bsmartphones_LIST_productCard_cc_1_NA_view-all&cid=MOBGHZ9HZ4AEQGFH");
		WebElement checkBox=driver.findElement(By.xpath("(//div[@class='_24_Dny'])[1]"));
		boolean verify=checkBox.isSelected();
		System.out.println(verify);
		Thread.sleep(2000);
        checkBox.click();
        Thread.sleep(1000);
        boolean verify1=checkBox.isSelected();
        System.out.println(verify1);
        
	}

}
