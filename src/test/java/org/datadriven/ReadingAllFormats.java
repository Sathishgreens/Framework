package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingAllFormats {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Lenovo\\Desktop\\Sathish Notes\\s.xlsx");
		
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		for(int i=0;i<rows;i++) {
			Row row = sheet.getRow(i);
			int cells = row.getPhysicalNumberOfCells();
			for(int j=0;j<cells;j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				switch (cellType) {
				case BOOLEAN:
					boolean b = cell.getBooleanCellValue();
					System.out.println("Boolean "+b);
					break;
				case STRING:
					String value = cell.getStringCellValue();
					System.out.println("String "+value);
					break;
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
						String format2 = format.format(dateCellValue);
						System.out.println(format2);
					}
					else {
					double value2 = cell.getNumericCellValue();
					long l = (long) value2;
					System.out.println(l);
					break;
					}
				
				default:
					break;
				}
				
			}
		}
		
		
	}
}
