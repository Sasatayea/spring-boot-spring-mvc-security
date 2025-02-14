package com.luv2code.springboot.demosecurity.controller;

import com.luv2code.springboot.demosecurity.entity.Employee;
import com.luv2code.springboot.demosecurity.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    // Constructor injection
    @Autowired
    public EmployeeController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    // add mapping for "/list"

    @GetMapping("/list")
    public String listEmployees(Model theModel){
        // get the employee from database
        List<Employee> theEmployees = employeeService.findAll();

        // add to spring model
        theModel.addAttribute("employees", theEmployees);

        return "employees/list-employees";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel) {

        // get the employee from database
        Employee theEmployee = employeeService.findById(theId);

        // add to spring model
        theModel.addAttribute("employee", theEmployee);

        // send it to our form
        return "employees/employee-form";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("employeeId") int theId) {
        // delete the employee
        employeeService.deleteById(theId);

        // use a redirect to prevent duplicate submissions
        return "redirect:/employees/list";
    }


    // add mapping for "/showFormForAdd"
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        // create a new employee object
        Employee theEmployee = new Employee();

        // add to spring model
        theModel.addAttribute("employee", theEmployee);

        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee( @ModelAttribute("employee") Employee theEmployee) {

        // save the employee
        employeeService.save(theEmployee);

        // use a redirect to prevent duplicate submissions
        return "redirect:/employees/list";
    }

}
