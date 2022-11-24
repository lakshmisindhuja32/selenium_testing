package Scenarios;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class call{

	public static void main(String[] args) throws IOException {
		ChromeDriver d;
		d=new ChromeDriver();
		methods m1 =new methods(d);
		FileInputStream f1=new FileInputStream("D:\\key.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f1) ;
		XSSFSheet xs=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		Iterator<Row> row=xs.iterator();
		while(row.hasNext())
		{
			r=row.next();
			c=r.getCell(2);
			String s1=c.getStringCellValue();
			if(s1.equals("Opening_Browser"))
				m1.opening_browser();
			else if(s1.equals("User_Name"))
			{
				m1.username_enter();
			}
			else if(s1.equals("Password"))
			{
				m1.passwordenter();
			}
			else if(s1.equals("click"))
			{
				m1.click();
			}
			else
			{
				m1.close();
			}
				
		}
		
	}

}
