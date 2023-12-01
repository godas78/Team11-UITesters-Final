package OOPConceptpart1;
import org.apache.poi.ss.usermodel.Row;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetHandling {
	public static void writeExcelSheet() throws IOException{
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet worksheet = workbook.createSheet("sheet 1");
		
		int rowNum =0;
		for (int i=1;i<=10;i++) {
			Row row =worksheet.createRow(rowNum++);
			int ColNum=0;
			for (int j=0;j<=10;j++) {
					Cell cell = row.createCell(ColNum++);
					cell.setCellValue("Row" + i + "Column" + j);	
			}
		}
		
		String path = System.getProperty("user.dir")+"/src/test/resources/TestData/Demo.xlsx";
		File ExcelFile = new File(path);
		FileOutputStream FOS = null;
		
		try {
			 FOS = new FileOutputStream(ExcelFile);
			 workbook.write(FOS);
			 workbook.close();
			}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			FOS.close();
			}
	}	
	
	public static void readExcelSheet() throws IOException {
		String path = System.getProperty("user.dir")+"/src/test/resources/TestData/Demo.xlsx";
		File ExcelFile = new File(path);
				
		FileInputStream Fis = new FileInputStream(ExcelFile);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = xssfWorkbook.getSheet("sheet 1");
		
		Iterator<Row> row = sheet.rowIterator();
		
		while(row.hasNext()) {
			Row currRow = row.next();
			Iterator<Cell> cell = currRow.cellIterator();
			
			while(cell.hasNext()) {
				Cell currcell=cell.next();
				System.out.println(currcell.getStringCellValue()+"~");
			}
		System.out.println();			
		}
		
		Row newRow = sheet.createRow(12);
		Cell newcell = newRow.createCell(13);
		newcell.setCellValue("shrav");
		FileOutputStream Fos = new FileOutputStream(ExcelFile);
		xssfWorkbook.write(Fos);
		
		Row newRow1 = sheet.createRow(12);
		Cell newcell1 = newRow1.createCell(11);
		newcell1.setCellValue("goda");
		FileOutputStream Fos1 = new FileOutputStream(ExcelFile);
		xssfWorkbook.write(Fos1);
		xssfWorkbook.close();
		}
			
	public static void main(String[] args) throws IOException{
	//writeExcelSheet();	
		readExcelSheet();	

	}

}
