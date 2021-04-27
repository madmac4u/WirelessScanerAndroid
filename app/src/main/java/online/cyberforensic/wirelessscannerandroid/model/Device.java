
package online.cyberforensic.wirelessscannerandroid.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Device {

    @SerializedName("kismet.device.base.type")
    @Expose
    private String kismetDeviceBaseType;
    @SerializedName("kismet.device.base.manuf")
    @Expose
    private String kismetDeviceBaseManuf;
    @SerializedName("kismet.device.base.seenby")
    @Expose
    private List<KismetDeviceBaseSeenby> kismetDeviceBaseSeenby = null;
    @SerializedName("kismet.server.uuid")
    @Expose
    private String kismetServerUuid;
    @SerializedName("kismet.device.base.num_alerts")
    @Expose
    private Integer kismetDeviceBaseNumAlerts;
    @SerializedName("kismet.device.base.mod_time")
    @Expose
    private Integer kismetDeviceBaseModTime;
    @SerializedName("kismet.device.base.last_time")
    @Expose
    private Integer kismetDeviceBaseLastTime;
    @SerializedName("kismet.device.base.first_time")
    @Expose
    private Integer kismetDeviceBaseFirstTime;
    @SerializedName("kismet.device.base.frequency")
    @Expose
    private Integer kismetDeviceBaseFrequency;
    @SerializedName("kismet.device.base.basic_crypt_set")
    @Expose
    private Integer kismetDeviceBaseBasicCryptSet;
    @SerializedName("kismet.device.base.channel")
    @Expose
    private String kismetDeviceBaseChannel;
    @SerializedName("kismet.device.base.crypt")
    @Expose
    private String kismetDeviceBaseCrypt;
    @SerializedName("kismet.device.base.freq_khz_map")
    @Expose
    private KismetDeviceBaseFreqKhzMap kismetDeviceBaseFreqKhzMap;
    @SerializedName("kismet.device.base.basic_type_set")
    @Expose
    private Integer kismetDeviceBaseBasicTypeSet;
    @SerializedName("kismet.device.base.signal")
    @Expose
    private KismetDeviceBaseSignal kismetDeviceBaseSignal;
    @SerializedName("kismet.device.base.commonname")
    @Expose
    private String kismetDeviceBaseCommonname;
    @SerializedName("kismet.device.base.name")
    @Expose
    private String kismetDeviceBaseName;
    @SerializedName("kismet.device.base.phyname")
    @Expose
    private String kismetDeviceBasePhyname;
    @SerializedName("kismet.device.base.related_devices")
    @Expose
    private KismetDeviceBaseRelatedDevices kismetDeviceBaseRelatedDevices;
    @SerializedName("kismet.device.base.macaddr")
    @Expose
    private String kismetDeviceBaseMacaddr;
    @SerializedName("kismet.device.base.key")
    @Expose
    private String kismetDeviceBaseKey;
    @SerializedName("kismet.device.base.packets.total")
    @Expose
    private Integer kismetDeviceBasePacketsTotal;
    @SerializedName("dot11.device")
    @Expose
    private Dot11Device dot11Device;
    @SerializedName("kismet.device.base.packets.rx")
    @Expose
    private Integer kismetDeviceBasePacketsRx;
    @SerializedName("kismet.device.base.packets.tx")
    @Expose
    private Integer kismetDeviceBasePacketsTx;
    @SerializedName("kismet.device.base.packets.llc")
    @Expose
    private Integer kismetDeviceBasePacketsLlc;
    @SerializedName("kismet.device.base.packets.error")
    @Expose
    private Integer kismetDeviceBasePacketsError;
    @SerializedName("kismet.device.base.packets.data")
    @Expose
    private Integer kismetDeviceBasePacketsData;
    @SerializedName("kismet.device.base.packets.crypt")
    @Expose
    private Integer kismetDeviceBasePacketsCrypt;
    @SerializedName("kismet.device.base.packets.filtered")
    @Expose
    private Integer kismetDeviceBasePacketsFiltered;
    @SerializedName("kismet.device.base.datasize")
    @Expose
    private Integer kismetDeviceBaseDatasize;
    @SerializedName("kismet.device.base.packets.rrd")
    @Expose
    private KismetDeviceBasePacketsRrd kismetDeviceBasePacketsRrd;
    @SerializedName("kismet.device.base.datasize.rrd")
    @Expose
    private KismetDeviceBaseDatasizeRrd kismetDeviceBaseDatasizeRrd;

    public String getKismetDeviceBaseType() {
        return kismetDeviceBaseType;
    }

    public void setKismetDeviceBaseType(String kismetDeviceBaseType) {
        this.kismetDeviceBaseType = kismetDeviceBaseType;
    }

    public String getKismetDeviceBaseManuf() {
        return kismetDeviceBaseManuf;
    }

    public void setKismetDeviceBaseManuf(String kismetDeviceBaseManuf) {
        this.kismetDeviceBaseManuf = kismetDeviceBaseManuf;
    }

    public List<KismetDeviceBaseSeenby> getKismetDeviceBaseSeenby() {
        return kismetDeviceBaseSeenby;
    }

    public void setKismetDeviceBaseSeenby(List<KismetDeviceBaseSeenby> kismetDeviceBaseSeenby) {
        this.kismetDeviceBaseSeenby = kismetDeviceBaseSeenby;
    }

    public String getKismetServerUuid() {
        return kismetServerUuid;
    }

    public void setKismetServerUuid(String kismetServerUuid) {
        this.kismetServerUuid = kismetServerUuid;
    }

    public Integer getKismetDeviceBaseNumAlerts() {
        return kismetDeviceBaseNumAlerts;
    }

    public void setKismetDeviceBaseNumAlerts(Integer kismetDeviceBaseNumAlerts) {
        this.kismetDeviceBaseNumAlerts = kismetDeviceBaseNumAlerts;
    }

    public Integer getKismetDeviceBaseModTime() {
        return kismetDeviceBaseModTime;
    }

    public void setKismetDeviceBaseModTime(Integer kismetDeviceBaseModTime) {
        this.kismetDeviceBaseModTime = kismetDeviceBaseModTime;
    }

    public Integer getKismetDeviceBaseLastTime() {
        return kismetDeviceBaseLastTime;
    }

    public void setKismetDeviceBaseLastTime(Integer kismetDeviceBaseLastTime) {
        this.kismetDeviceBaseLastTime = kismetDeviceBaseLastTime;
    }

    public Integer getKismetDeviceBaseFirstTime() {
        return kismetDeviceBaseFirstTime;
    }

    public void setKismetDeviceBaseFirstTime(Integer kismetDeviceBaseFirstTime) {
        this.kismetDeviceBaseFirstTime = kismetDeviceBaseFirstTime;
    }

    public Integer getKismetDeviceBaseFrequency() {
        return kismetDeviceBaseFrequency;
    }

    public void setKismetDeviceBaseFrequency(Integer kismetDeviceBaseFrequency) {
        this.kismetDeviceBaseFrequency = kismetDeviceBaseFrequency;
    }

    public Integer getKismetDeviceBaseBasicCryptSet() {
        return kismetDeviceBaseBasicCryptSet;
    }

    public void setKismetDeviceBaseBasicCryptSet(Integer kismetDeviceBaseBasicCryptSet) {
        this.kismetDeviceBaseBasicCryptSet = kismetDeviceBaseBasicCryptSet;
    }

    public String getKismetDeviceBaseChannel() {
        return kismetDeviceBaseChannel;
    }

    public void setKismetDeviceBaseChannel(String kismetDeviceBaseChannel) {
        this.kismetDeviceBaseChannel = kismetDeviceBaseChannel;
    }

    public String getKismetDeviceBaseCrypt() {
        return kismetDeviceBaseCrypt;
    }

    public void setKismetDeviceBaseCrypt(String kismetDeviceBaseCrypt) {
        this.kismetDeviceBaseCrypt = kismetDeviceBaseCrypt;
    }

    public KismetDeviceBaseFreqKhzMap getKismetDeviceBaseFreqKhzMap() {
        return kismetDeviceBaseFreqKhzMap;
    }

    public void setKismetDeviceBaseFreqKhzMap(KismetDeviceBaseFreqKhzMap kismetDeviceBaseFreqKhzMap) {
        this.kismetDeviceBaseFreqKhzMap = kismetDeviceBaseFreqKhzMap;
    }

    public Integer getKismetDeviceBaseBasicTypeSet() {
        return kismetDeviceBaseBasicTypeSet;
    }

    public void setKismetDeviceBaseBasicTypeSet(Integer kismetDeviceBaseBasicTypeSet) {
        this.kismetDeviceBaseBasicTypeSet = kismetDeviceBaseBasicTypeSet;
    }

    public KismetDeviceBaseSignal getKismetDeviceBaseSignal() {
        return kismetDeviceBaseSignal;
    }

    public void setKismetDeviceBaseSignal(KismetDeviceBaseSignal kismetDeviceBaseSignal) {
        this.kismetDeviceBaseSignal = kismetDeviceBaseSignal;
    }

    public String getKismetDeviceBaseCommonname() {
        return kismetDeviceBaseCommonname;
    }

    public void setKismetDeviceBaseCommonname(String kismetDeviceBaseCommonname) {
        this.kismetDeviceBaseCommonname = kismetDeviceBaseCommonname;
    }

    public String getKismetDeviceBaseName() {
        return kismetDeviceBaseName;
    }

    public void setKismetDeviceBaseName(String kismetDeviceBaseName) {
        this.kismetDeviceBaseName = kismetDeviceBaseName;
    }

    public String getKismetDeviceBasePhyname() {
        return kismetDeviceBasePhyname;
    }

    public void setKismetDeviceBasePhyname(String kismetDeviceBasePhyname) {
        this.kismetDeviceBasePhyname = kismetDeviceBasePhyname;
    }

    public KismetDeviceBaseRelatedDevices getKismetDeviceBaseRelatedDevices() {
        return kismetDeviceBaseRelatedDevices;
    }

    public void setKismetDeviceBaseRelatedDevices(KismetDeviceBaseRelatedDevices kismetDeviceBaseRelatedDevices) {
        this.kismetDeviceBaseRelatedDevices = kismetDeviceBaseRelatedDevices;
    }

    public String getKismetDeviceBaseMacaddr() {
        return kismetDeviceBaseMacaddr;
    }

    public void setKismetDeviceBaseMacaddr(String kismetDeviceBaseMacaddr) {
        this.kismetDeviceBaseMacaddr = kismetDeviceBaseMacaddr;
    }

    public String getKismetDeviceBaseKey() {
        return kismetDeviceBaseKey;
    }

    public void setKismetDeviceBaseKey(String kismetDeviceBaseKey) {
        this.kismetDeviceBaseKey = kismetDeviceBaseKey;
    }

    public Integer getKismetDeviceBasePacketsTotal() {
        return kismetDeviceBasePacketsTotal;
    }

    public void setKismetDeviceBasePacketsTotal(Integer kismetDeviceBasePacketsTotal) {
        this.kismetDeviceBasePacketsTotal = kismetDeviceBasePacketsTotal;
    }

    public Dot11Device getDot11Device() {
        return dot11Device;
    }

    public void setDot11Device(Dot11Device dot11Device) {
        this.dot11Device = dot11Device;
    }

    public Integer getKismetDeviceBasePacketsRx() {
        return kismetDeviceBasePacketsRx;
    }

    public void setKismetDeviceBasePacketsRx(Integer kismetDeviceBasePacketsRx) {
        this.kismetDeviceBasePacketsRx = kismetDeviceBasePacketsRx;
    }

    public Integer getKismetDeviceBasePacketsTx() {
        return kismetDeviceBasePacketsTx;
    }

    public void setKismetDeviceBasePacketsTx(Integer kismetDeviceBasePacketsTx) {
        this.kismetDeviceBasePacketsTx = kismetDeviceBasePacketsTx;
    }

    public Integer getKismetDeviceBasePacketsLlc() {
        return kismetDeviceBasePacketsLlc;
    }

    public void setKismetDeviceBasePacketsLlc(Integer kismetDeviceBasePacketsLlc) {
        this.kismetDeviceBasePacketsLlc = kismetDeviceBasePacketsLlc;
    }

    public Integer getKismetDeviceBasePacketsError() {
        return kismetDeviceBasePacketsError;
    }

    public void setKismetDeviceBasePacketsError(Integer kismetDeviceBasePacketsError) {
        this.kismetDeviceBasePacketsError = kismetDeviceBasePacketsError;
    }

    public Integer getKismetDeviceBasePacketsData() {
        return kismetDeviceBasePacketsData;
    }

    public void setKismetDeviceBasePacketsData(Integer kismetDeviceBasePacketsData) {
        this.kismetDeviceBasePacketsData = kismetDeviceBasePacketsData;
    }

    public Integer getKismetDeviceBasePacketsCrypt() {
        return kismetDeviceBasePacketsCrypt;
    }

    public void setKismetDeviceBasePacketsCrypt(Integer kismetDeviceBasePacketsCrypt) {
        this.kismetDeviceBasePacketsCrypt = kismetDeviceBasePacketsCrypt;
    }

    public Integer getKismetDeviceBasePacketsFiltered() {
        return kismetDeviceBasePacketsFiltered;
    }

    public void setKismetDeviceBasePacketsFiltered(Integer kismetDeviceBasePacketsFiltered) {
        this.kismetDeviceBasePacketsFiltered = kismetDeviceBasePacketsFiltered;
    }

    public Integer getKismetDeviceBaseDatasize() {
        return kismetDeviceBaseDatasize;
    }

    public void setKismetDeviceBaseDatasize(Integer kismetDeviceBaseDatasize) {
        this.kismetDeviceBaseDatasize = kismetDeviceBaseDatasize;
    }

    public KismetDeviceBasePacketsRrd getKismetDeviceBasePacketsRrd() {
        return kismetDeviceBasePacketsRrd;
    }

    public void setKismetDeviceBasePacketsRrd(KismetDeviceBasePacketsRrd kismetDeviceBasePacketsRrd) {
        this.kismetDeviceBasePacketsRrd = kismetDeviceBasePacketsRrd;
    }

    public KismetDeviceBaseDatasizeRrd getKismetDeviceBaseDatasizeRrd() {
        return kismetDeviceBaseDatasizeRrd;
    }

    public void setKismetDeviceBaseDatasizeRrd(KismetDeviceBaseDatasizeRrd kismetDeviceBaseDatasizeRrd) {
        this.kismetDeviceBaseDatasizeRrd = kismetDeviceBaseDatasizeRrd;
    }

}
