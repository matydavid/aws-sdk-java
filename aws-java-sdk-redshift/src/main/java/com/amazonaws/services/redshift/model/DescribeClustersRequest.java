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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#describeClusters(DescribeClustersRequest) DescribeClusters operation}.
 * <p>
 * Returns properties of provisioned clusters including general cluster
 * properties, cluster database properties, maintenance and backup
 * properties, and security and access properties. This operation
 * supports pagination. For more information about managing clusters, go
 * to
 * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"> Amazon Redshift Clusters </a>
 * in the <i>Amazon Redshift Cluster Management Guide</i> .
 * </p>
 * <p>
 * If you specify both tag keys and tag values in the same request,
 * Amazon Redshift returns all clusters that match any combination of the
 * specified keys and values. For example, if you have <code>owner</code>
 * and <code>environment</code> for tag keys, and <code>admin</code> and
 * <code>test</code> for tag values, all clusters that have any
 * combination of those values are returned.
 * </p>
 * <p>
 * If both tag keys and values are omitted from the request, clusters are
 * returned regardless of whether they have tag keys or values associated
 * with them.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#describeClusters(DescribeClustersRequest)
 */
public class DescribeClustersRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The unique identifier of a cluster whose properties you are
     * requesting. This parameter is case sensitive. <p>The default is that
     * all clusters defined for an account are returned.
     */
    private String clusterIdentifier;

    /**
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next
     * set of records by retrying the command with the returned marker value.
     * <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     */
    private Integer maxRecords;

    /**
     * An optional parameter that specifies the starting point to return a
     * set of response records. When the results of a <a>DescribeClusters</a>
     * request exceed the value specified in <code>MaxRecords</code>, AWS
     * returns a value in the <code>Marker</code> field of the response. You
     * can retrieve the next set of response records by providing the
     * returned marker value in the <code>Marker</code> parameter and
     * retrying the request. <p> Constraints: You can specify either the
     * <b>ClusterIdentifier</b> parameter or the <b>Marker</b> parameter, but
     * not both.
     */
    private String marker;

    /**
     * A tag key or keys for which you want to return all matching clusters
     * that are associated with the specified key or keys. For example,
     * suppose that you have clusters that are tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both
     * of these tag keys in the request, Amazon Redshift returns a response
     * with the clusters that have either or both of these tag keys
     * associated with them.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tagKeys;

    /**
     * A tag value or values for which you want to return all matching
     * clusters that are associated with the specified tag value or values.
     * For example, suppose that you have clusters that are tagged with
     * values called <code>admin</code> and <code>test</code>. If you specify
     * both of these tag values in the request, Amazon Redshift returns a
     * response with the clusters that have either or both of these tag
     * values associated with them.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tagValues;

    /**
     * The unique identifier of a cluster whose properties you are
     * requesting. This parameter is case sensitive. <p>The default is that
     * all clusters defined for an account are returned.
     *
     * @return The unique identifier of a cluster whose properties you are
     *         requesting. This parameter is case sensitive. <p>The default is that
     *         all clusters defined for an account are returned.
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }
    
    /**
     * The unique identifier of a cluster whose properties you are
     * requesting. This parameter is case sensitive. <p>The default is that
     * all clusters defined for an account are returned.
     *
     * @param clusterIdentifier The unique identifier of a cluster whose properties you are
     *         requesting. This parameter is case sensitive. <p>The default is that
     *         all clusters defined for an account are returned.
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }
    
    /**
     * The unique identifier of a cluster whose properties you are
     * requesting. This parameter is case sensitive. <p>The default is that
     * all clusters defined for an account are returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterIdentifier The unique identifier of a cluster whose properties you are
     *         requesting. This parameter is case sensitive. <p>The default is that
     *         all clusters defined for an account are returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClustersRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next
     * set of records by retrying the command with the returned marker value.
     * <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     *
     * @return The maximum number of response records to return in each call. If the
     *         number of remaining response records exceeds the specified
     *         <code>MaxRecords</code> value, a value is returned in a
     *         <code>marker</code> field of the response. You can retrieve the next
     *         set of records by retrying the command with the returned marker value.
     *         <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next
     * set of records by retrying the command with the returned marker value.
     * <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     *
     * @param maxRecords The maximum number of response records to return in each call. If the
     *         number of remaining response records exceeds the specified
     *         <code>MaxRecords</code> value, a value is returned in a
     *         <code>marker</code> field of the response. You can retrieve the next
     *         set of records by retrying the command with the returned marker value.
     *         <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next
     * set of records by retrying the command with the returned marker value.
     * <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of response records to return in each call. If the
     *         number of remaining response records exceeds the specified
     *         <code>MaxRecords</code> value, a value is returned in a
     *         <code>marker</code> field of the response. You can retrieve the next
     *         set of records by retrying the command with the returned marker value.
     *         <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClustersRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional parameter that specifies the starting point to return a
     * set of response records. When the results of a <a>DescribeClusters</a>
     * request exceed the value specified in <code>MaxRecords</code>, AWS
     * returns a value in the <code>Marker</code> field of the response. You
     * can retrieve the next set of response records by providing the
     * returned marker value in the <code>Marker</code> parameter and
     * retrying the request. <p> Constraints: You can specify either the
     * <b>ClusterIdentifier</b> parameter or the <b>Marker</b> parameter, but
     * not both.
     *
     * @return An optional parameter that specifies the starting point to return a
     *         set of response records. When the results of a <a>DescribeClusters</a>
     *         request exceed the value specified in <code>MaxRecords</code>, AWS
     *         returns a value in the <code>Marker</code> field of the response. You
     *         can retrieve the next set of response records by providing the
     *         returned marker value in the <code>Marker</code> parameter and
     *         retrying the request. <p> Constraints: You can specify either the
     *         <b>ClusterIdentifier</b> parameter or the <b>Marker</b> parameter, but
     *         not both.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional parameter that specifies the starting point to return a
     * set of response records. When the results of a <a>DescribeClusters</a>
     * request exceed the value specified in <code>MaxRecords</code>, AWS
     * returns a value in the <code>Marker</code> field of the response. You
     * can retrieve the next set of response records by providing the
     * returned marker value in the <code>Marker</code> parameter and
     * retrying the request. <p> Constraints: You can specify either the
     * <b>ClusterIdentifier</b> parameter or the <b>Marker</b> parameter, but
     * not both.
     *
     * @param marker An optional parameter that specifies the starting point to return a
     *         set of response records. When the results of a <a>DescribeClusters</a>
     *         request exceed the value specified in <code>MaxRecords</code>, AWS
     *         returns a value in the <code>Marker</code> field of the response. You
     *         can retrieve the next set of response records by providing the
     *         returned marker value in the <code>Marker</code> parameter and
     *         retrying the request. <p> Constraints: You can specify either the
     *         <b>ClusterIdentifier</b> parameter or the <b>Marker</b> parameter, but
     *         not both.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional parameter that specifies the starting point to return a
     * set of response records. When the results of a <a>DescribeClusters</a>
     * request exceed the value specified in <code>MaxRecords</code>, AWS
     * returns a value in the <code>Marker</code> field of the response. You
     * can retrieve the next set of response records by providing the
     * returned marker value in the <code>Marker</code> parameter and
     * retrying the request. <p> Constraints: You can specify either the
     * <b>ClusterIdentifier</b> parameter or the <b>Marker</b> parameter, but
     * not both.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional parameter that specifies the starting point to return a
     *         set of response records. When the results of a <a>DescribeClusters</a>
     *         request exceed the value specified in <code>MaxRecords</code>, AWS
     *         returns a value in the <code>Marker</code> field of the response. You
     *         can retrieve the next set of response records by providing the
     *         returned marker value in the <code>Marker</code> parameter and
     *         retrying the request. <p> Constraints: You can specify either the
     *         <b>ClusterIdentifier</b> parameter or the <b>Marker</b> parameter, but
     *         not both.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClustersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A tag key or keys for which you want to return all matching clusters
     * that are associated with the specified key or keys. For example,
     * suppose that you have clusters that are tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both
     * of these tag keys in the request, Amazon Redshift returns a response
     * with the clusters that have either or both of these tag keys
     * associated with them.
     *
     * @return A tag key or keys for which you want to return all matching clusters
     *         that are associated with the specified key or keys. For example,
     *         suppose that you have clusters that are tagged with keys called
     *         <code>owner</code> and <code>environment</code>. If you specify both
     *         of these tag keys in the request, Amazon Redshift returns a response
     *         with the clusters that have either or both of these tag keys
     *         associated with them.
     */
    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
              tagKeys = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              tagKeys.setAutoConstruct(true);
        }
        return tagKeys;
    }
    
    /**
     * A tag key or keys for which you want to return all matching clusters
     * that are associated with the specified key or keys. For example,
     * suppose that you have clusters that are tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both
     * of these tag keys in the request, Amazon Redshift returns a response
     * with the clusters that have either or both of these tag keys
     * associated with them.
     *
     * @param tagKeys A tag key or keys for which you want to return all matching clusters
     *         that are associated with the specified key or keys. For example,
     *         suppose that you have clusters that are tagged with keys called
     *         <code>owner</code> and <code>environment</code>. If you specify both
     *         of these tag keys in the request, Amazon Redshift returns a response
     *         with the clusters that have either or both of these tag keys
     *         associated with them.
     */
    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> tagKeysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagKeys.size());
        tagKeysCopy.addAll(tagKeys);
        this.tagKeys = tagKeysCopy;
    }
    
    /**
     * A tag key or keys for which you want to return all matching clusters
     * that are associated with the specified key or keys. For example,
     * suppose that you have clusters that are tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both
     * of these tag keys in the request, Amazon Redshift returns a response
     * with the clusters that have either or both of these tag keys
     * associated with them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagKeys A tag key or keys for which you want to return all matching clusters
     *         that are associated with the specified key or keys. For example,
     *         suppose that you have clusters that are tagged with keys called
     *         <code>owner</code> and <code>environment</code>. If you specify both
     *         of these tag keys in the request, Amazon Redshift returns a response
     *         with the clusters that have either or both of these tag keys
     *         associated with them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClustersRequest withTagKeys(String... tagKeys) {
        if (getTagKeys() == null) setTagKeys(new java.util.ArrayList<String>(tagKeys.length));
        for (String value : tagKeys) {
            getTagKeys().add(value);
        }
        return this;
    }
    
    /**
     * A tag key or keys for which you want to return all matching clusters
     * that are associated with the specified key or keys. For example,
     * suppose that you have clusters that are tagged with keys called
     * <code>owner</code> and <code>environment</code>. If you specify both
     * of these tag keys in the request, Amazon Redshift returns a response
     * with the clusters that have either or both of these tag keys
     * associated with them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagKeys A tag key or keys for which you want to return all matching clusters
     *         that are associated with the specified key or keys. For example,
     *         suppose that you have clusters that are tagged with keys called
     *         <code>owner</code> and <code>environment</code>. If you specify both
     *         of these tag keys in the request, Amazon Redshift returns a response
     *         with the clusters that have either or both of these tag keys
     *         associated with them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClustersRequest withTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> tagKeysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagKeys.size());
            tagKeysCopy.addAll(tagKeys);
            this.tagKeys = tagKeysCopy;
        }

        return this;
    }

    /**
     * A tag value or values for which you want to return all matching
     * clusters that are associated with the specified tag value or values.
     * For example, suppose that you have clusters that are tagged with
     * values called <code>admin</code> and <code>test</code>. If you specify
     * both of these tag values in the request, Amazon Redshift returns a
     * response with the clusters that have either or both of these tag
     * values associated with them.
     *
     * @return A tag value or values for which you want to return all matching
     *         clusters that are associated with the specified tag value or values.
     *         For example, suppose that you have clusters that are tagged with
     *         values called <code>admin</code> and <code>test</code>. If you specify
     *         both of these tag values in the request, Amazon Redshift returns a
     *         response with the clusters that have either or both of these tag
     *         values associated with them.
     */
    public java.util.List<String> getTagValues() {
        if (tagValues == null) {
              tagValues = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              tagValues.setAutoConstruct(true);
        }
        return tagValues;
    }
    
    /**
     * A tag value or values for which you want to return all matching
     * clusters that are associated with the specified tag value or values.
     * For example, suppose that you have clusters that are tagged with
     * values called <code>admin</code> and <code>test</code>. If you specify
     * both of these tag values in the request, Amazon Redshift returns a
     * response with the clusters that have either or both of these tag
     * values associated with them.
     *
     * @param tagValues A tag value or values for which you want to return all matching
     *         clusters that are associated with the specified tag value or values.
     *         For example, suppose that you have clusters that are tagged with
     *         values called <code>admin</code> and <code>test</code>. If you specify
     *         both of these tag values in the request, Amazon Redshift returns a
     *         response with the clusters that have either or both of these tag
     *         values associated with them.
     */
    public void setTagValues(java.util.Collection<String> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> tagValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagValues.size());
        tagValuesCopy.addAll(tagValues);
        this.tagValues = tagValuesCopy;
    }
    
    /**
     * A tag value or values for which you want to return all matching
     * clusters that are associated with the specified tag value or values.
     * For example, suppose that you have clusters that are tagged with
     * values called <code>admin</code> and <code>test</code>. If you specify
     * both of these tag values in the request, Amazon Redshift returns a
     * response with the clusters that have either or both of these tag
     * values associated with them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagValues A tag value or values for which you want to return all matching
     *         clusters that are associated with the specified tag value or values.
     *         For example, suppose that you have clusters that are tagged with
     *         values called <code>admin</code> and <code>test</code>. If you specify
     *         both of these tag values in the request, Amazon Redshift returns a
     *         response with the clusters that have either or both of these tag
     *         values associated with them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClustersRequest withTagValues(String... tagValues) {
        if (getTagValues() == null) setTagValues(new java.util.ArrayList<String>(tagValues.length));
        for (String value : tagValues) {
            getTagValues().add(value);
        }
        return this;
    }
    
    /**
     * A tag value or values for which you want to return all matching
     * clusters that are associated with the specified tag value or values.
     * For example, suppose that you have clusters that are tagged with
     * values called <code>admin</code> and <code>test</code>. If you specify
     * both of these tag values in the request, Amazon Redshift returns a
     * response with the clusters that have either or both of these tag
     * values associated with them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagValues A tag value or values for which you want to return all matching
     *         clusters that are associated with the specified tag value or values.
     *         For example, suppose that you have clusters that are tagged with
     *         values called <code>admin</code> and <code>test</code>. If you specify
     *         both of these tag values in the request, Amazon Redshift returns a
     *         response with the clusters that have either or both of these tag
     *         values associated with them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClustersRequest withTagValues(java.util.Collection<String> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> tagValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagValues.size());
            tagValuesCopy.addAll(tagValues);
            this.tagValues = tagValuesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClusterIdentifier() != null) sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getTagKeys() != null) sb.append("TagKeys: " + getTagKeys() + ",");
        if (getTagValues() != null) sb.append("TagValues: " + getTagValues() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode()); 
        hashCode = prime * hashCode + ((getTagValues() == null) ? 0 : getTagValues().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeClustersRequest == false) return false;
        DescribeClustersRequest other = (DescribeClustersRequest)obj;
        
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null) return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getTagKeys() == null ^ this.getTagKeys() == null) return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false) return false; 
        if (other.getTagValues() == null ^ this.getTagValues() == null) return false;
        if (other.getTagValues() != null && other.getTagValues().equals(this.getTagValues()) == false) return false; 
        return true;
    }
    
}
    