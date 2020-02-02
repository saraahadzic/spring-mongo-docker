
package info.interventure.userpolls.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "email",
    "notify",
    "timeZone"
})

public class Initiator {

    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("notify")
    private Boolean notify;
    @JsonProperty("timeZone")
    private String timeZone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("notify")
    public Boolean getNotify() {
        return notify;
    }

    @JsonProperty("notify")
    public void setNotify(Boolean notify) {
        this.notify = notify;
    }

    @JsonProperty("timeZone")
    public String getTimeZone() {
        return timeZone;
    }

    @JsonProperty("timeZone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Initiator initiator = (Initiator) o;
        return Objects.equals(name, initiator.name) &&
                Objects.equals(email, initiator.email) &&
                Objects.equals(notify, initiator.notify) &&
                Objects.equals(timeZone, initiator.timeZone) &&
                Objects.equals(additionalProperties, initiator.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, notify, timeZone, additionalProperties);
    }

    @Override
    public String toString() {
        return "Initiator{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", notify=" + notify +
                ", timeZone='" + timeZone + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
