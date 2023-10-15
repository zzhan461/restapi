package com.demo.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class controllerTest {
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setUp (){
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    //test cases for post
    @Test
    public void postSuccess () throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/alerts")
                .param("alert_id","123")
                .param("service_id","123")
                .param("service_name","name")
                .param("model","40")
                .param("alert_type","111")
                .param("alert_ts","10")
                .param("severity","warning")
                .param("team_slack", "slack_ch"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());
    }
    //test cases for get
    @Test
    public void getSuccess () throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/alerts")
                .param("service_id","123")
                .param("start_ts","1")
                .param("end_ts","6"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());
    }
}