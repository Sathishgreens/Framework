package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {
	
	private static void sample() throws IOException {
		
		File file = new File("C:\\Users\\Lenovo\\Desktop\\Login.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
	
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		
		CellType cellType = cell.getCellType();
		
		System.out.println(cellType);
		DataFormatter formatter = new DataFormatter();
		String formatCellValue = formatter.formatCellValue(cell);
		System.out.println(formatCellValue);
	}
	
	public static void main(String[] args) throws IOException {
		sample();
	}
	
	

}
