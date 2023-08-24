package datadriventest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceldata {

	public static void main(String[] args) throws IOException {
		//step 1: Convert physical file into java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/DataDrivenTest.xlsx");
		
		//step 2: Open workbook
		Workbook wb=WorkbookFactory.create(fis);
		
		//step 3: Get control over sheet
		Sheet sh=wb.getSheet("Sheet1");
		
		//step 4: Get control over row
		Row r1=sh.getRow(2);
		Row r2=sh.getRow(3);
		
		//step 5: Get control over cell
		Cell c1=r1.getCell(1);
		Cell c2=r2.getCell(1);
		
		//step 6: Get data
		System.out.println(c1.getStringCellValue());
		System.out.println(c2.getNumericCellValue());
		
		//step 7: Close workbook
		wb.close();

	}

}
