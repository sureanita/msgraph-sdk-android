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
 * The class for the Base Workbook Chart Series Collection Request Builder.
 */
public class BaseWorkbookChartSeriesCollectionRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookChartSeriesCollectionRequestBuilder {

    /**
     * The request builder for this collection of WorkbookChart
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookChartSeriesCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IWorkbookChartSeriesCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IWorkbookChartSeriesCollectionRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new WorkbookChartSeriesCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWorkbookChartSeriesRequestBuilder byId(final String id) {
        return new WorkbookChartSeriesRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IWorkbookChartSeriesItemAtRequestBuilder getItemAt(final Integer index) {
        return new WorkbookChartSeriesItemAtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.itemAt"), getClient(), null, index);
    }

    public IWorkbookChartSeriesCountRequestBuilder getCount() {
        return new WorkbookChartSeriesCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.count"), getClient(), null);
    }
}
