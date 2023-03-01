package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingExcel {
	
	private void sample() throws IOException {
		
		File file = new File("C:\\Users\\Lenovo\\Desktop\\Sathish Notes\\s.xlsx");
		file.createNewFile();
		//FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook();
		Sheet s = workbook.createSheet("sheet1");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int row = scanner.nextInt();
		System.out.println("Enter no of columns");
		int column = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter values ");
		for (int i = 0; i < row; i++) {
			Row r = s.createRow(i);
			for (int j = 0; j < column; j++) {
				Cell c = r.createCell(j);
				String nextLine = scanner.nextLine();
				c.setCellValue(nextLine);
				System.out.println(i+","+j+"="+nextLine);
			}
			
		}
		
		FileOutputStream stream2 = new FileOutputStream(file);
		workbook.write(stream2);
	
	}
	public static void main(String[] args) throws IOException {
		
		writingExcel excel = new writingExcel();
		excel.sample();
		
	}

}
