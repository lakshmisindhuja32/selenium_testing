package frameworksday6;

import java.io.FileInputStream;
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

public class ddt2_amazonpage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		  ChromeDriver d=new ChromeDriver();
		  FileInputStream f=new FileInputStream("D://ddt2.xlsx");
		  XSSFWorkbook wb=new XSSFWorkbook(f);
		  XSSFSheet ws=wb.getSheet("Sheet1");
		  Row r=null;
		  Cell c=null;
		  d.get("https://demo.guru99.com/test/newtours/");
		  d.manage().window().maximize();
		  WebElement drop=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		  List<WebElement>drop1=drop.findElements(By.tagName("a"));
		  System.out.println(drop1.size());
		  for(int i=0;i<drop1.size();i++)
		  {
		   System.out.println(drop1.get(i).getText());
		   r=ws.createRow(i);
		   r.createCell(0).setCellValue(drop1.get(i).getText());
		   r.createCell(1).setCellValue("pass");
		   
		  }
		  
		  FileOutputStream f1=new FileOutputStream("D://ddt2.xlsx");
		  wb.write(f1);
		  d.close();

		

	}

}
