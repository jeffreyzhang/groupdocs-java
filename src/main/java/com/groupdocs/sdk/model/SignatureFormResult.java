package com.groupdocs.sdk.model;

import com.groupdocs.sdk.model.SignatureFormInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureFormResult {
  private SignatureFormInfo form = null;
  public SignatureFormInfo getForm() {
    return form;
  }
  public void setForm(SignatureFormInfo form) {
    this.form = form;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureFormResult {\n");
    sb.append("  form: ").append(form).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
