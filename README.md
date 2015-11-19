# solidfire-sdk-java
Initial wrapping of the SolidFire Management API as a Java SDK

##Description
The SolidFire Java SDK is a collection of software modules and libraries that facilitate integration and orchestration between proprietary systems and third-party applications. The Java SDK allows developers to deeply integrate SolidFire system API with their Java programming language. The SolidFire Java SDK reduces the amount of additional coding time required for integration.

##Compatibility
| Component    | Version           |
| ------------ | ----------------- |
| Java         | 7.0 & 8.0         |
| SolidFire OS | Element 7.x & 8.x |

##Getting Help
Contacting SolidFire SDK Support
If you have any questions or comments about this product, contact <sdk@solidfire.com> or reach out to the developer community at [developer.solidfire.com](http://developer.solidfire.com). Your feedback helps us focus our efforts on new features and capabilities.

##Download
Download the latest JAR or grab via Maven:
```xml
<dependency>
  <groupId>com.solidfire</groupId>
  <artifactId>element-api</artifactId>
  <version>1.0.0.47</version>
</dependency>
```

or SBT:
```scala
libraryDependencies += "com.solidfire" % "element-api" % "1.0.0.47"
```

or Gradle:
```groovy
compile 'com.solidfire:element-api:1.0.0.47'
```

##Assembly
###Limitations with Certificate Signed Assembly Jar
###

##Documentation
[JavaDoc](https://solidfire.github.io/solidfire-sdk-java/latest/api/)
##Examples
###Examples of using the API (Java)
```java
import com.solidfire.javautil.Optional;

// Import Optional common empty types (String, Long, & Map)
import static com.solidfire.javautil.Optional.*;

public class ReadmeJavaExample {
  public static void main(String[] args ) {
    // Create Connection to SF Cluster
    SolidFireElementIF sf = SolidFireElement.create("mvip", "8.0", "username", "password");

    // Create some accounts
    AddAccountRequest addAccountRequest = new AddAccountRequest("username", EMPTY_STRING, EMPTY_STRING, EMPTY_MAP);
    Long accountId = sf.addAccount(addAccountRequest).getAccountID();

    // And a volume with default QoS
    CreateVolumeRequest createVolumeRequest = new CreateVolumeRequest("volumeName", accountId, 1000000000l, false, Optional.<QoS>empty(), EMPTY_MAP);
    Long volumeId = sf.createVolume(createVolumeRequest).getVolumeID();

    // Lookup iqn for new volume
    String iqn = sf.listVolumesForAccount(accountId, of(volumeId), of(1l)).getVolumes()[0].getIqn();

    // Change Min and Burst QoS while keeping Max and Burst Time the same
    QoS qos = new QoS(of(5000l), EMPTY_LONG, of(30000l), EMPTY_LONG );

    // Modify the volume size and QoS
    ModifyVolumeRequest modifyVolumeRequest = new ModifyVolumeRequest(volumeId, EMPTY_LONG, EMPTY_STRING, EMPTY_STRING, of(qos), of(2000000000l), EMPTY_MAP)
    sf.modifyVolume(modifyVolumeRequest);
  }
}
```

###Examples of using the API (Scala)
```scala    
// Import your Java Primitive Types
import java.lang.Long

import com.solidfire.javautil.Optional.{ empty , of }

class ReadmeExample {

  // Create Connection to SF Cluster
  val sf = SolidFireElement.create( "mvip", "8.0", "username", "password" )

  // Create some accounts
  val addAccount = new AddAccountRequest( "username", empty[String], empty[String], empty( ) )
  val accountId = sf.addAccount( addAccount  ).getAccountID

  // And a volume
  val createVolume = new CreateVolumeRequest( "volumeName", accountId, 1000000000l, false, empty[QoS], empty( ) )
  val volumeId = sf.createVolume( createVolume ).getVolumeID

  // Lookup iqn for new volume
  val iqn: String = sf.listVolumesForAccount( accountId, of( volumeId ), of( 1l ) ).getVolumes( )( 0 ).getIqn

  // Change Min and Burst QoS while keeping Max and Burst Time the same
  val qos: QoS = new QoS( of( 5000l ), empty[Long], of( 30000l ), empty[Long] )

  // Modify the volume
  val modifyVolume = new ModifyVolumeRequest( volumeId, empty[Long], empty[String], empty[String], of( qos ), of( 2000000000l ), empty( ) )
  sf.modifyVolume( modifyVolume  )
}
```
##Roadmap
##License
Copyright © 2015 SolidFire, Inc. All rights reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   <http://www.apache.org/licenses/LICENSE-2.0>

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions andlimitations under the License.
