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
 * The class for the Base Workbook Format Protection Request.
 */
public class BaseWorkbookFormatProtectionRequest extends BaseRequest implements IBaseWorkbookFormatProtectionRequest {

    /**
     * The request for the WorkbookFormatProtection
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseWorkbookFormatProtectionRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookFormatProtection from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookFormatProtection> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookFormatProtection from the service
     * @return The WorkbookFormatProtection from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookFormatProtection get() throws ClientException {
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
     * Patches this WorkbookFormatProtection with a source
     * @param sourceWorkbookFormatProtection The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final WorkbookFormatProtection sourceWorkbookFormatProtection, final ICallback<WorkbookFormatProtection> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookFormatProtection);
    }

    /**
     * Patches this WorkbookFormatProtection with a source
     * @param sourceWorkbookFormatProtection The source object with updates
     * @return The updated WorkbookFormatProtection
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookFormatProtection patch(final WorkbookFormatProtection sourceWorkbookFormatProtection) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookFormatProtection);
    }

    /**
     * Creates a WorkbookFormatProtection with a new object
     * @param newWorkbookFormatProtection The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final WorkbookFormatProtection newWorkbookFormatProtection, final ICallback<WorkbookFormatProtection> callback) {
        send(HttpMethod.POST, callback, newWorkbookFormatProtection);
    }

    /**
     * Creates a WorkbookFormatProtection with a new object
     * @param newWorkbookFormatProtection The new object to create
     * @return The created WorkbookFormatProtection
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookFormatProtection post(final WorkbookFormatProtection newWorkbookFormatProtection) throws ClientException {
        return send(HttpMethod.POST, newWorkbookFormatProtection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IWorkbookFormatProtectionRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookFormatProtectionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IWorkbookFormatProtectionRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookFormatProtectionRequest)this;
     }

}
