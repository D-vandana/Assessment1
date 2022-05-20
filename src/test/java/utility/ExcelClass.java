package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelClass {
	HSSFWorkbook wb;
	ConfigureClass rc = new ConfigureClass();
	public ExcelClass() {
		File f = new File(rc.getExcelDataPath());
		FileInputStream fis;
		try {
			fis = new FileInputStream(f);
			wb = new HSSFWorkbook(fis);
		}
		catch(Exception e) {
			System.out.println("Exception is:"+e.getMessage());
		}
	}
	public String getStringData(int sheetindex, int row, int column) {
		return wb.getSheetAt(sheetindex).getRow(row).getCell(column).getStringCellValue();
	}
	public String getStringData(String sheetName, int row, int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}

}
