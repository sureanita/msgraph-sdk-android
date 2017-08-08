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
 * The class for the Base Contact Folder Collection Request Builder.
 */
public class BaseContactFolderCollectionRequestBuilder extends BaseRequestBuilder implements IBaseContactFolderCollectionRequestBuilder {

    /**
     * The request builder for this collection of ContactFolder
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseContactFolderCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IContactFolderCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IContactFolderCollectionRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new ContactFolderCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IContactFolderRequestBuilder byId(final String id) {
        return new ContactFolderRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IContactFolderDeltaCollectionRequestBuilder getDelta() {
        return new ContactFolderDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
    }

	public IContactFolderDeltaCollectionRequestBuilder getDelta(final String deltaLink) {
        return new ContactFolderDeltaCollectionRequestBuilder(deltaLink, getClient(), null);
    }
}
