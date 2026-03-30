package com.charter.communications.demo;

import java.time.LocalDate;

public record Transaction(String customerId, double amount, LocalDate date){}
