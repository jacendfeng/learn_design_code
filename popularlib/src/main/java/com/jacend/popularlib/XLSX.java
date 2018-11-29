package com.jacend.popularlib;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

/**
 * @author fengxf
 * @since 2018-11-29
 */
public class XLSX {

    /**
     * {
     * "60000~80000/0~6/B": 6460,
     * "60000~80000/0~6/A": 7011,
     * "100000~/20~26/B": 5203,
     * "100000~/20~26/A": 5412,
     * "25000~40000/26~/B": 5761,
     * }
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("/Users/souche/Codes/learnCode/learn-design-code/popularlib/src/main/resources/test.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        // 上牌月份 row
        XSSFRow plateMonthRow = sheet.getRow(0);

        // AB 类型 row
        XSSFRow abRow = sheet.getRow(1);

        int lastRowIndex = sheet.getLastRowNum();
        for (int i = 2; i <= lastRowIndex; i++) {
            XSSFRow row = sheet.getRow(i);
            if (row == null) {
                break;
            }

            String mileageCell = row.getCell(0).getStringCellValue();

            short lastCellNum = row.getLastCellNum();
            for (int j = 1; j < lastCellNum; j++) {
                double cellValue = row.getCell(j).getNumericCellValue();
                System.out.println(mileageCell + "/"
                        + plateMonthRow.getCell(j).getStringCellValue() + "/"
                        + abRow.getCell(j).getStringCellValue());
                System.out.println(cellValue);
            }
        }

        fileInputStream.close();
    }
}
