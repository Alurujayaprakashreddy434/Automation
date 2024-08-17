package DDF;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataFetching {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\Srikanth\\eclipse-workspace\\JayaPrakash\\src\\main\\resources\\Book1.xlsl.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
	
	double data1 = wb.getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
	System.out.println(data1);
	
}
}

