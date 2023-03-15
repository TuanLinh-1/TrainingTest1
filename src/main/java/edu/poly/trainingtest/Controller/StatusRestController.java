package edu.poly.trainingtest.Controller;

import edu.poly.trainingtest.DTO.StatusDTO;
import edu.poly.trainingtest.Entity.Status;
import edu.poly.trainingtest.Service.StatusService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("StatusAPI")
public class StatusRestController {
    @Autowired
    private StatusService statusservice;
    @GetMapping
    public List<StatusDTO> findAll(){
        List<StatusDTO> statusDTOList = new ArrayList<>();

        List<Status> statusList = statusservice.findAll();
        for (Status item: statusList) {
            StatusDTO statusDTO = new StatusDTO();
            BeanUtils.copyProperties(item,statusDTO);
            statusDTOList.add(statusDTO);
        }
        return  statusDTOList;

    }
}
