package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.Month;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class dataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 //step1 :Create FIS/FR object
		 FileInputStream fis = new FileInputStream("./testdata/Testscriptdata.xlsx");

		 //step2: create respective file type object
		 Workbook workbook = WorkbookFactory.create(fis);
		 
		 //step3:call read methods
		String URL = workbook.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		System.out.println(URL); //https://www.shoppersstack.com/user-signin
        String USERNAME = workbook.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
        System.out.println(USERNAME); //vic.123@gmail.com
		LocalDateTime date= workbook.getSheet("Login").getRow(1).getCell(3).getLocalDateTimeCellValue();
		System.out.println(date);
		Month month = date.getMonth();
		int day = date.getDayOfMonth();
		int year = date.getYear();
		System.out.println(month);
		System.out.println(day);
		System.out.println(year);
	}

}
