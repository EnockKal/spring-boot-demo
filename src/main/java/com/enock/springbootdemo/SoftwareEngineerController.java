package com.enock.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineer")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineers() {
        return List.of(
                new SoftwareEngineer(
                        1, "James", "js, node, react, tailwindcss"
                ),
                new SoftwareEngineer(
                        2, "Enock", "java, springboot, node"
                )
        );
    }
}
