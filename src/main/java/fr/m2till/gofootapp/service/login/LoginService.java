package fr.m2till.gofootapp.service.login;

import fr.m2till.gofootapp.entity.Login;
import fr.m2till.gofootapp.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public Login save(Login login) {
        return loginRepository.save(login);
    }

    @Override
    public Login findByMail(String mail) {
        return loginRepository.findByMail(mail);
    }

    @Override
    public boolean existsByMailAndPassword(Login login) {
        return loginRepository.existsByMailAndPassword(login.getMail(),login.getPassword());
    }

}
