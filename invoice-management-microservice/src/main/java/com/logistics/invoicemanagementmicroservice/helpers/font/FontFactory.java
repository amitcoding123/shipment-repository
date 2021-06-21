package com.logistics.invoicemanagementmicroservice.helpers.font;

import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;

@Component
public class FontFactory {

    public Font getFont(Workbook workbook, FontType type) {
        Font font = null;
        font = workbook.createFont();

        switch (type) {
            case BOLD:
                font.setBold(true);
                break;
            case BOLD_ITALICS:
                font.setBold(true);
                font.setItalic(true);
                break;
        }

        return font;
    }

}
