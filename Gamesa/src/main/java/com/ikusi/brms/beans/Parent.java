package com.ikusi.brms.beans;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Parent implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "sysId")
   @XStreamAlias("sys_id")
   private java.lang.String sysId;

   public Parent()
   {
   }

   public java.lang.String getSysId()
   {
      return this.sysId;
   }

   public void setSysId(java.lang.String sysId)
   {
      this.sysId = sysId;
   }

   public Parent(java.lang.String sysId)
   {
      this.sysId = sysId;
   }

}