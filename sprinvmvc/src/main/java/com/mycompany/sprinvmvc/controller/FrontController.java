/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.sprinvmvc.controller;

import com.mycompany.sprinvmvc.Entities.User;
import com.mycompany.sprinvmvc.Services.UserService;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test/{id}")
    void home(@PathVariable("id") int id) {

        System.out.println(id);

    }

    @RequestMapping("/contact")
    String contact() {

        return "contact";
    }

    //formsubmit
    @RequestMapping(path = "/formsubmit", method = RequestMethod.POST)
    ModelAndView formsubmit(@ModelAttribute User user, Model m, @RequestParam("file") CommonsMultipartFile file, HttpSession session) {
        String path = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" + File.separator
                + "images\\";
        String filename = file.getOriginalFilename();

        System.out.println(path + filename);
        try {
            byte barr[] = file.getBytes();

            BufferedOutputStream bout = new BufferedOutputStream(
                    new FileOutputStream(path + "/" + filename));
            bout.write(barr);
            bout.flush();
            bout.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return new ModelAndView("process", "filename", filename);
        // userService.add(user);

    }

    @GetMapping("/*")
    public String handle() {
        return "error";
    }
}
