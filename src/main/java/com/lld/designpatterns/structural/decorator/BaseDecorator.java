package com.lld.designpatterns.structural.decorator;

import lombok.AllArgsConstructor;

// Step 3 - Base decorator
// why this is abstract because we need to implement the Product(DataSource here)'s methods but we don't create it here also rather just use them.
// The second reason is that we need a reference of the BaseDecorator.
@AllArgsConstructor
public abstract class BaseDecorator implements DataSource {
    protected DataSource nextLayer;
}
