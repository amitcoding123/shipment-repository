package com.fedex.ws.ship.v26;

public class ShipPortTypeProxy implements com.fedex.ws.ship.v26.ShipPortType {
  private String _endpoint = null;
  private com.fedex.ws.ship.v26.ShipPortType shipPortType = null;
  
  public ShipPortTypeProxy() {
    _initShipPortTypeProxy();
  }
  
  public ShipPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initShipPortTypeProxy();
  }
  
  private void _initShipPortTypeProxy() {
    try {
      shipPortType = (new com.fedex.ws.ship.v26.ShipServiceLocator()).getShipServicePort();
      if (shipPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)shipPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)shipPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (shipPortType != null)
      ((javax.xml.rpc.Stub)shipPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.fedex.ws.ship.v26.ShipPortType getShipPortType() {
    if (shipPortType == null)
      _initShipPortTypeProxy();
    return shipPortType;
  }
  
  public com.fedex.ws.ship.v26.ProcessTagReply processTag(com.fedex.ws.ship.v26.ProcessTagRequest processTagRequest) throws java.rmi.RemoteException{
    if (shipPortType == null)
      _initShipPortTypeProxy();
    return shipPortType.processTag(processTagRequest);
  }
  
  public com.fedex.ws.ship.v26.ProcessShipmentReply processShipment(com.fedex.ws.ship.v26.ProcessShipmentRequest processShipmentRequest) throws java.rmi.RemoteException{
    if (shipPortType == null)
      _initShipPortTypeProxy();
    return shipPortType.processShipment(processShipmentRequest);
  }
  
  public com.fedex.ws.ship.v26.ShipmentReply deleteTag(com.fedex.ws.ship.v26.DeleteTagRequest deleteTagRequest) throws java.rmi.RemoteException{
    if (shipPortType == null)
      _initShipPortTypeProxy();
    return shipPortType.deleteTag(deleteTagRequest);
  }
  
  public com.fedex.ws.ship.v26.ShipmentReply deleteShipment(com.fedex.ws.ship.v26.DeleteShipmentRequest deleteShipmentRequest) throws java.rmi.RemoteException{
    if (shipPortType == null)
      _initShipPortTypeProxy();
    return shipPortType.deleteShipment(deleteShipmentRequest);
  }
  
  public com.fedex.ws.ship.v26.ShipmentReply validateShipment(com.fedex.ws.ship.v26.ValidateShipmentRequest validateShipmentRequest) throws java.rmi.RemoteException{
    if (shipPortType == null)
      _initShipPortTypeProxy();
    return shipPortType.validateShipment(validateShipmentRequest);
  }
  
  
}