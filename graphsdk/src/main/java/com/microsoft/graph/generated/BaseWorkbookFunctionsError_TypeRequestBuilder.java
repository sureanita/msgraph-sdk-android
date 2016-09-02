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
import java.util.List;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Error_Type Request Builder.
 */
public class BaseWorkbookFunctionsError_TypeRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsError_Type
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsError_TypeRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement errorVal) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("errorVal", errorVal);
    }

    /**
     * Creates the IWorkbookFunctionsError_TypeRequest
     *
     * @return The IWorkbookFunctionsError_TypeRequest instance
     */
    public IWorkbookFunctionsError_TypeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsError_TypeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsError_TypeRequest instance
     */
    public IWorkbookFunctionsError_TypeRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsError_TypeRequest request = new WorkbookFunctionsError_TypeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("errorVal")) {
            request.mBody.errorVal = getParameter("errorVal");
        }

        return request;
    }
}