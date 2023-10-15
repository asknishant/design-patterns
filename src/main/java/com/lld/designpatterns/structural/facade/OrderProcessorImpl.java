package com.lld.designpatterns.structural.facade;

public class OrderProcessorImpl implements OrderProcessor {
    private final InventoryService inventoryService = new InventoryService();
    private final PaymentService paymentService = new PaymentService();
    private final InvoiceService invoiceService = new InvoiceService();
    @Override
    public void process(Long orderId) {
        //we  need below functionality
        // Check for inventory
        if(!inventoryService.isPresent(orderId)) {
            throw new RuntimeException("Stock not present");
        }
        // PaymentGateway
        paymentService.processPayment(orderId);
        // CreateBill
        invoiceService.processInvoice(orderId);
        // SendEmail
    }
}
