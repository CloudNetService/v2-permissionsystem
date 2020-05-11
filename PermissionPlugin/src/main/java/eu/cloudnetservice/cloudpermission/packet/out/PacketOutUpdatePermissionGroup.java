package eu.cloudnetservice.cloudpermission.packet.out;

import de.dytanic.cloudnet.lib.network.protocol.packet.Packet;
import de.dytanic.cloudnet.lib.utility.document.Document;
import eu.cloudnetsrvice.cloudpermission.model.PermissionGroup;

public class PacketOutUpdatePermissionGroup extends Packet {
    public PacketOutUpdatePermissionGroup(PermissionGroup permissionGroup) {
        super(201, new Document("permissionGroup", permissionGroup));
    }
}
