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
 * The interface for the Base Reference Attachment Request.
 */
public interface IBaseReferenceAttachmentRequest extends IHttpRequest {

    /**
     * Gets the ReferenceAttachment from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<ReferenceAttachment> callback);

    /**
     * Gets the ReferenceAttachment from the service
     * @return The ReferenceAttachment from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ReferenceAttachment get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ReferenceAttachment with a source
     * @param sourceReferenceAttachment The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final ReferenceAttachment sourceReferenceAttachment, final ICallback<ReferenceAttachment> callback);

    /**
     * Patches this ReferenceAttachment with a source
     * @param sourceReferenceAttachment The source object with updates
     * @return The updated ReferenceAttachment
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ReferenceAttachment patch(final ReferenceAttachment sourceReferenceAttachment) throws ClientException;

    /**
     * Posts a ReferenceAttachment with a new object
     * @param newReferenceAttachment The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final ReferenceAttachment newReferenceAttachment, final ICallback<ReferenceAttachment> callback);

    /**
     * Posts a ReferenceAttachment with a new object
     * @param newReferenceAttachment The new object to create
     * @return The created ReferenceAttachment
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ReferenceAttachment post(final ReferenceAttachment newReferenceAttachment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseReferenceAttachmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseReferenceAttachmentRequest expand(final String value);

}
