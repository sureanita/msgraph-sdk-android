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
 * The class for the Base Workbook Chart Fill Request.
 */
public class BaseWorkbookChartFillRequest extends BaseRequest implements IBaseWorkbookChartFillRequest {

    /**
     * The request for the WorkbookChartFill
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseWorkbookChartFillRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookChartFill from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookChartFill> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartFill from the service
     * @return The WorkbookChartFill from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChartFill get() throws ClientException {
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
     * Patches this WorkbookChartFill with a source
     * @param sourceWorkbookChartFill The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final WorkbookChartFill sourceWorkbookChartFill, final ICallback<WorkbookChartFill> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartFill);
    }

    /**
     * Patches this WorkbookChartFill with a source
     * @param sourceWorkbookChartFill The source object with updates
     * @return The updated WorkbookChartFill
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChartFill patch(final WorkbookChartFill sourceWorkbookChartFill) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartFill);
    }

    /**
     * Creates a WorkbookChartFill with a new object
     * @param newWorkbookChartFill The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final WorkbookChartFill newWorkbookChartFill, final ICallback<WorkbookChartFill> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartFill);
    }

    /**
     * Creates a WorkbookChartFill with a new object
     * @param newWorkbookChartFill The new object to create
     * @return The created WorkbookChartFill
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChartFill post(final WorkbookChartFill newWorkbookChartFill) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartFill);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IWorkbookChartFillRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookChartFillRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IWorkbookChartFillRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookChartFillRequest)this;
     }

}
