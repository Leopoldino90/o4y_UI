package me.offer4you.model;

import com.google.maps.model.AddressComponent;
import com.google.maps.model.AddressComponentType;
import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    private String[] longNames;
    private String[] shortNames;
    private String[][] types;
    
    public AddressComponent[] getAddressComponents() {
        int numComponents = longNames.length;
        AddressComponent[] addressComponents = new AddressComponent[numComponents];
        for (int i = 0; i < numComponents; i++) {
            addressComponents[i] = new AddressComponent();
            addressComponents[i].longName = longNames[i];
            addressComponents[i].shortName = shortNames[i];
            int numTypes = types[i].length;
            AddressComponentType[] addressComponentTypes = new AddressComponentType[numTypes];
            for (int j = 0; j < numTypes; j++) {
                addressComponentTypes[i] = AddressComponentType.valueOf(types[i][j]);
            }
            addressComponents[i].types = addressComponentTypes;
        }    
        return addressComponents;
    }
    
    public void setAddressComponents(AddressComponent[] addressComponents) {
        int numComponents = addressComponents.length;
        for (int i = 0; i < numComponents; i++) {
            longNames[i] = addressComponents[i].longName;
            shortNames[i] = addressComponents[i].shortName;
            int numTypes = addressComponents[i].types.length;
            for (int j = 0; j < numTypes; j++) {
                types[i][j] = addressComponents[i].types[j].toString();
            }
        }  
    }
}