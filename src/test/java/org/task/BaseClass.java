package org.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass {

	public static File f;
	public static FileInputStream fin;
	public static FileOutputStream fo;
	public static Workbook book;
	public static Sheet sh;
	public static Row r;
	public static Cell c;
	
	
	public static void readExcel(int rowNo, int cellNo) throws IOException {
	
		 f = new File("C:\\Users\\pc\\eclipse-workspace\\NEW\\PriyaMvn\\Excel\\Students.xlsx");
		 fin = new FileInputStream(f);
		 book = new XSSFWorkbook(fin);
		 sh = book.getSheet("Students");
		 r = sh.getRow(rowNo);
		int rowCount = sh.getPhysicalNumberOfRows();
		System.out.println("No of Rows:"+rowCount);
		 c = r.getCell(cellNo);
		int cellCount = r.getPhysicalNumberOfCells();
		System.out.println("No of Cells:"+cellCount);
		
		for (int i = 0; i < rowCount; i++) {
			
			 r = sh.getRow(i);
			
			for (int j = 0; j < cellCount; j++) {
				
				Cell c1 = r.getCell(j);
				System.out.println(c1);
			}
	
		}
		

	}
	
	public static void writeNameData(String name1, int a) throws IOException {
		
		 f = new File("C:\\Users\\pc\\eclipse-workspace\\NEW\\PriyaMvn\\Excel\\Students.xlsx");
		 fin = new FileInputStream(f);
		 book = new XSSFWorkbook(fin);
		 sh = book.getSheet("Students");
		 r = sh.createRow(a);
		 c = r.createCell(1);
		 c.setCellValue(name1);
		 fo = new FileOutputStream(f);
		 book.write(fo);
		 
		 System.out.println("Name updated in Excel");

	}
	
	public static void writeCourseData(String name2, int a) throws IOException {
		
		 f = new File("C:\\Users\\pc\\eclipse-workspace\\NEW\\PriyaMvn\\Excel\\Students.xlsx");
		 fin = new FileInputStream(f);
		 book = new XSSFWorkbook(fin);
		 sh = book.getSheet("Students");
		 r = sh.createRow(a);
		 c = r.createCell(1);
		 c.setCellValue(name2);
		 fo = new FileOutputStream(f);
		 book.write(fo);
		 
		 System.out.println("Course updated in Excel");

	}
}
