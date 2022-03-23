package com.etiya.rentACar.business.requests.damageRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateDamageRequest {

    private String description;
    private String date;
    private  int carId;
}
