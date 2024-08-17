package com.vtiger.genericUtility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	public String readStringDataFromExcel(String sheetname, int rownam, int celnam) throws Throwable {
		FileInputStream fise=new FileInputStream("C:\\Users\\Srikanth\\eclipse-workspace\\FrameWork\\src\\test\\resources\\123.xlsx");
		Workbook wbe=WorkbookFactory.create(fise);
		return wbe.getSheet(sheetname).getRow(rownam).getCell(celnam).getStringCellValue();
	}

}
