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

import com.groupdocs.sdk.model.SubscriptionPlanUsageInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class GetSubscriptionPlanUsageResult {
  private SubscriptionPlanUsageInfo subscription_plan = null;
  private SubscriptionPlanUsageInfo usage = null;
  private String last_reset_date = null;
  public SubscriptionPlanUsageInfo getSubscription_plan() {
    return subscription_plan;
  }
  public void setSubscription_plan(SubscriptionPlanUsageInfo subscription_plan) {
    this.subscription_plan = subscription_plan;
  }

  public SubscriptionPlanUsageInfo getUsage() {
    return usage;
  }
  public void setUsage(SubscriptionPlanUsageInfo usage) {
    this.usage = usage;
  }

  public String getLast_reset_date() {
    return last_reset_date;
  }
  public void setLast_reset_date(String last_reset_date) {
    this.last_reset_date = last_reset_date;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSubscriptionPlanUsageResult {\n");
    sb.append("  subscription_plan: ").append(subscription_plan).append("\n");
    sb.append("  usage: ").append(usage).append("\n");
    sb.append("  last_reset_date: ").append(last_reset_date).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

