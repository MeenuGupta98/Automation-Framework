package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

    private static XSSFWorkbook wb;
    private static XSSFSheet sh;

    public static void openExcel() throws IOException {
        try (FileInputStream fs = new FileInputStream("src/test/resources/testdata/Testdata.xlsx")) {
            wb = new XSSFWorkbook(fs);
            sh = wb.getSheet("Sheet1");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getData(int row, int col) {
        return sh.getRow(row).getCell(col).getStringCellValue();
    }

    public static int getRowCount() {
        return sh.getPhysicalNumberOfRows();
    }
}
