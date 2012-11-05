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
public class SignatureEnvelopeAuditLogInfo {
  private String id = null;
  private String remoteAddress = null;
  private String action = null;
  private String userName = null;
  private String date = null;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getRemoteAddress() {
    return remoteAddress;
  }
  public void setRemoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
  }

  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureEnvelopeAuditLogInfo {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  remoteAddress: ").append(remoteAddress).append("\n");
    sb.append("  action: ").append(action).append("\n");
    sb.append("  userName: ").append(userName).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

