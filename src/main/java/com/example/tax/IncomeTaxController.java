package com.example.tax;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class IncomeTaxController {

    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam("income") double income,
            @RequestParam("deductions") double deductions,
            @RequestParam("taxRate") double taxRate,
            Model model
    ) {
        double taxableIncome = income - deductions;
        double taxAmount = taxableIncome * taxRate;
        double netIncome = income - taxAmount;

        model.addAttribute("taxAmount", taxAmount);
        model.addAttribute("netIncome", netIncome);

        return "result";
    }
}