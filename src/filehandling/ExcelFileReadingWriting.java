package filehandling;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class ExcelFileReadingWriting {

    public static void main(String[] args) {
        ExcelFileReadingWriting obj = new ExcelFileReadingWriting();
        try {

        //    obj.writigDataFromMapToExcel();
            obj.readCompleteExcelFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void readCompleteExcelFile() throws IOException {
        File file = new File("src/testData/TestData.xlsx");
        //file input stream class is used to read the excel file
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
       XSSFSheet sheet= workbook.getSheet("empdata");
        int rownum=   sheet.getPhysicalNumberOfRows();
        System.out.println("Number of rows: "+rownum);
       int noOfColumns= sheet.getRow(0).getPhysicalNumberOfCells();

        for(int i=0; i<rownum; i++){
            for(int j=0; j<noOfColumns; j++){
             CellType type=   sheet.getRow(i).getCell(j).getCellTypeEnum();
                if(type==CellType.STRING){
                    String cellvalue= sheet.getRow(i).getCell(j).getStringCellValue();
                    System.out.print(cellvalue+" ");
                }else if(type==CellType.NUMERIC){
                    double cellvalue= sheet.getRow(i).getCell(j).getNumericCellValue();
                    System.out.print((int)cellvalue+" ");
                }else if(type==CellType.BLANK){
                    System.out.print("BLANK ");
                }


            }
            System.out.println();
        }
        fis.close();
        workbook.close();
    }

    public void readExcelFile() throws IOException {
        //use fileclass to create a file object
        File file = new File("src/testData/TestData.xlsx");
        //file input stream class is used to read the excel file
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        //sheet
     //   workbook.getSheet("Employee");
     XSSFSheet sheet=   workbook.getSheetAt(0);
     //find numbr of rows
     int rownum=   sheet.getPhysicalNumberOfRows();
        System.out.println("Number of rows: "+rownum);
     int noofcell=   sheet.getRow(0).getPhysicalNumberOfCells();

 //   String data= sheet.getRow(1).getCell(0).getStringCellValue();
  //      System.out.println("Data from first row and second cell: "+data);

        //check cell type
    CellType type= sheet.getRow(1).getCell(2).getCellTypeEnum();
    if(type==CellType.STRING){
        String cellvalue= sheet.getRow(1).getCell(2).getStringCellValue();
        System.out.println("Cell value is: "+cellvalue);
    }else if(type==CellType.NUMERIC){
        double cellvalue= sheet.getRow(1).getCell(2).getNumericCellValue();
        System.out.println("Cell value is: "+cellvalue);
    }else if(type==CellType.BLANK){
        System.out.println("Cell is blank");
    }


        fis.close();
        workbook.close();
    }

    public void writeExcelFile() throws IOException {
        //use fileclass to create a file object
        File file = new File("src/testData/TestData.xlsx");
        //file input stream class is used to read the excel file
        FileInputStream fis = new FileInputStream(file);
        //create workbook object
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

    public void writigDataFromMapToExcel(){
        Map<String,Object[]> data = new TreeMap<>();
        data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
        data.put("2", new Object[] {1, "John", "Doe"});
        data.put("3", new Object[] {2, "Jane", "Smith"});
        data.put("4", new Object[] {3, "Mike", "Johnson"});
        File file = new File("src/testData/TestData.xlsx");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("empdata");

            int rownum = 0;
            for (String key : data.keySet()) {
                Row row = sheet.createRow(rownum++);
                Object[] objArr = data.get(key);
                int cellnum = 0;
                for (Object obj : objArr) {
                    Cell cell = row.createCell(cellnum++);
                    if (obj instanceof String) {
                        cell.setCellValue((String) obj);
                    } else if (obj instanceof Integer) {
                        cell.setCellValue((Integer) obj);
                    }
                }
            }
            FileOutputStream fos = new FileOutputStream(file);
            workbook.write(fos);
            fos.close();
            workbook.close();
            System.out.println("Data written to Excel file successfully.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}



