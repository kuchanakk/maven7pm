package exceldata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceloper {
	
	static String excelfile="C:\\Users\\kiran\\eclipse-workspace\\mavenproject\\resources\\testdata.xlsx";
	
	public static String readata(int row , int clm) throws IOException {
		
		FileInputStream fis = new FileInputStream(excelfile);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String expectedtext=wb.getSheet("Sheet2").getRow(row).getCell(clm).getStringCellValue();
		
	return expectedtext;
		
	}
	
	
	public static void writedata(int row , int clm,String value) throws IOException {
		FileInputStream fis = new FileInputStream(excelfile);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		wb.getSheet("Sheet2").getRow(row).createCell(clm).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(excelfile);
		wb.write(fos);
		fos.close();
	}
	

}
