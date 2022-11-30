package com.example.firstappspringboot.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties
public class Data {
     private String id;
     private String date;
     private String deadlineDate;
     private String title;
     private String category;
     private String description;
     private String phase;
     private String phaseEn;
     private String place;
     private String sid;
     private String eid;
     private String awarded_value;
     private String awarded_currency;
     private String awarded_value_eur;
     private Purchaser purchaser;
     private List<Awarded> awarded;

     public String getId() {
          return id;
     }

     public void setId(String id) {
          this.id = id;
     }

     public String getDate() {
          return date;
     }

     public void setDate(String date) {
          this.date = date;
     }

     public String getDeadlineDate() {
          return deadlineDate;
     }

     public void setDeadlineDate(String deadlineDate) {
          this.deadlineDate = deadlineDate;
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

     public String getDescription() {
          return description;
     }

     public void setDescription(String description) {
          this.description = description;
     }

     public String getPhase() {
          return phase;
     }

     public void setPhase(String phase) {
          this.phase = phase;
     }

     public String getPhaseEn() {
          return phaseEn;
     }

     public void setPhaseEn(String phaseEn) {
          this.phaseEn = phaseEn;
     }

     public String getPlace() {
          return place;
     }

     public void setPlace(String place) {
          this.place = place;
     }

     public String getSid() {
          return sid;
     }

     public void setSid(String sid) {
          this.sid = sid;
     }

     public String getEid() {
          return eid;
     }

     public void setEid(String eid) {
          this.eid = eid;
     }

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

     public String getAwarded_value_eur() {
          return awarded_value_eur;
     }

     public void setAwarded_value_eur(String awarded_value_eur) {
          this.awarded_value_eur = awarded_value_eur;
     }

     public Purchaser getPurchaser() {
          return purchaser;
     }

     public void setPurchaser(Purchaser purchaser) {
          this.purchaser = purchaser;
     }

     public List<Awarded> getAwarded() {
          return awarded;
     }

     public void setAwarded(List<Awarded> awarded) {
          this.awarded = awarded;
     }
}
