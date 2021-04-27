
package online.cyberforensic.wirelessscannerandroid.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class KismetCommonSignalSignalRrd {

    @SerializedName("kismet.common.rrd.blank_val")
    @Expose
    private Integer kismetCommonRrdBlankVal;
    @SerializedName("kismet.common.rrd.minute_vec")
    @Expose
    private List<Integer> kismetCommonRrdMinuteVec = null;
    @SerializedName("kismet.common.rrd.serial_time")
    @Expose
    private Integer kismetCommonRrdSerialTime;
    @SerializedName("kismet.common.rrd.last_time")
    @Expose
    private Integer kismetCommonRrdLastTime;

    public Integer getKismetCommonRrdBlankVal() {
        return kismetCommonRrdBlankVal;
    }

    public void setKismetCommonRrdBlankVal(Integer kismetCommonRrdBlankVal) {
        this.kismetCommonRrdBlankVal = kismetCommonRrdBlankVal;
    }

    public List<Integer> getKismetCommonRrdMinuteVec() {
        return kismetCommonRrdMinuteVec;
    }

    public void setKismetCommonRrdMinuteVec(List<Integer> kismetCommonRrdMinuteVec) {
        this.kismetCommonRrdMinuteVec = kismetCommonRrdMinuteVec;
    }

    public Integer getKismetCommonRrdSerialTime() {
        return kismetCommonRrdSerialTime;
    }

    public void setKismetCommonRrdSerialTime(Integer kismetCommonRrdSerialTime) {
        this.kismetCommonRrdSerialTime = kismetCommonRrdSerialTime;
    }

    public Integer getKismetCommonRrdLastTime() {
        return kismetCommonRrdLastTime;
    }

    public void setKismetCommonRrdLastTime(Integer kismetCommonRrdLastTime) {
        this.kismetCommonRrdLastTime = kismetCommonRrdLastTime;
    }

}