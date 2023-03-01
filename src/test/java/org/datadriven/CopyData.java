package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CopyData {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Lenovo\\Desktop\\Sathish Notes\\s.xlsx");
		
		FileInputStream inputStream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(inputStream);
		
		Sheet sheet = workbook.getSheet("sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		Row row = sheet.getRow(0);
		int cells = row.getPhysicalNumberOfCells();
		
		Sheet sheet2 = workbook.createSheet("sss");
		
		for(int i=0;i<rows;i++) {
			Row row2 = sheet.getRow(i);
			Row createRow = sheet2.createRow(i);
			for(int j=0;j<cells;j++) {
				Cell cell = row2.getCell(j);
				Cell createCell = createRow.createCell(j);
				createCell.setCellValue(cell.getStringCellValue());
			}
		}
		
		FileOutputStream outputStream = new FileOutputStream(file);
		workbook.write(outputStream);
		
	}

}
