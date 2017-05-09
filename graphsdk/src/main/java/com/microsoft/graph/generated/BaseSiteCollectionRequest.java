// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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
 * The class for the Base Site Collection Request.
 */
public class BaseSiteCollectionRequest extends BaseCollectionRequest<BaseSiteCollectionResponse, ISiteCollectionPage> implements IBaseSiteCollectionRequest {

    /**
     * The request builder for this collection of Site
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseSiteCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseSiteCollectionResponse.class, ISiteCollectionPage.class);
    }

    public void get(final ICallback<ISiteCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ISiteCollectionPage get() throws ClientException {
        final BaseSiteCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Site newSite, final ICallback<Site> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SiteRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newSite, callback);
    }

    public Site post(final Site newSite) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SiteRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newSite);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public ISiteCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (SiteCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public ISiteCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (SiteCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public ISiteCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (SiteCollectionRequest)this;
    }

    public ISiteCollectionPage buildFromResponse(final BaseSiteCollectionResponse response) {
        final ISiteCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SiteCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final SiteCollectionPage page = new SiteCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
