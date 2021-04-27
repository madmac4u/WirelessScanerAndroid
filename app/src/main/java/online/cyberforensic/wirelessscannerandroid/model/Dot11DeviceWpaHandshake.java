
package online.cyberforensic.wirelessscannerandroid.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Dot11DeviceWpaHandshake {

    @SerializedName("dot11.eapol.packet")
    @Expose
    private Dot11EapolPacket dot11EapolPacket;
    @SerializedName("dot11.eapol.rsn_pmkid")
    @Expose
    private String dot11EapolRsnPmkid;
    @SerializedName("dot11.eapol.nonce")
    @Expose
    private String dot11EapolNonce;
    @SerializedName("dot11.eapol.install")
    @Expose
    private Integer dot11EapolInstall;
    @SerializedName("dot11.eapol.replay_counter")
    @Expose
    private Integer dot11EapolReplayCounter;
    @SerializedName("dot11.eapol.message_num")
    @Expose
    private Integer dot11EapolMessageNum;
    @SerializedName("dot11.eapol.direction")
    @Expose
    private Integer dot11EapolDirection;
    @SerializedName("dot11.eapol.timestamp")
    @Expose
    private Double dot11EapolTimestamp;

    public Dot11EapolPacket getDot11EapolPacket() {
        return dot11EapolPacket;
    }

    public void setDot11EapolPacket(Dot11EapolPacket dot11EapolPacket) {
        this.dot11EapolPacket = dot11EapolPacket;
    }

    public String getDot11EapolRsnPmkid() {
        return dot11EapolRsnPmkid;
    }

    public void setDot11EapolRsnPmkid(String dot11EapolRsnPmkid) {
        this.dot11EapolRsnPmkid = dot11EapolRsnPmkid;
    }

    public String getDot11EapolNonce() {
        return dot11EapolNonce;
    }

    public void setDot11EapolNonce(String dot11EapolNonce) {
        this.dot11EapolNonce = dot11EapolNonce;
    }

    public Integer getDot11EapolInstall() {
        return dot11EapolInstall;
    }

    public void setDot11EapolInstall(Integer dot11EapolInstall) {
        this.dot11EapolInstall = dot11EapolInstall;
    }

    public Integer getDot11EapolReplayCounter() {
        return dot11EapolReplayCounter;
    }

    public void setDot11EapolReplayCounter(Integer dot11EapolReplayCounter) {
        this.dot11EapolReplayCounter = dot11EapolReplayCounter;
    }

    public Integer getDot11EapolMessageNum() {
        return dot11EapolMessageNum;
    }

    public void setDot11EapolMessageNum(Integer dot11EapolMessageNum) {
        this.dot11EapolMessageNum = dot11EapolMessageNum;
    }

    public Integer getDot11EapolDirection() {
        return dot11EapolDirection;
    }

    public void setDot11EapolDirection(Integer dot11EapolDirection) {
        this.dot11EapolDirection = dot11EapolDirection;
    }

    public Double getDot11EapolTimestamp() {
        return dot11EapolTimestamp;
    }

    public void setDot11EapolTimestamp(Double dot11EapolTimestamp) {
        this.dot11EapolTimestamp = dot11EapolTimestamp;
    }

}
