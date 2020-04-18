package com.sliit.mtit.microservice.deliveryservice.controller;

import com.sliit.mtit.microservice.deliveryservice.dto.DeliveryResponse;
import com.sliit.mtit.microservice.deliveryservice.dto.DeliveyRequest;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody DeliveryResponse createDelivery(@RequestBody DeliveyRequest deliveryRequest){

        System.out.println("Delivery Details: "+deliveryRequest);
        var deliveryResponse = new DeliveryResponse();
        deliveryResponse.setDeliveryID(UUID.randomUUID().toString());
        deliveryResponse.setDriverID(UUID.randomUUID().toString());
        deliveryResponse.setVehicleID(UUID.randomUUID().toString());
        deliveryResponse.setMessage("Delivery Created");
        return deliveryResponse;


    }
}
