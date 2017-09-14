/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateConstraint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConstraintRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The portfolio identifier.
     * </p>
     */
    private String portfolioId;
    /**
     * <p>
     * The product identifier.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The constraint parameters. Expected values vary depending on which <b>Type</b> is specified. For more
     * information, see the Examples section.
     * </p>
     * <p>
     * For Type <code>LAUNCH</code>, the <code>RoleArn</code> property is required.
     * </p>
     * <p>
     * For Type <code>NOTIFICATION</code>, the <code>NotificationArns</code> property is required.
     * </p>
     * <p>
     * For Type <code>TEMPLATE</code>, the <code>Rules</code> property is required.
     * </p>
     */
    private String parameters;
    /**
     * <p>
     * The type of the constraint. Case-sensitive valid values are: <code>LAUNCH</code>, <code>NOTIFICATION</code>, or
     * <code>TEMPLATE</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The text description of the constraint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A token to disambiguate duplicate requests. You can use the same input in multiple requests, provided that you
     * also specify a different idempotency token for each request.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConstraintRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @param portfolioId
     *        The portfolio identifier.
     */

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @return The portfolio identifier.
     */

    public String getPortfolioId() {
        return this.portfolioId;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @param portfolioId
     *        The portfolio identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConstraintRequest withPortfolioId(String portfolioId) {
        setPortfolioId(portfolioId);
        return this;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @return The product identifier.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConstraintRequest withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The constraint parameters. Expected values vary depending on which <b>Type</b> is specified. For more
     * information, see the Examples section.
     * </p>
     * <p>
     * For Type <code>LAUNCH</code>, the <code>RoleArn</code> property is required.
     * </p>
     * <p>
     * For Type <code>NOTIFICATION</code>, the <code>NotificationArns</code> property is required.
     * </p>
     * <p>
     * For Type <code>TEMPLATE</code>, the <code>Rules</code> property is required.
     * </p>
     * 
     * @param parameters
     *        The constraint parameters. Expected values vary depending on which <b>Type</b> is specified. For more
     *        information, see the Examples section.</p>
     *        <p>
     *        For Type <code>LAUNCH</code>, the <code>RoleArn</code> property is required.
     *        </p>
     *        <p>
     *        For Type <code>NOTIFICATION</code>, the <code>NotificationArns</code> property is required.
     *        </p>
     *        <p>
     *        For Type <code>TEMPLATE</code>, the <code>Rules</code> property is required.
     */

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The constraint parameters. Expected values vary depending on which <b>Type</b> is specified. For more
     * information, see the Examples section.
     * </p>
     * <p>
     * For Type <code>LAUNCH</code>, the <code>RoleArn</code> property is required.
     * </p>
     * <p>
     * For Type <code>NOTIFICATION</code>, the <code>NotificationArns</code> property is required.
     * </p>
     * <p>
     * For Type <code>TEMPLATE</code>, the <code>Rules</code> property is required.
     * </p>
     * 
     * @return The constraint parameters. Expected values vary depending on which <b>Type</b> is specified. For more
     *         information, see the Examples section.</p>
     *         <p>
     *         For Type <code>LAUNCH</code>, the <code>RoleArn</code> property is required.
     *         </p>
     *         <p>
     *         For Type <code>NOTIFICATION</code>, the <code>NotificationArns</code> property is required.
     *         </p>
     *         <p>
     *         For Type <code>TEMPLATE</code>, the <code>Rules</code> property is required.
     */

    public String getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * The constraint parameters. Expected values vary depending on which <b>Type</b> is specified. For more
     * information, see the Examples section.
     * </p>
     * <p>
     * For Type <code>LAUNCH</code>, the <code>RoleArn</code> property is required.
     * </p>
     * <p>
     * For Type <code>NOTIFICATION</code>, the <code>NotificationArns</code> property is required.
     * </p>
     * <p>
     * For Type <code>TEMPLATE</code>, the <code>Rules</code> property is required.
     * </p>
     * 
     * @param parameters
     *        The constraint parameters. Expected values vary depending on which <b>Type</b> is specified. For more
     *        information, see the Examples section.</p>
     *        <p>
     *        For Type <code>LAUNCH</code>, the <code>RoleArn</code> property is required.
     *        </p>
     *        <p>
     *        For Type <code>NOTIFICATION</code>, the <code>NotificationArns</code> property is required.
     *        </p>
     *        <p>
     *        For Type <code>TEMPLATE</code>, the <code>Rules</code> property is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConstraintRequest withParameters(String parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The type of the constraint. Case-sensitive valid values are: <code>LAUNCH</code>, <code>NOTIFICATION</code>, or
     * <code>TEMPLATE</code>.
     * </p>
     * 
     * @param type
     *        The type of the constraint. Case-sensitive valid values are: <code>LAUNCH</code>,
     *        <code>NOTIFICATION</code>, or <code>TEMPLATE</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the constraint. Case-sensitive valid values are: <code>LAUNCH</code>, <code>NOTIFICATION</code>, or
     * <code>TEMPLATE</code>.
     * </p>
     * 
     * @return The type of the constraint. Case-sensitive valid values are: <code>LAUNCH</code>,
     *         <code>NOTIFICATION</code>, or <code>TEMPLATE</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the constraint. Case-sensitive valid values are: <code>LAUNCH</code>, <code>NOTIFICATION</code>, or
     * <code>TEMPLATE</code>.
     * </p>
     * 
     * @param type
     *        The type of the constraint. Case-sensitive valid values are: <code>LAUNCH</code>,
     *        <code>NOTIFICATION</code>, or <code>TEMPLATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConstraintRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The text description of the constraint.
     * </p>
     * 
     * @param description
     *        The text description of the constraint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The text description of the constraint.
     * </p>
     * 
     * @return The text description of the constraint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The text description of the constraint.
     * </p>
     * 
     * @param description
     *        The text description of the constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConstraintRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A token to disambiguate duplicate requests. You can use the same input in multiple requests, provided that you
     * also specify a different idempotency token for each request.
     * </p>
     * 
     * @param idempotencyToken
     *        A token to disambiguate duplicate requests. You can use the same input in multiple requests, provided that
     *        you also specify a different idempotency token for each request.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A token to disambiguate duplicate requests. You can use the same input in multiple requests, provided that you
     * also specify a different idempotency token for each request.
     * </p>
     * 
     * @return A token to disambiguate duplicate requests. You can use the same input in multiple requests, provided
     *         that you also specify a different idempotency token for each request.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A token to disambiguate duplicate requests. You can use the same input in multiple requests, provided that you
     * also specify a different idempotency token for each request.
     * </p>
     * 
     * @param idempotencyToken
     *        A token to disambiguate duplicate requests. You can use the same input in multiple requests, provided that
     *        you also specify a different idempotency token for each request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConstraintRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage()).append(",");
        if (getPortfolioId() != null)
            sb.append("PortfolioId: ").append(getPortfolioId()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConstraintRequest == false)
            return false;
        CreateConstraintRequest other = (CreateConstraintRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getPortfolioId() == null ^ this.getPortfolioId() == null)
            return false;
        if (other.getPortfolioId() != null && other.getPortfolioId().equals(this.getPortfolioId()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getPortfolioId() == null) ? 0 : getPortfolioId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateConstraintRequest clone() {
        return (CreateConstraintRequest) super.clone();
    }

}
