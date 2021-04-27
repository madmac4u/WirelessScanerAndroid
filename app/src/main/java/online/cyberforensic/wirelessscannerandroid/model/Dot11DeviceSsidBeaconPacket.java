
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
    private Integer kismetPacketSource;
    @SerializedName("kismet.packet.dlt")
    @Expose
    private Integer kismetPacketDlt;
    @SerializedName("kismet.packet.ts_usec")
    @Expose
    private Integer kismetPacketTsUsec;
    @SerializedName("kismet.packet.ts_sec")
    @Expose
    private Integer kismetPacketTsSec;

    public String getKismetPacketData() {
        return kismetPacketData;
    }

    public void setKismetPacketData(String kismetPacketData) {
        this.kismetPacketData = kismetPacketData;
    }

    public Integer getKismetPacketSource() {
        return kismetPacketSource;
    }

    public void setKismetPacketSource(Integer kismetPacketSource) {
        this.kismetPacketSource = kismetPacketSource;
    }

    public Integer getKismetPacketDlt() {
        return kismetPacketDlt;
    }

    public void setKismetPacketDlt(Integer kismetPacketDlt) {
        this.kismetPacketDlt = kismetPacketDlt;
    }

    public Integer getKismetPacketTsUsec() {
        return kismetPacketTsUsec;
    }

    public void setKismetPacketTsUsec(Integer kismetPacketTsUsec) {
        this.kismetPacketTsUsec = kismetPacketTsUsec;
    }

    public Integer getKismetPacketTsSec() {
        return kismetPacketTsSec;
    }

    public void setKismetPacketTsSec(Integer kismetPacketTsSec) {
        this.kismetPacketTsSec = kismetPacketTsSec;
    }

}
