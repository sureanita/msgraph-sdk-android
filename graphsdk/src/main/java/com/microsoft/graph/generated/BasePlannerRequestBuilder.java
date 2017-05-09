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
 * The class for the Base Planner Request Builder.
 */
public class BasePlannerRequestBuilder extends BaseRequestBuilder implements IBasePlannerRequestBuilder {

    /**
     * The request builder for the Planner
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BasePlannerRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IPlannerRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IPlannerRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new PlannerRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPlannerTaskCollectionRequestBuilder getTasks() {
        return new PlannerTaskCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tasks"), getClient(), null);
    }

    public IPlannerTaskRequestBuilder getTasks(final String id) {
        return new PlannerTaskRequestBuilder(getRequestUrlWithAdditionalSegment("tasks") + "/" + id, getClient(), null);
    }
    public IPlannerPlanCollectionRequestBuilder getPlans() {
        return new PlannerPlanCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("plans"), getClient(), null);
    }

    public IPlannerPlanRequestBuilder getPlans(final String id) {
        return new PlannerPlanRequestBuilder(getRequestUrlWithAdditionalSegment("plans") + "/" + id, getClient(), null);
    }
    public IPlannerBucketCollectionRequestBuilder getBuckets() {
        return new PlannerBucketCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("buckets"), getClient(), null);
    }

    public IPlannerBucketRequestBuilder getBuckets(final String id) {
        return new PlannerBucketRequestBuilder(getRequestUrlWithAdditionalSegment("buckets") + "/" + id, getClient(), null);
    }
}
