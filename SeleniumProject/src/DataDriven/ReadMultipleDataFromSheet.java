package DataDriven;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromSheet {

	public static void main(String[] args) throws Throwable, Throwable {
		String filepath="./resource/exceldata.xlsx";
		String sheetName="TC01";
		FileInputStream file=new FileInputStream(filepath);
		Workbook workBook = WorkbookFactory.create(file);
		Sheet sheet = workBook.getSheet(sheetName);
		int rowno = sheet.getPhysicalNumberOfRows();
		int cellno = sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<rowno;i++)
		{
			for(int j=0;j<cellno;j++)
			{
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			System.out.println();
		}
	}

}
