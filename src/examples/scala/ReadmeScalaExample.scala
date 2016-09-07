// Import your Java Primitive Types
import java.lang.Long

import com.solidfire.client.ElementFactory
import com.solidfire.element.api._
import com.solidfire.jsvcgen.javautil.Optional.{empty, of}

class ReadmeScalaExample {

  // Create Connection to SF Cluster
  val sf = ElementFactory.create( "mvip", "username", "password", "8.0" )

  // Create some accounts
  val addAccount = AddAccountRequest.builder.username( "username" ).build
  val accountId  = sf.addAccount( addAccount ).getAccountID

  // And a volume
  val createVolume = new CreateVolumeRequest( "volumeName", accountId, 1000000000l, false, empty[QoS], empty( ) )
  val volumeId     = sf.createVolume( createVolume ).getVolumeID

  // Lookup iqn for new volume
  val iqn: String = sf.listVolumesForAccount( accountId, of( volumeId ), of( 1l ) ).getVolumes( )( 0 ).getIqn

  // Change Min and Burst QoS while keeping Max and Burst Time the same
  val qos: QoS = new QoS( of( 5000l ), empty[Long], of( 30000l ), empty[Long] )

  // Modify the volume
  val modifyVolume = ModifyVolumeRequest.builder
    .volumeID( volumeId )
    .optionalQos( qos )
    .optionalTotalSize( 2000000000l )
    .build

  sf.modifyVolume( modifyVolume )
}
