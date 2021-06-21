package com.logistics.invoicemanagementmicroservice.helpers.cellstyle;

import org.apache.poi.ss.usermodel.*;
import org.springframework.stereotype.Component;

@Component
public class CellStyleFactory {

    public CellStyle getCellStyle(Workbook workbook, Font font, CellStyleType styleType) {
        CellStyle cellStyle = workbook.createCellStyle();
        if(font != null)
            cellStyle.setFont(font);
        if(styleType != null) {
            switch (styleType) {
                case TOP_BORDER:
                    cellStyle.setBorderTop(BorderStyle.THICK);
                    break;
                case LEFT_BORDER:
                    cellStyle.setBorderLeft(BorderStyle.THICK);
                    break;
                case RIGHT_BORDER:
                    cellStyle.setBorderRight(BorderStyle.THICK);
                    break;
                case BOTTOM_BORDER:
                    cellStyle.setBorderBottom(BorderStyle.THICK);
                    break;
                case TOP_LEFT_BORDER:
                    cellStyle.setBorderTop(BorderStyle.THICK);
                    cellStyle.setBorderLeft(BorderStyle.THICK);
                    break;
                case TOP_RIGHT_BORDER:
                    cellStyle.setBorderTop(BorderStyle.THICK);
                    cellStyle.setBorderRight(BorderStyle.THICK);
                    break;
                case ALL_BORDERS:
                    cellStyle.setBorderBottom(BorderStyle.THICK);
                    cellStyle.setBorderRight(BorderStyle.THICK);
                    cellStyle.setBorderLeft(BorderStyle.THICK);
                    cellStyle.setBorderTop(BorderStyle.THICK);
                    break;
                case ALL_BORDERS_CENTRE:
                    cellStyle.setBorderBottom(BorderStyle.THICK);
                    cellStyle.setBorderRight(BorderStyle.THICK);
                    cellStyle.setBorderLeft(BorderStyle.THICK);
                    cellStyle.setBorderTop(BorderStyle.THICK);
                    cellStyle.setAlignment(HorizontalAlignment.CENTER);
                    break;
                case TOP_LEFT_RIGHT_BORDER:
                    cellStyle.setBorderRight(BorderStyle.THICK);
                    cellStyle.setBorderLeft(BorderStyle.THICK);
                    cellStyle.setBorderTop(BorderStyle.THICK);
                    break;
                case LEFT_RIGHT_BORDER:
                    cellStyle.setBorderLeft(BorderStyle.THICK);
                    cellStyle.setBorderRight(BorderStyle.THICK);
                    break;
            }
        }

        return cellStyle;
    }

}
