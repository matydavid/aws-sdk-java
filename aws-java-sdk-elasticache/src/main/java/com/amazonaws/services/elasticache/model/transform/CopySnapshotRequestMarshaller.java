/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticache.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Copy Snapshot Request Marshaller
 */
public class CopySnapshotRequestMarshaller implements Marshaller<Request<CopySnapshotRequest>, CopySnapshotRequest> {

    public Request<CopySnapshotRequest> marshall(CopySnapshotRequest copySnapshotRequest) {

        if (copySnapshotRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CopySnapshotRequest> request = new DefaultRequest<CopySnapshotRequest>(copySnapshotRequest, "AmazonElastiCache");
        request.addParameter("Action", "CopySnapshot");
        request.addParameter("Version", "2014-09-30");

        if (copySnapshotRequest.getSourceSnapshotName() != null) {
            request.addParameter("SourceSnapshotName", StringUtils.fromString(copySnapshotRequest.getSourceSnapshotName()));
        }
        if (copySnapshotRequest.getTargetSnapshotName() != null) {
            request.addParameter("TargetSnapshotName", StringUtils.fromString(copySnapshotRequest.getTargetSnapshotName()));
        }

        return request;
    }
}
