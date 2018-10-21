package ru.kpfu.itis.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "order_date",
        "owner",
        "consumer",
        "duration",
        "price",
        "track"
})
public class Order {

    @JsonProperty("order_date")
    private String orderDate;
    @JsonProperty("owner")
    private Owner owner;
    @JsonProperty("consumer")
    private Consumer consumer;
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("price")
    private Integer price;
    @JsonProperty("track")
    private Track track;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("order_date")
    public String getOrderDate() {
        return orderDate;
    }

    @JsonProperty("order_date")
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @JsonProperty("consumer")
    public Consumer getConsumer() {
        return consumer;
    }

    @JsonProperty("consumer")
    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @JsonProperty("price")
    public Integer getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Integer price) {
        this.price = price;
    }

    @JsonProperty("track")
    public Track getTrack() {
        return track;
    }

    @JsonProperty("track")
    public void setTrack(Track track) {
        this.track = track;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
