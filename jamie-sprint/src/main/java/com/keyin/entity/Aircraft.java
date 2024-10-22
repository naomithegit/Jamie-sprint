package com.keyin.entity;

import javax.persistence.*;

@Entity
    public class Aircraft {

        @Id
        @SequenceGenerator(name = "aircraft_sequence", sequenceName = "aircraft_sequence", allocationSize = 1, initialValue = 1)
        @GeneratedValue(generator = "aircraft_sequence")
        private long id;
        private String model;
        private String manufacturer;
        public long getId() {
        return id;
    }

        public void setId(long id) {
        this.id = id;
    }

        public String getModel() {
        return model;
    }

        public void setModel(String model) {
        this.model = model;
    }
}
