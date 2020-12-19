package testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLReader {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("testdata");
		int rowcount=sheet.getLastRowNum();
		int colcount=sheet.getRow(0).getLastCellNum();
		
		for (int i = 1; i < rowcount; i++) {
			XSSFRow currentrow=sheet.getRow(i);
			
			for (int j = 0; j < colcount; j++) {
				String currentcell=currentrow.getCell(j).toString();
				System.out.println(currentcell);
			}
		}
		
		workbook.close();
		
	}
	
	

}
