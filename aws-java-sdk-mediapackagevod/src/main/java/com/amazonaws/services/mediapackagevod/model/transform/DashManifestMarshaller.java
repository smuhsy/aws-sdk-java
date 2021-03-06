/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediapackagevod.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediapackagevod.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DashManifestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DashManifestMarshaller {

    private static final MarshallingInfo<String> MANIFESTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manifestName").build();
    private static final MarshallingInfo<Integer> MINBUFFERTIMESECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minBufferTimeSeconds").build();
    private static final MarshallingInfo<String> PROFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("profile").build();
    private static final MarshallingInfo<StructuredPojo> STREAMSELECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("streamSelection").build();

    private static final DashManifestMarshaller instance = new DashManifestMarshaller();

    public static DashManifestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DashManifest dashManifest, ProtocolMarshaller protocolMarshaller) {

        if (dashManifest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dashManifest.getManifestName(), MANIFESTNAME_BINDING);
            protocolMarshaller.marshall(dashManifest.getMinBufferTimeSeconds(), MINBUFFERTIMESECONDS_BINDING);
            protocolMarshaller.marshall(dashManifest.getProfile(), PROFILE_BINDING);
            protocolMarshaller.marshall(dashManifest.getStreamSelection(), STREAMSELECTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
