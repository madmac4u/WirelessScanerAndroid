
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
    private Integer kismetCommonSignalCarrierset;
    @SerializedName("kismet.common.signal.encodingset")
    @Expose
    private Integer kismetCommonSignalEncodingset;
    @SerializedName("kismet.common.signal.maxseenrate")
    @Expose
    private Integer kismetCommonSignalMaxseenrate;
    @SerializedName("kismet.common.signal.max_noise")
    @Expose
    private Integer kismetCommonSignalMaxNoise;
    @SerializedName("kismet.common.signal.max_signal")
    @Expose
    private Integer kismetCommonSignalMaxSignal;
    @SerializedName("kismet.common.signal.min_noise")
    @Expose
    private Integer kismetCommonSignalMinNoise;
    @SerializedName("kismet.common.signal.min_signal")
    @Expose
    private Integer kismetCommonSignalMinSignal;
    @SerializedName("kismet.common.signal.last_noise")
    @Expose
    private Integer kismetCommonSignalLastNoise;
    @SerializedName("kismet.common.signal.last_signal")
    @Expose
    private Integer kismetCommonSignalLastSignal;
    @SerializedName("kismet.common.signal.type")
    @Expose
    private String kismetCommonSignalType;

    public KismetCommonSignalSignalRrd getKismetCommonSignalSignalRrd() {
        return kismetCommonSignalSignalRrd;
    }

    public void setKismetCommonSignalSignalRrd(KismetCommonSignalSignalRrd kismetCommonSignalSignalRrd) {
        this.kismetCommonSignalSignalRrd = kismetCommonSignalSignalRrd;
    }

    public Integer getKismetCommonSignalCarrierset() {
        return kismetCommonSignalCarrierset;
    }

    public void setKismetCommonSignalCarrierset(Integer kismetCommonSignalCarrierset) {
        this.kismetCommonSignalCarrierset = kismetCommonSignalCarrierset;
    }

    public Integer getKismetCommonSignalEncodingset() {
        return kismetCommonSignalEncodingset;
    }

    public void setKismetCommonSignalEncodingset(Integer kismetCommonSignalEncodingset) {
        this.kismetCommonSignalEncodingset = kismetCommonSignalEncodingset;
    }

    public Integer getKismetCommonSignalMaxseenrate() {
        return kismetCommonSignalMaxseenrate;
    }

    public void setKismetCommonSignalMaxseenrate(Integer kismetCommonSignalMaxseenrate) {
        this.kismetCommonSignalMaxseenrate = kismetCommonSignalMaxseenrate;
    }

    public Integer getKismetCommonSignalMaxNoise() {
        return kismetCommonSignalMaxNoise;
    }

    public void setKismetCommonSignalMaxNoise(Integer kismetCommonSignalMaxNoise) {
        this.kismetCommonSignalMaxNoise = kismetCommonSignalMaxNoise;
    }

    public Integer getKismetCommonSignalMaxSignal() {
        return kismetCommonSignalMaxSignal;
    }

    public void setKismetCommonSignalMaxSignal(Integer kismetCommonSignalMaxSignal) {
        this.kismetCommonSignalMaxSignal = kismetCommonSignalMaxSignal;
    }

    public Integer getKismetCommonSignalMinNoise() {
        return kismetCommonSignalMinNoise;
    }

    public void setKismetCommonSignalMinNoise(Integer kismetCommonSignalMinNoise) {
        this.kismetCommonSignalMinNoise = kismetCommonSignalMinNoise;
    }

    public Integer getKismetCommonSignalMinSignal() {
        return kismetCommonSignalMinSignal;
    }

    public void setKismetCommonSignalMinSignal(Integer kismetCommonSignalMinSignal) {
        this.kismetCommonSignalMinSignal = kismetCommonSignalMinSignal;
    }

    public Integer getKismetCommonSignalLastNoise() {
        return kismetCommonSignalLastNoise;
    }

    public void setKismetCommonSignalLastNoise(Integer kismetCommonSignalLastNoise) {
        this.kismetCommonSignalLastNoise = kismetCommonSignalLastNoise;
    }

    public Integer getKismetCommonSignalLastSignal() {
        return kismetCommonSignalLastSignal;
    }

    public void setKismetCommonSignalLastSignal(Integer kismetCommonSignalLastSignal) {
        this.kismetCommonSignalLastSignal = kismetCommonSignalLastSignal;
    }

    public String getKismetCommonSignalType() {
        return kismetCommonSignalType;
    }

    public void setKismetCommonSignalType(String kismetCommonSignalType) {
        this.kismetCommonSignalType = kismetCommonSignalType;
    }

}
