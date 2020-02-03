
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
import org.springframework.data.mongodb.core.mapping.Document;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "address",
    "countryCode",
    "locationId"
})

public class Location {

    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private String address;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("locationId")
    private String locationId;
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

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("locationId")
    public String getLocationId() {
        return locationId;
    }

    @JsonProperty("locationId")
    public void setLocationId(String locationId) {
        this.locationId = locationId;
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
        Location location = (Location) o;
        return Objects.equals(name, location.name) &&
                Objects.equals(address, location.address) &&
                Objects.equals(countryCode, location.countryCode) &&
                Objects.equals(locationId, location.locationId) &&
                Objects.equals(additionalProperties, location.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, countryCode, locationId, additionalProperties);
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", locationId='" + locationId + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
