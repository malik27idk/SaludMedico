package com.SistemaGestionMedica.controlls;

import com.SistemaGestionMedica.dto.UsuarioDto;
import com.SistemaGestionMedica.entity.Usuario;
import com.SistemaGestionMedica.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AuthController {

    private UsuarioService usuarioService;

    public AuthController(UsuarioService UsuarioService) {
        this.usuarioService = UsuarioService;
    }

    @GetMapping("index")
    public String home(){
        return "index";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    // handler method to handle user registration request
    @GetMapping("register")
    public String showRegistrationForm(Model model){
    	UsuarioDto usuario = new UsuarioDto();
        model.addAttribute("usuario", usuario);
        return "register";
    }

    // handler method to handle register user form submit request
    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("usuario") UsuarioDto usuario,
                               BindingResult result,
                               Model model){
    	Usuario existing = usuarioService.findByEmail(usuario.getEmail());
        if (existing != null) {
            result.rejectValue("email", null, "There is already an account registered with that email");
        }
        if (result.hasErrors()) {
            model.addAttribute("user", usuario);
            return "register";
        }
        usuarioService.saveUser(usuario);
        return "redirect:/register?success";
    }

    @GetMapping("/users")
    public String listRegisteredUsers(Model model){
        List<UsuarioDto> usuarios = usuarioService.findAllUsers();
        model.addAttribute("usuarios", usuarios);
        return "usuarios";
    }
}
