package com.lld.designpatterns.structural.adapter;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PaymentRequest {
   Long id;
   String name;
   String email;
   Double amount;
}
