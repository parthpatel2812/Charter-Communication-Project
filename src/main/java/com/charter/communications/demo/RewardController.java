package com.charter.communications.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/rewards")
public class RewardController {
    @Autowired
    private RewardService rewardService;

    @PostMapping("/calculate")
    public Map<String, CustomerRewards> calculate(@RequestBody List<Transaction> transactions) {
        return rewardService.processRewards(transactions);
    }
}
