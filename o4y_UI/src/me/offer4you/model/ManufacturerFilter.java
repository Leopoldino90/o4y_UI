package me.offer4you.model;

import javax.persistence.ManyToOne;

public class ManufacturerFilter extends Filter {
    private static final long serialVersionUID = 1L;
    @ManyToOne
    private Manufacturer manufacturer;

    public ManufacturerFilter(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}