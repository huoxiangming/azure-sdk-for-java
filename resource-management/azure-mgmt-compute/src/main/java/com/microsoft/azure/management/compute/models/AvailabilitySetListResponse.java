/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.compute.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;

import java.util.ArrayList;
import java.util.Iterator;

/**
* The List Availability Set operation response.
*/
public class AvailabilitySetListResponse extends OperationResponse implements Iterable<AvailabilitySet> {
    private ArrayList<AvailabilitySet> availabilitySets;
    
    /**
    * Optional. Gets or sets the list of availability sets
    * @return The AvailabilitySets value.
    */
    public ArrayList<AvailabilitySet> getAvailabilitySets() {
        return this.availabilitySets;
    }
    
    /**
    * Optional. Gets or sets the list of availability sets
    * @param availabilitySetsValue The AvailabilitySets value.
    */
    public void setAvailabilitySets(final ArrayList<AvailabilitySet> availabilitySetsValue) {
        this.availabilitySets = availabilitySetsValue;
    }
    
    /**
    * Initializes a new instance of the AvailabilitySetListResponse class.
    *
    */
    public AvailabilitySetListResponse() {
        super();
        this.setAvailabilitySets(new LazyArrayList<AvailabilitySet>());
    }
    
    /**
    * Gets the sequence of AvailabilitySets.
    *
    */
    public Iterator<AvailabilitySet> iterator() {
        return this.getAvailabilitySets().iterator();
    }
}