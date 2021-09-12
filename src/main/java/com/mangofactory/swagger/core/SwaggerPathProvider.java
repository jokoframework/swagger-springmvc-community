package com.mangofactory.swagger.core;

public interface SwaggerPathProvider {

   public String getApiResourcePrefix();

   public String getAppBasePath();

   public String getSwaggerDocumentationBasePath();

   public String getRequestMappingEndpoint(String requestMappingPattern);
}
