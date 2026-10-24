// ---docerion
// type: source
// title: UserAddress embeddable value type
// summary: A JPA embeddable value type holding a street and city for a user address.
// ---

package io.crnk.example.springboot.domain.model;

import javax.persistence.Embeddable;

@Embeddable
public class UserAddress {

    private String city;

    private String street;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}

