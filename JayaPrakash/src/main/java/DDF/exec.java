package DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exec {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Srikanth\\eclipse-workspace\\JayaPrakash\\src\\main\\resources\\Book1.xlsl.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String sh=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(sh);
		
		
	
}
}