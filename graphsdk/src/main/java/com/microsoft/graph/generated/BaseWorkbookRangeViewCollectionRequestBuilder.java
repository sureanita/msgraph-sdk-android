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
 * The class for the Base Workbook Range View Collection Request Builder.
 */
public class BaseWorkbookRangeViewCollectionRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookRangeViewCollectionRequestBuilder {

    /**
     * The request builder for this collection of WorkbookRangeView
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookRangeViewCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IWorkbookRangeViewCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IWorkbookRangeViewCollectionRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new WorkbookRangeViewCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWorkbookRangeViewRequestBuilder byId(final String id) {
        return new WorkbookRangeViewRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IWorkbookRangeViewItemAtRequestBuilder getItemAt(final Integer index) {
        return new WorkbookRangeViewItemAtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.itemAt"), getClient(), null, index);
    }
}
