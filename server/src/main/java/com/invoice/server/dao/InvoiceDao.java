package com.invoice.server.dao;

import com.invoice.server.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceDao extends JpaRepository<Invoice, Long> {

}
