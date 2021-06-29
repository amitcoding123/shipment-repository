package com.logistics.domain;

public class ShipperDto extends BaseDto {

    private String place;
    private String name;
    private String phoneNumber;
    private String email;
    private String aadharNumber;
    private String panNumber;
    private String gstin;
    private String aadharFileName;
    private String aadharContentType;
    private byte[] aadharDocument;
    private String panFileName;
    private String panContentType;
    private byte[] panDocument;
    private AddressDto address;


    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getGstin() {
		return gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	public String getAadharFileName() {
		return aadharFileName;
	}

	public void setAadharFileName(String aadharFileName) {
		this.aadharFileName = aadharFileName;
	}

	public String getAadharContentType() {
		return aadharContentType;
	}

	public void setAadharContentType(String aadharContentType) {
		this.aadharContentType = aadharContentType;
	}

	public byte[] getAadharDocument() {
		return aadharDocument;
	}

	public void setAadharDocument(byte[] aadharDocument) {
		this.aadharDocument = aadharDocument;
	}

	public String getPanFileName() {
		return panFileName;
	}

	public void setPanFileName(String panFileName) {
		this.panFileName = panFileName;
	}

	public String getPanContentType() {
		return panContentType;
	}

	public void setPanContentType(String panContentType) {
		this.panContentType = panContentType;
	}

	public byte[] getPanDocument() {
		return panDocument;
	}

	public void setPanDocument(byte[] panDocument) {
		this.panDocument = panDocument;
	}
    
	
}
