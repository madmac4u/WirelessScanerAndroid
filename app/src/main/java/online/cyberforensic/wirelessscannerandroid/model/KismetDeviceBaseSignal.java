
package online.cyberforensic.wirelessscannerandroid.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class KismetDeviceBaseSignal {

    @SerializedName("kismet.common.signal.signal_rrd")
    @Expose
    private KismetCommonSignalSignalRrd kismetCommonSignalSignalRrd;
    @SerializedName("kismet.common.signal.carrierset")
    @Expose
    private Long kismetCommonSignalCarrierset;
    @SerializedName("kismet.common.signal.encodingset")
    @Expose
    private Long kismetCommonSignalEncodingset;
    @SerializedName("kismet.common.signal.maxseenrate")
    @Expose
    private Long kismetCommonSignalMaxseenrate;
    @SerializedName("kismet.common.signal.max_noise")
    @Expose
    private Long kismetCommonSignalMaxNoise;
    @SerializedName("kismet.common.signal.max_signal")
    @Expose
    private Long kismetCommonSignalMaxSignal;
    @SerializedName("kismet.common.signal.min_noise")
    @Expose
    private Long kismetCommonSignalMinNoise;
    @SerializedName("kismet.common.signal.min_signal")
    @Expose
    private Long kismetCommonSignalMinSignal;
    @SerializedName("kismet.common.signal.last_noise")
    @Expose
    private Long kismetCommonSignalLastNoise;
    @SerializedName("kismet.common.signal.last_signal")
    @Expose
    private Long kismetCommonSignalLastSignal;
    @SerializedName("kismet.common.signal.type")
    @Expose
    private String kismetCommonSignalType;

    public KismetCommonSignalSignalRrd getKismetCommonSignalSignalRrd() {
        return kismetCommonSignalSignalRrd;
    }

    public void setKismetCommonSignalSignalRrd(KismetCommonSignalSignalRrd kismetCommonSignalSignalRrd) {
        this.kismetCommonSignalSignalRrd = kismetCommonSignalSignalRrd;
    }

    public Long getKismetCommonSignalCarrierset() {
        return kismetCommonSignalCarrierset;
    }

    public void setKismetCommonSignalCarrierset(Long kismetCommonSignalCarrierset) {
        this.kismetCommonSignalCarrierset = kismetCommonSignalCarrierset;
    }

    public Long getKismetCommonSignalEncodingset() {
        return kismetCommonSignalEncodingset;
    }

    public void setKismetCommonSignalEncodingset(Long kismetCommonSignalEncodingset) {
        this.kismetCommonSignalEncodingset = kismetCommonSignalEncodingset;
    }

    public Long getKismetCommonSignalMaxseenrate() {
        return kismetCommonSignalMaxseenrate;
    }

    public void setKismetCommonSignalMaxseenrate(Long kismetCommonSignalMaxseenrate) {
        this.kismetCommonSignalMaxseenrate = kismetCommonSignalMaxseenrate;
    }

    public Long getKismetCommonSignalMaxNoise() {
        return kismetCommonSignalMaxNoise;
    }

    public void setKismetCommonSignalMaxNoise(Long kismetCommonSignalMaxNoise) {
        this.kismetCommonSignalMaxNoise = kismetCommonSignalMaxNoise;
    }

    public Long getKismetCommonSignalMaxSignal() {
        return kismetCommonSignalMaxSignal;
    }

    public void setKismetCommonSignalMaxSignal(Long kismetCommonSignalMaxSignal) {
        this.kismetCommonSignalMaxSignal = kismetCommonSignalMaxSignal;
    }

    public Long getKismetCommonSignalMinNoise() {
        return kismetCommonSignalMinNoise;
    }

    public void setKismetCommonSignalMinNoise(Long kismetCommonSignalMinNoise) {
        this.kismetCommonSignalMinNoise = kismetCommonSignalMinNoise;
    }

    public Long getKismetCommonSignalMinSignal() {
        return kismetCommonSignalMinSignal;
    }

    public void setKismetCommonSignalMinSignal(Long kismetCommonSignalMinSignal) {
        this.kismetCommonSignalMinSignal = kismetCommonSignalMinSignal;
    }

    public Long getKismetCommonSignalLastNoise() {
        return kismetCommonSignalLastNoise;
    }

    public void setKismetCommonSignalLastNoise(Long kismetCommonSignalLastNoise) {
        this.kismetCommonSignalLastNoise = kismetCommonSignalLastNoise;
    }

    public Long getKismetCommonSignalLastSignal() {
        return kismetCommonSignalLastSignal;
    }

    public void setKismetCommonSignalLastSignal(Long kismetCommonSignalLastSignal) {
        this.kismetCommonSignalLastSignal = kismetCommonSignalLastSignal;
    }

    public String getKismetCommonSignalType() {
        return kismetCommonSignalType;
    }

    public void setKismetCommonSignalType(String kismetCommonSignalType) {
        this.kismetCommonSignalType = kismetCommonSignalType;
    }

}
