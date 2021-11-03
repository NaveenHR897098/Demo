package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllTheDataInTheFromOfString
{
	public static void main(String[] args) throws Throwable, IOException
	{
		String filepath="./resource/exceldata.xlsx";
		String sheetName="TC01";
		FileInputStream file=new FileInputStream(filepath);
		Workbook workBook = WorkbookFactory.create(file);
		String url = workBook.getSheet(sheetName).getRow(1).getCell(0).getStringCellValue();
		String username = workBook.getSheet(sheetName).getRow(1).getCell(1).toString();
		String password = workBook.getSheet(sheetName).getRow(1).getCell(2).toString();
		String number = workBook.getSheet(sheetName).getRow(1).getCell(3).toString();
		String boo = workBook.getSheet(sheetName).getRow(1).getCell(4).toString();
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		System.out.println(number);
		System.out.println(boo);
	}
}
