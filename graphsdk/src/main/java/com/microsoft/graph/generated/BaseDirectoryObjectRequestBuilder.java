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
 * The class for the Base Directory Object Request Builder.
 */
public class BaseDirectoryObjectRequestBuilder extends BaseRequestBuilder implements IBaseDirectoryObjectRequestBuilder {

    /**
     * The request builder for the DirectoryObject
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseDirectoryObjectRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IDirectoryObjectRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IDirectoryObjectRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new DirectoryObjectRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDeviceRequestBuilder device() {
        return new DeviceRequestBuilder(getRequestUrlWithAdditionalSegment("device"), getClient(), null);
    }

    public IDirectoryRoleRequestBuilder directoryRole() {
        return new DirectoryRoleRequestBuilder(getRequestUrlWithAdditionalSegment("directoryRole"), getClient(), null);
    }

    public IDirectoryRoleTemplateRequestBuilder directoryRoleTemplate() {
        return new DirectoryRoleTemplateRequestBuilder(getRequestUrlWithAdditionalSegment("directoryRoleTemplate"), getClient(), null);
    }

    public IGroupRequestBuilder group() {
        return new GroupRequestBuilder(getRequestUrlWithAdditionalSegment("group"), getClient(), null);
    }

    public IContractRequestBuilder contract() {
        return new ContractRequestBuilder(getRequestUrlWithAdditionalSegment("contract"), getClient(), null);
    }

    public IOrganizationRequestBuilder organization() {
        return new OrganizationRequestBuilder(getRequestUrlWithAdditionalSegment("organization"), getClient(), null);
    }

    public IUserRequestBuilder user() {
        return new UserRequestBuilder(getRequestUrlWithAdditionalSegment("user"), getClient(), null);
    }

    public IGroupSettingTemplateRequestBuilder groupSettingTemplate() {
        return new GroupSettingTemplateRequestBuilder(getRequestUrlWithAdditionalSegment("groupSettingTemplate"), getClient(), null);
    }

    public IDirectoryObjectCheckMemberGroupsCollectionRequestBuilder getCheckMemberGroups(final java.util.List<String> groupIds) {
        return new DirectoryObjectCheckMemberGroupsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkMemberGroups"), getClient(), null, groupIds);
    }

    public IDirectoryObjectGetMemberGroupsCollectionRequestBuilder getGetMemberGroups(final Boolean securityEnabledOnly) {
        return new DirectoryObjectGetMemberGroupsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMemberGroups"), getClient(), null, securityEnabledOnly);
    }

    public IDirectoryObjectGetMemberObjectsCollectionRequestBuilder getGetMemberObjects(final Boolean securityEnabledOnly) {
        return new DirectoryObjectGetMemberObjectsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMemberObjects"), getClient(), null, securityEnabledOnly);
    }
}
