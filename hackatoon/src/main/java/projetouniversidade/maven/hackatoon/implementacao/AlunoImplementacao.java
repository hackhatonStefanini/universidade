package projetouniversidade.maven.hackatoon.implementacao;

import org.springframework.stereotype.Service;
import projetouniversidade.maven.hackatoon.services.AlunoService;

import java.util.regex.Pattern;

@Service
public class AlunoImplementacao implements AlunoService {

    @Override
    public Boolean ownerCpfValidation(String ownerCpf) {

        String cpfValidation = "[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2}";
        return Pattern.compile(cpfValidation).matcher(ownerCpf).matches();

    }

}
