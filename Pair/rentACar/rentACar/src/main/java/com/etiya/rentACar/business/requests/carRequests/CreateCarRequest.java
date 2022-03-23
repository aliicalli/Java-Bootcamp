package com.etiya.rentACar.business.requests.carRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {

    private double dailyPrice;

    private String description;

    private double modelYear;

    private int colorId;

    private  int brandId;


}
