package datadriventest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readfromexcelusingmethodchaining {

	public static void main(String[] args) throws IOException {
		// step 1: Convert physical file into java readable  object
		FileInputStream fis = new FileInputStream("./src/test/resources/DataDrivenTest.xlsx");

		// step 2: Open workbook
		Workbook wb = WorkbookFactory.create(fis);

		System.out.println(wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue());
		System.out.println(wb.getSheet("Sheet1").getRow(3).getCell(1).getNumericCellValue());
		wb.close();
	}
}
