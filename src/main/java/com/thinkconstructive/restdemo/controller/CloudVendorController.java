package com.thinkconstructive.restdemo.controller;

import com.thinkconstructive.restdemo.model.CloudVendor;
import com.thinkconstructive.restdemo.response.ResponseHandler;
import com.thinkconstructive.restdemo.service.CloudVendorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    private final CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    // =========================
    // DEFAULT ROUTE (INFO PAGE)
    // =========================
    @GetMapping
    public String cloudVendorHome() {
        return "<h1>Cloud Vendor API</h1>"
                + "<p>✅ API is running successfully 🚀</p>"
                + "<hr/>"
                + "<h3>Available Endpoints:</h3>"
                + "<ul>"
                + "<li><b>GET</b> /cloudvendor/vendors → Get all cloud vendors</li>"
                + "<li><b>GET</b> /cloudvendor/{vendorId} → Get cloud vendor by ID</li>"
                + "<li><b>POST</b> /cloudvendor → Create a new cloud vendor</li>"
                + "<li><b>PUT</b> /cloudvendor → Update an existing cloud vendor</li>"
                + "<li><b>DELETE</b> /cloudvendor/{vendorId} → Delete cloud vendor</li>"
                + "</ul>";
    }

    // =========================
    // GET ALL VENDORS
    // =========================
    @GetMapping("/vendors")
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorService.getAllCloudVendors();
    }

    // =========================
    // GET VENDOR BY ID
    // =========================
    @GetMapping("/{vendorId}")
    @ApiOperation(
            value = "Get Cloud Vendor by ID",
            notes = "Provide cloud vendor details by vendor ID",
            response = ResponseEntity.class
    )
    public ResponseEntity<Object> getCloudVendorDetails(
            @PathVariable String vendorId) {

        return ResponseHandler.responseBuilder(
                "Requested Vendor Details are given here",
                HttpStatus.OK,
                cloudVendorService.getCloudVendor(vendorId)
        );
    }

    // =========================
    // CREATE VENDOR
    // =========================
    @PostMapping
    public String createCloudVendorDetails(
            @RequestBody CloudVendor cloudVendor) {

        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }

    // =========================
    // UPDATE VENDOR
    // =========================
    @PutMapping
    public String updateCloudVendorDetails(
            @RequestBody CloudVendor cloudVendor) {

        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }

    // =========================
    // DELETE VENDOR
    // =========================
    @DeleteMapping("/{vendorId}")
    public String deleteCloudVendorDetails(
            @PathVariable String vendorId) {

        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }
}
