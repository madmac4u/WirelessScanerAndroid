
package online.cyberforensic.wirelessscannerandroid.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class KismetDeviceBaseDatasizeRrd {

    @SerializedName("kismet.common.rrd.blank_val")
    @Expose
    private Long kismetCommonRrdBlankVal;
    @SerializedName("kismet.common.rrd.day_vec")
    @Expose
    private List<Long> kismetCommonRrdDayVec = null;
    @SerializedName("kismet.common.rrd.hour_vec")
    @Expose
    private List<Long> kismetCommonRrdHourVec = null;
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

    public List<Long> getKismetCommonRrdDayVec() {
        return kismetCommonRrdDayVec;
    }

    public void setKismetCommonRrdDayVec(List<Long> kismetCommonRrdDayVec) {
        this.kismetCommonRrdDayVec = kismetCommonRrdDayVec;
    }

    public List<Long> getKismetCommonRrdHourVec() {
        return kismetCommonRrdHourVec;
    }

    public void setKismetCommonRrdHourVec(List<Long> kismetCommonRrdHourVec) {
        this.kismetCommonRrdHourVec = kismetCommonRrdHourVec;
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
