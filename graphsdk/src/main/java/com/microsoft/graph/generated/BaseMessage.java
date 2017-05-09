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
 * The class for the Base Message.
 */
public class BaseMessage extends OutlookItem implements IJsonBackedObject {


    public BaseMessage() {
        oDataType = "microsoft.graph.message";
    }

    /**
     * The Received Date Time.
	 * 
     */
    @SerializedName("receivedDateTime")
    @Expose
    public java.util.Calendar receivedDateTime;

    /**
     * The Sent Date Time.
	 * 
     */
    @SerializedName("sentDateTime")
    @Expose
    public java.util.Calendar sentDateTime;

    /**
     * The Has Attachments.
	 * 
     */
    @SerializedName("hasAttachments")
    @Expose
    public Boolean hasAttachments;

    /**
     * The Internet Message Id.
	 * 
     */
    @SerializedName("internetMessageId")
    @Expose
    public String internetMessageId;

    /**
     * The Subject.
	 * 
     */
    @SerializedName("subject")
    @Expose
    public String subject;

    /**
     * The Body.
	 * 
     */
    @SerializedName("body")
    @Expose
    public ItemBody body;

    /**
     * The Body Preview.
	 * 
     */
    @SerializedName("bodyPreview")
    @Expose
    public String bodyPreview;

    /**
     * The Importance.
	 * 
     */
    @SerializedName("importance")
    @Expose
    public Importance importance;

    /**
     * The Parent Folder Id.
	 * 
     */
    @SerializedName("parentFolderId")
    @Expose
    public String parentFolderId;

    /**
     * The Sender.
	 * 
     */
    @SerializedName("sender")
    @Expose
    public Recipient sender;

    /**
     * The From.
	 * 
     */
    @SerializedName("from")
    @Expose
    public Recipient from;

    /**
     * The To Recipients.
	 * 
     */
    @SerializedName("toRecipients")
    @Expose
    public java.util.List<Recipient> toRecipients;

    /**
     * The Cc Recipients.
	 * 
     */
    @SerializedName("ccRecipients")
    @Expose
    public java.util.List<Recipient> ccRecipients;

    /**
     * The Bcc Recipients.
	 * 
     */
    @SerializedName("bccRecipients")
    @Expose
    public java.util.List<Recipient> bccRecipients;

    /**
     * The Reply To.
	 * 
     */
    @SerializedName("replyTo")
    @Expose
    public java.util.List<Recipient> replyTo;

    /**
     * The Conversation Id.
	 * 
     */
    @SerializedName("conversationId")
    @Expose
    public String conversationId;

    /**
     * The Unique Body.
	 * 
     */
    @SerializedName("uniqueBody")
    @Expose
    public ItemBody uniqueBody;

    /**
     * The Is Delivery Receipt Requested.
	 * 
     */
    @SerializedName("isDeliveryReceiptRequested")
    @Expose
    public Boolean isDeliveryReceiptRequested;

    /**
     * The Is Read Receipt Requested.
	 * 
     */
    @SerializedName("isReadReceiptRequested")
    @Expose
    public Boolean isReadReceiptRequested;

    /**
     * The Is Read.
	 * 
     */
    @SerializedName("isRead")
    @Expose
    public Boolean isRead;

    /**
     * The Is Draft.
	 * 
     */
    @SerializedName("isDraft")
    @Expose
    public Boolean isDraft;

    /**
     * The Web Link.
	 * 
     */
    @SerializedName("webLink")
    @Expose
    public String webLink;

    /**
     * The Inference Classification.
	 * 
     */
    @SerializedName("inferenceClassification")
    @Expose
    public InferenceClassificationType inferenceClassification;

    /**
     * The Attachments.
	 * 
     */
    public transient AttachmentCollectionPage attachments;

    /**
     * The Extensions.
	 * 
     */
    public transient ExtensionCollectionPage extensions;

    /**
     * The Single Value Extended Properties.
	 * 
     */
    public transient SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;

    /**
     * The Multi Value Extended Properties.
	 * 
     */
    public transient MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;


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


        if (json.has("attachments")) {
            final BaseAttachmentCollectionResponse response = new BaseAttachmentCollectionResponse();
            if (json.has("attachments@odata.nextLink")) {
                response.nextLink = json.get("attachments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("attachments").toString(), JsonObject[].class);
            final Attachment[] array = new Attachment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Attachment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            attachments = new AttachmentCollectionPage(response, null);
        }

        if (json.has("extensions")) {
            final BaseExtensionCollectionResponse response = new BaseExtensionCollectionResponse();
            if (json.has("extensions@odata.nextLink")) {
                response.nextLink = json.get("extensions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("extensions").toString(), JsonObject[].class);
            final Extension[] array = new Extension[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Extension.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            extensions = new ExtensionCollectionPage(response, null);
        }

        if (json.has("singleValueExtendedProperties")) {
            final BaseSingleValueLegacyExtendedPropertyCollectionResponse response = new BaseSingleValueLegacyExtendedPropertyCollectionResponse();
            if (json.has("singleValueExtendedProperties@odata.nextLink")) {
                response.nextLink = json.get("singleValueExtendedProperties@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("singleValueExtendedProperties").toString(), JsonObject[].class);
            final SingleValueLegacyExtendedProperty[] array = new SingleValueLegacyExtendedProperty[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SingleValueLegacyExtendedProperty.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            singleValueExtendedProperties = new SingleValueLegacyExtendedPropertyCollectionPage(response, null);
        }

        if (json.has("multiValueExtendedProperties")) {
            final BaseMultiValueLegacyExtendedPropertyCollectionResponse response = new BaseMultiValueLegacyExtendedPropertyCollectionResponse();
            if (json.has("multiValueExtendedProperties@odata.nextLink")) {
                response.nextLink = json.get("multiValueExtendedProperties@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("multiValueExtendedProperties").toString(), JsonObject[].class);
            final MultiValueLegacyExtendedProperty[] array = new MultiValueLegacyExtendedProperty[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MultiValueLegacyExtendedProperty.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            multiValueExtendedProperties = new MultiValueLegacyExtendedPropertyCollectionPage(response, null);
        }
    }
}
