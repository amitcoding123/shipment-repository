package com.logistics.invoicemanagementmicroservice.helpers;

import com.logistics.invoicemanagementmicroservice.dto.DSRDto;
import com.logistics.invoicemanagementmicroservice.helpers.cellstyle.CellStyleFactory;
import com.logistics.invoicemanagementmicroservice.helpers.cellstyle.CellStyleType;
import com.logistics.invoicemanagementmicroservice.helpers.font.FontFactory;
import com.logistics.invoicemanagementmicroservice.helpers.font.FontType;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

@Component
public class DSRExcelHelper {

    private final CellFactory cellFactory;
    private final CellStyleFactory cellStyleFactory;
    private final FontFactory fontFactory;

    public DSRExcelHelper(CellFactory cellFactory, CellStyleFactory cellStyleFactory, FontFactory fontFactory) {
        this.cellFactory = cellFactory;
        this.cellStyleFactory = cellStyleFactory;
        this.fontFactory = fontFactory;
    }

    public ByteArrayInputStream generateDSR(List<DSRDto> data) {
        ByteArrayInputStream dsr = null;
        try(Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            CreationHelper creationHelper = workbook.getCreationHelper();
            Sheet sheet = workbook.createSheet("DSR");
            int rowIndex = 1;
            int columnIndex = 1;

            Row row1 = sheet.createRow(rowIndex);
            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.ALL_BORDERS_CENTRE),
                    "Date of Booking", columnIndex);
            sheet.autoSizeColumn(columnIndex);
            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.ALL_BORDERS_CENTRE),
                    "AWB Number", ++columnIndex);
            sheet.autoSizeColumn(columnIndex);
            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.ALL_BORDERS_CENTRE),
                    "Shipper Name", ++columnIndex);
            sheet.autoSizeColumn(columnIndex);
            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.ALL_BORDERS_CENTRE),
                    "Consignee Name", ++columnIndex);
            sheet.autoSizeColumn(columnIndex);
            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.ALL_BORDERS_CENTRE),
                    "Tracking Number", ++columnIndex);
            sheet.autoSizeColumn(columnIndex);
            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.ALL_BORDERS_CENTRE),
                    "Chargeable Weight", ++columnIndex);
            sheet.autoSizeColumn(columnIndex);
            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.ALL_BORDERS_CENTRE),
                    "Purchase Cost", ++columnIndex);
            sheet.autoSizeColumn(columnIndex);
            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.ALL_BORDERS_CENTRE),
                    "Selling Cost", ++columnIndex);
            sheet.autoSizeColumn(columnIndex);
            for (DSRDto dto: data) {
                columnIndex = 1;
                Row row = sheet.createRow(++rowIndex);
                cellFactory.createCell(row, cellStyleFactory.getCellStyle(workbook,
                        null, CellStyleType.ALL_BORDERS_CENTRE),
                        dto.getBookingDate().toString(), columnIndex);
                sheet.autoSizeColumn(columnIndex);
                cellFactory.createCell(row, cellStyleFactory.getCellStyle(workbook,
                        null, CellStyleType.ALL_BORDERS_CENTRE),
                        dto.getAwbNumber(), ++columnIndex);
                sheet.autoSizeColumn(columnIndex);
                cellFactory.createCell(row, cellStyleFactory.getCellStyle(workbook,
                        null, CellStyleType.ALL_BORDERS_CENTRE),
                        dto.getShipperName(), ++columnIndex);
                sheet.autoSizeColumn(columnIndex);
                cellFactory.createCell(row, cellStyleFactory.getCellStyle(workbook,
                        null, CellStyleType.ALL_BORDERS_CENTRE),
                        dto.getConsigneeName(), ++columnIndex);
                sheet.autoSizeColumn(columnIndex);
                cellFactory.createCell(row, cellStyleFactory.getCellStyle(workbook,
                        null, CellStyleType.ALL_BORDERS_CENTRE),
                        dto.getTrackingNumber(), ++columnIndex);
                sheet.autoSizeColumn(columnIndex);
                cellFactory.createCell(row, cellStyleFactory.getCellStyle(workbook,
                        null, CellStyleType.ALL_BORDERS_CENTRE),
                        dto.getWeight(), ++columnIndex);
                sheet.autoSizeColumn(columnIndex);
                cellFactory.createCell(row, cellStyleFactory.getCellStyle(workbook,
                        null, CellStyleType.ALL_BORDERS_CENTRE),
                        String.valueOf(dto.getPurchaseCost()), ++columnIndex);
                sheet.autoSizeColumn(columnIndex);
                cellFactory.createCell(row, cellStyleFactory.getCellStyle(workbook,
                        null, CellStyleType.ALL_BORDERS_CENTRE),
                        String.valueOf(dto.getSellingCost()), ++columnIndex);
                sheet.autoSizeColumn(columnIndex);
            }

            workbook.write(out);

            dsr = new ByteArrayInputStream(out.toByteArray());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return dsr;
    }
}
