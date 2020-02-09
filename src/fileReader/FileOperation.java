package fileReader;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileOperation {

    public static Map ReadeExcelPoi(String fileLocation) throws IOException {

        FileInputStream file = new FileInputStream(fileLocation);
        Workbook workbook = new XSSFWorkbook(file);

        Sheet sheet = workbook.getSheetAt(0);

        Map<Integer, List<String>> data = new HashMap<>();
        int i = 0;
        for (Row row : sheet) {
            data.put(i, new ArrayList<String>());
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case STRING:
                        data.get(i).add(cell.getRichStringCellValue().getString());
                        break;
                    case NUMERIC:
                        if (DateUtil.isCellDateFormatted(cell)) {
                            data.get(i).add(cell.getDateCellValue() + "");
                        } else {
                            data.get(i).add(cell.getNumericCellValue() + "");
                        }
                        break;
                    case BOOLEAN:
                        data.get(i).add(cell.getBooleanCellValue() + "");
                        break;
                    case FORMULA:
                        data.get(i).add(cell.getCellFormula() + "");
                        break;
                    default:
                        data.get(i).add(" ");
                }
            }
            i++;
        }

        return data;
    }

    public static void writeExcelPoi(Map<Integer, List<String>> data, String filePath) throws IOException {
        Workbook workbook = new XSSFWorkbook();

        Sheet sheet = workbook.createSheet("Employees");

        Row header = sheet.createRow(0);

        Cell headerCell = header.createCell(0);
        headerCell.setCellValue("First Name");
        headerCell = header.createCell(1);
        headerCell.setCellValue("Last Name");
        headerCell = header.createCell(2);
        headerCell.setCellValue("Phone Number");
        headerCell = header.createCell(3);
        headerCell.setCellValue("Profession");
        headerCell = header.createCell(4);
        headerCell.setCellValue("Company");
        headerCell = header.createCell(5);
        headerCell.setCellValue("Start Date");


        data.forEach((num, candidateList) -> {
            Row row = sheet.createRow(num);

            Cell cell = row.createCell(0);
            cell.setCellValue(candidateList.get(0));
            cell = row.createCell(1);
            cell.setCellValue(candidateList.get(1));
            cell = row.createCell(2);
            cell.setCellValue(candidateList.get(2));
            cell = row.createCell(3);
            cell.setCellValue(candidateList.get(3));
            cell = row.createCell(4);
            cell.setCellValue(candidateList.get(4));
        });

        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
    }
}

