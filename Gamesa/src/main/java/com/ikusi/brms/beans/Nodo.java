package com.ikusi.brms.beans;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Nodo implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String sys_id;
   private java.lang.String eventName;
   private com.ikusi.brms.beans.Request request;

   public Nodo()
   {
   }

   public java.lang.String getSys_id()
   {
      return this.sys_id;
   }

   public void setSys_id(java.lang.String sys_id)
   {
      this.sys_id = sys_id;
   }

   public java.lang.String getEventName()
   {
      return this.eventName;
   }

   public void setEventName(java.lang.String eventName)
   {
      this.eventName = eventName;
   }

   public com.ikusi.brms.beans.Request getRequest()
   {
      return this.request;
   }

   public void setRequest(com.ikusi.brms.beans.Request request)
   {
      this.request = request;
   }

   public Nodo(java.lang.String sys_id, java.lang.String eventName,
         com.ikusi.brms.beans.Request request)
   {
      this.sys_id = sys_id;
      this.eventName = eventName;
      this.request = request;
   }

}