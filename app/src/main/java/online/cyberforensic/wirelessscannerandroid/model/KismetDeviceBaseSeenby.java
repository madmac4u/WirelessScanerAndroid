
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
    private Integer kismetCommonSeenbyNumPackets;
    @SerializedName("kismet.common.seenby.last_time")
    @Expose
    private Integer kismetCommonSeenbyLastTime;
    @SerializedName("kismet.common.seenby.first_time")
    @Expose
    private Integer kismetCommonSeenbyFirstTime;

    public String getKismetCommonSeenbyUuid() {
        return kismetCommonSeenbyUuid;
    }

    public void setKismetCommonSeenbyUuid(String kismetCommonSeenbyUuid) {
        this.kismetCommonSeenbyUuid = kismetCommonSeenbyUuid;
    }

    public Integer getKismetCommonSeenbyNumPackets() {
        return kismetCommonSeenbyNumPackets;
    }

    public void setKismetCommonSeenbyNumPackets(Integer kismetCommonSeenbyNumPackets) {
        this.kismetCommonSeenbyNumPackets = kismetCommonSeenbyNumPackets;
    }

    public Integer getKismetCommonSeenbyLastTime() {
        return kismetCommonSeenbyLastTime;
    }

    public void setKismetCommonSeenbyLastTime(Integer kismetCommonSeenbyLastTime) {
        this.kismetCommonSeenbyLastTime = kismetCommonSeenbyLastTime;
    }

    public Integer getKismetCommonSeenbyFirstTime() {
        return kismetCommonSeenbyFirstTime;
    }

    public void setKismetCommonSeenbyFirstTime(Integer kismetCommonSeenbyFirstTime) {
        this.kismetCommonSeenbyFirstTime = kismetCommonSeenbyFirstTime;
    }

}
