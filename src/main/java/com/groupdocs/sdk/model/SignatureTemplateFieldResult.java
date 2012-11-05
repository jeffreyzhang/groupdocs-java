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

import com.groupdocs.sdk.model.SignatureTemplateFieldInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureTemplateFieldResult {
  private SignatureTemplateFieldInfo field = null;
  private String templateId = null;
  private String recipientId = null;
  private String documentId = null;
  public SignatureTemplateFieldInfo getField() {
    return field;
  }
  public void setField(SignatureTemplateFieldInfo field) {
    this.field = field;
  }

  public String getTemplateId() {
    return templateId;
  }
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public String getRecipientId() {
    return recipientId;
  }
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
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
    sb.append("class SignatureTemplateFieldResult {\n");
    sb.append("  field: ").append(field).append("\n");
    sb.append("  templateId: ").append(templateId).append("\n");
    sb.append("  recipientId: ").append(recipientId).append("\n");
    sb.append("  documentId: ").append(documentId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

