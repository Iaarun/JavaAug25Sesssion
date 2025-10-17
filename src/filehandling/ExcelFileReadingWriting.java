package filehandling;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;

import java.io.*;

public class ExcelFileReadingWriting {

    public static void main(String[] args) {
        ExcelFileReadingWriting obj = new ExcelFileReadingWriting();
        try {

            obj.writeExcelFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeExcelFile() throws IOException {
        File file = new File("src/testData/TestData.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
         XSSFSheet sheet= workbook.createSheet("student");
        XSSFRow row= sheet.createRow(1);
        XSSFCell cell=  row.createCell(1);
        cell.setCellValue("Selenium");

        FileOutputStream fout = new FileOutputStream(file);
        workbook.write(fout);
        fout.close();
        workbook.close();
        System.out.println("Excel file written successfully");
    }
}
