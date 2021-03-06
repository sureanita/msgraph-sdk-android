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
 * The interface for the Base Section Group Request.
 */
public interface IBaseSectionGroupRequest extends IHttpRequest {

    /**
     * Gets the SectionGroup from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<SectionGroup> callback);

    /**
     * Gets the SectionGroup from the service
     * @return The SectionGroup from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    SectionGroup get() throws ClientException;

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
     * Patches this SectionGroup with a source
     * @param sourceSectionGroup The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final SectionGroup sourceSectionGroup, final ICallback<SectionGroup> callback);

    /**
     * Patches this SectionGroup with a source
     * @param sourceSectionGroup The source object with updates
     * @return The updated SectionGroup
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    SectionGroup patch(final SectionGroup sourceSectionGroup) throws ClientException;

    /**
     * Posts a SectionGroup with a new object
     * @param newSectionGroup The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final SectionGroup newSectionGroup, final ICallback<SectionGroup> callback);

    /**
     * Posts a SectionGroup with a new object
     * @param newSectionGroup The new object to create
     * @return The created SectionGroup
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    SectionGroup post(final SectionGroup newSectionGroup) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseSectionGroupRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseSectionGroupRequest expand(final String value);

}

