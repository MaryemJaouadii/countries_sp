package com.example.firstappspringboot.domain;

import java.util.List;
import java.util.Map;

public class CustomEntity {
    private int id;
    private String date;
    private String deadline_date;
    private Double awarded_value_eur;

    public Double getAwarded_value_eur() {
        return awarded_value_eur;
    }

    public void setAwarded_value_eur(Double awarded_value_eur) {
        this.awarded_value_eur = awarded_value_eur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;
    private String deadline_length_days;

    public String getDeadline_length_hours() {
        return deadline_length_hours;
    }

    public void setDeadline_length_hours(String deadline_length_hours) {
        this.deadline_length_hours = deadline_length_hours;
    }

    private String deadline_length_hours;

    private String title;
    private String category;
    private String sid;


    public String getAwarded_value() {
        return awarded_value;
    }

    public void setAwarded_value(String awarded_value) {
        this.awarded_value = awarded_value;
    }

    public String getAwarded_currency() {
        return awarded_currency;
    }

    public void setAwarded_currency(String awarded_currency) {
        this.awarded_currency = awarded_currency;
    }

    private String awarded_currency;

    private String awarded_value;
    private String src_url;
    private Map<?,?> purchaser;
    private Map<?,?>  type;
    private Map<?,?>[]  awarded;

    public List getIndicators() {
        return indicators;
    }

    public void setIndicators(List indicators) {
        this.indicators = indicators;
    }

    private List indicators;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    private String phase;

    public String getPhase_en() {
        return phase_en;
    }

    public void setPhase_en(String phase_en) {
        this.phase_en = phase_en;
    }

    private String phase_en;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    private String place;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    private String eid;

    public CustomEntity(int id, String date, String deadline_date, Double awarded_value_eur, String description, String deadline_length_days, String deadline_length_hours, String title, String category, String sid, String awarded_currency, String awarded_value, String src_url, Map<?, ?> purchaser, Map<?, ?> type, Map<?, ?>[] awarded, List indicators, String phase, String phase_en, String place, String eid) {
        this.id = id;
        this.date = date;
        this.deadline_date = deadline_date;
        this.awarded_value_eur = awarded_value_eur;
        this.description = description;
        this.deadline_length_days = deadline_length_days;
        this.deadline_length_hours = deadline_length_hours;
        this.title = title;
        this.category = category;
        this.sid = sid;
        this.awarded_currency = awarded_currency;
        this.awarded_value = awarded_value;
        this.src_url = src_url;
        this.purchaser = purchaser;
        this.type = type;
        this.awarded = awarded;
        this.indicators = indicators;
        this.phase = phase;
        this.phase_en = phase_en;
        this.place = place;
        this.eid = eid;
    }

    public CustomEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeadline_date() {
        return deadline_date;
    }

    public void setDeadline_date(String deadline_date) {
        this.deadline_date = deadline_date;
    }

    public String getDeadline_length_days() {
        return deadline_length_days;
    }

    public void setDeadline_length_days(String deadline_length_days) {
        this.deadline_length_days = deadline_length_days;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSrc_url() {
        return src_url;
    }

    public void setSrc_url(String src_url) {
        this.src_url = src_url;
    }

    public Map<?, ?> getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(Map<?, ?> purchaser) {
        this.purchaser = purchaser;
    }

    public Map<?, ?> getType() {
        return type;
    }

    public void setType(Map<?, ?> type) {
        this.type = type;
    }

    public Map<?, ?>[] getAwarded() {
        return awarded;
    }

    public void setAwarded(Map<?, ?>[] awarded) {
        this.awarded = awarded;
    }
}