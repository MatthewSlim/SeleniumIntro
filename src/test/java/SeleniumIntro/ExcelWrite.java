package SeleniumIntro;

import org.apache.poi.ss.usermodel.Cell;
        import org.apache.poi.ss.usermodel.Row;
        import org.apache.poi.xssf.usermodel.XSSFSheet;
        import org.apache.poi.xssf.usermodel.XSSFWorkbook;

        import java.io.FileNotFoundException;
        import java.io.FileOutputStream;
        import java.io.IOException;

public class ExcelWrite {

    private static final String FILE_NAME = System.getProperty("user.dir") + "\\ExcelExample.xlsx";

    public static void main(String[] args) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Relegated Premier League Teams 17/18");
        Object[][] teams = {
                {"Premier League Teams", "Position", "Points", "GD"},
                {"Swansea", 18, 33, -28},
                {"Stoke", 19, 33, -33},
                {"West Brom", 20, 3, -25}
        };

        int rowNum = 0;
        System.out.println("Creating excel");

        for (Object[] team  : teams) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : team) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
}