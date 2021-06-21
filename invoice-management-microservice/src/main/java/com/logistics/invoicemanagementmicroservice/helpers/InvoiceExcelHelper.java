package com.logistics.invoicemanagementmicroservice.helpers;

import com.logistics.domain.ItemDto;
import com.logistics.domain.ShipmentDto;
import com.logistics.invoicemanagementmicroservice.dto.BoxDto;
import com.logistics.invoicemanagementmicroservice.helpers.cellstyle.CellStyleFactory;
import com.logistics.invoicemanagementmicroservice.helpers.cellstyle.CellStyleType;
import com.logistics.invoicemanagementmicroservice.helpers.font.FontFactory;
import com.logistics.invoicemanagementmicroservice.helpers.font.FontType;
import com.logistics.invoicemanagementmicroservice.utils.NumberToWords;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;

@Component
public class InvoiceExcelHelper {

    private final CellFactory cellFactory;
    private final CellStyleFactory cellStyleFactory;
    private final FontFactory fontFactory;

    public InvoiceExcelHelper(CellFactory cellFactory, CellStyleFactory cellStyleFactory, FontFactory fontFactory) {
        this.cellFactory = cellFactory;
        this.cellStyleFactory = cellStyleFactory;
        this.fontFactory = fontFactory;
    }

    public ByteArrayOutputStream generateInvoice(ShipmentDto shipment){
        ByteArrayInputStream invoice = null;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try(Workbook workbook = new XSSFWorkbook()) {
            CreationHelper creationHelper = workbook.getCreationHelper();
            Sheet sheet = workbook.createSheet("Shipment Invoice");

            //Create Header cell style

            Row row1 = sheet.createRow(1);

            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.ALL_BORDERS_CENTRE),
                    "INVOICE", 1);
            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    null, CellStyleType.ALL_BORDERS_CENTRE),
                    null, 2);
            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    null, CellStyleType.ALL_BORDERS_CENTRE),
                    null, 3);
            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    null, CellStyleType.ALL_BORDERS_CENTRE),
                    null, 4);
            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    null, CellStyleType.ALL_BORDERS_CENTRE),
                    null, 5);
            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    null, CellStyleType.ALL_BORDERS_CENTRE),
                    null, 6);
            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    null, CellStyleType.ALL_BORDERS_CENTRE),
                    null, 7);
            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    null, CellStyleType.ALL_BORDERS_CENTRE),
                    null, 8);
            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    null, CellStyleType.ALL_BORDERS_CENTRE),
                    null, 9);
            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    null, CellStyleType.ALL_BORDERS_CENTRE),
                    null, 10);
            cellFactory.createCell(row1, cellStyleFactory.getCellStyle(workbook,
                    null, CellStyleType.ALL_BORDERS_CENTRE),
                    null, 11);

            CellRangeAddress cellRangeAddress = new CellRangeAddress(1, 1, 1, 11);
            sheet.addMergedRegion(cellRangeAddress);

            Row row2 = sheet.createRow(2);
            cellFactory.createCell(row2,
                    cellStyleFactory.
                            getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD),
                                    CellStyleType.TOP_LEFT_BORDER), "Exporter", 1);

            cellFactory.createEmptyCells(row2, 2, 5);

            cellFactory.createCell(row2, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), "Invoice No. & Date:", 6);
            cellFactory.createEmptyCells(row2, 7, 8);
            cellFactory.createCell(row2, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), "Exporter Ref.", 9);
            cellFactory.createEmptyCells(row2, 10, 10);
            cellFactory.createCell(row2, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.RIGHT_BORDER), null, 11);

            Row row3 = sheet.createRow(3);
            cellFactory.createCell(row3, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), shipment.getShipper().getName(), 1);
            cellFactory.createEmptyCells(row3, 2, 5);
            cellFactory.createCell(row3, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), String.valueOf(shipment.getCreatedOn()), 6);
            cellFactory.createEmptyCells(row3, 7, 8);
            cellFactory.createCell(row3, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), /*shipment.getExporterRef()*/"", 9);
            cellFactory.createEmptyCells(row3, 10, 10);
            cellFactory.createCell(row3, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.RIGHT_BORDER), null, 11);

            Row row4 = sheet.createRow(4);
            cellFactory.createCell(row4, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 1);
            cellFactory.createEmptyCells(row4, 2, 5);
            cellFactory.createCell(row4, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 6);
            cellFactory.createEmptyCells(row4, 7, 8);
            cellFactory.createCell(row4, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 9);
            cellFactory.createEmptyCells(row4, 10, 10);
            cellFactory.createCell(row4, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.RIGHT_BORDER), null, 11);

            Row row5 = sheet.createRow(5);
            cellFactory.createCell(row5, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 1);
            cellFactory.createEmptyCells(row5, 2, 5);
            cellFactory.createCell(row5, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), "Other Reference(s)", 6);
            cellFactory.createCell(row5, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 7);
            cellFactory.createCell(row5, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 8);
            cellFactory.createCell(row5, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), "", 9);
            cellFactory.createCell(row5, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 10);
            cellFactory.createCell(row5, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_RIGHT_BORDER), null, 11);

            Row row6 = sheet.createRow(6);
            cellFactory.createCell(row6, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 1);
            cellFactory.createEmptyCells(row6, 2, 5);
            cellFactory.createCell(row6, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 6);
            cellFactory.createEmptyCells(row6, 7, 10);
            cellFactory.createCell(row6, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.RIGHT_BORDER), null, 11);

            Row row7 = sheet.createRow(7);
            cellFactory.createCell(row7, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.LEFT_BORDER), "Adhaar Card No.", 1);
            cellFactory.createCell(row7, null, shipment.getShipper().getAadharNumber(), 2);
            cellFactory.createEmptyCells(row7, 3, 5);
            cellFactory.createCell(row7, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 6);
            cellFactory.createEmptyCells(row7, 7, 10);
            cellFactory.createCell(row7, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.RIGHT_BORDER), null, 11);

            Row row8 = sheet.createRow(8);
            cellFactory.createCell(row8, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.LEFT_BORDER), "Consignee", 1);
            cellFactory.createCell(row8, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 2);
            cellFactory.createCell(row8, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 3);
            cellFactory.createCell(row8, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 4);
            cellFactory.createCell(row8, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 5);
            cellFactory.createCell(row8, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 6);
            cellFactory.createEmptyCells(row8, 7, 10);
            cellFactory.createCell(row8, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.RIGHT_BORDER), null, 11);

            Row row9 = sheet.createRow(9);
            cellFactory.createCell(row9, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), shipment.getConsignee().getName(), 1);
            cellFactory.createEmptyCells(row9, 2, 5);
            cellFactory.createCell(row9, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 6);
            cellFactory.createEmptyCells(row9, 7, 8);
            cellFactory.createCell(row9, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), null), "WEIGHT", 9);
            cellFactory.createCell(row9, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), null), String.valueOf(shipment.getActualWeight()), 10);
            cellFactory.createCell(row9, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.RIGHT_BORDER), null, 11);

            Row row10 = sheet.createRow(10);
            cellFactory.createCell(row10, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 1);
            cellFactory.createEmptyCells(row10, 2, 5);
            cellFactory.createCell(row10, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 6);
            cellFactory.createEmptyCells(row6, 7, 10);
            cellFactory.createCell(row10, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.RIGHT_BORDER), null, 11);

            Row row11 = sheet.createRow(11);
            cellFactory.createCell(row11, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 1);
            cellFactory.createEmptyCells(row6, 2, 5);
            cellFactory.createCell(row11, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 6);
            cellFactory.createEmptyCells(row6, 7, 10);
            cellFactory.createCell(row11, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.RIGHT_BORDER), null, 11);

            Row row12 = sheet.createRow(12);
            cellFactory.createCell(row12, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 1);
            cellFactory.createEmptyCells(row12, 2, 5);
            cellFactory.createCell(row12, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 6);
            cellFactory.createEmptyCells(row12, 7, 10);
            cellFactory.createCell(row12, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.RIGHT_BORDER), null, 11);

            Row row13 = sheet.createRow(13);
            cellFactory.createCell(row13, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), null, 1);
            cellFactory.createEmptyCells(row13, 2, 5);
            cellFactory.createCell(row13, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), "Country of origin of goods", 6);
            cellFactory.createCell(row13, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 7);
            cellFactory.createCell(row13, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 8);
            cellFactory.createCell(row13, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), "Country of final destination", 9);
            cellFactory.createCell(row13, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 10);
            cellFactory.createCell(row13, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_RIGHT_BORDER), null, 11);

            Row row14 = sheet.createRow(14);
            cellFactory.createCell(row14, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.LEFT_BORDER), null, 1);
            cellFactory.createEmptyCells(row14, 2, 2);
            cellFactory.createCell(row14, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), null), shipment.getConsignee().getPhoneNumber(), 3);
            cellFactory.createEmptyCells(row14, 4, 5);
            cellFactory.createCell(row14, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), null, 6);
            cellFactory.createCell(row14, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 7);
            cellFactory.createCell(row14, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 8);
            cellFactory.createCell(row14, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), null, 9);
            cellFactory.createCell(row14, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 10);
            cellFactory.createCell(row14, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_RIGHT_BORDER), null, 11);

            Row row15 = sheet.createRow(15);
            cellFactory.createCell(row15, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.LEFT_BORDER), shipment.getConsignee().getAddress().getCountry(), 1);
            cellFactory.createEmptyCells(row15, 2, 5);
            cellFactory.createCell(row15, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), null, 6);
            cellFactory.createCell(row15, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.TOP_BORDER), shipment.getShipper().getAddress().getCountry(), 7);
            cellFactory.createCell(row15, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 8);
            cellFactory.createCell(row15, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), null, 9);
            cellFactory.createCell(row15, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.TOP_BORDER), shipment.getConsignee().getAddress().getCountry(), 10);
            cellFactory.createCell(row15, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_RIGHT_BORDER), null, 11);

            Row row16 = sheet.createRow(16);
            cellFactory.createCell(row16, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), "Pre-Carriage By", 1);
            cellFactory.createCell(row16, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 2);
            cellFactory.createCell(row16, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), "Place of Receipt by pre-carrier", 3);
            cellFactory.createCell(row16, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 4);
            cellFactory.createCell(row16, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 5);
            cellFactory.createCell(row16, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), "Terms of Delivery & Payment", 6);
            cellFactory.createCell(row16, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 7);
            cellFactory.createCell(row16, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 8);
            cellFactory.createCell(row16, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 9);
            cellFactory.createCell(row16, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 10);
            cellFactory.createCell(row16, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_RIGHT_BORDER), null, 11);

            Row row17 = sheet.createRow(17);
            cellFactory.createCell(row17, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), shipment.getUserId(), 1);
            cellFactory.createEmptyCells(row17, 2,2);
            cellFactory.createCell(row17, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), "", 3);
            cellFactory.createEmptyCells(row17, 4, 5);
            cellFactory.createCell(row17, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.LEFT_BORDER), "Terms & Conditions Apply", 6);
            cellFactory.createEmptyCells(row17, 7, 10);
            cellFactory.createCell(row17, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_RIGHT_BORDER), null, 11);

            Row row18 = sheet.createRow(18);
            cellFactory.createCell(row18, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), "Vessel/ Flight No.", 1);
            cellFactory.createCell(row18, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 2);
            cellFactory.createCell(row18, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), "Port of Landing", 3);
            cellFactory.createCell(row18, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 4);
            cellFactory.createCell(row18, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 5);
            cellFactory.createCell(row18, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 6);
            cellFactory.createEmptyCells(row18, 7, 10);
            cellFactory.createCell(row18, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_RIGHT_BORDER), null, 11);

            Row row19 = sheet.createRow(19);
            cellFactory.createCell(row19, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), "", 1);
            cellFactory.createEmptyCells(row19, 2,2);
            cellFactory.createCell(row19, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), "", 3);
            cellFactory.createEmptyCells(row19, 4, 5);
            cellFactory.createCell(row19, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.LEFT_BORDER), null, 6);
            cellFactory.createEmptyCells(row19, 7, 10);
            cellFactory.createCell(row19, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_RIGHT_BORDER), null, 11);

            Row row20 = sheet.createRow(20);
            cellFactory.createCell(row20, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), "Port of Discharge", 1);
            cellFactory.createCell(row20, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 2);
            cellFactory.createCell(row20, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), "Final Destination", 3);
            cellFactory.createCell(row20, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 4);
            cellFactory.createCell(row20, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 5);
            cellFactory.createCell(row20, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 6);
            cellFactory.createEmptyCells(row20, 7, 10);
            cellFactory.createCell(row20, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_RIGHT_BORDER), null, 11);

            Row row21 = sheet.createRow(21);
            cellFactory.createCell(row21, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), shipment.getConsignee().getAddress().getCountry(), 1);
            cellFactory.createEmptyCells(row21, 2, 2);
            cellFactory.createCell(row21, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), shipment.getConsignee().getAddress().getCountry(), 3);
            cellFactory.createEmptyCells(row21, 4, 5);
            cellFactory.createCell(row21, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 6);
            cellFactory.createEmptyCells(row21, 7, 10);
            cellFactory.createCell(row21, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_RIGHT_BORDER), null, 11);

            Row row22 = sheet.createRow(22);
            cellFactory.createCell(row22, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), "Marks & Numbers", 1);
            cellFactory.createCell(row22, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 2);
            cellFactory.createCell(row22, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), null, 3);
            cellFactory.createCell(row22, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 4);
            cellFactory.createCell(row22, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 5);
            cellFactory.createCell(row22, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), "Description of Goods", 6);
            cellFactory.createEmptyCells(row22, 7, 8);
            cellFactory.createCell(row22, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), "QTY", 9);
            cellFactory.createCell(row22, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), "Rate", 10);
            cellFactory.createCell(row22, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_RIGHT_BORDER), "AMOUNT", 11);

            Row row23 = sheet.createRow(23);
            cellFactory.createCell(row23, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), "Container No.", 1);
            cellFactory.createEmptyCells(row23, 2, 2);
            cellFactory.createCell(row23, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 3);
            cellFactory.createEmptyCells(row23, 4, 8);
            cellFactory.createCell(row23, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 9);
            cellFactory.createCell(row23, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), "INR", 10);
            cellFactory.createCell(row23, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_RIGHT_BORDER), "INR", 11);

            Row row24 = sheet.createRow(24);
            cellFactory.createCell(row24, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.LEFT_BORDER), "Box 1", 1);
            cellFactory.createEmptyCells(row24, 2, 11);

            Row row25 = sheet.createRow(25);
            cellFactory.createCell(row25, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.LEFT_BORDER), "Weight: " + shipment.getActualWeight() + " Kg", 1);
            cellFactory.createEmptyCells(row25, 2, 11);

            Integer rowIndex = 25;
            Integer counter = 1;
            BigDecimal totalAmount = BigDecimal.ZERO;

            for (ItemDto box: shipment.getItems()) {
                rowIndex++;
                totalAmount = totalAmount.add(box.getPrice().multiply(BigDecimal.valueOf(Long.valueOf(box.getQuantity()))));
                Row row = sheet.createRow(rowIndex);
                cellFactory.createCell(row, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), null ), counter + ")", 5);
                cellFactory.createCell(row, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), null ), box.getItemType().getDescription(), 6);
                cellFactory.createCell(row, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), null ), String.valueOf(box.getQuantity()), 9);
                cellFactory.createCell(row, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), null ), box.getPrice().toPlainString(), 10);
                cellFactory.createCell(row, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.RIGHT_BORDER ), box.getPrice().multiply(BigDecimal.valueOf(Long.valueOf(box.getQuantity()))).toPlainString(), 11);
                counter++;
            }

            Row row26 = sheet.createRow(++rowIndex);
            cellFactory.createCell(row26, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 1);
            cellFactory.createCell(row26, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.BOTTOM_BORDER), null, 2);
            cellFactory.createCell(row26, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.BOTTOM_BORDER), null, 3);
            cellFactory.createCell(row26, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.BOTTOM_BORDER), null, 4);
            cellFactory.createCell(row26, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.BOTTOM_BORDER), null, 5);
            cellFactory.createCell(row26, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.BOTTOM_BORDER), null, 6);
            cellFactory.createCell(row26, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.BOTTOM_BORDER), null, 7);
            cellFactory.createCell(row26, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.BOTTOM_BORDER), null, 8);
            cellFactory.createCell(row26, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.BOTTOM_BORDER), null, 9);
            cellFactory.createCell(row26, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.BOTTOM_BORDER), null, 10);
            cellFactory.createCell(row26, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.RIGHT_BORDER), null, 11);

            Row row27 = sheet.createRow(++rowIndex);
            cellFactory.createCell(row27, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 1);
            cellFactory.createCell(row27, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), null), "Total", 10);
            cellFactory.createCell(row27, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.RIGHT_BORDER), totalAmount.toPlainString(), 11);

            String totalInWords = NumberToWords.convertNumberToWords(totalAmount);
            String amountText = "Amount Chargeable : " + "INR" + " " + totalInWords + " ONLY";

            Row row28 = sheet.createRow(++rowIndex);
            cellFactory.createCell(row28, cellStyleFactory.getCellStyle(workbook, fontFactory.getFont(workbook, FontType.BOLD), CellStyleType.LEFT_BORDER), amountText, 1);
            cellFactory.createCell(row28, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.RIGHT_BORDER), null, 11);

            Row row29 = sheet.createRow(++rowIndex);
            cellFactory.createCell(row29, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 1);
            cellFactory.createCell(row29, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), null, 8);
            cellFactory.createCell(row29, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), shipment.getShipper().getName(), 9);
            cellFactory.createCell(row29, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 10);
            cellFactory.createCell(row29, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_RIGHT_BORDER), null, 11);

            Row row30 = sheet.createRow(++rowIndex);
            cellFactory.createCell(row30, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), "Declaration:", 1);
            cellFactory.createCell(row30, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 8);
            cellFactory.createCell(row30, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.RIGHT_BORDER), null, 11);

            Row row31 = sheet.createRow(++rowIndex);
            cellFactory.createCell(row31, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), "We declaration that invoice shows the actual price of goods", 1);
            cellFactory.createCell(row31, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 8);
            cellFactory.createCell(row31, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.RIGHT_BORDER), null, 11);

            Row row32 = sheet.createRow(++rowIndex);
            cellFactory.createCell(row32, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), "described and that all particularss are true & correct.", 1);
            cellFactory.createCell(row32, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 8);
            cellFactory.createCell(row32, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.RIGHT_BORDER), null, 11);

            Row row33 = sheet.createRow(++rowIndex);
            cellFactory.createCell(row33, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 1);
            cellFactory.createCell(row33, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.LEFT_BORDER), null, 8);
            cellFactory.createCell(row33, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.RIGHT_BORDER), null, 11);

            Row row34 = sheet.createRow(++rowIndex);
            cellFactory.createCell(row34, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_LEFT_BORDER), null, 1);
            cellFactory.createCell(row34, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 2);
            cellFactory.createCell(row34, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 3);
            cellFactory.createCell(row34, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 4);
            cellFactory.createCell(row34, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 5);
            cellFactory.createCell(row34, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 6);
            cellFactory.createCell(row34, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 7);
            cellFactory.createCell(row34, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 8);
            cellFactory.createCell(row34, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 9);
            cellFactory.createCell(row34, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_BORDER), null, 10);
            cellFactory.createCell(row34, cellStyleFactory.getCellStyle(workbook, null, CellStyleType.TOP_RIGHT_BORDER), null, 11);


            workbook.write(out);
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        return out;
    }

}
