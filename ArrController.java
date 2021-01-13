/**
 * API/Controller Layer
 * Receives request from client and sends back a response
 */

package com.example.runningsum.api;

import com.example.runningsum.model.Arr;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("runningsum")
@RestController
public class ArrController {

    @PostMapping
    // Returns Arr object with array of running sums as data member
    public Arr calculateRunningSum(@RequestBody Arr a) {
        return new Arr(a.runningSum());
    }
}
