
package online.cyberforensic.wirelessscannerandroid.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class KismetCommonSignalSignalRrd {

    @SerializedName("kismet.common.rrd.blank_val")
    @Expose
    private Long kismetCommonRrdBlankVal;
    @SerializedName("kismet.common.rrd.minute_vec")
    @Expose
    private List<Long> kismetCommonRrdMinuteVec = null;
    @SerializedName("kismet.common.rrd.serial_time")
    @Expose
    private Long kismetCommonRrdSerialTime;
    @SerializedName("kismet.common.rrd.last_time")
    @Expose
    private Long kismetCommonRrdLastTime;

    public Long getKismetCommonRrdBlankVal() {
        return kismetCommonRrdBlankVal;
    }

    public void setKismetCommonRrdBlankVal(Long kismetCommonRrdBlankVal) {
        this.kismetCommonRrdBlankVal = kismetCommonRrdBlankVal;
    }

    public List<Long> getKismetCommonRrdMinuteVec() {
        return kismetCommonRrdMinuteVec;
    }

    public void setKismetCommonRrdMinuteVec(List<Long> kismetCommonRrdMinuteVec) {
        this.kismetCommonRrdMinuteVec = kismetCommonRrdMinuteVec;
    }

    public Long getKismetCommonRrdSerialTime() {
        return kismetCommonRrdSerialTime;
    }

    public void setKismetCommonRrdSerialTime(Long kismetCommonRrdSerialTime) {
        this.kismetCommonRrdSerialTime = kismetCommonRrdSerialTime;
    }

    public Long getKismetCommonRrdLastTime() {
        return kismetCommonRrdLastTime;
    }

    public void setKismetCommonRrdLastTime(Long kismetCommonRrdLastTime) {
        this.kismetCommonRrdLastTime = kismetCommonRrdLastTime;
    }

}
