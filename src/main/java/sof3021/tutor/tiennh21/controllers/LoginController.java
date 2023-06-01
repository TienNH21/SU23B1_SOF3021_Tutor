package sof3021.tutor.tiennh21.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sof3021.tutor.tiennh21.request.LoginVM;

@Controller
public class LoginController {
    @GetMapping("login")
    public String getLoginForm()
    {
        return "login";
    }

    @PostMapping("login")
    public String login(LoginVM vm, Model model) {
        // Đăng nhập tiennh21/123456
        // C1: request.getParameter("username") -> String -> Ép kiểu
        // C2: @RequestParam
        // C3: Java bean

        System.out.println(vm.getUsername() + "/" + vm.getPassword());
        if (
            vm.getUsername().equals("tiennh21")
            &&
            vm.getPassword().equals("123456")
        ) {
            model.addAttribute("message", "Đăng nhập thành công");
        } else {
            model.addAttribute("message", "Đăng nhập thất bại");
        }

        return "login";
    }
}
