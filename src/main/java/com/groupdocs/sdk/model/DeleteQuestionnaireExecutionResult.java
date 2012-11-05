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
public class DeleteQuestionnaireExecutionResult {
  private Double collector_id = null;
  private Double execution_id = null;
  public Double getCollector_id() {
    return collector_id;
  }
  public void setCollector_id(Double collector_id) {
    this.collector_id = collector_id;
  }

  public Double getExecution_id() {
    return execution_id;
  }
  public void setExecution_id(Double execution_id) {
    this.execution_id = execution_id;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteQuestionnaireExecutionResult {\n");
    sb.append("  collector_id: ").append(collector_id).append("\n");
    sb.append("  execution_id: ").append(execution_id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

