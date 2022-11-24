package frameworksday6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ddt3_amazonpage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream f=new FileInputStream("D:\\ddt3.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//String baseurl="https://www.amazon.com/"
		//d.get(baseurl);
		d.get("https://demo.guru99.com/selenium/newtours/");
		d.manage().window().maximize();
		WebElement a=d.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		List<WebElement>b=a.findElements(By.tagName("a"));
		
		System.out.println(b.size());
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getText());
			r=ws.createRow(i);
			r.createCell(0).setCellValue(b.get(i).getText());
			b.get(i).click();
			
			String a1=d.getTitle();
			r.createCell(1).setCellValue(a1);
			
			String a2=d.getCurrentUrl();
			r.createCell(2).setCellValue(a2);
			
			a=d.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
			b=a.findElements(By.tagName("a"));
			
		}
		FileOutputStream f2=new FileOutputStream("D:\\ddt3.xlsx");
		wb.write(f2);
		f2.close();
			}

}
