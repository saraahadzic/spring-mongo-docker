
package info.interventure.userpolls.model;



import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@Document(collection = "polls", language = "english")

public class UserPolls {

    @JsonProperty("id")
    @TextIndexed
    @Id
    private String id;
    @TextIndexed
    @JsonProperty("adminKey")
    private String adminKey;
    @JsonProperty("latestChange")
    @Field(targetType = FieldType.INT64)
    private Date latestChange;
    @JsonProperty("initiated")
    @Field(targetType = FieldType.INT64)
    private Date initiated;
    @JsonProperty("participantsCount")
    private Integer participantsCount;
    @JsonProperty("inviteesCount")
    private Integer inviteesCount;
    @JsonProperty("type")
    @TextIndexed
    private String type;
    @JsonProperty("hidden")
    private Boolean hidden;
    @JsonProperty("preferencesType")
    @TextIndexed
    private String preferencesType;
    @JsonProperty("state")
    @TextIndexed
    private String state;
    @JsonProperty("locale")
    @TextIndexed
    private String locale;
    @JsonProperty("title")
    @TextIndexed
    private String title;
    @TextIndexed
    @JsonProperty("initiator")
    private Initiator initiator;
    @TextIndexed
    @JsonProperty("options")
    private List<Option> options = null;
    @JsonProperty("optionsHash")
    @TextIndexed
    private String optionsHash;
    @JsonProperty("participants")
    @TextIndexed
    private List<Participant> participants = null;
    @JsonProperty("invitees")
    private List<Object> invitees = null;
    @JsonProperty("device")
    @TextIndexed
    private String device;
    @JsonProperty("levels")
    @TextIndexed
    private String levels;
    @JsonProperty("description")
    @TextIndexed
    private String description;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("multiDay")
    private Boolean multiDay;
    @JsonProperty("columnConstraint")
    private Integer columnConstraint;
    @JsonProperty("dateText")
    private Boolean dateText;
    @JsonProperty("timeZone")
    private Boolean timeZone;
    @JsonProperty("rowConstraint")
    private Integer rowConstraint;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("adminKey")
    public String getAdminKey() {
        return adminKey;
    }

    @JsonProperty("adminKey")
    public void setAdminKey(String adminKey) {
        this.adminKey = adminKey;
    }

    @JsonProperty("latestChange")
    public Date getLatestChange() {
        return latestChange;
    }

    @JsonProperty("latestChange")
    public void setLatestChange(Date latestChange) {
        this.latestChange = latestChange;
    }

    @JsonProperty("initiated")
    public Date getInitiated() {
        return initiated;
    }

    @JsonProperty("initiated")
    public void setInitiated(Date initiated) {
        this.initiated = initiated;
    }

    @JsonProperty("participantsCount")
    public Integer getParticipantsCount() {
        return participantsCount;
    }

    @JsonProperty("participantsCount")
    public void setParticipantsCount(Integer participantsCount) {
        this.participantsCount = participantsCount;
    }

    @JsonProperty("inviteesCount")
    public Integer getInviteesCount() {
        return inviteesCount;
    }

    @JsonProperty("inviteesCount")
    public void setInviteesCount(Integer inviteesCount) {
        this.inviteesCount = inviteesCount;
    }


    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("hidden")
    public Boolean getHidden() {
        return hidden;
    }

    @JsonProperty("hidden")
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    @JsonProperty("preferencesType")
    public String getPreferencesType() {
        return preferencesType;
    }

    @JsonProperty("preferencesType")
    public void setPreferencesType(String preferencesType) {
        this.preferencesType = preferencesType;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("initiator")

    public Initiator getInitiator() {
        return initiator;
    }

    @JsonProperty("initiator")
    public void setInitiator(Initiator initiator) {
        this.initiator = initiator;
    }
    @JsonProperty("options")
    public List<Option> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @JsonProperty("optionsHash")
    public String getOptionsHash() {
        return optionsHash;
    }

    @JsonProperty("optionsHash")
    public void setOptionsHash(String optionsHash) {
        this.optionsHash = optionsHash;
    }

    @JsonProperty("participants")
    public List<Participant> getParticipants() {
        return participants;
    }

    @JsonProperty("participants")
    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    @JsonProperty("invitees")
    public List<Object> getInvitees() {
        return invitees;
    }

    @JsonProperty("invitees")
    public void setInvitees(List<Object> invitees) {
        this.invitees = invitees;
    }

    @JsonProperty("device")
    public String getDevice() {
        return device;
    }

    @JsonProperty("device")
    public void setDevice(String device) {
        this.device = device;
    }

    @JsonProperty("levels")
    public String getLevels() {
        return levels;
    }

    @JsonProperty("levels")
    public void setLevels(String levels) {
        this.levels = levels;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("multiDay")
    public Boolean getMultiDay() {
        return multiDay;
    }

    @JsonProperty("multiDay")
    public void setMultiDay(Boolean multiDay) {
        this.multiDay = multiDay;
    }

    @JsonProperty("columnConstraint")
    public Integer getColumnConstraint() {
        return columnConstraint;
    }

    @JsonProperty("columnConstraint")
    public void setColumnConstraint(Integer columnConstraint) {
        this.columnConstraint = columnConstraint;
    }

    @JsonProperty("dateText")
    public Boolean getDateText() {
        return dateText;
    }

    @JsonProperty("dateText")
    public void setDateText(Boolean dateText) {
        this.dateText = dateText;
    }

    @JsonProperty("timeZone")
    public Boolean getTimeZone() {
        return timeZone;
    }

    @JsonProperty("timeZone")
    public void setTimeZone(Boolean timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("rowConstraint")
    public Integer getRowConstraint() {
        return rowConstraint;
    }

    @JsonProperty("rowConstraint")
    public void setRowConstraint(Integer rowConstraint) {
        this.rowConstraint = rowConstraint;
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
    public String toString() {
        return "UserPolls{" +
                "id='" + id + '\'' +
                ", adminKey='" + adminKey + '\'' +
                ", latestChange=" + latestChange +
                ", initiated=" + initiated +
                ", participantsCount=" + participantsCount +
                ", inviteesCount=" + inviteesCount +
                ", type='" + type + '\'' +
                ", hidden=" + hidden +
                ", preferencesType='" + preferencesType + '\'' +
                ", state='" + state + '\'' +
                ", locale='" + locale + '\'' +
                ", title='" + title + '\'' +
                ", initiator=" + initiator +
                ", options=" + options +
                ", optionsHash='" + optionsHash + '\'' +
                ", participants=" + participants +
                ", invitees=" + invitees +
                ", device='" + device + '\'' +
                ", levels='" + levels + '\'' +
                ", description='" + description + '\'' +
                ", location=" + location +
                ", multiDay=" + multiDay +
                ", columnConstraint=" + columnConstraint +
                ", dateText=" + dateText +
                ", timeZone=" + timeZone +
                ", rowConstraint=" + rowConstraint +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPolls userPolls = (UserPolls) o;
        return Objects.equals(id, userPolls.id) &&
                Objects.equals(adminKey, userPolls.adminKey) &&
                Objects.equals(latestChange, userPolls.latestChange) &&
                Objects.equals(initiated, userPolls.initiated) &&
                Objects.equals(participantsCount, userPolls.participantsCount) &&
                Objects.equals(inviteesCount, userPolls.inviteesCount) &&
                Objects.equals(type, userPolls.type) &&
                Objects.equals(hidden, userPolls.hidden) &&
                Objects.equals(preferencesType, userPolls.preferencesType) &&
                Objects.equals(state, userPolls.state) &&
                Objects.equals(locale, userPolls.locale) &&
                Objects.equals(title, userPolls.title) &&
                Objects.equals(initiator, userPolls.initiator) &&
                Objects.equals(options, userPolls.options) &&
                Objects.equals(optionsHash, userPolls.optionsHash) &&
                Objects.equals(participants, userPolls.participants) &&
                Objects.equals(invitees, userPolls.invitees) &&
                Objects.equals(device, userPolls.device) &&
                Objects.equals(levels, userPolls.levels) &&
                Objects.equals(description, userPolls.description) &&
                Objects.equals(location, userPolls.location) &&
                Objects.equals(multiDay, userPolls.multiDay) &&
                Objects.equals(columnConstraint, userPolls.columnConstraint) &&
                Objects.equals(dateText, userPolls.dateText) &&
                Objects.equals(timeZone, userPolls.timeZone) &&
                Objects.equals(rowConstraint, userPolls.rowConstraint) &&
                Objects.equals(additionalProperties, userPolls.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adminKey, latestChange, initiated, participantsCount, inviteesCount, type, hidden, preferencesType, state, locale, title, initiator, options, optionsHash, participants, invitees, device, levels, description, location, multiDay, columnConstraint, dateText, timeZone, rowConstraint, additionalProperties);
    }
}
