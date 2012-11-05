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
public class MergeTemplateResult {
  private Double datasource_id = null;
  private Double document_id = null;
  private Double job_id = null;
  public Double getDatasource_id() {
    return datasource_id;
  }
  public void setDatasource_id(Double datasource_id) {
    this.datasource_id = datasource_id;
  }

  public Double getDocument_id() {
    return document_id;
  }
  public void setDocument_id(Double document_id) {
    this.document_id = document_id;
  }

  public Double getJob_id() {
    return job_id;
  }
  public void setJob_id(Double job_id) {
    this.job_id = job_id;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeTemplateResult {\n");
    sb.append("  datasource_id: ").append(datasource_id).append("\n");
    sb.append("  document_id: ").append(document_id).append("\n");
    sb.append("  job_id: ").append(job_id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

