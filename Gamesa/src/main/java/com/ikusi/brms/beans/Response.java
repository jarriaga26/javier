package com.ikusi.brms.beans;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Response implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "resultado")
   private java.lang.String resultado;

   public Response()
   {
   }
 
   public java.lang.String getResultado()
   {
      return this.resultado;
   }

   public void setResultado(java.lang.String resultado)
   {
      this.resultado = resultado;
   }

   public Response(java.lang.String resultado)
   {
      this.resultado = resultado;
   }

}