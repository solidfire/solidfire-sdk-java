import com.solidfire.client.ElementFactory;
import com.solidfire.element.api.*;
import com.solidfire.jsvcgen.javautil.Optional;

// Import Optional common empty types (String, Long, & Map)
import static com.solidfire.jsvcgen.javautil.Optional.*;

public class ReadmeJavaExample {
    public static void main(String[] args) {
        // Create Connection to SF Cluster
        SolidFireElement sf = ElementFactory.create("mvip", "username", "password", "8.0");

        // Create some accounts
        AddAccountRequest addAccountRequest = AddAccountRequest.builder()
                                                               .username("username")
                                                               .build();

        Long accountId = sf.addAccount(addAccountRequest).getAccountID();

        // And a volume with default QoS
        CreateVolumeRequest createVolumeRequest = new CreateVolumeRequest("volumeName", accountId,
                1000000000l, false,
                Optional.<QoS>empty(),
                EMPTY_MAP);

        Long volumeId = sf.createVolume(createVolumeRequest).getVolumeID();

        // Lookup iqn for new volume
        String iqn = sf.listVolumesForAccount(accountId, of(volumeId), of(1l)).getVolumes()[0].getIqn();

        // Change Min and Burst QoS while keeping Max and Burst Time the same
        QoS qos = new QoS(of(5000l), EMPTY_LONG, of(30000l), EMPTY_LONG);

        // Modify the volume size and QoS
        ModifyVolumeRequest modifyVolumeRequest = ModifyVolumeRequest.builder()
                                                                     .volumeID(volumeId)
                                                                     .optionalQos(qos)
                                                                     .optionalTotalSize(2000000000l)
                                                                     .build();

        sf.modifyVolume(modifyVolumeRequest);
    }
}