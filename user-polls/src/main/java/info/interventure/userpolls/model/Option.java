
package info.interventure.userpolls.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "text",
    "available",
    "start",
    "allday",
    "date",
    "end",
    "startDate",
    "endDate",
    "startDateTime",
    "endDateTime",
    "dateTime"
})

public class Option {

    @JsonProperty("text")
    private String text;
    @JsonProperty("available")
    private Boolean available;
    @JsonProperty("start")
    @Field(targetType = FieldType.INT64)
    private Date start;
    @JsonProperty("allday")
    private Boolean allday;
    @JsonProperty("date")
    @Field(targetType = FieldType.INT64)
    private Date date;
    @JsonProperty("end")
    @Field(targetType = FieldType.INT64)
    private Date end;
    @JsonProperty("startDate")
    private Date startDate;
    @JsonProperty("endDate")
    private Date endDate;
    @JsonProperty("startDateTime")
    private Date startDateTime;
    @JsonProperty("endDateTime")
    private Date endDateTime;
    @JsonProperty("dateTime")
    private Date dateTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("available")
    public Boolean getAvailable() {
        return available;
    }

    @JsonProperty("available")
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @JsonProperty("start")
    public Date getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(Date start) {
        this.start = start;
    }

    @JsonProperty("allday")
    public Boolean getAllday() {
        return allday;
    }

    @JsonProperty("allday")
    public void setAllday(Boolean allday) {
        this.allday = allday;
    }

    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    @JsonProperty("end")
    public Date getEnd() {
        return end;
    }

    @JsonProperty("end")
    public void setEnd(Date end) {
        this.end = end;
    }

    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("startDateTime")
    public Date getStartDateTime() {
        return startDateTime;
    }

    @JsonProperty("startDateTime")
    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    @JsonProperty("endDateTime")
    public Date getEndDateTime() {
        return endDateTime;
    }

    @JsonProperty("endDateTime")
    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    @JsonProperty("dateTime")
    public Date getDateTime() {
        return dateTime;
    }

    @JsonProperty("dateTime")
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
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
        Option option = (Option) o;
        return Objects.equals(text, option.text) &&
                Objects.equals(available, option.available) &&
                Objects.equals(start, option.start) &&
                Objects.equals(allday, option.allday) &&
                Objects.equals(date, option.date) &&
                Objects.equals(end, option.end) &&
                Objects.equals(startDate, option.startDate) &&
                Objects.equals(endDate, option.endDate) &&
                Objects.equals(startDateTime, option.startDateTime) &&
                Objects.equals(endDateTime, option.endDateTime) &&
                Objects.equals(dateTime, option.dateTime) &&
                Objects.equals(additionalProperties, option.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, available, start, allday, date, end, startDate, endDate, startDateTime, endDateTime, dateTime, additionalProperties);
    }

    @Override
    public String toString() {
        return "Option{" +
                "text='" + text + '\'' +
                ", available=" + available +
                ", start=" + start +
                ", allday=" + allday +
                ", date=" + date +
                ", end=" + end +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", startDateTime=" + startDateTime +
                ", endDateTime=" + endDateTime +
                ", dateTime=" + dateTime +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
