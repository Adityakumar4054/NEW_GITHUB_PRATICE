package swdDemos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Creatingexceldata
{

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream FIS=new FileOutputStream("C:\\Users\\adity\\ALL PROGRAMS\\Test3.xlsx");
		
		XSSFWorkbook wokbok=new XSSFWorkbook();
		
		XSSFSheet sheet=wokbok.createSheet("sheet1");
		
		
		
			XSSFRow row=sheet.createRow(0);
			row.createCell(0).setCellValue("book");
			row.createCell(1).setCellValue("pen");
			row.createCell(2).setCellValue("papaer");			
			
			XSSFRow Ro=sheet.createRow(1);
			Ro.createCell(0).setCellValue("english");
			Ro.createCell(1).setCellValue("parker");
			Ro.createCell(2).setCellValue("finepaper");
			
			XSSFRow Rw=sheet.createRow(2);
			Rw.createCell(0).setCellValue("math");
			Rw.createCell(1).setCellValue("link");
			Rw.createCell(2).setCellValue("classmate");
			
			wokbok.write(FIS);
			FIS.close();
				
			
			
		}
		

	}


