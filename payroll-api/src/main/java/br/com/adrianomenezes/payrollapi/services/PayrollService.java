package br.com.adrianomenezes.payrollapi.services;


import br.com.adrianomenezes.payrollapi.domain.Payroll;

public interface PayrollService {

    Payroll getPayment(Long workerId, Payroll payroll);
}
