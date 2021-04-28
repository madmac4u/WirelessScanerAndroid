
package online.cyberforensic.wirelessscannerandroid.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Dot11Device {

    @SerializedName("dot11.device.last_probed_ssid_record")
    @Expose
    private Dot11DeviceLastProbedSsidRecord dot11DeviceLastProbedSsidRecord;
    @SerializedName("dot11.device.last_bssid")
    @Expose
    private String dot11DeviceLastBssid;
    @SerializedName("dot11.device.response_fingerprint")
    @Expose
    private Long dot11DeviceResponseFingerprint;
    @SerializedName("dot11.device.probe_fingerprint")
    @Expose
    private Long dot11DeviceProbeFingerprint;
    @SerializedName("dot11.device.beacon_fingerprint")
    @Expose
    private Long dot11DeviceBeaconFingerprint;
    @SerializedName("dot11.device.neighbor_report_capable")
    @Expose
    private Long dot11DeviceNeighborReportCapable;
    @SerializedName("dot11.device.link_measurement_capable")
    @Expose
    private Long dot11DeviceLinkMeasurementCapable;
    @SerializedName("dot11.device.wps_m3_last")
    @Expose
    private Long dot11DeviceWpsM3Last;
    @SerializedName("dot11.device.max_tx_power")
    @Expose
    private Long dot11DeviceMaxTxPower;
    @SerializedName("dot11.device.wps_m3_count")
    @Expose
    private Long dot11DeviceWpsM3Count;
    @SerializedName("dot11.device.min_tx_power")
    @Expose
    private Long dot11DeviceMinTxPower;
    @SerializedName("dot11.device.last_beacon_timestamp")
    @Expose
    private Long dot11DeviceLastBeaconTimestamp;
    @SerializedName("dot11.device.datasize_retry")
    @Expose
    private Long dot11DeviceDatasizeRetry;
    @SerializedName("dot11.device.probed_ssid_map")
    @Expose
    private List<Dot11DeviceProbedSsidMap> dot11DeviceProbedSsidMap = null;
    @SerializedName("dot11.device.last_sequence")
    @Expose
    private Long dot11DeviceLastSequence;
    @SerializedName("dot11.device.num_client_aps")
    @Expose
    private Long dot11DeviceNumClientAps;
    @SerializedName("dot11.device.num_advertised_ssids")
    @Expose
    private Long dot11DeviceNumAdvertisedSsids;
    @SerializedName("dot11.device.num_probed_ssids")
    @Expose
    private Long dot11DeviceNumProbedSsids;
    @SerializedName("dot11.device.num_associated_clients")
    @Expose
    private Long dot11DeviceNumAssociatedClients;
    @SerializedName("dot11.device.wpa_present_handshake")
    @Expose
    private Long dot11DeviceWpaPresentHandshake;
    @SerializedName("dot11.device.client_disconnects")
    @Expose
    private Long dot11DeviceClientDisconnects;
    @SerializedName("dot11.device.typeset")
    @Expose
    private Long dot11DeviceTypeset;
    @SerializedName("dot11.device.num_responded_ssids")
    @Expose
    private Long dot11DeviceNumRespondedSsids;
    @SerializedName("dot11.device.client_disconnects_last")
    @Expose
    private Long dot11DeviceClientDisconnectsLast;
    @SerializedName("dot11.device.bss_timestamp")
    @Expose
    private Long dot11DeviceBssTimestamp;
    @SerializedName("dot11.device.num_fragments")
    @Expose
    private Long dot11DeviceNumFragments;
    @SerializedName("dot11.device.num_retries")
    @Expose
    private Long dot11DeviceNumRetries;
    @SerializedName("dot11.device.datasize")
    @Expose
    private Long dot11DeviceDatasize;
    @SerializedName("dot11.device.ssid_beacon_packet")
    @Expose
    private Dot11DeviceSsidBeaconPacket dot11DeviceSsidBeaconPacket;
    @SerializedName("dot11.device.wpa_handshake_list")
    @Expose
    private List<Dot11DeviceWpaHandshake> dot11DeviceWpaHandshakeList = null;
    @SerializedName("dot11.device.client_map")
    @Expose
    private Dot11DeviceClientMap dot11DeviceClientMap;
    @SerializedName("dot11.device.advertised_ssid_map")
    @Expose
    private List<Dot11DeviceAdvertisedSsidMap> dot11DeviceAdvertisedSsidMap = null;
    @SerializedName("dot11.device.responded_ssid_map")
    @Expose
    private List<Dot11DeviceRespondedSsidMap> dot11DeviceRespondedSsidMap = null;
    @SerializedName("dot11.device.last_beaconed_ssid_record")
    @Expose
    private Dot11DeviceLastBeaconedSsidRecord dot11DeviceLastBeaconedSsidRecord;
    @SerializedName("dot11.device.associated_client_map")
    @Expose
    private Dot11DeviceAssociatedClientMap dot11DeviceAssociatedClientMap;

    public Dot11DeviceLastProbedSsidRecord getDot11DeviceLastProbedSsidRecord() {
        return dot11DeviceLastProbedSsidRecord;
    }

    public void setDot11DeviceLastProbedSsidRecord(Dot11DeviceLastProbedSsidRecord dot11DeviceLastProbedSsidRecord) {
        this.dot11DeviceLastProbedSsidRecord = dot11DeviceLastProbedSsidRecord;
    }

    public String getDot11DeviceLastBssid() {
        return dot11DeviceLastBssid;
    }

    public void setDot11DeviceLastBssid(String dot11DeviceLastBssid) {
        this.dot11DeviceLastBssid = dot11DeviceLastBssid;
    }

    public Long getDot11DeviceResponseFingerprint() {
        return dot11DeviceResponseFingerprint;
    }

    public void setDot11DeviceResponseFingerprint(Long dot11DeviceResponseFingerprint) {
        this.dot11DeviceResponseFingerprint = dot11DeviceResponseFingerprint;
    }

    public Long getDot11DeviceProbeFingerprint() {
        return dot11DeviceProbeFingerprint;
    }

    public void setDot11DeviceProbeFingerprint(Long dot11DeviceProbeFingerprint) {
        this.dot11DeviceProbeFingerprint = dot11DeviceProbeFingerprint;
    }

    public Long getDot11DeviceBeaconFingerprint() {
        return dot11DeviceBeaconFingerprint;
    }

    public void setDot11DeviceBeaconFingerprint(Long dot11DeviceBeaconFingerprint) {
        this.dot11DeviceBeaconFingerprint = dot11DeviceBeaconFingerprint;
    }

    public Long getDot11DeviceNeighborReportCapable() {
        return dot11DeviceNeighborReportCapable;
    }

    public void setDot11DeviceNeighborReportCapable(Long dot11DeviceNeighborReportCapable) {
        this.dot11DeviceNeighborReportCapable = dot11DeviceNeighborReportCapable;
    }

    public Long getDot11DeviceLinkMeasurementCapable() {
        return dot11DeviceLinkMeasurementCapable;
    }

    public void setDot11DeviceLinkMeasurementCapable(Long dot11DeviceLinkMeasurementCapable) {
        this.dot11DeviceLinkMeasurementCapable = dot11DeviceLinkMeasurementCapable;
    }

    public Long getDot11DeviceWpsM3Last() {
        return dot11DeviceWpsM3Last;
    }

    public void setDot11DeviceWpsM3Last(Long dot11DeviceWpsM3Last) {
        this.dot11DeviceWpsM3Last = dot11DeviceWpsM3Last;
    }

    public Long getDot11DeviceMaxTxPower() {
        return dot11DeviceMaxTxPower;
    }

    public void setDot11DeviceMaxTxPower(Long dot11DeviceMaxTxPower) {
        this.dot11DeviceMaxTxPower = dot11DeviceMaxTxPower;
    }

    public Long getDot11DeviceWpsM3Count() {
        return dot11DeviceWpsM3Count;
    }

    public void setDot11DeviceWpsM3Count(Long dot11DeviceWpsM3Count) {
        this.dot11DeviceWpsM3Count = dot11DeviceWpsM3Count;
    }

    public Long getDot11DeviceMinTxPower() {
        return dot11DeviceMinTxPower;
    }

    public void setDot11DeviceMinTxPower(Long dot11DeviceMinTxPower) {
        this.dot11DeviceMinTxPower = dot11DeviceMinTxPower;
    }

    public Long getDot11DeviceLastBeaconTimestamp() {
        return dot11DeviceLastBeaconTimestamp;
    }

    public void setDot11DeviceLastBeaconTimestamp(Long dot11DeviceLastBeaconTimestamp) {
        this.dot11DeviceLastBeaconTimestamp = dot11DeviceLastBeaconTimestamp;
    }

    public Long getDot11DeviceDatasizeRetry() {
        return dot11DeviceDatasizeRetry;
    }

    public void setDot11DeviceDatasizeRetry(Long dot11DeviceDatasizeRetry) {
        this.dot11DeviceDatasizeRetry = dot11DeviceDatasizeRetry;
    }

    public List<Dot11DeviceProbedSsidMap> getDot11DeviceProbedSsidMap() {
        return dot11DeviceProbedSsidMap;
    }

    public void setDot11DeviceProbedSsidMap(List<Dot11DeviceProbedSsidMap> dot11DeviceProbedSsidMap) {
        this.dot11DeviceProbedSsidMap = dot11DeviceProbedSsidMap;
    }

    public Long getDot11DeviceLastSequence() {
        return dot11DeviceLastSequence;
    }

    public void setDot11DeviceLastSequence(Long dot11DeviceLastSequence) {
        this.dot11DeviceLastSequence = dot11DeviceLastSequence;
    }

    public Long getDot11DeviceNumClientAps() {
        return dot11DeviceNumClientAps;
    }

    public void setDot11DeviceNumClientAps(Long dot11DeviceNumClientAps) {
        this.dot11DeviceNumClientAps = dot11DeviceNumClientAps;
    }

    public Long getDot11DeviceNumAdvertisedSsids() {
        return dot11DeviceNumAdvertisedSsids;
    }

    public void setDot11DeviceNumAdvertisedSsids(Long dot11DeviceNumAdvertisedSsids) {
        this.dot11DeviceNumAdvertisedSsids = dot11DeviceNumAdvertisedSsids;
    }

    public Long getDot11DeviceNumProbedSsids() {
        return dot11DeviceNumProbedSsids;
    }

    public void setDot11DeviceNumProbedSsids(Long dot11DeviceNumProbedSsids) {
        this.dot11DeviceNumProbedSsids = dot11DeviceNumProbedSsids;
    }

    public Long getDot11DeviceNumAssociatedClients() {
        return dot11DeviceNumAssociatedClients;
    }

    public void setDot11DeviceNumAssociatedClients(Long dot11DeviceNumAssociatedClients) {
        this.dot11DeviceNumAssociatedClients = dot11DeviceNumAssociatedClients;
    }

    public Long getDot11DeviceWpaPresentHandshake() {
        return dot11DeviceWpaPresentHandshake;
    }

    public void setDot11DeviceWpaPresentHandshake(Long dot11DeviceWpaPresentHandshake) {
        this.dot11DeviceWpaPresentHandshake = dot11DeviceWpaPresentHandshake;
    }

    public Long getDot11DeviceClientDisconnects() {
        return dot11DeviceClientDisconnects;
    }

    public void setDot11DeviceClientDisconnects(Long dot11DeviceClientDisconnects) {
        this.dot11DeviceClientDisconnects = dot11DeviceClientDisconnects;
    }

    public Long getDot11DeviceTypeset() {
        return dot11DeviceTypeset;
    }

    public void setDot11DeviceTypeset(Long dot11DeviceTypeset) {
        this.dot11DeviceTypeset = dot11DeviceTypeset;
    }

    public Long getDot11DeviceNumRespondedSsids() {
        return dot11DeviceNumRespondedSsids;
    }

    public void setDot11DeviceNumRespondedSsids(Long dot11DeviceNumRespondedSsids) {
        this.dot11DeviceNumRespondedSsids = dot11DeviceNumRespondedSsids;
    }

    public Long getDot11DeviceClientDisconnectsLast() {
        return dot11DeviceClientDisconnectsLast;
    }

    public void setDot11DeviceClientDisconnectsLast(Long dot11DeviceClientDisconnectsLast) {
        this.dot11DeviceClientDisconnectsLast = dot11DeviceClientDisconnectsLast;
    }

    public Long getDot11DeviceBssTimestamp() {
        return dot11DeviceBssTimestamp;
    }

    public void setDot11DeviceBssTimestamp(Long dot11DeviceBssTimestamp) {
        this.dot11DeviceBssTimestamp = dot11DeviceBssTimestamp;
    }

    public Long getDot11DeviceNumFragments() {
        return dot11DeviceNumFragments;
    }

    public void setDot11DeviceNumFragments(Long dot11DeviceNumFragments) {
        this.dot11DeviceNumFragments = dot11DeviceNumFragments;
    }

    public Long getDot11DeviceNumRetries() {
        return dot11DeviceNumRetries;
    }

    public void setDot11DeviceNumRetries(Long dot11DeviceNumRetries) {
        this.dot11DeviceNumRetries = dot11DeviceNumRetries;
    }

    public Long getDot11DeviceDatasize() {
        return dot11DeviceDatasize;
    }

    public void setDot11DeviceDatasize(Long dot11DeviceDatasize) {
        this.dot11DeviceDatasize = dot11DeviceDatasize;
    }

    public Dot11DeviceSsidBeaconPacket getDot11DeviceSsidBeaconPacket() {
        return dot11DeviceSsidBeaconPacket;
    }

    public void setDot11DeviceSsidBeaconPacket(Dot11DeviceSsidBeaconPacket dot11DeviceSsidBeaconPacket) {
        this.dot11DeviceSsidBeaconPacket = dot11DeviceSsidBeaconPacket;
    }

    public List<Dot11DeviceWpaHandshake> getDot11DeviceWpaHandshakeList() {
        return dot11DeviceWpaHandshakeList;
    }

    public void setDot11DeviceWpaHandshakeList(List<Dot11DeviceWpaHandshake> dot11DeviceWpaHandshakeList) {
        this.dot11DeviceWpaHandshakeList = dot11DeviceWpaHandshakeList;
    }

    public Dot11DeviceClientMap getDot11DeviceClientMap() {
        return dot11DeviceClientMap;
    }

    public void setDot11DeviceClientMap(Dot11DeviceClientMap dot11DeviceClientMap) {
        this.dot11DeviceClientMap = dot11DeviceClientMap;
    }

    public List<Dot11DeviceAdvertisedSsidMap> getDot11DeviceAdvertisedSsidMap() {
        return dot11DeviceAdvertisedSsidMap;
    }

    public void setDot11DeviceAdvertisedSsidMap(List<Dot11DeviceAdvertisedSsidMap> dot11DeviceAdvertisedSsidMap) {
        this.dot11DeviceAdvertisedSsidMap = dot11DeviceAdvertisedSsidMap;
    }

    public List<Dot11DeviceRespondedSsidMap> getDot11DeviceRespondedSsidMap() {
        return dot11DeviceRespondedSsidMap;
    }

    public void setDot11DeviceRespondedSsidMap(List<Dot11DeviceRespondedSsidMap> dot11DeviceRespondedSsidMap) {
        this.dot11DeviceRespondedSsidMap = dot11DeviceRespondedSsidMap;
    }

    public Dot11DeviceLastBeaconedSsidRecord getDot11DeviceLastBeaconedSsidRecord() {
        return dot11DeviceLastBeaconedSsidRecord;
    }

    public void setDot11DeviceLastBeaconedSsidRecord(Dot11DeviceLastBeaconedSsidRecord dot11DeviceLastBeaconedSsidRecord) {
        this.dot11DeviceLastBeaconedSsidRecord = dot11DeviceLastBeaconedSsidRecord;
    }

    public Dot11DeviceAssociatedClientMap getDot11DeviceAssociatedClientMap() {
        return dot11DeviceAssociatedClientMap;
    }

    public void setDot11DeviceAssociatedClientMap(Dot11DeviceAssociatedClientMap dot11DeviceAssociatedClientMap) {
        this.dot11DeviceAssociatedClientMap = dot11DeviceAssociatedClientMap;
    }

}
