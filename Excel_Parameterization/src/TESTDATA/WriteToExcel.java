package TESTDATA;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Workbook wb = new XSSFWorkbook();
		Sheet s1 = wb.createSheet("SHEET A");
		Sheet s2 = wb.createSheet("SHEET B");
		Sheet s3 = wb.createSheet("SHEET C");
		
		Row r1 = s3.createRow(0);
		Row r2 = s3.createRow(1);
		Row r3 = s3.createRow(2);
		
		Cell c1 = r3.createCell(5);
		Cell c2 = r3.createCell(8);
		Cell c3 = r3.createCell(9);
		
		c1.setCellValue(100);
		c2.setCellValue(122325.36);
		c3.setCellValue("selenium");
		
		try (OutputStream fileOut = new FileOutputStream("S:\\JANBASK\\QA-5th-March-2024\\Excel_Parameterization\\src\\TESTDATA\\Test.xlsx")) {
		    wb.write(fileOut);
		}
		
	}

}
