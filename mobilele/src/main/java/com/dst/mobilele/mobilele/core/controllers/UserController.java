package com.dst.mobilele.mobilele.core.controllers;

import com.dst.mobilele.mobilele.user.dto.UserRegisterDTO;
import com.dst.mobilele.mobilele.user.dto.UserRoleViewDTO;
import com.dst.mobilele.mobilele.user.services.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController extends BaseController {

    private final UserRoleService roleService;


    @Autowired
    public UserController(UserRoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/register")
    public ModelAndView getRegister(ModelAndView mav) {

        List<UserRoleViewDTO> roles = this.roleService.getAll();

        mav.addObject("allRoles", roles);
        mav.addObject("userRegister", new UserRegisterDTO());

        return super.view("auth-register", mav);

    }

    @PostMapping("/register")
    public ModelAndView postRegister(@ModelAttribute UserRegisterDTO userRegister) {

        return super.redirect("auth-login");
    }
}
