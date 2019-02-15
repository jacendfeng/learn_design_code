package com.jacend.popularlib;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

/**
 * @author fengxf
 * @since 2019-01-16
 */
public class XLSX2 {

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
        FileInputStream fileInputStream = new FileInputStream("/Users/souche/Codes/learnCode/learn-design-code/popularlib/src/main/resources/test2.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();

        // suppose your formula is in B3
        CellReference cellReference = new CellReference("C1");
        Row row = sheet.getRow(cellReference.getRow());
        Cell cell = row.getCell(cellReference.getCol());

        System.out.println(evaluator.evaluateFormulaCell(cell));
        System.out.println(cell.getNumericCellValue());

        // suppose your formula is in B3
        CellReference cellReference2 = new CellReference("C2");
        Row row2 = sheet.getRow(cellReference2.getRow());
        Cell cell2 = row2.getCell(cellReference2.getCol());

        System.out.println(evaluator.evaluateFormulaCell(cell2));
        System.out.println(cell2.getNumericCellValue());
        fileInputStream.close();
    }
}
