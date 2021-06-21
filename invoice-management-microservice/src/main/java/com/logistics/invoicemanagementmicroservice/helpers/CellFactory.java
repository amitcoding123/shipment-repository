package com.logistics.invoicemanagementmicroservice.helpers;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Component;

@Component
public class CellFactory {

    public Cell createCell(Row row, CellStyle cellStyle, String cellValue, Integer index) {
        Cell cell = row.createCell(index);

        if(cellStyle != null)
            cell.setCellStyle(cellStyle);
        if(cellValue != null)
            cell.setCellValue(cellValue);

        return cell;
    }

    public void createEmptyCells(Row row, Integer start, Integer end) {
        for(Integer count = start; count <= end; count++) {
            row.createCell(count);
        }
    }
}
