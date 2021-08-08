/**
 * ShipPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.ship.v26;

public interface ShipPortType extends java.rmi.Remote {
    public com.fedex.ws.ship.v26.ProcessTagReply processTag(com.fedex.ws.ship.v26.ProcessTagRequest processTagRequest) throws java.rmi.RemoteException;
    public com.fedex.ws.ship.v26.ProcessShipmentReply processShipment(com.fedex.ws.ship.v26.ProcessShipmentRequest processShipmentRequest) throws java.rmi.RemoteException;
    public com.fedex.ws.ship.v26.ShipmentReply deleteTag(com.fedex.ws.ship.v26.DeleteTagRequest deleteTagRequest) throws java.rmi.RemoteException;
    public com.fedex.ws.ship.v26.ShipmentReply deleteShipment(com.fedex.ws.ship.v26.DeleteShipmentRequest deleteShipmentRequest) throws java.rmi.RemoteException;
    public com.fedex.ws.ship.v26.ShipmentReply validateShipment(com.fedex.ws.ship.v26.ValidateShipmentRequest validateShipmentRequest) throws java.rmi.RemoteException;
}
