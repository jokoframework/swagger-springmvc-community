package com.mangofactory.swagger.core;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;

public interface ResourceGroupingStrategy {

   public String getResourceGroupPath(RequestMappingInfo requestMappingInfo, HandlerMethod handlerMethod);


   public String getResourceDescription(RequestMappingInfo requestMappingInfo, HandlerMethod handlerMethod);
}
