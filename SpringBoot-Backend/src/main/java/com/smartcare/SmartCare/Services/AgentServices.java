package com.smartcare.SmartCare.Services;

import com.smartcare.SmartCare.DTO.AgentDTO;

public interface AgentServices {
    Object saveAgent(AgentDTO agentDTO);
    Object viewAgent(String agentId);
    String deleteAgent(String agentId);
    String generateNextAgentId(String ownerId);
}
