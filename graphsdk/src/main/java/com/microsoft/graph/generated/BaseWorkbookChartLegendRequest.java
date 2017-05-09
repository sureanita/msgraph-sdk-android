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
 * The class for the Base Workbook Chart Legend Request.
 */
public class BaseWorkbookChartLegendRequest extends BaseRequest implements IBaseWorkbookChartLegendRequest {

    /**
     * The request for the WorkbookChartLegend
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseWorkbookChartLegendRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookChartLegend from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookChartLegend> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartLegend from the service
     * @return The WorkbookChartLegend from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChartLegend get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this WorkbookChartLegend with a source
     * @param sourceWorkbookChartLegend The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final WorkbookChartLegend sourceWorkbookChartLegend, final ICallback<WorkbookChartLegend> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartLegend);
    }

    /**
     * Patches this WorkbookChartLegend with a source
     * @param sourceWorkbookChartLegend The source object with updates
     * @return The updated WorkbookChartLegend
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChartLegend patch(final WorkbookChartLegend sourceWorkbookChartLegend) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartLegend);
    }

    /**
     * Creates a WorkbookChartLegend with a new object
     * @param newWorkbookChartLegend The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final WorkbookChartLegend newWorkbookChartLegend, final ICallback<WorkbookChartLegend> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartLegend);
    }

    /**
     * Creates a WorkbookChartLegend with a new object
     * @param newWorkbookChartLegend The new object to create
     * @return The created WorkbookChartLegend
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChartLegend post(final WorkbookChartLegend newWorkbookChartLegend) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartLegend);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IWorkbookChartLegendRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookChartLegendRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IWorkbookChartLegendRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookChartLegendRequest)this;
     }

}
