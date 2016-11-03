package com.solidfire.examples;

import com.solidfire.client.ElementFactory;
import com.solidfire.element.api.*;
import com.solidfire.core.javautil.Optional;

// Import Optional common empty types (String, Long, & Map)
import static com.solidfire.core.javautil.Optional.*;
public class ReadmeJavaExample {
    public static void main(String[] args) {
        // Create Connection to SF Cluster
        SolidFireElement sf = ElementFactory.create("mvip", "username", "password", "8.0");

        //* --------- EXAMPLE 1 - CREATE AN ACCOUNT ----------- *//
        // Construct an "AddAccount" request with only required parameters using the builder
        AddAccountRequest addAccountRequest = AddAccountRequest.builder()
                                                               .username("username")
                                                               .build();
        // Send the request and pull the account ID from the result object
        Long accountId = sf.addAccount(addAccountRequest).getAccountID();

        //* --------- EXAMPLE 2 - CREATE A VOLUME ------------- *//
        // Construct a request with parameters using the constructor.
        CreateVolumeRequest createVolumeRequest = new CreateVolumeRequest("volumeName", accountId,
                1000000000l, false,
                Optional.<QoS>empty(),
                EMPTY_MAP);

        // Send the "CreateVolume" request pull the VolumeID off the result object
        Long volumeId = sf.createVolume(createVolumeRequest).getVolumeID();

        //* --------- EXAMPLE 3 - LIST ONE VOLUME FOR AN ACCOUNT ------------- *//
        // Send the "ListVolume" request with desired parameters inline and pull the first volume in the result
        Volume volume = sf.listVolumesForAccount(accountId, of(volumeId), of(1l)).getVolumes()[0];
        // Pull the iqn from the volume
        String iqn = volume.getIqn();

        //* --------- EXAMPLE 3 - MODIFY A VOLUME ------------- *//
        // Change Min and Burst QoS while keeping Max and Burst Time the same
        QoS qos = new QoS(of(5000l), EMPTY_LONG, of(30000l), EMPTY_LONG);

        // Construct request to modify the volume size and QoS using the builder
        ModifyVolumeRequest modifyVolumeRequest = ModifyVolumeRequest.builder()
                                                                     .volumeID(volumeId)
                                                                     .optionalQos(qos)
                                                                     .optionalTotalSize(2000000000l)
                                                                     .build();

        // Send the modify volume request
        sf.modifyVolume(modifyVolumeRequest);
    }
}
