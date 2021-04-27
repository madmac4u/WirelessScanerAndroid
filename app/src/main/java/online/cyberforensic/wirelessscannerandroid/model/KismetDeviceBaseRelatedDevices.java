
package online.cyberforensic.wirelessscannerandroid.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class KismetDeviceBaseRelatedDevices {

    @SerializedName("dot11_bssts_similar")
    @Expose
    private List<String> dot11BsstsSimilar = null;

    public List<String> getDot11BsstsSimilar() {
        return dot11BsstsSimilar;
    }

    public void setDot11BsstsSimilar(List<String> dot11BsstsSimilar) {
        this.dot11BsstsSimilar = dot11BsstsSimilar;
    }

}
