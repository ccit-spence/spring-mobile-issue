package com.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String getIndex(Device device, Model model) {

        final Logger logger = LoggerFactory.getLogger(IndexController.class);

        model.addAttribute("type", device.toString());

        if (device.isMobile()) {
            logger.info("Hello mobile user!");

            return "index/desktop/index";

        } else if (device.isTablet()) {
            logger.info("Hello tablet user!");

            return "index/desktop/index";

        } else {
            logger.info("Hello desktop user!");

            return "index/desktop/index";

        }

    }

}
