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
public class SignatureEnvelopeDocumentInfo {
  private Integer fieldsCount = null;
  private String finalDocumentMD5 = null;
  private Integer order = null;
  private String name = null;
  private String envelopeId = null;
  private Integer originalDocumentPagesCount = null;
  private String originalDocumentMD5 = null;
  private String documentId = null;
  public Integer getFieldsCount() {
    return fieldsCount;
  }
  public void setFieldsCount(Integer fieldsCount) {
    this.fieldsCount = fieldsCount;
  }

  public String getFinalDocumentMD5() {
    return finalDocumentMD5;
  }
  public void setFinalDocumentMD5(String finalDocumentMD5) {
    this.finalDocumentMD5 = finalDocumentMD5;
  }

  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getEnvelopeId() {
    return envelopeId;
  }
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public Integer getOriginalDocumentPagesCount() {
    return originalDocumentPagesCount;
  }
  public void setOriginalDocumentPagesCount(Integer originalDocumentPagesCount) {
    this.originalDocumentPagesCount = originalDocumentPagesCount;
  }

  public String getOriginalDocumentMD5() {
    return originalDocumentMD5;
  }
  public void setOriginalDocumentMD5(String originalDocumentMD5) {
    this.originalDocumentMD5 = originalDocumentMD5;
  }

  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureEnvelopeDocumentInfo {\n");
    sb.append("  fieldsCount: ").append(fieldsCount).append("\n");
    sb.append("  finalDocumentMD5: ").append(finalDocumentMD5).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  envelopeId: ").append(envelopeId).append("\n");
    sb.append("  originalDocumentPagesCount: ").append(originalDocumentPagesCount).append("\n");
    sb.append("  originalDocumentMD5: ").append(originalDocumentMD5).append("\n");
    sb.append("  documentId: ").append(documentId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

