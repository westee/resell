package com.westee.sales.controller;

import com.westee.sales.entity.PageResponse;
import com.westee.sales.entity.Response;
import com.westee.sales.generate.Agreement;
import com.westee.sales.service.AgreementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AgreementController {
    private final AgreementService agreementService;

    @Autowired
    public AgreementController(AgreementService agreementService) {
        this.agreementService = agreementService;
    }

    @GetMapping("/agreement")
    public PageResponse<Agreement> getAgreementList(@RequestParam(name = "pageNum", defaultValue = "1", required = false) Integer pageNum,
                                                    @RequestParam(name = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        return agreementService.getAgreementList(pageNum, pageSize);
    }

    @GetMapping("/agreement/{agreementId}")
    public Response<Agreement> getAgreementById(@PathVariable(name = "agreementId") long agreementId) {
        return Response.ok(agreementService.getAgreementById(agreementId));
    }

    @PostMapping("/agreement")
    public Response<Agreement> createAgreement(@RequestBody Agreement agreement) {
        return Response.ok(agreementService.createAgreement(agreement));
    }

    @PatchMapping("/agreement/{id}")
    public Response<Agreement> updateAgreement(@PathVariable("id") Long id,
                                             @RequestBody Agreement agreement) {
        agreement.setId(id);
        return Response.ok(agreementService.updateAgreement(agreement));
    }

    @DeleteMapping("/agreement/{id}")
    public Response<String> deleteAgreement(@PathVariable("id") Long agreementId) {
        agreementService.deleteAgreement(agreementId);
        return Response.ok("");
    }
}
