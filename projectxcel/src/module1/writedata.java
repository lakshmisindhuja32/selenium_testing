package module1;

//note: FIRST DELETE THE MODULES CREATED FOR THE PACKAGE OR CLASS IN ORDER TO MAKE THE JAR FILES WORK PROPERLY
//SECOND REMOVE OR CLOSE ALL THE EXCEL FILES BEFORE EXECUTING PROGRAM
//THIRD WRITE THE SHEET NMAE IN THE GETSHEET METHOD

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class writedata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream  f=new FileInputStream("D:\\e.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		Row r=null;
		Cell c=null;
		r=ws.createRow(2);
		r.createCell(1).setCellValue("manual testing");
		r=ws.createRow(3);
		r.createCell(2).setCellValue("QTP");
		r=ws.createRow(4);
		r.createCell(3).setCellValue("selenium");
		FileOutputStream f1=new FileOutputStream("D:\\e.xlsx");
		wb.write(f1);
		f1.close();
	}

}
