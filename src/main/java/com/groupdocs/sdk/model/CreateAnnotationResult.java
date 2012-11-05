/**
 *  Copyright 2012 GroupDocs.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.groupdocs.sdk.model;

/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class CreateAnnotationResult {
  private Double id = null;
  private String sessionGuid = null;
  private String documentGuid = null;
  private String annotationGuid = null;
  private String access = null;
  private String replyGuid = null;
  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  public String getSessionGuid() {
    return sessionGuid;
  }
  public void setSessionGuid(String sessionGuid) {
    this.sessionGuid = sessionGuid;
  }

  public String getDocumentGuid() {
    return documentGuid;
  }
  public void setDocumentGuid(String documentGuid) {
    this.documentGuid = documentGuid;
  }

  public String getAnnotationGuid() {
    return annotationGuid;
  }
  public void setAnnotationGuid(String annotationGuid) {
    this.annotationGuid = annotationGuid;
  }

  public String getAccess() {
    return access;
  }
  public void setAccess(String access) {
    this.access = access;
  }

  public String getReplyGuid() {
    return replyGuid;
  }
  public void setReplyGuid(String replyGuid) {
    this.replyGuid = replyGuid;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAnnotationResult {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  sessionGuid: ").append(sessionGuid).append("\n");
    sb.append("  documentGuid: ").append(documentGuid).append("\n");
    sb.append("  annotationGuid: ").append(annotationGuid).append("\n");
    sb.append("  access: ").append(access).append("\n");
    sb.append("  replyGuid: ").append(replyGuid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

