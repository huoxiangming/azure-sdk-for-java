/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.compute.models;

import java.util.List;

/**
 * Describes the properties of a Virtual Machine Image.
 */
public class VirtualMachineImageProperties {
    /**
     * The plan property.
     */
    private PurchasePlan plan;

    /**
     * The osDiskImage property.
     */
    private OSDiskImage osDiskImage;

    /**
     * The dataDiskImages property.
     */
    private List<DataDiskImage> dataDiskImages;

    /**
     * Get the plan value.
     *
     * @return the plan value
     */
    public PurchasePlan getPlan() {
        return this.plan;
    }

    /**
     * Set the plan value.
     *
     * @param plan the plan value to set
     */
    public void setPlan(PurchasePlan plan) {
        this.plan = plan;
    }

    /**
     * Get the osDiskImage value.
     *
     * @return the osDiskImage value
     */
    public OSDiskImage getOsDiskImage() {
        return this.osDiskImage;
    }

    /**
     * Set the osDiskImage value.
     *
     * @param osDiskImage the osDiskImage value to set
     */
    public void setOsDiskImage(OSDiskImage osDiskImage) {
        this.osDiskImage = osDiskImage;
    }

    /**
     * Get the dataDiskImages value.
     *
     * @return the dataDiskImages value
     */
    public List<DataDiskImage> getDataDiskImages() {
        return this.dataDiskImages;
    }

    /**
     * Set the dataDiskImages value.
     *
     * @param dataDiskImages the dataDiskImages value to set
     */
    public void setDataDiskImages(List<DataDiskImage> dataDiskImages) {
        this.dataDiskImages = dataDiskImages;
    }

}