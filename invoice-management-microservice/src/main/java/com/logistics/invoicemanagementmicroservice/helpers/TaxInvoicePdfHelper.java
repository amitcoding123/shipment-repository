package com.logistics.invoicemanagementmicroservice.helpers;

import java.io.File;
import java.nio.file.Files;
import java.time.LocalDate;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.DashedBorder;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;
import com.logistics.domain.ShipmentDto;
import com.logistics.domain.TaxInvoiceDto;
import com.logistics.invoicemanagementmicroservice.model.CustomerTaxInvoice;

@Component
public class TaxInvoicePdfHelper {
	
	private static final Long min = 1L;
	private static final Long max = 999999999999999999L;
	
	public CustomerTaxInvoice generateTaxInvoice(TaxInvoiceDto dto) {
		
		Long suffix = (long) (Math.random() * (max-min) + min);
		String fileName = "Tax_Invoice_" + suffix + ".pdf";
		String path = "C:/amit/temp/" + fileName;
		
		CustomerTaxInvoice taxInvoice = new CustomerTaxInvoice();
		
		try {
			PdfWriter writer = new PdfWriter(path);
			PdfDocument pdfDocument = new PdfDocument(writer);
			pdfDocument.addNewPage();
			Document document = new Document(pdfDocument);
			Border solidBorder = new SolidBorder(1);
			Border noBorder = new DashedBorder(0);
			
			document.setLeftMargin(80);
			document.setTopMargin(80);
			
			PdfFont courierBold = PdfFontFactory.createFont(FontConstants.COURIER_BOLD);
			PdfFont courierItalics = PdfFontFactory.createFont(FontConstants.COURIER_OBLIQUE);
			
			Text text1 = new Text(dto.getUser().getOrganization().getName()).setFontSize(12);
			text1.setFont(courierBold);
			
			float[] pcw1 = {450F};
			
			Table t1 = new Table(pcw1);
			
			Cell c1 = new Cell();
			c1.setTextAlignment(TextAlignment.CENTER);
			Paragraph p1 = new Paragraph();
			p1.add(text1);
			c1.add(p1);
			
			c1.setBorder(solidBorder);
			
			t1.addCell(c1);
			document.add(t1);
			
			float[] pcw2 = {100F, 350F};
			Table t2 = new Table(pcw2);
			
			Cell c2 = new Cell();
			c2.setTextAlignment(TextAlignment.RIGHT);
			
			Text text2 = new Text("Reg. Office:").setFontSize(8);			
			text2.setFont(courierBold);
			Paragraph p2 = new Paragraph();
			p2.add(text2);
			c2.add(p2);
			c2.setBorderLeft(solidBorder);
			c2.setBorderRight(noBorder);
			c2.setBorderTop(noBorder);
			c2.setBorderBottom(noBorder);
			t2.addCell(c2);
			
			Cell c3 = new Cell();
			c3.setTextAlignment(TextAlignment.LEFT);
			
			Text text3 = new Text(dto.getUser().getOrganization().getAddress()).setFontSize(8);			
			text3.setFont(courierItalics);
			Paragraph p3 = new Paragraph();
			p3.add(text3);
			c3.add(p3);
			c3.setBorderLeft(noBorder);
			c3.setBorderRight(solidBorder);
			c3.setBorderTop(noBorder);
			c3.setBorderBottom(noBorder);
			t2.addCell(c2);
			
			Cell c4 = new Cell();
			c4.setTextAlignment(TextAlignment.RIGHT);
			
			Text text4 = new Text("Tel. No.").setFontSize(8);			
			text4.setFont(courierBold);
			Paragraph p4 = new Paragraph();
			p4.add(text4);
			c4.add(p4);
			c4.setBorderLeft(solidBorder);
			c4.setBorderRight(noBorder);
			c4.setBorderTop(noBorder);
			c4.setBorderBottom(noBorder);
			t2.addCell(c4);
			
			Cell c5 = new Cell();
			c5.setTextAlignment(TextAlignment.LEFT);
			
			Text text5 = new Text(dto.getUser().getOrganization().getTelephoneNumber()).setFontSize(8);			
			text5.setFont(courierItalics);
			Paragraph p5 = new Paragraph();
			p5.add(text5);
			c5.add(p5);
			c5.setBorderLeft(noBorder);
			c5.setBorderRight(solidBorder);
			c5.setBorderTop(noBorder);
			c5.setBorderBottom(noBorder);
			t2.addCell(c5);
			
			Cell c6 = new Cell();
			c6.setTextAlignment(TextAlignment.RIGHT);
			
			Text text6 = new Text("Email:").setFontSize(8);			
			text6.setFont(courierBold);
			Paragraph p6 = new Paragraph();
			p6.add(text6);
			c6.add(p6);
			c6.setBorderLeft(solidBorder);
			c6.setBorderRight(noBorder);
			c6.setBorderTop(noBorder);
			c6.setBorderBottom(noBorder);
			t2.addCell(c6);
			
			Cell c7 = new Cell();
			c7.setTextAlignment(TextAlignment.LEFT);
			
			Text text7 = new Text(dto.getUser().getOrganization().getEmail()).setFontSize(8);			
			text7.setFont(courierItalics);
			Paragraph p7 = new Paragraph();
			p7.add(text7);
			c7.add(p7);
			c7.setBorderLeft(noBorder);
			c7.setBorderRight(solidBorder);
			c7.setBorderTop(noBorder);
			c7.setBorderBottom(noBorder);
			t2.addCell(c7);
			
			Cell c8 = new Cell();
			c8.setTextAlignment(TextAlignment.RIGHT);
			
			Text text8 = new Text("GSTIN:").setFontSize(8);			
			text8.setFont(courierBold);
			Paragraph p8 = new Paragraph();
			p8.add(text8);
			c8.add(p8);
			c8.setBorderLeft(solidBorder);
			c8.setBorderRight(noBorder);
			c8.setBorderTop(noBorder);
			c8.setBorderBottom(noBorder);
			t2.addCell(c8);
			
			Cell c9 = new Cell();
			c9.setTextAlignment(TextAlignment.LEFT);
			
			Text text9 = new Text(dto.getUser().getOrganization().getGstin()).setFontSize(8);			
			text9.setFont(courierItalics);
			Paragraph p9 = new Paragraph();
			p9.add(text9);
			c9.add(p9);
			c9.setBorderLeft(noBorder);
			c9.setBorderRight(solidBorder);
			c9.setBorderTop(noBorder);
			c9.setBorderBottom(noBorder);
			t2.addCell(c9);
			
			document.add(t2);
			
			float[] pcw3 = {450F};
			
			Table t3 = new Table(pcw3);
			
			Cell c10 = new Cell();
			c10.setTextAlignment(TextAlignment.CENTER);
			Paragraph p10 = new Paragraph();
			Text text10 = new Text("TAX INVOICE").setFontSize(12);
			text10.setFont(courierBold);
			p10.add(text10);
			c10.add(p10);
			
			c10.setBorder(solidBorder);
			
			t3.addCell(c10);
			document.add(t3);
			
			float[] pcw4 = {200F, 50F, 200F};
			Table t4 = new Table(pcw4);
			
			Cell c11 = new Cell();
			c11.setTextAlignment(TextAlignment.CENTER);
			StringBuffer shipperDetails = new StringBuffer();
			
			shipperDetails.append("TO,\t").append(dto.getShipper().getName());
			shipperDetails.append("\nAddress:\t").append(dto.getShipper().getAddress().getAddressLine1())
			.append(", ").append(dto.getShipper().getAddress().getAddressLine2())
			.append(", ").append(dto.getShipper().getAddress().getCity())
			.append(" - ").append(dto.getShipper().getAddress().getZipCode())
			.append(", ").append(dto.getShipper().getAddress().getState());
			shipperDetails.append("\nPAN:\t").append(dto.getShipper().getPanNumber());
			shipperDetails.append("\nGSTIN:\t").append(dto.getShipper().getGstin());
			
			Paragraph p11 = new Paragraph();
			Text text11 = new Text(shipperDetails.toString()).setFontSize(8);
			p11.add(text11);
			c11.add(p11);
			c11.setBorderLeft(solidBorder);
			c11.setBorderTop(solidBorder);
			c11.setBorderRight(noBorder);
			c11.setBorderBottom(noBorder);
			t4.addCell(c11);
			
			Cell emptyCell = new Cell();
			t4.addCell(emptyCell);
			
			Cell c12 = new Cell();
			c11.setTextAlignment(TextAlignment.CENTER);
			StringBuffer orgDetails = new StringBuffer();
			
			orgDetails.append("PAN NO.:\t").append(dto.getUser().getOrganization().getPan());
			orgDetails.append("\nINVOICE NUMBER:\t").append(dto.getTaxInvoiceNumber());
			orgDetails.append("\nDATE:\t").append(dto.getInvoiceDate());
			
			Paragraph p12 = new Paragraph();
			Text text12 = new Text(orgDetails.toString()).setFontSize(8);
			p12.add(text12);
			c12.add(p12);
			c12.setBorderLeft(noBorder);
			c12.setBorderTop(solidBorder);
			c12.setBorderRight(solidBorder);
			c12.setBorderBottom(noBorder);
			t4.addCell(c12);
			
			document.add(t4);
			
			float[] pcw5 = {50F, 150F, 50F, 50F, 50F, 100F};
			Table t5 = new Table(pcw5);
			
			Cell c13 = new Cell();
			c13.setTextAlignment(TextAlignment.CENTER);
			Paragraph p13 = new Paragraph();
			Text text13 = new Text("SR. No.").setFontSize(8);
			p13.add(text13);
			c13.add(p13);
			c13.setBorder(solidBorder);
			t5.addCell(c13);
			
			Cell c14 = new Cell();
			c14.setTextAlignment(TextAlignment.CENTER);
			Paragraph p14 = new Paragraph();
			Text text14 = new Text("PARTICULARS").setFontSize(8);
			p14.add(text14);
			c14.add(p14);
			c14.setBorder(solidBorder);
			t5.addCell(c14);
			
			Cell c15 = new Cell();
			c15.setTextAlignment(TextAlignment.CENTER);
			Paragraph p15 = new Paragraph();
			Text text15 = new Text("HSN/SAC Code").setFontSize(8);
			p15.add(text15);
			c15.add(p15);
			c15.setBorder(solidBorder);
			t5.addCell(c15);
			
			Cell c16 = new Cell();
			c16.setTextAlignment(TextAlignment.CENTER);
			Paragraph p16 = new Paragraph();
			Text text16 = new Text("RATE (RS)").setFontSize(8);
			p16.add(text16);
			c16.add(p16);
			c16.setBorder(solidBorder);
			t5.addCell(c16);
			
			Cell c17 = new Cell();
			c17.setTextAlignment(TextAlignment.CENTER);
			Paragraph p17 = new Paragraph();
			Text text17 = new Text("UNITS (Kgs)").setFontSize(8);
			p17.add(text17);
			c17.add(p17);
			c17.setBorder(solidBorder);
			t5.addCell(c17);
			
			Cell c18 = new Cell();
			c18.setTextAlignment(TextAlignment.CENTER);
			Paragraph p18 = new Paragraph();
			Text text18 = new Text("AMOUNT (RS)").setFontSize(8);
			p18.add(text18);
			c18.add(p18);
			c18.setBorder(solidBorder);
			t5.addCell(c18);
			
			int serialNumber = 1;
			
			double totalCovidCharge = 0;
			double totalNetAmount = 0;
			double totalInvoiceValue = 0;
			double totalWeight = 0;
			
			for(ShipmentDto shipment: dto.getShipments()) {
				Cell cell0 = new Cell();
				cell0.setTextAlignment(TextAlignment.CENTER);
				Paragraph para0 = new Paragraph();
				Text text0 = new Text(String.valueOf(serialNumber));
				para0.add(text0);
				cell0.add(para0);
				cell0.setBorderLeft(solidBorder);
				cell0.setBorderRight(solidBorder);
				t5.addCell(cell0);
				
				serialNumber++;
				
				Cell cell01 = new Cell();
				cell01.setTextAlignment(TextAlignment.CENTER);
				Paragraph para01 = new Paragraph();
				StringBuffer courier = new StringBuffer("Courier Service");
				courier.append("\n(Airway Bill No. ").append(shipment.getInvoiceNumber()).append(")");
				courier.append("\n(FedEx Tracking No. ").append(shipment.getTrackingNumber()).append(")");
				Text text01 = new Text(String.valueOf(courier.toString()));
				para01.add(text01);
				cell01.add(para01);
				cell01.setBorderLeft(solidBorder);
				cell01.setBorderRight(solidBorder);
				t5.addCell(cell01);
				
				Cell cell02 = new Cell();
				cell02.setTextAlignment(TextAlignment.CENTER);
				Paragraph para02 = new Paragraph();				
				Text text02 = new Text("996812");
				para02.add(text02);
				cell02.add(para02);
				cell02.setBorderLeft(solidBorder);
				cell02.setBorderRight(solidBorder);
				t5.addCell(cell02);
				
				Cell cell03 = new Cell();
				cell03.setTextAlignment(TextAlignment.CENTER);
				Paragraph para03 = new Paragraph();				
				Text text03 = new Text(" ");
				para03.add(text03);
				cell03.add(para03);
				cell03.setBorderLeft(solidBorder);
				cell03.setBorderRight(solidBorder);
				t5.addCell(cell03);
				
				Cell cell04 = new Cell();
				cell04.setTextAlignment(TextAlignment.CENTER);
				Paragraph para04 = new Paragraph();				
				Text text04 = new Text((shipment.getActualWeight().doubleValue() > shipment.getBoxWeight().doubleValue()) 
						? String.valueOf(shipment.getActualWeight().doubleValue()) : String.valueOf(shipment.getBoxWeight().doubleValue()));
				para04.add(text04);
				cell04.add(para04);
				cell04.setBorderLeft(solidBorder);
				cell04.setBorderRight(solidBorder);
				t5.addCell(cell04);
				
				Cell cell05 = new Cell();
				cell05.setTextAlignment(TextAlignment.CENTER);
				Paragraph para05 = new Paragraph();				
				Text text05 = new Text(String.valueOf(shipment.getFrieghtCharge().doubleValue()));
				para05.add(text05);
				cell05.add(para05);
				cell05.setBorderLeft(solidBorder);
				cell05.setBorderRight(solidBorder);
				t5.addCell(cell05);
				
				totalCovidCharge += shipment.getCovidSurcharge();
				totalNetAmount += shipment.getFrieghtCharge().doubleValue();
				totalWeight += (shipment.getActualWeight().doubleValue() > shipment.getBoxWeight().doubleValue() 
						? shipment.getActualWeight().doubleValue() : shipment.getBoxWeight().doubleValue());
			}
			
			Cell cell21 = new Cell();
			cell21.setTextAlignment(TextAlignment.CENTER);
			Paragraph para21 = new Paragraph();
			Text text21 = new Text(" ").setFontSize(8);
			para21.add(text21);
			cell21.add(para21);
			cell21.setBorderLeft(solidBorder);
			cell21.setBorderRight(solidBorder);
			t5.addCell(cell21);
			
			Cell cell22 = new Cell();
			cell22.setTextAlignment(TextAlignment.CENTER);
			Paragraph para22 = new Paragraph();
			Text text22 = new Text("Covid Surchange").setFontSize(8);
			para22.add(text22);
			cell22.add(para22);
			cell22.setBorderLeft(solidBorder);
			cell22.setBorderRight(solidBorder);
			cell22.setBorderBottom(solidBorder);
			t5.addCell(cell21);
			
			Cell cell23 = new Cell();
			cell23.setTextAlignment(TextAlignment.CENTER);
			Paragraph para23 = new Paragraph();
			Text text23 = new Text(" ").setFontSize(8);
			para23.add(text23);
			cell23.add(para23);
			cell23.setBorderLeft(solidBorder);
			cell23.setBorderRight(solidBorder);
			t5.addCell(cell23);
			
			Cell cell24 = new Cell();
			cell24.setTextAlignment(TextAlignment.CENTER);
			Paragraph para24 = new Paragraph();
			Text text24 = new Text(" ").setFontSize(8);
			para24.add(text24);
			cell24.add(para24);
			cell24.setBorderLeft(solidBorder);
			cell24.setBorderRight(solidBorder);
			t5.addCell(cell24);
			
			Cell cell25 = new Cell();
			cell25.setTextAlignment(TextAlignment.CENTER);
			Paragraph para25 = new Paragraph();
			Text text25 = new Text(" ").setFontSize(8);
			para25.add(text25);
			cell25.add(para25);
			cell25.setBorderLeft(solidBorder);
			cell25.setBorderRight(solidBorder);
			t5.addCell(cell25);
			
			Cell cell26 = new Cell();
			cell26.setTextAlignment(TextAlignment.CENTER);
			Paragraph para26 = new Paragraph();
			Text text26 = new Text(String.valueOf(totalCovidCharge)).setFontSize(8);
			para26.add(text26);
			cell26.add(para26);
			cell26.setBorderLeft(solidBorder);
			cell26.setBorderRight(solidBorder);
			t5.addCell(cell26);
			
			Cell cell27 = new Cell();
			cell27.setTextAlignment(TextAlignment.CENTER);
			Paragraph para27 = new Paragraph();
			Text text27 = new Text(" ").setFontSize(8);
			para27.add(text27);
			cell27.add(para27);
			cell27.setBorderLeft(solidBorder);
			cell27.setBorderRight(solidBorder);
			t5.addCell(cell27);
			
			Cell cell28 = new Cell();
			cell28.setTextAlignment(TextAlignment.CENTER);
			Paragraph para28 = new Paragraph();
			Text text28 = new Text("NET TOTAL").setFontSize(8);
			text28.setFont(courierBold);
			para28.add(text28);
			cell28.add(para28);			
			cell28.setBorder(solidBorder);
			t5.addCell(cell28);
			
			Cell cell29 = new Cell();
			cell29.setTextAlignment(TextAlignment.CENTER);
			Paragraph para29 = new Paragraph();
			Text text29 = new Text(" ").setFontSize(8);
			para29.add(text29);
			cell29.add(para29);			
			cell29.setBorder(solidBorder);
			t5.addCell(cell29);
			
			Cell cell30 = new Cell();
			cell30.setTextAlignment(TextAlignment.CENTER);
			Paragraph para30 = new Paragraph();
			Text text30 = new Text(" ").setFontSize(8);
			para30.add(text30);
			cell30.add(para30);			
			cell30.setBorder(solidBorder);
			t5.addCell(cell30);
			
			Cell cell31 = new Cell();
			cell31.setTextAlignment(TextAlignment.CENTER);
			Paragraph para31 = new Paragraph();
			Text text31 = new Text(String.valueOf(totalWeight)).setFontSize(8);
			text31.setFont(courierBold);
			para31.add(text31);
			cell31.add(para31);			
			cell31.setBorder(solidBorder);
			t5.addCell(cell31);
			
			Cell cell32 = new Cell();
			cell32.setTextAlignment(TextAlignment.CENTER);
			Paragraph para32 = new Paragraph();
			Text text32 = new Text(String.valueOf(totalNetAmount)).setFontSize(8);
			text32.setFont(courierBold);
			para32.add(text32);
			cell32.add(para32);			
			cell32.setBorder(solidBorder);
			t5.addCell(cell32);
			
			Cell cell33 = new Cell();
			cell33.setTextAlignment(TextAlignment.CENTER);
			Paragraph para33 = new Paragraph();
			Text text33 = new Text(String.valueOf(" ")).setFontSize(8);
			para33.add(text33);
			cell33.add(para33);			
			cell33.setBorderLeft(solidBorder);
			cell33.setBorderRight(solidBorder);
			t5.addCell(cell33);
			
			Cell cell34 = new Cell();
			cell34.setTextAlignment(TextAlignment.CENTER);
			Paragraph para34 = new Paragraph();
			StringBuffer totalAmount = new StringBuffer();
			totalAmount.append("Other Charges: \n").append("Fuel Surcharge (19.5% of Net Total)");
			Text text34 = new Text(totalAmount.toString()).setFontSize(8);
			para34.add(text34);
			cell34.add(para34);			
			cell34.setBorder(solidBorder);
			t5.addCell(cell34);
			
			Cell cell35 = new Cell();
			cell35.setTextAlignment(TextAlignment.CENTER);
			Paragraph para35 = new Paragraph();
			Text text35 = new Text(" ").setFontSize(8);
			para35.add(text35);
			cell35.add(para35);			
			cell35.setBorder(solidBorder);
			t5.addCell(cell35);
			
			Cell cell36 = new Cell();
			cell36.setTextAlignment(TextAlignment.CENTER);
			Paragraph para36 = new Paragraph();
			Text text36 = new Text(" ").setFontSize(8);
			para36.add(text36);
			cell36.add(para36);			
			cell36.setBorder(solidBorder);
			t5.addCell(cell36);
			
			Cell cell37 = new Cell();
			cell37.setTextAlignment(TextAlignment.CENTER);
			Paragraph para37 = new Paragraph();
			Text text37 = new Text(" ").setFontSize(8);
			para37.add(text37);
			cell37.add(para37);			
			cell37.setBorder(solidBorder);
			t5.addCell(cell37);
			
			Cell cell38 = new Cell();
			cell38.setTextAlignment(TextAlignment.CENTER);
			Paragraph para38 = new Paragraph();
			Text text38 = new Text(String.valueOf(totalNetAmount * 0.195)).setFontSize(8);
			para38.add(text38);
			cell38.add(para38);			
			cell38.setBorder(solidBorder);
			t5.addCell(cell38);
			
			document.add(t5);
			
			float[] pcw6 = {200F, 50F, 250F};
			Table t6 = new Table(pcw6);
			
			Cell cell61 = new Cell();
			cell61.setTextAlignment(TextAlignment.RIGHT);
			Paragraph para61 = new Paragraph();
			StringBuffer subTotal = new StringBuffer();
			subTotal.append("Sub Total:");
			subTotal.append("\nCGST:");
			subTotal.append("\nSGST:");
			subTotal.append("\nInvoice Value(In Rs.):");
			Text text61 = new Text(subTotal.toString()).setFontSize(8);
			para61.add(text61);
			cell61.add(para61);
			cell61.setBorderLeft(solidBorder);
			cell61.setBorderTop(solidBorder);
			cell61.setBorderBottom(solidBorder);
			cell61.setBorderRight(noBorder);
			t6.addCell(cell61);
			
			Cell cell62 = new Cell();
			cell62.setTextAlignment(TextAlignment.RIGHT);
			Paragraph para62 = new Paragraph();
			StringBuffer gst = new StringBuffer();
			gst.append("\n9%");
			gst.append("\n9%");
			Text text62 = new Text(gst.toString()).setFontSize(8);
			para62.add(text62);
			cell62.add(para62);
			cell62.setBorderBottom(solidBorder);
			cell62.setBorderLeft(noBorder);
			cell62.setBorderRight(noBorder);
			cell62.setBorderTop(solidBorder);
			t6.addCell(cell62);
			
			Cell cell63 = new Cell();
			cell63.setTextAlignment(TextAlignment.RIGHT);
			Paragraph para63 = new Paragraph();
			StringBuffer charge = new StringBuffer();
			charge.append(totalNetAmount * 1.195);
			charge.append("\n").append(totalNetAmount * 1.195 * 0.09);
			charge.append("\n").append(totalNetAmount * 1.195 * 0.09);
			charge.append("\n").append((totalNetAmount * 1.195 * 0.09) * 2 + totalNetAmount * 1.195);
			Text text63 = new Text(charge.toString()).setFontSize(8);
			para63.add(text63);
			cell63.add(para63);
			cell63.setBorderBottom(solidBorder);
			cell63.setBorderLeft(noBorder);
			cell63.setBorderRight(solidBorder);
			cell63.setBorderTop(solidBorder);
			t6.addCell(cell63);
			
			document.add(t6);
			
			float[] pcw7 = {200F, 300F};
			Table t7 = new Table(pcw7);
			
			Cell cell71 = new Cell();
			cell71.setTextAlignment(TextAlignment.LEFT);
			Paragraph para71 = new Paragraph();
			StringBuffer bankDetails = new StringBuffer();
			bankDetails.append("BANK DETAILS");
			bankDetails.append("Bank name: ").append(dto.getUser().getOrganization().getBankDetails().get(0).getAccountNumber());
			bankDetails.append("IFSC Code: ").append(dto.getUser().getOrganization().getBankDetails().get(0).getIfscCode());
			bankDetails.append("MICR Code: ").append(dto.getUser().getOrganization().getBankDetails().get(0).getMicrCode());
			Text text71 = new Text(bankDetails.toString()).setFontSize(8);
			para71.add(text71);
			cell71.add(para71);
			cell71.setBorder(solidBorder);
			cell71.setFont(courierBold);
			t7.addCell(cell71);
			
			Cell cell72 = new Cell();
			cell72.setTextAlignment(TextAlignment.CENTER);
			Paragraph para72 = new Paragraph();			
			Text text72 = new Text("FOR INTERNATIONAL SPEED LINK").setFontSize(8);
			para72.add(text72);
			cell72.add(para72);
			cell72.setBorder(solidBorder);
			cell72.setFont(courierBold);
			t7.addCell(cell72);
			
			document.add(t7);
			
			document.setLeftMargin(80);
			document.setTopMargin(80);
			
			document.close();
			
			
			
			taxInvoice.setFileName(fileName);
			taxInvoice.setCreatedOn(LocalDate.now());
			taxInvoice.setUserId(dto.getUser().getUserId());
			taxInvoice.setShipperId(dto.getShipper().getId());
			File file = new File(path);
			
			taxInvoice.setTaxInvoice(FileUtils.readFileToByteArray(file));
			taxInvoice.setContentType(Files.probeContentType(file.toPath()));
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return taxInvoice;
	}

}
