/**
 * BLZServiceSOAP12BindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.thomas_bayer.blz;

public class BLZServiceSOAP12BindingSkeleton implements com.thomas_bayer.blz.BLZServicePortType, org.apache.axis.wsdl.Skeleton {
    private com.thomas_bayer.blz.BLZServicePortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://thomas-bayer.com/blz/", "blz"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getBank", _params, new javax.xml.namespace.QName("http://thomas-bayer.com/blz/", "details"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://thomas-bayer.com/blz/", "detailsType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://thomas-bayer.com/blz/", "getBank"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getBank") == null) {
            _myOperations.put("getBank", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getBank")).add(_oper);
    }

    public BLZServiceSOAP12BindingSkeleton() {
        this.impl = new com.thomas_bayer.blz.BLZServiceSOAP12BindingImpl();
    }

    public BLZServiceSOAP12BindingSkeleton(com.thomas_bayer.blz.BLZServicePortType impl) {
        this.impl = impl;
    }
    public com.thomas_bayer.blz.DetailsType getBank(java.lang.String blz) throws java.rmi.RemoteException
    {
        com.thomas_bayer.blz.DetailsType ret = impl.getBank(blz);
        return ret;
    }

}
