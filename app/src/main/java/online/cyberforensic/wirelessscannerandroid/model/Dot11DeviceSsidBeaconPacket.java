
package online.cyberforensic.wirelessscannerandroid.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Dot11DeviceSsidBeaconPacket {

    @SerializedName("kismet.packet.data")
    @Expose
    private String kismetPacketData;
    @SerializedName("kismet.packet.source")
    @Expose
    private Long kismetPacketSource;
    @SerializedName("kismet.packet.dlt")
    @Expose
    private Long kismetPacketDlt;
    @SerializedName("kismet.packet.ts_usec")
    @Expose
    private Long kismetPacketTsUsec;
    @SerializedName("kismet.packet.ts_sec")
    @Expose
    private Long kismetPacketTsSec;

    public String getKismetPacketData() {
        return kismetPacketData;
    }

    public void setKismetPacketData(String kismetPacketData) {
        this.kismetPacketData = kismetPacketData;
    }

    public Long getKismetPacketSource() {
        return kismetPacketSource;
    }

    public void setKismetPacketSource(Long kismetPacketSource) {
        this.kismetPacketSource = kismetPacketSource;
    }

    public Long getKismetPacketDlt() {
        return kismetPacketDlt;
    }

    public void setKismetPacketDlt(Long kismetPacketDlt) {
        this.kismetPacketDlt = kismetPacketDlt;
    }

    public Long getKismetPacketTsUsec() {
        return kismetPacketTsUsec;
    }

    public void setKismetPacketTsUsec(Long kismetPacketTsUsec) {
        this.kismetPacketTsUsec = kismetPacketTsUsec;
    }

    public Long getKismetPacketTsSec() {
        return kismetPacketTsSec;
    }

    public void setKismetPacketTsSec(Long kismetPacketTsSec) {
        this.kismetPacketTsSec = kismetPacketTsSec;
    }

}
