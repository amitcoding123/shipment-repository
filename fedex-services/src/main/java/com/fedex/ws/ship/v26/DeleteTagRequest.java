/**
 * DeleteTagRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;

public class DeleteTagRequest  implements java.io.Serializable {
    /* Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services). */
    private com.fedex.ws.ship.v26.WebAuthenticationDetail webAuthenticationDetail;

    private com.fedex.ws.ship.v26.ClientDetail clientDetail;

    private com.fedex.ws.ship.v26.UserDetail userDetail;

    private com.fedex.ws.ship.v26.TransactionDetail transactionDetail;

    private com.fedex.ws.ship.v26.VersionId version;

    /* Only used for tags which had FedEx Express services. */
    private java.lang.String dispatchLocationId;

    /* Only used for tags which had FedEx Express services. */
    private java.util.Date dispatchDate;

    /* If the original ProcessTagRequest specified third-party payment,
     * then the delete request must contain the same pay type and payor account
     * number for security purposes. */
    private com.fedex.ws.ship.v26.Payment payment;

    private java.lang.String confirmationNumber;

    public DeleteTagRequest() {
    }

    public DeleteTagRequest(
           com.fedex.ws.ship.v26.WebAuthenticationDetail webAuthenticationDetail,
           com.fedex.ws.ship.v26.ClientDetail clientDetail,
           com.fedex.ws.ship.v26.UserDetail userDetail,
           com.fedex.ws.ship.v26.TransactionDetail transactionDetail,
           com.fedex.ws.ship.v26.VersionId version,
           java.lang.String dispatchLocationId,
           java.util.Date dispatchDate,
           com.fedex.ws.ship.v26.Payment payment,
           java.lang.String confirmationNumber) {
           this.webAuthenticationDetail = webAuthenticationDetail;
           this.clientDetail = clientDetail;
           this.userDetail = userDetail;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.dispatchLocationId = dispatchLocationId;
           this.dispatchDate = dispatchDate;
           this.payment = payment;
           this.confirmationNumber = confirmationNumber;
    }


    /**
     * Gets the webAuthenticationDetail value for this DeleteTagRequest.
     * 
     * @return webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public com.fedex.ws.ship.v26.WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }


    /**
     * Sets the webAuthenticationDetail value for this DeleteTagRequest.
     * 
     * @param webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public void setWebAuthenticationDetail(com.fedex.ws.ship.v26.WebAuthenticationDetail webAuthenticationDetail) {
        this.webAuthenticationDetail = webAuthenticationDetail;
    }


    /**
     * Gets the clientDetail value for this DeleteTagRequest.
     * 
     * @return clientDetail
     */
    public com.fedex.ws.ship.v26.ClientDetail getClientDetail() {
        return clientDetail;
    }


    /**
     * Sets the clientDetail value for this DeleteTagRequest.
     * 
     * @param clientDetail
     */
    public void setClientDetail(com.fedex.ws.ship.v26.ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }


    /**
     * Gets the userDetail value for this DeleteTagRequest.
     * 
     * @return userDetail
     */
    public com.fedex.ws.ship.v26.UserDetail getUserDetail() {
        return userDetail;
    }


    /**
     * Sets the userDetail value for this DeleteTagRequest.
     * 
     * @param userDetail
     */
    public void setUserDetail(com.fedex.ws.ship.v26.UserDetail userDetail) {
        this.userDetail = userDetail;
    }


    /**
     * Gets the transactionDetail value for this DeleteTagRequest.
     * 
     * @return transactionDetail
     */
    public com.fedex.ws.ship.v26.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this DeleteTagRequest.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(com.fedex.ws.ship.v26.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this DeleteTagRequest.
     * 
     * @return version
     */
    public com.fedex.ws.ship.v26.VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this DeleteTagRequest.
     * 
     * @param version
     */
    public void setVersion(com.fedex.ws.ship.v26.VersionId version) {
        this.version = version;
    }


    /**
     * Gets the dispatchLocationId value for this DeleteTagRequest.
     * 
     * @return dispatchLocationId   * Only used for tags which had FedEx Express services.
     */
    public java.lang.String getDispatchLocationId() {
        return dispatchLocationId;
    }


    /**
     * Sets the dispatchLocationId value for this DeleteTagRequest.
     * 
     * @param dispatchLocationId   * Only used for tags which had FedEx Express services.
     */
    public void setDispatchLocationId(java.lang.String dispatchLocationId) {
        this.dispatchLocationId = dispatchLocationId;
    }


    /**
     * Gets the dispatchDate value for this DeleteTagRequest.
     * 
     * @return dispatchDate   * Only used for tags which had FedEx Express services.
     */
    public java.util.Date getDispatchDate() {
        return dispatchDate;
    }


    /**
     * Sets the dispatchDate value for this DeleteTagRequest.
     * 
     * @param dispatchDate   * Only used for tags which had FedEx Express services.
     */
    public void setDispatchDate(java.util.Date dispatchDate) {
        this.dispatchDate = dispatchDate;
    }


    /**
     * Gets the payment value for this DeleteTagRequest.
     * 
     * @return payment   * If the original ProcessTagRequest specified third-party payment,
     * then the delete request must contain the same pay type and payor account
     * number for security purposes.
     */
    public com.fedex.ws.ship.v26.Payment getPayment() {
        return payment;
    }


    /**
     * Sets the payment value for this DeleteTagRequest.
     * 
     * @param payment   * If the original ProcessTagRequest specified third-party payment,
     * then the delete request must contain the same pay type and payor account
     * number for security purposes.
     */
    public void setPayment(com.fedex.ws.ship.v26.Payment payment) {
        this.payment = payment;
    }


    /**
     * Gets the confirmationNumber value for this DeleteTagRequest.
     * 
     * @return confirmationNumber
     */
    public java.lang.String getConfirmationNumber() {
        return confirmationNumber;
    }


    /**
     * Sets the confirmationNumber value for this DeleteTagRequest.
     * 
     * @param confirmationNumber
     */
    public void setConfirmationNumber(java.lang.String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteTagRequest)) return false;
        DeleteTagRequest other = (DeleteTagRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webAuthenticationDetail==null && other.getWebAuthenticationDetail()==null) || 
             (this.webAuthenticationDetail!=null &&
              this.webAuthenticationDetail.equals(other.getWebAuthenticationDetail()))) &&
            ((this.clientDetail==null && other.getClientDetail()==null) || 
             (this.clientDetail!=null &&
              this.clientDetail.equals(other.getClientDetail()))) &&
            ((this.userDetail==null && other.getUserDetail()==null) || 
             (this.userDetail!=null &&
              this.userDetail.equals(other.getUserDetail()))) &&
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.dispatchLocationId==null && other.getDispatchLocationId()==null) || 
             (this.dispatchLocationId!=null &&
              this.dispatchLocationId.equals(other.getDispatchLocationId()))) &&
            ((this.dispatchDate==null && other.getDispatchDate()==null) || 
             (this.dispatchDate!=null &&
              this.dispatchDate.equals(other.getDispatchDate()))) &&
            ((this.payment==null && other.getPayment()==null) || 
             (this.payment!=null &&
              this.payment.equals(other.getPayment()))) &&
            ((this.confirmationNumber==null && other.getConfirmationNumber()==null) || 
             (this.confirmationNumber!=null &&
              this.confirmationNumber.equals(other.getConfirmationNumber())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getWebAuthenticationDetail() != null) {
            _hashCode += getWebAuthenticationDetail().hashCode();
        }
        if (getClientDetail() != null) {
            _hashCode += getClientDetail().hashCode();
        }
        if (getUserDetail() != null) {
            _hashCode += getUserDetail().hashCode();
        }
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getDispatchLocationId() != null) {
            _hashCode += getDispatchLocationId().hashCode();
        }
        if (getDispatchDate() != null) {
            _hashCode += getDispatchDate().hashCode();
        }
        if (getPayment() != null) {
            _hashCode += getPayment().hashCode();
        }
        if (getConfirmationNumber() != null) {
            _hashCode += getConfirmationNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteTagRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DeleteTagRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webAuthenticationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "WebAuthenticationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "WebAuthenticationDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ClientDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ClientDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "UserDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "UserDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "TransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "TransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "VersionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dispatchLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DispatchLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dispatchDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "DispatchDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Payment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "Payment"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v26", "ConfirmationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
