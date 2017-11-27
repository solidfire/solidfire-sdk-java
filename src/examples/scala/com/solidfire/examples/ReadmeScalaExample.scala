package com.solidfire.examples

import com.solidfire.client.ElementFactory
import com.solidfire.element.api._
import com.solidfire.core.javautil.Optional.{empty, of}

class ReadmeScalaExample {

  // Create Connection to SF Cluster
  val sfe = ElementFactory.create( "mvip", "username", "password", "8.0" )

  //* --------- EXAMPLE 1 - CREATE AN ACCOUNT ----------- *//
  // Construct an "AddAccount" request with only required parameters using the builder
  val addAccount = AddAccountRequest.builder.username( "username" ).build

  // Send the request and pull the account ID from the result object
  val accountId = sfe.addAccount( addAccount ).getAccountID

  //* --------- EXAMPLE 2 - CREATE A VOLUME ------------- *//
  // Construct a "CreateVolume" request with parameters using the constructor.
  val createVolume = new CreateVolumeRequest( "volumeName", accountId,
    1000000000L, false, empty[QoS], empty( ) )

  // Send the request pull the VolumeID off the result object
  val volumeId = sfe.createVolume( createVolume ).getVolumeID

  //* --------- EXAMPLE 3 - LIST ONE VOLUME FOR AN ACCOUNT ------------- *//
  // Send the "ListVolume" request with desired parameters inline and pull the first volume in the result
  val volume: Volume = sfe.listVolumesForAccount( accountId, of( volumeId ), of( 1L ) ).getVolumes( )( 0 )

  // pull the iqn from the volume
  val iqn: String = volume.getIqn

  //* --------- EXAMPLE 4 - MODIFY A VOLUME ------------- *//
  // Change Min and Burst QoS while keeping Max and Burst Time the same
  val qos: QoS = new QoS( of( 5000l ), empty( ), of( 30000l ), empty( ) )

  // Construct request to modify the volume size and QoS using the builder.
  val modifyVolume = ModifyVolumeRequest.builder
    .volumeID( volumeId )
    .optionalQos( qos )
    .optionalTotalSize( 2000000000l )
    .build

  // Send the modify volume request
  sfe.modifyVolume( modifyVolume )
}
