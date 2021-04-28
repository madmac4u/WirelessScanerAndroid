
package online.cyberforensic.wirelessscannerandroid.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class KismetDeviceBaseSeenby {

    @SerializedName("kismet.common.seenby.uuid")
    @Expose
    private String kismetCommonSeenbyUuid;
    @SerializedName("kismet.common.seenby.num_packets")
    @Expose
    private Long kismetCommonSeenbyNumPackets;
    @SerializedName("kismet.common.seenby.last_time")
    @Expose
    private Long kismetCommonSeenbyLastTime;
    @SerializedName("kismet.common.seenby.first_time")
    @Expose
    private Long kismetCommonSeenbyFirstTime;

    public String getKismetCommonSeenbyUuid() {
        return kismetCommonSeenbyUuid;
    }

    public void setKismetCommonSeenbyUuid(String kismetCommonSeenbyUuid) {
        this.kismetCommonSeenbyUuid = kismetCommonSeenbyUuid;
    }

    public Long getKismetCommonSeenbyNumPackets() {
        return kismetCommonSeenbyNumPackets;
    }

    public void setKismetCommonSeenbyNumPackets(Long kismetCommonSeenbyNumPackets) {
        this.kismetCommonSeenbyNumPackets = kismetCommonSeenbyNumPackets;
    }

    public Long getKismetCommonSeenbyLastTime() {
        return kismetCommonSeenbyLastTime;
    }

    public void setKismetCommonSeenbyLastTime(Long kismetCommonSeenbyLastTime) {
        this.kismetCommonSeenbyLastTime = kismetCommonSeenbyLastTime;
    }

    public Long getKismetCommonSeenbyFirstTime() {
        return kismetCommonSeenbyFirstTime;
    }

    public void setKismetCommonSeenbyFirstTime(Long kismetCommonSeenbyFirstTime) {
        this.kismetCommonSeenbyFirstTime = kismetCommonSeenbyFirstTime;
    }

}
