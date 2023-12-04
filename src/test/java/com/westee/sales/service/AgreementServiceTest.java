package com.westee.sales.service;

import com.westee.sales.entity.PageResponse;
import com.westee.sales.generate.Agreement;
import com.westee.sales.generate.AgreementMapper;
import com.westee.sales.generate.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AgreementServiceTest {
    @Mock
    AgreementMapper agreementMapper;

    @Mock
    Agreement agreement;

    @InjectMocks
    private AgreementService agreementService;

    @BeforeEach
    public void initUserContext() {
        User user = new User();
        user.setId(1L);
        UserContext.setCurrentUser(user);

        lenient().when(agreementMapper.selectByPrimaryKey(Mockito.anyLong())).thenReturn(agreement);
    }

    @Test
    void getAgreementById() {
        Agreement agreementById = agreementService.getAgreementById(Mockito.anyLong());
        Assertions.assertNotNull(agreementById);
    }

    @Test
    void getAgreementListTest() {
        int pageNumber = 5;
        int pageSize = 10;

        List<Agreement> mockData = Mockito.mock(List.class);
        when(agreementMapper.selectByExampleWithBLOBs(any())).thenReturn(mockData);
        PageResponse<Agreement> result = agreementService.getAgreementList(pageNumber, pageSize);

        assertEquals(pageNumber, result.getPageNum());
        assertEquals(pageSize, result.getPageSize());
        assertEquals(mockData, result.getData());
    }

}
