// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Coup Num Request Builder.
 */
public class BaseWorkbookFunctionsCoupNumRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCoupNum
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsCoupNumRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement frequency, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("settlement", settlement);
        mBodyParams.put("maturity", maturity);
        mBodyParams.put("frequency", frequency);
        mBodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsCoupNumRequest
     *
     * @return The IWorkbookFunctionsCoupNumRequest instance
     */
    public IWorkbookFunctionsCoupNumRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsCoupNumRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsCoupNumRequest instance
     */
    public IWorkbookFunctionsCoupNumRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsCoupNumRequest request = new WorkbookFunctionsCoupNumRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("settlement")) {
            request.mBody.settlement = getParameter("settlement");
        }

        if (hasParameter("maturity")) {
            request.mBody.maturity = getParameter("maturity");
        }

        if (hasParameter("frequency")) {
            request.mBody.frequency = getParameter("frequency");
        }

        if (hasParameter("basis")) {
            request.mBody.basis = getParameter("basis");
        }

        return request;
    }
}
