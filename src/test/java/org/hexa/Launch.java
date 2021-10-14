package org.hexa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Launch {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\suresh\\eclipse\\Maven_9AM\\ExcelData\\Demo.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.getSheet("Demo");
	Row r = s.getRow(2);
	Cell cell = r.getCell(0);
	
}
}
