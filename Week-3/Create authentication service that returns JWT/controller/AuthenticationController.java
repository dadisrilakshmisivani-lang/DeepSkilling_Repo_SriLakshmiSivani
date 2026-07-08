package SpringWebProject.controller;

import SpringWebProject.model.AuthenticationRequest;
import SpringWebProject.model.AuthenticationResponse;
import SpringWebProject.util.JwtUtil;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    private JwtUtil jwtUtil = new JwtUtil();

    @PostMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestBody AuthenticationRequest request) {

        // For now, accept only this username/password
        if ("sivani".equals(request.getUsername())
                && "12345".equals(request.getPassword())) {

            String token = jwtUtil.generateToken(request.getUsername());

            return new AuthenticationResponse(token);
        }

        throw new RuntimeException("Invalid Username or Password");
    }
}