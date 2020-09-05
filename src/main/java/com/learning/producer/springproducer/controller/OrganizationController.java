package com.learning.producer.springproducer.controller;

import com.learning.producer.springproducer.OrganizationProducer;
import com.learning.producer.springproducer.model.Organization;
import com.learning.producer.springproducer.model.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrganizationController {

    @Autowired
    OrganizationProducer organizationProducer;

    @Autowired
    private OrganizationRepository organizationRepository;

    @Value("${activemq.destination}")
    private String destination;

    @PostMapping("/startService")
    public String sendMessage(@RequestBody Organization org) {
        organizationProducer.sendTo(destination, org);
        return "success";
    }

    /*
    @PostMapping(path="/startService") // Map ONLY POST Requests
    public @ResponseBody
    String addNewOrganization (@RequestParam String company_name, @RequestParam Integer year_of_inc,
                               @RequestParam Integer postal_code, @RequestParam Integer employee_count, @RequestParam String slogan) {

        Organization n = new Organization();
        n.setCompany_name(company_name);
        n.setYear_of_inc(year_of_inc);
        n.setPostal_code(postal_code);
        n.setEmployee_count(employee_count);
        n.setSlogan(slogan);
        organizationRepository.save(n);
        System.out.println("saved");
        return "Saved";
    }
     */

    @GetMapping(path="/startService")
    public @ResponseBody Iterable<Organization> getAllOrganizations() {
        // This returns a JSON or XML with the organizations
        return organizationRepository.findAll();
    }
}
