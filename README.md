#<img src="https://raw.githubusercontent.com/solidfire/solidfire-sdk-java/gh-pages/Java-SDK-Icon-RGB-02.png"" height="50" width="50" > SolidFire Java SDK

Java SDK library for interacting with SolidFire Element API

##Current Release
Version 1.1.0.81

##Description
The SolidFire Java SDK is a collection of software modules and libraries that facilitate integration and orchestration between proprietary systems and third-party applications. The Java SDK allows developers to deeply integrate SolidFire system API with the Java programming language. The SolidFire Java SDK reduces the amount of additional coding time required for integration.

##Compatibility
| Component    | Version             |
| ------------ | ------------------- |
| Java         | 7.0 & 8.0           |
| SolidFire OS | Element 7.0 - 8.4\* |
\*<sub><sup>_**Note**: This version of the SDK will work with versions of Element OS greater then 8.4 but some features will not be supported in the API._</sup></sub>

##Getting Help
Contacting SolidFire SDK Support
If you have any questions or comments about this product, contact <ng-sf-host-integrations-sdk@netapp.com> or reach out to the developer community at [ThePub](http://netapp.io). Your feedback helps us focus our efforts on new features and capabilities.

##Download
[Download](http://mvnrepository.com/artifact/com.solidfire) the latest JAR or grab via Maven:

```xml
<dependency>
  <groupId>com.solidfire</groupId>
  <artifactId>solidfire-sdk-java</artifactId>
  <version>1.1.0.81</version>
</dependency>
```

or SBT:

```scala
libraryDependencies += "com.solidfire" % "solidfire-sdk-java" % "1.1.0.81"
```

or Gradle:

```groovy
compile 'com.solidfire:solidfire-sdk-java:1.1.0.81'
```
##Assembly Jar
The SolidFire Java SDK is also released as a Signed Assembly containing everything you need to quickly spin up a working client to interact with you SolidFire cluster.  The assembly can be downloaded [here](https://github.com/solidfire/solidfire-sdk-java/releases/download/v1.1.0.81/solidfire-sdk-1.1.0.81.jar).  

___Dependencies___:

| Component           | Version |
| ------------------- | ------- |
| jsvcgen-client-java | 0.3.0   |
| base64              | 2.3.9   |
| gson                | 2.6.2   |
| joda-time           | 2.9.3   |
| joda-convert        | 1.8.1   |
| slf4j-api           | 1.6.6   |

_**Note**: The SDK assembly should only be used in a standalone setting such as scripting or for prototyping.  It should not be used in a production environment as the signed components might conflict with other components that are unsigned or signed with another certificate.  See below._   

###Limitations with a Certificate Signed Assembly Jar
The SDK assembly is signed with a certificate controlled by SolidFire, Inc, assuring the archive is official and legitimate.  One caveat to having a set of components also signed with SolidFire's certificate, is no other version of these components can exist on the classpath. This will cause a security exception in the JVM.  

If using the SDK with a restricted version of the above listed components, e.g. logback, or in developing an enterprise solution that runs in a web application container, etc., use the publicly [hosted versions](http://mvnrepository.com/artifact/com.solidfire) of the SDK.


##Documentation

[Latest JavaDoc](https://solidfire.github.io/solidfire-sdk-java/latest/api/)

[1.1.0.81 JavaDoc](https://solidfire.github.io/solidfire-sdk-java/doc/v1.1/)

[1.0.0.53 JavaDoc](https://solidfire.github.io/solidfire-sdk-java/doc/v1.0/)

##Examples
Step 1 - Build a [SolidFireElement](https://solidfire.github.io/solidfire-sdk-java/doc/v1.1/com/solidfire/element/api/SolidFireElement.html) object using the factory
---
This is the preferred way to construct the [SolidFireElement](https://solidfire.github.io/solidfire-sdk-java/doc/v1.1/com/solidfire/element/api/SolidFireElement.html) object. The factory will make a call to the SolidFire cluster using the credentials supplied to test the connection. It will also set the version to communicate with based on the highest number supported by the
SDK and Element OS. Optionally, you can choose to set the version manually and whether or not to verify SSL. Read more about it in the [ElementFactory](https://solidfire.github.io/solidfire-sdk-java/doc/v1.1/com/solidfire/client/ElementFactory.html) documentation.

####Java:
```java
import com.solidfire.client.ElementFactory;
import com.solidfire.element.api.*;
import com.solidfire.jsvcgen.javautil.Optional;

// Import Optional common empty types (String, Long, & Map)
import static com.solidfire.jsvcgen.javautil.Optional.*;

...
    // Use ElementFactory to get a SolidFireElement object.
    SolidFireElement sfe = ElementFactory.create("mvip", "username", "password", "8.0");
```
####Scala:
```scala
import com.solidfire.client.ElementFactory
import com.solidfire.element.api._
import com.solidfire.jsvcgen.javautil.Optional.{empty, of}

...
  // Use ElementFactory to get a SolidFireElement object.
  val sf = ElementFactory.create( "mvip", "username", "password", "8.0" )
```

##Step 2 - Call the API method and retrieve the result

All service methods in SolidFireElement call API endpoints and they all return result objects. The naming convention is <i>[methodName]Result</i>. For example, <i>listAccounts()</i> returns a <i>ListAccountsResult</i> object which has a property called <i>getAccounts()</i> returns an array of <i>Accounts</i> that can be iterated.

This example sends a request to list accounts then pulls the first account
from the <i>AddAccountResult</i> object.

####Java:
```java
    // Send the request and wait for the result then pull the Account
    ListAccountsResult listAccountsResult = sfe.listAccounts(ListAccountsRequest.builder().build());
    Account account = listAccountsResult.getAccounts()[0];
```
####Scala:
```scala
    // Send the request and wait for the result then pull the first Account
    val listAccountsResult = sfe.listAccounts(ListAccountsRequest.builder.build)
    val account = listAccountsResult.getAccounts()(0)
```

###Examples of using the API (Java)
```java
import com.solidfire.client.ElementFactory;
import com.solidfire.element.api.*;
import com.solidfire.jsvcgen.javautil.Optional;

// Import Optional common empty types (String, Long, & Map)
import static com.solidfire.jsvcgen.javautil.Optional.*;
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
```
###Examples of using the API (Scala)
```scala    
import com.solidfire.client.ElementFactory
import com.solidfire.element.api._
import com.solidfire.jsvcgen.javautil.Optional.{empty, of}

class ReadmeScalaExample {

  // Create Connection to SF Cluster
  val sf = ElementFactory.create( "mvip", "username", "password", "8.0" )

  //* --------- EXAMPLE 1 - CREATE AN ACCOUNT ----------- *//
  // Construct an "AddAccount" request with only required parameters using the builder
  val addAccount = AddAccountRequest.builder.username( "username" ).build

  // Send the request and pull the account ID from the result object
  val accountId = sf.addAccount( addAccount ).getAccountID

  //* --------- EXAMPLE 2 - CREATE A VOLUME ------------- *//
  // Construct a "CreateVolume" request with parameters using the constructor.
  val createVolume = new CreateVolumeRequest( "volumeName", accountId, 
                                              1000000000L, false, empty[QoS], empty( ) )
  
  // Send the request pull the VolumeID off the result object
  val volumeId = sf.createVolume( createVolume ).getVolumeID

  //* --------- EXAMPLE 3 - LIST ONE VOLUME FOR AN ACCOUNT ------------- *//
  // Send the "ListVolume" request with desired parameters inline and pull the first volume in the result
  val iqn: Volume = sf.listVolumesForAccount( accountId, of( volumeId ), of( 1L ) ).getVolumes()(0)
  
  // pull the iqn from the volume
  val iqn: String = volume.getIqn

  //* --------- EXAMPLE 4 - MODIFY A VOLUME ------------- *//
  // Change Min and Burst QoS while keeping Max and Burst Time the same
  val qos: QoS = new QoS( of( 5000l ), empty(), of( 30000l ), empty() )

  // Construct request to modify the volume size and QoS using the builder.
  val modifyVolume = ModifyVolumeRequest.builder
                                        .volumeID( volumeId )
                                        .optionalQos( qos )
                                        .optionalTotalSize( 2000000000l )
                                        .build

  // Send the modify volume request
  sf.modifyVolume( modifyVolume )
}
```

##Timeouts

Connection timeout (useful for failing fast when a host becomes
unreachable):

####Java:
```java
    import com.solidfire.client.ElementFactory;
    import com.solidfire.element.api.*;
    ...
    SolidFireElement sfe = ElementFactory.create("ip-address-of-cluster", "username", "password");
    sfe.getRequestDispatcher().setConnectionTimeout(600);
```

Read timeout (useful for extending time for a service call to return):

####Java:
```java
    import com.solidfire.client.ElementFactory;
    import com.solidfire.element.api.*;
    ...
    SolidFireElement sfe = ElementFactory.create("ip-address-of-cluster", "username", "password");
    sfe.getRequestDispatcher().setReadTimeout(600);
```

##More Examples

More specific examples are available [here](examples/README.md)

##Logging and Logback
The SDK and the Assembly leverage the [SLF4J API](http://www.slf4j.org/) for logging with the assembly also including  [logback-classic](http://logback.qos.ch/reasonsToSwitch.html) implementation.  An advantage to using the SLF4J interface is the availability of legacy logging framework [bridges](http://www.slf4j.org/legacy.html), for intercepting and consolidating all logging calls into a single log.

###Logback (Assembly Only) Tracing Request / Response calls in the log
An example logback.xml: 

```xml
<configuration debug="true">

    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <!-- encoders are assigned the type
             ch.qos.logback.classic.encoder.PatternLayoutEncoder by default -->
        <encoder>
            <pattern>%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n</pattern>
        </encoder>
    </appender>

    <logger name="com.solidfire.element.api.SolidFireElement" level="DEBUG" />

    <root level="INFO">
        <appender-ref ref="STDOUT" />
    </root>
</configuration>
```

##Roadmap
| Version | Release Date      | Notes                                                             |
| ------- | ------------------ | ---------------------------------------------------------------- |
| 1.0     | November 20, 2015  | Accounts, Volumes, Access Groups, Snapshots, and Group Snapshots |
| 1.1     | September 20, 2016 | Additional Nitorgen & Oxygen API Coverage                        |
| 1.2     | ___TBD___          | Complete Nitorgen, Oxygen, & Fluorine API Coverage               |

##License
Copyright © 2016 NetApp, Inc. All rights reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   <http://www.apache.org/licenses/LICENSE-2.0>

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions andlimitations under the License.
