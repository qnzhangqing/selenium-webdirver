package main;

import java.io.*;
import org.apache.poi.xssf.usermodel.*;

public class excelutils {
	private XSSFSheet ExcelWSheet;
	private XSSFWorkbook ExcelWBook;

	// Constructor to connect to the Excel with sheetname and Path
	public excelutils(String Path, String SheetName) throws Exception {
		try {
			// Open the Excel file
			FileInputStream ExcelFile = new FileInputStream(Path);
			// Access the required test data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
		} catch (Exception e) {
			throw (e);
		}
	}

	// This method is to set the rowcount of the excel.
	public int excel_get_rows() throws Exception {
		try {
			return ExcelWSheet.getPhysicalNumberOfRows();
		} catch (Exception e) {
			throw (e);

		}
	}

	// This method to get the data and get the value as strings.
	public String getCellDataasstring(int RowNum, int ColNum) throws Exception {
		try {
			String CellData = ExcelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
			System.out.println("The value of CellData " + CellData);
			return CellData;
		} catch (Exception e) {
			return "Errors in Getting Cell Data";
		}
	}

	// This method to get the data and get the value as number.
	public double getCellDataasnumber(int RowNum, int ColNum) throws Exception {
		try {
			double CellData = ExcelWSheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
			System.out.println("The value of CellData " + CellData);
			return CellData;
		} catch (Exception e) {
			return 000.00;
		}
	}
	
	public static void main(String[] args) throws Exception {
		excelutils e=new excelutils("D:\\soft\\OK.xlsx","ok");
		System.out.println(e.getCellDataasstring(1, 1));
//		e
	}
}
