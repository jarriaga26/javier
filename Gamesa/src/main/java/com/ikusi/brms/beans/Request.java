package com.ikusi.brms.beans;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class was automatically generated by the data modeler tool.
 */
@XmlRootElement(name = "request")
public class Request implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "event")
   @XStreamAlias("event")
   private com.ikusi.brms.beans.Event event;
   @org.kie.api.definition.type.Label(value = "device")
   @XStreamAlias("device")
   private com.ikusi.brms.beans.Device device;
   @org.kie.api.definition.type.Label(value = "metrics")
   @XStreamAlias("metrics")
   @XStreamImplicit("metric")
   private java.util.List<com.ikusi.brms.beans.Metric> metrics;
   @org.kie.api.definition.type.Label(value = "parents")
   @XStreamAlias("parents")
   @XStreamImplicit("parent")
   private java.util.List<com.ikusi.brms.beans.Parent> parents;

   public Request()
   {
   }

   public com.ikusi.brms.beans.Event getEvent()
   {
      return this.event;
   }

   public void setEvent(com.ikusi.brms.beans.Event event)
   {
      this.event = event;
   }

   public com.ikusi.brms.beans.Device getDevice()
   {
      return this.device;
   }

   public void setDevice(com.ikusi.brms.beans.Device device)
   {
      this.device = device;
   }

   public java.util.List<com.ikusi.brms.beans.Metric> getMetrics()
   {
      return this.metrics;
   }

   public void setMetrics(java.util.List<com.ikusi.brms.beans.Metric> metrics)
   {
      this.metrics = metrics;
   }

   public java.util.List<com.ikusi.brms.beans.Parent> getParents()
   {
      return this.parents;
   }

   public void setParents(java.util.List<com.ikusi.brms.beans.Parent> parents)
   {
      this.parents = parents;
   }

   public Request(com.ikusi.brms.beans.Event event,
         com.ikusi.brms.beans.Device device,
         java.util.List<com.ikusi.brms.beans.Metric> metrics,
         java.util.List<com.ikusi.brms.beans.Parent> parents)
   {
      this.event = event;
      this.device = device;
      this.metrics = metrics;
      this.parents = parents;
   }

}