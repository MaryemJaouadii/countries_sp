package com.example.firstappspringboot.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties
public class Awarded {
    private String date;
    private int value_for_two;
    private int value_for_two_eur;
    private List<Suppliers> suppliers;
    private int value_for_three;
    private int value_for_one_eur;
    private int count;
    private int value_for_one;
    private int value_for_three_eur;
    private int suppliers_id;
    private int value_eur;
    private List<Integer> offers_count;
    private String suppliers_name;
    private Long value;
    private String offers_count_data; // supposed to be object


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getValue_for_two() {
        return value_for_two;
    }

    public void setValue_for_two(int value_for_two) {
        this.value_for_two = value_for_two;
    }

    public int getValue_for_two_eur() {
        return value_for_two_eur;
    }

    public void setValue_for_two_eur(int value_for_two_eur) {
        this.value_for_two_eur = value_for_two_eur;
    }

    public List<Suppliers> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Suppliers> suppliers) {
        this.suppliers = suppliers;
    }

    public int getValue_for_three() {
        return value_for_three;
    }

    public void setValue_for_three(int value_for_three) {
        this.value_for_three = value_for_three;
    }

    public int getValue_for_one_eur() {
        return value_for_one_eur;
    }

    public void setValue_for_one_eur(int value_for_one_eur) {
        this.value_for_one_eur = value_for_one_eur;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getValue_for_one() {
        return value_for_one;
    }

    public void setValue_for_one(int value_for_one) {
        this.value_for_one = value_for_one;
    }

    public int getValue_for_three_eur() {
        return value_for_three_eur;
    }

    public void setValue_for_three_eur(int value_for_three_eur) {
        this.value_for_three_eur = value_for_three_eur;
    }

    public int getSuppliers_id() {
        return suppliers_id;
    }

    public void setSuppliers_id(int suppliers_id) {
        this.suppliers_id = suppliers_id;
    }

    public int getValue_eur() {
        return value_eur;
    }

    public void setValue_eur(int value_eur) {
        this.value_eur = value_eur;
    }

    public List<Integer> getOffers_count() {
        return offers_count;
    }

    public void setOffers_count(List<Integer> offers_count) {
        this.offers_count = offers_count;
    }

    public String getSuppliers_name() {
        return suppliers_name;
    }

    public void setSuppliers_name(String suppliers_name) {
        this.suppliers_name = suppliers_name;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getOffers_count_data() {
        return offers_count_data;
    }

    public void setOffers_count_data(String offers_count_data) {
        this.offers_count_data = offers_count_data;
    }
}
