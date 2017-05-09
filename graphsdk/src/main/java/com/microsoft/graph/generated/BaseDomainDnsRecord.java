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

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Domain Dns Record.
 */
public class BaseDomainDnsRecord extends Entity implements IJsonBackedObject {


    public BaseDomainDnsRecord() {
        oDataType = "microsoft.graph.domainDnsRecord";
    }

    /**
     * The Is Optional.
	 * 
     */
    @SerializedName("isOptional")
    @Expose
    public Boolean isOptional;

    /**
     * The Label.
	 * 
     */
    @SerializedName("label")
    @Expose
    public String label;

    /**
     * The Record Type.
	 * 
     */
    @SerializedName("recordType")
    @Expose
    public String recordType;

    /**
     * The Supported Service.
	 * 
     */
    @SerializedName("supportedService")
    @Expose
    public String supportedService;

    /**
     * The Ttl.
	 * 
     */
    @SerializedName("ttl")
    @Expose
    public Integer ttl;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;

    }
}
